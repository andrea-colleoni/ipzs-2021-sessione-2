# Docker - Giorno 2 (26/08/2021)

## Argomenti
- Build di un'immagine usando Dockerfile
  - Comando docker build
- Volumi
- Docker compose
  - Sintassi di base di YAML
  - Definizione di un servizio
    - Mappatura porte e volumi
    - Mappatura variabili d'ambiente
- Integrazione tra Eclipse e Docker
  - Esempi di creazione di un'immagine da una build di Maven (esempio di Spring Boot)
  -Debug remoto di java su container Docker (sospeso)

## Comandi linux
- sudo -s: attiva una sessione di sudo come root (non c'è più bisogno di lanciare i comandi con sudo)
## Comandi Docker visti a lezione
- docker build -t ipzs/nginx-nano:latest . 
- docker image rm ipzs/nginx-nano:latest
- docker run -itd --rm --name db-01 -v mysql_data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=passw0rd -p 3306:3306 mysql
- docker-compose -f compose-mysql.yml up -d
- docker-compose -f compose-mysql.yml down
- docker network ls

## Comandi GIT visti a lezione (per risolvere l'esercizio 2 sulla VM)
- git clone https://github.com/andrea-colleoni/ipzs-2021-sessione-2.git
- apt install default-jdk
- cd ipzs-2021-sessione-2/ 
- sh mvnw package
- docker-compose up -d

## Links utili
- [Java Remote Debugging](https://stackify.com/java-remote-debugging/)
- [Spring Boot e Docker](https://spring.io/guides/gs/spring-boot-docker/)
