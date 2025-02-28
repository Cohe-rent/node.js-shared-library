@Library('node.js-shared-library') _
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkoutCode()
            }
        }
    }
}
