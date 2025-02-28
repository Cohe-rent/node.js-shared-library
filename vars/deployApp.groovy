// Shared Library Function: deployApp.groovy
def call(String env) {
    echo "🚀 Deploying to ${env} environment..."
    
    // Example Deployment Steps
    sh "echo Deploying application to ${env}"
    
    // Simulating success
    echo "✅ Deployment to ${env} completed."
}
