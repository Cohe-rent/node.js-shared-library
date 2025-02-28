@Library('node.js-shared-library') _
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                script {
                    checkoutCode('main', 'https://github.com/Cohe-rent/node.js-shared-library.git')
                }
            }
        }
    }
}
