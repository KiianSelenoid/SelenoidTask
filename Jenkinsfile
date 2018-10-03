pipeline {
    environment{
        GIT_SOURCE = 'https://github.com/spring-projects/spring-petclinic.git'
        BRANCH = 'master'
    }

    agent any

    stages {

        stage("Checkout"){
            steps{
                git url: "${env.GIT_SOURCE}",
                branch: "${env.BRANCH}"
                echo "Checkout successfully completed!"
            }
        }

        stage("Build and test") {
            steps{
                echo "Build and test"
                sh "sudo docker pull selenoid/chrome:65.0"
                sh "sudo docker pull selenoid/firefox:58.0"
                sh "sudo docker pull aerokube/selenoid"
                sh "sudo docker-compose up -d"
                sh "mvn clean install"
            }
        }
    }
}