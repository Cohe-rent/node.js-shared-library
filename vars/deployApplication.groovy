def call() {
    stage('Deploy (Start Server)') {
        script {
            container('nodejs') {
                sh '''
                if [ -f service.js ]; then
                    nohup node service.js > server.log 2>&1 &
                    echo "Server started successfully."
                else
                    echo "service.js not found, skipping..."
                fi
                '''
            }
        }
    }
}
