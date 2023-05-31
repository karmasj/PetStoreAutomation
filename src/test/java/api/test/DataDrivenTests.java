package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DataDrivenTests 
{
	
	@Test(priority=1, dataProvider="Data", dataProviderClass =DataProviders.class)
	public void testPostUser(String userID, String userName, String fname, String lName, String email, String pwd, String ph)
	{
		User userPayLoad = new User();
		userPayLoad.setId(Integer.parseInt(userID));
		userPayLoad.setUsername(userName);
		userPayLoad.setFirstName(fname);
		userPayLoad.setLastName(lName);
		userPayLoad.setEmail(email);
		userPayLoad.setPassword(pwd);
		userPayLoad.setPhone(ph);
		
		Response response=UserEndpoints.createUser(userPayLoad);
		//response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority=2, dataProvider="UserNames", dataProviderClass =DataProviders.class)
	public void testDeleteUserByName(String userName) 
	{
		Response response=UserEndpoints.deleteUser(userName);
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
