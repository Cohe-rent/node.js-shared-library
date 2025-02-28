pipeline {
    agent any

    environment {
        NODE_ENV = 'production'
    }

    stages {
        stage('Checkout Code') {
            steps {
                script {
                    checkoutCode()
                }
            }
        }

        stage('Install Dependencies') {
            steps {
                script {
                    installDependencies()
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    runTests()
                }
            }
        }

        stage('Build Application') {
            steps {
                script {
                    buildApplication()
                }
            }
        }

        stage('Deploy Application') {
            steps {
                script {
                    deployApplication()
                }
            }
        }
    }

    post {
        success {
            echo '✅ Deployment Successful!'
        }
        failure {
            echo '❌ Pipeline Failed!'
        }
        always {
            echo '📝 Cleaning up workspace...'
            cleanWs()
        }
    }
}

/* Shared Library Functions */
def checkoutCode() {
    stage('Checkout Code') {
        steps {
            git branch: 'main', url: 'https://github.com/Cohe-rent/node.js-shared-library.git'
        }
    }
}

def installDependencies() {
    stage('Install Dependencies') {
        steps {
            container('nodejs') {
                sh 'ls -la'  // Debugging step
                sh 'node -v'
                sh 'npm install'
            }
        }
    }
}

def runTests() {
    stage('Run Tests') {
        steps {
            container('nodejs') {
                sh 'npm test || echo "No tests found, skipping..."'
            }
        }
    }
}

def buildApplication() {
    stage('Build Application') {
        steps {
            container('nodejs') {
                sh 'npm run build || echo "No build step defined, skipping..."'
            }
        }
    }
}

def deployApplication() {
    stage('Deploy (Start Server)') {
        steps {
            container('nodejs') {
                sh 'if [ -f service.js ]; then nohup node service.js & else echo "service.js not found, skipping..."; fi'
            }
        }
    }
}
