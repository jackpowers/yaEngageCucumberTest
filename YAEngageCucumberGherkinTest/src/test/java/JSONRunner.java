

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/Destination"})
//src/test/java/annotation/SearchTestScenarioOutline.feature
@Cucumber.Options( 
//        features = {"classpath:src/test/java/annotation/SearchTestScenarioOutline.feature"},
        format={"json:target/Destination/cucumber.json"}) 

public class JSONRunner {

}
