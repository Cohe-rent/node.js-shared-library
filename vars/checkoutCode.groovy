// vars/checkoutCode.groovy
def call(String branch = 'main', String repoUrl = 'https://github.com/Cohe-rent/coherennt.git', String credentialsId = 'your-credentials-id') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: repoUrl, credentialsId: credentialsId]],
        extensions: [[$class: 'CloneOption', depth: 1]]
    ])
}
