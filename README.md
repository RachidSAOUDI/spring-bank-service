### 1. create new project 
* Maven Project
* Java JDK version = 17
* Spring Boot version = 2.7.4
* Jar
### 2. Dependencies
* Spring Web 
* Spring Data JPA
* H2 Database 
* Lombok
* Spring for GraphQL

### test on localhost
* for test Account List : 
  http://localhost:8081/bankAccounts
* for test One Account :
  http://localhost:8081/bankAccounts/{id}
+ example
  http://localhost:8081/bankAccounts/be2884a6-e296-420e-a5cd-9c6214a85b66
### Add depenency 
https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui
* springdoc OpenAPI UI Version : 1.6.11

### Test Rest API (Documentation Swagger Or Documentation OpenAPI)
use this link for test Rest API : 
http://localhost:8081/swagger-ui/index.html

### Add Dependency 
Spring Data Rest

### for test search method example : 
http://localhost:8081/bankAccounts/search/findByType?type=SAVING_ACCOUNT
or
http://localhost:8081/bankAccounts/search/findByType?type=CURRENT_ACCOUNT

### link after change Method findByType
http://localhost:8081/bankAccounts/search/byType?t=SAVING_ACCOUNT

### for test projection :
http://localhost:8081/bankAccounts?projection=p1

### for test GraphQL
http://localhost:8081/graphiql?path=/graphql

### Query Example :
* example1 :
query{
  bankAccountById(id:"ffd1f270-b2bb-4f60-a05d-58c3dfbd3885"){
    balance, currency, type
  }
}
* Example 2:
  query{
  accountsList{
  id, balance, currency, type
  }
  }
## select query
query{
accountsList {
id, balance
}
}
## select Query 
query {
accountsList {
id, balance, customer {name}
}
}
## select Query 
query {
accountsList {
id, balance, customer {name, bankAccounts{id}}
}
}
## select Query 
query {
customers{
id, name
}
}
## Query GraphQL 
query {
customers{
id, name, bankAccounts {balance, id, type}
}
}
## Query 
query {
    customers{
      id, name, bankAccounts {balance}
    }
}

### exemple mutation GraphQL
mutation($t : String, $b : Float, $c : String) {
addAccount(bankAccount : {
type : $t,
balance : $b,
currency : $c
}){
id, type, balance
}
}
## call query
{"t": "CURRENT_ACCOUNT", "b": 4000, "c": "USD"}
## Update Query 
mutation($id : String, $t : String, $b : Float, $c : String) {
updateAccount(id : $id, bankAccount : {
type : $t,
balance : $b,
currency : $c
}){
id, type, balance
}
}
## send Variables 
{"t": "CURRENT_ACCOUNT", "b": 3200, "c": "USD", "id": "28260fec-dac5-4ee9-8377-fa32e4e029ad"}
## delete Query
mutation {
deleteAccount(id : "dc226d18-d01e-4ba7-9a5a-64267ad748d1")
}
