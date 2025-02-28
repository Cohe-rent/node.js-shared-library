@Library('node.js-shared-library') _  // Load the shared library

pipeline {
    agent {
        kubernetes {
            label 'node-agent'
            defaultContainer 'node'
            yaml """
apiVersion: v1
kind: Pod
metadata:
  labels:
    jenkins/agent: 'true'
spec:
  containers:
    - name: node
      image: node:18
      command: ['cat']
      tty: true
"""
        }
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
}
