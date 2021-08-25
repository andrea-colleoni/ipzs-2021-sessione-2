# Eseritazione guidata

## Installzione ed utilizzo di un server MySql

- Individuare l'immagine di MySql e documentarsi su come funziona
- Eseguire un container dell'immagine MySql con le seguenti caratteristiche:
  - la password di root deve essere impostata a __passw0rd__
  - la porta di default 3306 deve esere mappata sull'host sulla porta 3306
  - il percorso dove vengono memorizzati i db deve essere mappato su un percorso dell'host
- Connettersi al server MySql e...
  - Creare un database con una tabella
  - Inserire qualche record
- Killare e rimuovere il container
- Lanciare un nuovo container mappato allo stesso modo e verificare che i record siano stati conservati