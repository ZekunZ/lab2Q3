pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ZekunZ/lab2Q3.git']])
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}