pipeline {
    agent any

    tools {
        maven 'Maven'  // Use the Maven version configured in Jenkins
        jdk 'Java'     // Use the JDK configured in Jenkins
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'master', url: 'https://github.com/sp746/jenkins.git'
            }
        }
        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            publishHTML([
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/extent-reports',
                reportFiles: 'index.html',
                reportName: 'ExtentReports'
            ])
        }
    }
}
