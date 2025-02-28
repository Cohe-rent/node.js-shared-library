def call() {
    stage('Build Application') {
        steps {
            container('nodejs') {
                sh 'npm run build || echo "No build step defined, skipping..."'
            }
        }
    }
}
