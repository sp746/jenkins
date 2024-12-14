pipeline {
    agent any

    tools {
        maven 'Maven'  // Ensure Maven is configured in Global Tool Configuration
        jdk 'Java'     // Ensure JDK is configured in Global Tool Configuration
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'master', url: 'https://github.com/sp746/jenkins.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn test'  // Use Windows-compatible command
            }
        }

        stage('Publish Reports') {
            steps {
                publishHTML(target: [
                    reportDir: 'target/extent-reports',
                    reportFiles: 'index.html',
                    reportName: 'Extent Reports'
                ])
            }
        }
    }

    post {
        always {
            cleanWs()  // Clean workspace after the build
        }
    }
}
