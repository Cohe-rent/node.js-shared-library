@Library('node.js-shared-library') _  // Import Shared Library

pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo '🏗️ Building the application...'
                sh 'echo "Building application..."'
            }
        }
        
        stage('Deploy') {
            steps {
                deployApp('staging') // Calls the shared library function
            }
        }
    }
    
    post {
        success {
            echo '🎉 Pipeline executed successfully!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}
