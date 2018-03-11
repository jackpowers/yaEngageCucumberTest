

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(
//        features = {"classpath:src/test/java/annotation/SearchTestScenarioOutline.feature"},
        format = {"pretty", "html:target/Destination"})

public class RunTest {

}
