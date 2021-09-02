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
    }
}
