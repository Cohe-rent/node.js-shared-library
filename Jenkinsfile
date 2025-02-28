@Library('node.js-shared-library') _  // Replace with your library name
pipeline {
    agent {
        kubernetes {
            yaml """
apiVersion: v1
kind: Pod
spec:
  restartPolicy: Never
  containers:
  - name: nodejs
    image: node:18
    command: [ "sleep", "infinity" ]
    tty: true
"""
        }
    }

    stages {
        checkoutCode()
        installDependencies()
        runTests()
        buildApplication()
        deployApplication()
    }

    post {
        success {
            echo '✅ Build and Deployment Successful!'
        }
        failure {
            echo '❌ Build Failed. Check logs for details.'
        }
    }
}
