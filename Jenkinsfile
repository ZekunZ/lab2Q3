pipeline {
    agent any
    tools {
        jdk 'java-17'
        maven 'MAVEN'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}