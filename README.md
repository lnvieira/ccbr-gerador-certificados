# Gerador de Certificados
Gerador de Certificados Code Club Brasil

#Demo app:
https://certificategenerator.herokuapp.com/

##Build:
mvn clean install

##Build image:
docker build --force-rm -t brcodeclub/certificate-generator:latest .

##Run:
docker run -p 8080:8080 brcodeclub/certificate-generator:latest

##Access:
http://localhost:8080/

##Docker Hub:
https://hub.docker.com/r/brcodeclub/certificate-generator/