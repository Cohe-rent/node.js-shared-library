def call() {
    stage('Checkout Code') {
        git branch: 'main', url: 'https://github.com/Cohe-rent/node.js.git'
    }
}
