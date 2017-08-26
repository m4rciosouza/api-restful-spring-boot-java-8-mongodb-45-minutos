# API RESTful em 45 minutos
API RESTful com Spring Boot, Java 8, MongoDB e Spring Security em 45 minutos
### Como executar a aplicação
Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git.
```
git clone https://github.com/m4rciosouza/api-restful-spring-boot-java-8-mongodb-45-minutos.git
cd api-restful-spring-boot-java-8-mongodb-45-minutos
mvn spring-boot:run
Acesse http://localhost:8080/api/clientes
Utilize o usuário "user" e a senha que é impressa no terminal ao executar a aplicação para autenticar.
```
### APIs endpoints
GET http://localhost:8080/api/clientes [lista todos os clientes]  
GET http://localhost:8080/api/clientes/{id} [lista um cliente por ID]  
POST http://localhost:8080/api/clientes [cadastra um novo cliente]  
PUT http://localhost:8080/api/clientes/{id} [atualiza os dados de um cliente]  
DELETE http://localhost:8080/api/clientes/{id} [remove um cliente por ID]  

### Importando o projeto no Eclipse ou STS
No terminal, execute a seguinte operação:
```
mvn eclipse:eclipse
```
No Eclipse/STS, importe o projeto como projeto Maven.
