def call() {
    stage('Install Dependencies') {
        steps {
            container('nodejs') {
                sh 'ls -la'  // Debug: Check if package.json exists
                sh 'node -v'
                sh 'npm install'
            }
        }
    }
}
