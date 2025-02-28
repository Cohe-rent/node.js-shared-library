def call() {
    stage('Checkout Code') {
        steps {
            git branch: 'main', url: 'https://github.com/Cohe-rent/node.js-shared-library.git'
        }
    }
}
