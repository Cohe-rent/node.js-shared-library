def call() {
    stage('Deploy (Start Server)') {
        steps {
            container('nodejs') {
                sh 'if [ -f service.js ]; then nohup node service.js & else echo "service.js not found, skipping..."; fi'
            }
        }
    }
}
