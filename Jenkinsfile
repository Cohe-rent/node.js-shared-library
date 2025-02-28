pipeline {
    agent {
        kubernetes {
            yaml '''
            apiVersion: v1
            kind: Pod
            metadata:
              labels:
                jenkins/label: jenkins-agent
            spec:
              containers:
              - name: jnlp
                image: jenkins/inbound-agent:latest
                resources:
                  limits:
                    memory: 512Mi
                    cpu: 512m
                  requests:
                    memory: 512Mi
                    cpu: 512m
            '''
        }
    }

    environment {
        REPO_URL = 'https://github.com/Cohe-rent/node.js-shared-library.git'
        BRANCH = 'main'
    }

    stages {
        stage('Checkout Code') {
            steps {
                script {
                    checkout scmGit(
                        branches: [[name: env.BRANCH]],
                        userRemoteConfigs: [[url: env.REPO_URL]]
                    )
                }
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'npm install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'npm test'
            }
        }

        stage('Build Application') {
            steps {
                sh 'npm run build'
            }
        }

        stage('Deploy Application') {
            steps {
                sh 'echo "Deploying application..."'
                // Add your deployment commands here
            }
        }
    }

    post {
        success {
            echo 'Build and deployment successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
