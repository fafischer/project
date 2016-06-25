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
}