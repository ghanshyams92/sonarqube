#!groovy
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

try {
stage("Building SONAR ...") {
sh './gradlew clean sonarqube'
}
} catch (e) {emailext attachLog: true, body: 'See attached log', subject: 'BUSINESS Build Failure', to: 'ghanshyams92@gmail.com'
step([$class: 'WsCleanup'])
return
}
sonarqube {
properties {
property "sonar.host.url", http://sonar2033.inmbzp7033.in.dst.ibm.com/ //  url is your sonar server
property "sonar.projectName", "project  display name"   //  this name will appear in dashboard
property "sonar.projectKey", "projectKey" // It sould be a keybased on this report is created
property "sonar.groovy.jacoco.reportPath", "${project.buildDir}/jacoco/test.exec"    }
}
