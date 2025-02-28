pipeline {
    agent any

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
}
