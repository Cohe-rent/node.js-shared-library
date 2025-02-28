def call() {
    stage('Build Application') {
        script {
            container('nodejs') {
                sh 'npm run build || echo "No build step defined, skipping..."'
            }
        }
    }
}
