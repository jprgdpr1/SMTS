#!/bin/bash

# Compile the project
javac -d classes -cp "jars/*" -g src/*.java

# Run JUnit tests with JaCoCo agent to collect coverage information
java -cp "classes;jacoco-0.8.11/lib/jacocoagent.jar;mysql.jar;junit-platform-console-standalone.jar;randoop.jar" -javaagent:jacoco-0.8.11/lib/jacocoagent.jar org.junit.platform.console.ConsoleLauncher --class-path classes --select-class=smqa.group17.smts.tests.blackbox.Randoop1 --select-class=smqa.group17.smts.tests.blackbox.Randoop2 --select-class=smqa.group17.smts.tests.blackbox.Randoop3

# Generate code coverage report using JaCoCo
java -jar jacoco-0.8.11/lib/jacococli.jar report jacoco.exec --classfiles classes --sourcefiles src --html report