pipeline {
 agent any
 options {
   buildDiscarder(logRotator(numToKeepStr: '5'))
 }
 stages('Build') {
  sh '.mvnw clean install site surefire-report:report'
  sh 'tree'
 }
}
