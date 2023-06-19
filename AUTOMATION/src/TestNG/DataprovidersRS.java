package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovidersRS {
@Test (dataProvider= "getdata")
public void usernamepassword (String username, String password){
	System.out.println(username);
	System.out.println(password);
}
@DataProvider
public Object[][] getdata() {
	//let us provide 3 set of username and password so [3]rows and [2] columns
	Object[][] data = new Object[3][2];
	//1st set
	data[0][0]="username1"; //1st row 1st column
	data[0][1]="password1";// 1st row 2nd column
	//2nd set
	data[1][0]="username2"; //2nd row 1st column
	data[1][1]="password2";// 2nd row 2nd column
	//3rd set
	data[2][0]="username3"; //3rd row 1st column
	data[2][1]="password3";// 3rd row 2nd column
	return data;
}
}
