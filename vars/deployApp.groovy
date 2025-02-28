// vars/deployApp.groovy
def call(String environment) {
    pipeline {
        agent any
        stages {
            stage('Deploy') {
                steps {
                    echo "Deploying to ${environment}"
                }
            }
        }
    }
}
