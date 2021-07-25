#!/bin/bash

mvn clean package
cp target/yafi-jsf-spring-primefaces-1.0-SNAPSHOT.war /home/eg/Downloads/wls1411/user_projects/domains/base_domain/autodeploy/

#http://localhost:7001/console/login/LoginForm.jsp

#test url http://127.0.0.1:7001/yafi-jsf-spring-primefaces-1.0-SNAPSHOT/home.jsf

#username-pass
#weblogic7
#weblogic7