#!/bin/bash
mvn clean install
cp ./target/john-project-0.0.1-SNAPSHOT.jar ./dockertest/john-project-0.0.1-SNAPSHOT.jar
cd ./dockertest
docker-compose up
