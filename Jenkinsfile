node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Get some code from a GitHub repository
   //git url: 'https://github.com/jglick/simple-maven-project-with-tests.git'

   checkout scm

   //print env.getEnvironment()
   sh 'env | sort'
   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.           
   def mvnHome = tool 'MVN3'

   // Mark the code build 'stage'....
   stage 'Build'
   // Run the maven build
   sh "${mvnHome}/bin/mvn clean install"

   stage 'Test'
   sh "${mvnHome}/bin/mvn test"

    stage 'Set Version'
    def originalV = version();
    def major = originalV[0];
    def minor = originalV[1];
    def v = "${major}.${minor}-${env.BUILD_NUMBER}"
    if (v) {
       echo "Building version ${v}"
    }
    // Update the project pom.xml files
    sh "${mvnHome}/bin/mvn -B versions:set -DgenerateBackupPoms=false -DnewVersion=${v}"
    // Add the pom.xml files and create a commit+tag
    sh 'git add .'
    sh "git commit -m 'Raise version'"
    sh "git tag v${v}"

    // Create the release build
    stage 'Release Build'
    // Use the SSH Agent Plugin to forward the used ssh credentials 
    // from the jenkins master to the jenkins slave. Otherwise you may 
    // not be able to push/pull, clone
    sshagent(['Git-Jenkins']) {
      // Invoke the maven build without tests and deploy the artifacts
      sh "${mvnHome}/bin/mvn -B -DskipTests clean deploy"
      // Push the commit and the created tag
      sh "git push origin master"
      sh "git push origin v${v}"
    }
}

// Parse the pom.xml and extract the version information.
def version() {
    def matcher = readFile('pom.xml') =~ '<version>(.+)-.*</version>'
    matcher ? matcher[0][1].tokenize(".") : null
}
