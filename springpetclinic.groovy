node {
    stage('Prepare') {
    // some block
    deleteDir()
    git 'https://github.com/prasanthbangs2016/spring-petclinic.git'
    }
    
    stage('Build'){
    bat 'mvn package'
    }
    
    stage('Artifact'){
        archiveArtifacts 'target/spring-*.jar'
    }
    
}
