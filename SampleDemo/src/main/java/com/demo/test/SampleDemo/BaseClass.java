package com.demo.test.SampleDemo;

import java.io.FileReader;

import java.nio.file.Paths;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static String UserDir = Paths.get(".").toAbsolutePath().normalize().toString();
	public static Object obj;
	public static JSONObject jsonObject;

	// This method is created to load the Json file and store the Json Objects
	
	@BeforeSuite()
	public static void setUp() throws Exception {
		obj = new JSONParser().parse(new FileReader(UserDir + "/Resources/testdata.json"));
		jsonObject = (JSONObject) obj;

		try {
			String name = (String) jsonObject.get("name");
			System.out.println("Name: " + name);
			String location = (String) jsonObject.get("location");
			System.out.println("Location: " + location);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
