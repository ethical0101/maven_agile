pipeline {
    agent any

    tools {
        maven 'Maven' // Ensure Maven is installed and configured in Jenkins
        jdk 'JDK11'   // Ensure JDK is installed and configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone the repository
                git branch: 'main', url: 'https://github.com/your-repo/LMS.git'
            }
        }

        stage('Build') {
            steps {
                // Clean and compile the project
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run unit tests
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Package the application into a JAR file
                sh 'mvn package'
            }
        }

        stage('Archive') {
            steps {
                // Archive the JAR file as a build artifact
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        always {
            // Clean up workspace after build
            cleanWs()
        }
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed. Please check the logs.'
        }
    }
}