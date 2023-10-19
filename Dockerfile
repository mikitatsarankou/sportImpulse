FROM tomcat:latest
ADD target/sportImpulse.war /usr/local/tomcat/webapps/
EXPOSE 8085
CMD ["catalina.sh", "run"]