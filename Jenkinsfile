pipeline {
    agent any
    tools {
        jdk 'java-17'
        maven 'MAVEN'
    }
    stages {
        stage('Build') {
            steps {
                bat "mvn clean install -DskipTests"
            }
        }
    }
}