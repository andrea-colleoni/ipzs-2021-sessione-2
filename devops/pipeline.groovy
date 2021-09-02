pipeline {
    agent any

    tools {
      jdk 'Jdk-11'
      maven 'Maven 3.8.2'
    }

    stages {
        stage('Inizio') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Checkout') {
            steps {
                git branch: 'main', 
                    url: 'https://github.com/andrea-colleoni/ipzs-2021-sessione-2.git'
            }
        }
        stage('Pulizia') {
            steps {
                dir('eclipse/corso-docker') {
                    sh 'mvn clean'
                }
            }
        }
        stage('Compilazione') {
            steps {
                dir('eclipse/corso-docker') {
                    sh 'mvn -Dmaven.test.skip=true compile'
                }
            }
        }
        stage('Test & Package') {
            steps {
                dir('eclipse/corso-docker') {
                    sh 'mvn package'
                }
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'eclipse/corso-docker/target/*.jar', followSymlinks: false
        }
        always {
            junit 'eclipse/corso-docker/target/surefire-reports/*.xml'
            writeFile encoding: 'UTF-8', 
                file: 'BUILD.md', 
                text: """# Informazioni di build

__Data build__: """ + new java.util.Date().toString() + """
__Progetto__: ${env.JOB_NAME} INSTABILE
__Build n. ${env.BUILD_NUMBER}__: ${currentBuild.result}"""     
            archiveArtifacts artifacts: 'BUILD.md', followSymlinks: false
        }
        unstable {
            mail to: 'andrea@colleoni.info',
                 body: """Progetto: ${env.JOB_NAME} INSTABILE
                 Build n. ${env.BUILD_NUMBER} ${currentBuild.result}""", 
                 subject: "Progetto: ${env.JOB_NAME} INSTABILE- Build n. ${env.BUILD_NUMBER} ${currentBuild.result}"
        }        
    }
}
