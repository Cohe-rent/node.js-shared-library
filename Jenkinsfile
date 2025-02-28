podTemplate(
    label: 'node-agent',
    containers: [
        containerTemplate(
            name: 'jnlp',
            image: 'node:18', // Official Node.js image with npm
            alwaysPullImage: true,
            ttyEnabled: true,
            command: 'cat'
        )
    ]
) {
    node('node-agent') {
        stage('Checkout Code') {
            checkout scm
        }

        stage('Install Dependencies') {
            container('jnlp') {
                sh 'npm install'
            }
        }

        stage('Run Tests') {
            container('jnlp') {
                sh 'npm test'
            }
        }

        stage('Build Application') {
            container('jnlp') {
                sh 'npm run build'
            }
        }

        stage('Deploy Application') {
            container('jnlp') {
                sh './deploy.sh' // Change this based on your deployment process
            }
        }
    }
}
