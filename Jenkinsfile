pipeline {
    agent any

    stages {

        stage("Build and test") {
            steps{
                echo "Build and test"
                sh "sudo docker-compose up"
                sh "mvn clean install"
            }
        }
    }
}