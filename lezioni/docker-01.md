# Docker - Giorno 1 (25/08/2021)

## Argomenti
- Evoluzione infrstrutture
  - Da HW a Virtualizzazione
  - Da virtualizzazione a containerizzazione
- Installazione dei prerequisiti per il corso
  - Hyper-V
  - Importazione della VM con Docker
  - (opzionale) Installazione di Docker Desktop
- Funzionamento dei container
  - Comando __run__: da un immagine crea un container
  - Ciclo di vitsa di un container: volatilità dei container
  - Modalità interattiva (__-it__)
- Mappature
  - Mappatura delle porte TCP
  - Mappatura dei volumi sul File System

## Comandi linux visti a lezione (nella Virtual Machine)
- sudo apt update
- sudo apt install net-tools
- sudo apt install ssh
- ifconfig: mostra l'indirizzo IP della VM
- ssh andrea@[indirizzo IP della VM]: per connettersi da windows alla VM linux
## Comandi Docker visti a lezione
- docker run alpine: esecuzione di un container a partire dall'immagie "alpine"
- docker run -it alpine: esecuzione di un container a partire dall'immagie "alpine" in modalità interattiva
- docker start -i 947bfdf986a5: avvio in modalità interattiva del container con ID "947bfdf986a5"
- docker container ls: elenco dei container attivi
- docker run -d --rm -p 9999:8080  tomcat
- docker run -d --name web-01 -p 8080:80 nginx
- docker run -d --name web-01 -p 8080:80 -v C:\PercorsoLocale\web:/usr/share/nginx/html nginx
- docker exec -it web-01 sh
- docker images: elenco delle immagini presenti sul local registry
- docker volume ls: elenco dei volumi registrati nel docker host