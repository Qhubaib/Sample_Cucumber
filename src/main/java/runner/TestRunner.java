package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="G:\\SQ AHMED\\Eclipse_WorkSpace\\Qhubaib_Cucumber\\src\\main\\java\\feature\\Hooks.feature",//path of feature
		glue= {"stepDefinitions"},//path of step definition file
		plugin= {"pretty","html:test-output","json:json-output/cucumber.json","junit:ahmed_xml/cucumber.xml"},//it will generate the test-output folder & in this it will give .html output
		//And also it will give the pretty output(output will be readable format)
		dryRun=false,//it will check the mapping of feature file to step definition file
		monochrome=true, //It gives your console output in a readable format
		strict = true //it will execute the steps , but whatever the snippet we haven't defined it wont skip it 
		//Instead of skipping it will fail that particular step(it will give pendingException:TODO Implement method
		//tags= {"~@RegressionTest","@End2EndTest"}
		)

/*
 * Note: if dryRun , monochrome both are true then it will fail the junit output if any snippet code matching is not missing
 * Where as if dryRun is true it will pass the junit output if even though if any snippet code matching is not missing
 * Where as strict is true if will run the code & fail the code if anything is not matching
 * Tags Notes:
 * 	tags=("@SmokeTest") //Single Tag Execution
 * 	tags=("@SmokeTest,@RegressionTest") // This is OR Functionality - Means it will execute either SmokeTest/RegressionTest
 * 	tags=("@SmokeTest","@RegressionTest") // This is AND Functionality - Means it will execute if it satifies both
 * SmokeTest & RegressionTest(But if we ()-> Parenthesis we will get error
 * --> So we have to use {}--> Curly Braces
 * 	If we want to use to skip any Tag (So we have to use ~@SmokeTest)
 * Ignoring Scenarios:
 * 	in case of AND --> tags= {"~@RegressionTest","@End2EndTest"} Here whatever scenario is having @RegressionTest
 * 		it will get ignored(Means if the scenarios is having two/three tags @RegressionTest @SmokeTest @End2EndTest
 * 		In AND case it will all the @RegressionTest Tags(Even though these scenarios is having some more tags also)
 *  in case of OR --> tags= {"~@RegressionTest,@End2EndTest"} Here it will skip only @RegressionTest Tag
 *  	Means it will skip only those scenarios which is having one tag as @RegressionTest
 *  	Let say if the scenario is having two tags @RegressionTest @SmokeTest --> Even though we do have 
 *  		@RegressionTest in this scenario but it wont skip the above scenario
 *  One word AND/OR Difference:
 *   AND : tags= {"~@RegressionTest","@End2EndTest"} -->> It will skip All @RegressionTest Tag Scenarios
 *   OR  : tags= {"~@RegressionTest,@End2EndTest"} -->> it will skip only those scenarios which is having only one @RegressionTest Tag
 *  
*/
public class TestRunner {

}
