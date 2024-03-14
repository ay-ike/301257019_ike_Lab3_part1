pipeline {
    environment {
        registry = "amonte13/301257019_ike_lab3_q1"
        registryCredential = 'd41c1b45-f854-4417-8c00-1589c6444813'
        dockerImage = ''
    }
    agent any

    tools{
		maven "MAVEN3"
		jdk "JDK"
	}
    
    stages {
        
        stage('Cloning Git') {
            steps {
                git branch: 'main', url: 'https://github.com/ay-ike/301257019_ike_Lab3_part1'
            }
        }

        stage('Maven Build') { 
            steps {
                bat "mvn clean compile"
            }
        }
        
        stage('Building image') {
            steps{
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        stage('Deploy image') {
            steps{
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}
