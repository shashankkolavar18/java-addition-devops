pipeline {
    agent any

    tools {
        jdk 'JDK 21'
    }

    environment {
        PATH = "/opt/homebrew/bin:/opt/homebrew/opt/openjdk@21/bin:$PATH"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
                sh '/opt/homebrew/bin/mvn clean test'
            }
        }

        stage('Package JAR') {
            steps {
                sh '/opt/homebrew/bin/mvn package -DskipTests'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the console output.'
        }
    }
}