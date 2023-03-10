# SPRINGBOOT API INTRODUCTIONS IN ATLAS MONGO DB
## Requirements
- github link -> https://github.com/scbushan05/spring-boot-mongodb
- jdk - version 19
- Intellij
- Database -> Mongodb (Atlas... i.e. online)


- initializer url -> https://start.spring.io/

## mvn commands
- mvn clean
- mvn clean compile
- mvn test

## Tomcat
- Tomcat port: 8080

## Solving plugin errors:
- Now lets say I had 10 such plugins which didn't get resolve and among them the first was 'org.apache.maven.plugins:maven-site-plugin' I went to '.m2/repository/org/apache/maven/plugins/' and deleted the directory 'maven-site-plugin' and did a maven reimport again. Guess what, particular missing plugin got dowloaded. And I just followed similar steps for other missing plugins and all got resolved.
- link -> https://stackoverflow.com/questions/20496239/maven-plugins-can-not-be-found-in-intellij

## NB : 
- While opening the project in IDEA such as Intellij IDEA, open the last 'demo' file


## Killing a process in cmd:
- First determine process id occupied by that port i.e. port 8080 by running:<br>

      netstat -ano | findstr :8080
- Then kill the process

      netstat -ano | findstr :8080

## Layers 
- API layer - Controller (Contains GET, POST, PUT, DELETE)
- Service Layer - Business logic
- Data Access Layer - 

## API Layer
![SpringBootLayers](images/SpringBootLayers.PNG)

## API DOC
1) POST -> Create Employee:
- - endpoint -> http://localhost:8080/api/v1/employees/create-employee
- - - body : 

          {
            "name": "Simon",
            "gender": "Male",
            "dob": "23-11-2006",
            "country": "Kenya"
          }

- response :

        {
          "id": 3,
          "name": "Simon",
          "gender": "Male",
          "dob": "23-11-2006",
          "country": "Kenya"
        }


2) GET -> Get all Employees:
- - endpoint -> http://localhost:8080/api/v1/employees/employees-list
- - - body :
    
          [
           {
             "id": 1,
             "name": "Simon",
             "gender": "Male",
             "dob": "23-11-2006",
             "country": "Kenya"
           },
           {
             "id": 2,
             "name": "Martin",
             "gender": "Male",
             "dob": "23-11-1999",
             "country": "Kenya"
           }
          ]

3) GET -> Get Employee by id:
- - endpoint -> http://localhost:8080/api/v1/employees/get-employee/1
- - - response :

          {
            "id": 1,
            "name": "Simon",
            "gender": "Male",
            "dob": "23-11-2006",
            "country": "Kenya"
          }
4) PUT -> Update Employee:
- endpoint -> http://localhost:8080/api/v1/employees/update-employee/1
- - - body :

          {
            "name": "Simon",
            "gender": "Male",
            "dob": "23-11-2006",
            "country": "Kenya"
          }

- response :

        {
          "id": 3,
          "name": "Simon",
          "gender": "Male",
          "dob": "23-11-2006",
          "country": "Kenya"
        }

5)DELETE -> Delete Employee:
- endpoint -> http://localhost:8080/api/v1/employees/delete-employee/1
- response:

            Employee deleted with id 1