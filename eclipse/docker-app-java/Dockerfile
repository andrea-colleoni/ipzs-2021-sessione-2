FROM openjdk:11
RUN mkdir /app
WORKDIR /app
COPY ./bin ./
EXPOSE 8000
# ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=y
ENTRYPOINT [ "java", "ipzs.Home" ]