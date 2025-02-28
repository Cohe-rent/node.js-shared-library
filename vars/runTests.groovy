def call() {
    stage('Run Tests') {
        script {
            container('nodejs') {
                sh '''
                if [ -f package.json ]; then
                    npm test || echo "No tests found, skipping..."
                else
                    echo "package.json not found, skipping tests."
                fi
                '''
            }
        }
    }
}
