# DevOps - Giorno 2 (02/09/2021)

## Argomenti
- Pipeline in Jenkins: definizione di un job con linguaggio dichiarativo
  - Stages e steps
  - Actions
  - Pipeline Sytax Helper
  - Variabili della build
  - Usare una pipeline da SCM
- Build di progetti Angular
- Deployment
  - Con strumenti classici
  - Con Docker

- Uso dei links delle build
  - http://localhost:8080/job/prima-pipeline/lastSuccessfulBuild/artifact/frontend.zip
http://localhost:8080/job/prima-pipeline/15/artifact/eclipse/corso-docker/target/corso-docker-0.0.1-SNAPSHOT.jar
  - http://localhost:8080/job/prima-pipeline/lastSuccessfulBuild/backend.jar

## Comandi visti a lezione
- docker build  -t andrea/docker-jenkins:latest .
- docker run --rm -p 8080:8080 -v C:\Users\andre\Desktop\Temp\Corsi\Avalon\Zecca\sessione-2\jenkins:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock andrea/docker-jenkins

## Links
- https://blog.nestybox.com/2019/09/29/jenkins.html