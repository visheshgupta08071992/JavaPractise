package JavaConceptOfTheDay;

//Referance : http://makeseleniumeasy.com/2020/03/04/rest-assured-tutorial-24-creating-json-array-request-body-using-list/


//		[
//		{
//		"firstname": "Amod",
//		"additionalneeds": "Breakfast",
//		"bookingdates": {
//		"checkin": "2021-08-01",
//		"checkout": "2021-08-02"
//		},
//		"totalprice": 222,
//		"depositpaid": true,
//		"lastname": "Mahajan"
//		},
//		{
//		"firstname": "Animesh",
//		"additionalneeds": "Breakfast",
//		"bookingdates": {
//		"checkin": "2021-07-01",
//		"checkout": "2021-07-01"
//		},
//		"totalprice": 111,
//		"depositpaid": true,
//		"lastname": "Prashant"
//		}
//		]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class GivenAComplexJsonPrintItUsingHashMapAndList {

	@Test
	public void generatePayload(){

		//There are two objects in the above payload, Objects represents hashmap. Within both the Objects again there
		// is one Object.  These two Objects are added in a List.

		Map<String,Object> bookingForAmod=new HashMap<String, Object>();
		bookingForAmod.put("firstname","Amod");
		bookingForAmod.put("additionalneeds","Breakfast");
		Map<String,String> bookingDatesForAmod=new HashMap<String, String>();
		bookingDatesForAmod.put("checkin","2021-08-01");
		bookingDatesForAmod.put("checkout","2021-08-02");
		bookingForAmod.put("bookingdates",bookingDatesForAmod);
		bookingForAmod.put("totalprice",222);
		bookingForAmod.put("depositpaid",true);
		bookingForAmod.put("lastname","Mahajan");


		Map<String,Object> bookingForAnimesh=new HashMap<String, Object>();
		bookingForAnimesh.put("firstname","Animesh");
		bookingForAnimesh.put("additionalneeds","Breakfast");
		Map<String,String> bookingDatesForAnimesh=new HashMap<String, String>();
		bookingDatesForAnimesh.put("checkin","2021-07-01");
		bookingDatesForAnimesh.put("checkout","2021-07-02");
		bookingForAnimesh.put("bookingdates",bookingDatesForAnimesh);
		bookingForAnimesh.put("totalprice",111);
		bookingForAnimesh.put("depositpaid",true);
		bookingForAnimesh.put("lastname","Prashant");

		List<Map<String,Object>> jsonPayload=new ArrayList<>();
		jsonPayload.add(bookingForAmod);
		jsonPayload.add(bookingForAnimesh);
		System.out.println(jsonPayload);
	}


	@Test
	public void generatePayload2(){
//		{
//			"Reshma Kadam": {
//			"age": 25,
//					"Gender": "Female"
//		},
//			"Neha Singh": {
//			"age": 27,
//					"Gender": "Female"
//		}
//		}

		Map<String,String> reshma= new HashMap<>();
		reshma.put("age","25");
		reshma.put("Gender","Female");

		Map<String,String> Neha= new HashMap<>();
		Neha.put("age","27");
		Neha.put("Gender","Female");

		Map<String,Object> payload= new HashMap<>();
		payload.put("Reshma Kadam",reshma);
		payload.put("Neha Singh",Neha);

		System.out.println(payload);



	}
}
