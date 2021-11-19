#busca verrsao do java 
FROM openjdk:11

LABEL maintainer="demo-projeto-desafio"

ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar.original 

ENTRYPOINT [ "java", "-jar" ,"demo-0.0.1-SNAPSHOT.jar.original"]


# WORKDIR /demoprojetodesafio/app

# COPY . /demoprojetodesafio/app/

# #ENTRYPOINT exec java $JAVA_OPTS -jar demoprojetodesafio.jar
# # For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
# ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar demoprojetodesafio.jar
