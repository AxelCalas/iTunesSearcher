#!/bin/bash
mvn -f /home/app/pom.xml clean package
java -jar /home/app/target/iTunesSearcher-0.0.1-SNAPSHOT.jar