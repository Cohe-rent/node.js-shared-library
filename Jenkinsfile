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
                    import org.mycompany.Utilities
                    echo "Uppercase: ${Utilities.toUpperCase('hello world')}"
                }
            }
        }
    }
}
