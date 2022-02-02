FROM tomcat:9.0-jdk16-temurin
COPY ./target/manage_employee-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]