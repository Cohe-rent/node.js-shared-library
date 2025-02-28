def call() {
    stage('Build Application') {
        container('nodejs') {
            sh 'npm run build || echo "No build step defined, skipping..."'
        }
    }
}
