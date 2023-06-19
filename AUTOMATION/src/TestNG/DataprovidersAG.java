package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovidersAG {
@Test (dataProvider= "getdata")
public void usernamepassword (String username, String password){
	System.out.println(username);
	System.out.println(password);
}
@DataProvider
public Object[][] getdata() {
	
	return new Object[][] {{"username_A", "password_A" },{"username_B", "password_B"},{"username_C", "password_C"}};
}
}
