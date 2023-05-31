package api.endpoints;
/*
 * Swagger URI--> https://petstore.swagger.io
 * POST-Create User -- https://petstore.swagger.io/v2/user
 * GET- get user -- https://petstore.swagger.io/v2/user/{username}
 * PUT --update user -- https://petstore.swagger.io/v2/user/{username}
 * Delete--delete user -- https://petstore.swagger.io/v2/user/{username}
 */
public class Routes 
{
	public static String base_url = "https://petstore.swagger.io/v2";
	
	//endpoints for USER model
	
	public static String post_url=base_url+"/user"; // post url
	
	public static String get_url=base_url+"/user/{username}"; //get url
	
	public static String update_url=base_url+"/user/{username}"; // put url
	
	public static String delete_url=base_url+"/user/{username}"; // delete url
	

	//Store module
		//here you will create store module urls
	
	//Pet module
		//here you will create pet module urls
}
