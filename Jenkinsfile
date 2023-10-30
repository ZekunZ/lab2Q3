pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }
    stages {
        stage('Build') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ZekunZ/lab2Q3.git']])
                sh 'mvn -Dmaven.test.failure.ignore=true clean package'
            }
        }
    }
}