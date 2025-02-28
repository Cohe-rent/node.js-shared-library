@Library('node.js-shared-library') _

pipeline {
    agent any
    stages {
        stage('Deploy') {
            steps {
                deployApp('staging')
            }
        }
        stage('Convert Text') {
            steps {
                script {
                    def result = org.mycompany.Utilities.toUpperCase('hello world')
                    echo "Uppercase: ${result}"
                }
            }
        }
    }
}
