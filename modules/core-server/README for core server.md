## Core Server for EZ-travel

[![N|Solid](http://i.imgur.com/onfjH4w.jpg)](https://nodesource.com/products/nsolid)


### Introduction

Core server is RESTful service which created for EZ-travel 

### Prerequisite
The project created using following sdk's and tools.
  - java version "1.8.0_74"
  - Java(TM) SE Runtime Environment (build 1.8.0_74-b02)
  - Apache Maven 3.3.9
  - Spring Boot 1.5.6.RELEASE
  - json-simple 1.1
  
**_and deployed and tested on_**
  - apache-tomcat-8.0.32
  
### Configuration and building
First you need to configure database. For that you have to import sql file in module/database/ez-trave.sql

- database name - ez-travel


Core server uses abstract database layer from **core logic** module. There for you need to build whole project first. 

First clone the Project from github
```sh
git clone https://github.com/hsenidlanka/ez-travel.git

```

After that you need to build core-logic to run core-server.
It can easily build by main parent pom. 

```sh
cd ez-travel/modules
mvn clean install
```
If it ran succesfully now you are ready to run core-server.
Go to core server pom and run it as spring boot project
```sh
cd core-server
mvn spring-boot:run
```

### Configuration and building

For API doc refernce use below link

* https://goo.gl/FQcZMw

