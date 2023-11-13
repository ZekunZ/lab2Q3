pipeline {
    agent any
    environment {
       DOCKERHUB_PWD=credentials('CredentialID_DockerHub_PWD')
    }
    stages {
        stage('Build') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ZekunZ/lab2Q3.git']])
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Docker Build') {
        	agent any
            steps {
          	    sh 'docker build -t zekunz/lab2q3:1.0 .'
            }
        }
        stage('Docker Push') {
        	agent any
            steps {
            	sh "docker login -u zekunz -p ${DOCKERHUB_PWD}"
                sh 'docker push zekunz/lab2q3:1.0'
            }
          }
        }
    }
}