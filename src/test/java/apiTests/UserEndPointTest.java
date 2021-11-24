package apiTests;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(ZeroCodeUnitRunner.class)
@TargetEnv("api.properties")
public class UserEndPointTest {
	
	@Test
	@Scenario("user_creation_test.json")
	public void user_creation() {
		
	}
	
	
	@Test
	@Scenario("login_successful.json")
	public void login_successful() {
		
	}
		
	@Test
	@Scenario("login_unsuccessful.json")
	public void login_unsuccessful() {
		
	}

}
