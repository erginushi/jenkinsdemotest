pipeline {
  agent none
  stages {
    stage('Maven Install') {
      agent {
        docker {
          image 'maven:3.5.0'
        }
      }
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
      agent any
      steps {
	sh 'sudo docker stop spring'
	sh 'sudo docker rm spring'
        sh 'sudo docker build -t springdemo .'
	sh 'sudo docker run -d --name spring -p 4567:4567 springdemo'
      }
    }
  }
}
