FROM tomcat:latest
COPY target/sportImpulse.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]