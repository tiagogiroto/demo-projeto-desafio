# demo-projeto-desafio

Aplicação de teste

Utilização: 
* Windows 10
* Java 11
* Visual Studio Code
* Docker

 - Para executar seu projeto:

* Clone o projeto 
* Abra a pasta com VSCode 
* Inicie a aplicação utilizando o Spring Boot Dashboard


Para testes foi utilizada a aplicação Postman com os seguintes parâmetros
---------

Exibe um objeto específiico da lista
GET  http://localhost:8080/dispositivo/lista/2


Exibe todos os objeto da lista
GET  - http://localhost:8080/dispositivo/lista 



Cria um novo cadastro
CREATE - http://localhost:8080/dispositivo/cadastro
    {
    "name": "joao das neves",
    "mac": 34254,
    "email": "joao@email.com",
    "latitude": "321321321",
    "longitude": "321321312"
    }
    
Deleta um objeto por id
DELETE - http://localhost:8080/dispositivo/deletar/3

