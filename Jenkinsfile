pipeline {
    environment{
        GIT_SOURCE = 'https://github.com/KiianSelenoid/SelenoidTask.git'
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
                sh "docker-compose up"
                sh "mvn clean install"
            }
        }
    }
}