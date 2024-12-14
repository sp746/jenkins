pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-repo.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Execute Tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Publish Reports') {
            steps {
                archiveArtifacts artifacts: 'target/extent-reports.html'
            }
        }
    }
}
