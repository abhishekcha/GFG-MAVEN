pipeline
{
	agent any
	tools
	{
		maven 'MAVEN_HOME'
	}
	
	stages
	{
		stage('Welcome Stage')
		{
			steps
			{
				echo 'welcome to jenkins pipeline'
			}
		}
		stage('clean Stage')
		{
			steps
			{
				bat 'mvn clean'
			}
		}  
		stage('build Stage')
		{
			steps
			{
				bat 'mvn install'
			}
		}
		stage('success Stage')
		{
			steps
			{
				echo 'successfully build'
			}
		}
		
	}


}
