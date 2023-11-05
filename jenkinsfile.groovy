pipeline {
    agent any

    stages {
        stage('Parallel Stages') {
            parallel {
                stage('Stage 1') {
                    steps {
                        echo "Hello Can"
                        
                    }
                }
                stage('Stage 2') {
                    steps {
                        echo "Dies ist Stage 2"
                    }
                }
                stage('Stage 3') {
                    steps {
                        echo "Dies ist Stage 3"
                    }
                }
            }
        }
    }

    post {
        always {
            echo "Alle Stages wurden abgeschlossen."
        }
    }
}
