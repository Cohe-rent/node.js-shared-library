def call() {
    stage('Install Dependencies') {
        script {
            container('nodejs') {
                sh '''
                ls -la  # Debug: Check if package.json exists
                node -v
                if [ -f package.json ]; then
                    npm install
                else
                    echo "package.json not found, skipping npm install."
                fi
                '''
            }
        }
    }
}
