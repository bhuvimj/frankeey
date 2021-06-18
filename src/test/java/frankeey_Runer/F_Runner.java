package frankeey_Runer;

import org.junit.runner.RunWith;

import Base.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\frankey\\featr\\frankey.feature",glue="frankey//stepdef")
public class F_Runner extends Base_Class {
	

}
