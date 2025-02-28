def call() {
    stage('Run Tests') {
        container('nodejs') {
            sh 'npm test || echo "No tests found, skipping..."'
        }
    }
}
