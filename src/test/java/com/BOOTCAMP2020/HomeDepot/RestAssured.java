package com.BOOTCAMP2020.HomeDepot;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

public class RestAssured {
  @Test
  public void f() {
	//Get: Listing users
	  Response server = get("https://reqres.in/api/users?page=2");
	 server.prettyPrint();
	 System.out.println(server.statusCode());
	 
	 
	 //Post: Creating user
	 File file = new File("C:\\Users\\Nigar Muneer\\eclipse-workspace\\HomeDepot\\src\\test\\java\\JSONUserFile");
	 Response post = given().contentType("application/json").body(file).post("https://reqres.in/api/users");
	 post.prettyPrint();
	 post.then().statusCode(201);
	  
  }
}
