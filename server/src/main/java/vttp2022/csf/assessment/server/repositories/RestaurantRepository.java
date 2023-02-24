package vttp2022.csf.assessment.server.repositories;

import java.util.List;
import java.util.Optional;

import org.bson.Document;
import jakarta.json.Json;
import jakarta.json.JsonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import vttp2022.csf.assessment.server.models.Comment;
import vttp2022.csf.assessment.server.models.Restaurant;

@Repository
public class RestaurantRepository {

	
	public static final String C_RESTAURANTS = "restdb";

	@Autowired
	private MongoTemplate mongoTemplate;

	


	// TODO Task 2
	// Use this method to retrive a list of cuisines from the restaurant collection
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method


	//public Rest;  

	public JsonObject toJson(Restaurant restaurant) {
		return Json.createObjectBuilder()
			.add("restaurantId", Restaurant.restaurantId)
			.add("name", Restaurant.name)
			.add("cuisine", Restaurant.cuisine)
			.add("address", Restaurant.address)
			.add("coordinates", Restaurant.coordinates)
			.add("mapUrl", Restaurant.mapUrl)
			.build();

			//not visible error -_- WHY 


	}

	public static Restaurant create(Document doc) {
		Restaurant rest = new Restaurant();
		rest.setRestaurantId(doc.getString("restaurant"));
		rest.setName(doc.getString("name"));
		rest.setCuisine(doc.getString("cuisine"));
		rest.setAddress(doc.getString("address"));
		//rest.setCoordinates(doc.getLatLng("coordinates"));
		rest.setMapURL(doc.getString("mapUrl"));

		return rest;
	}

	// query : db.restdb.distinct('cuisine')
	public List<Restaurant> getCuisines() {
		//return mongoTemplate.findDistinct(new Query(), "cuisine", C_RESTAURANTS, getClass(), String.class);
		Query query = new Query();
			return mongoTemplate.find(query, Document.class, "restdb")
				.stream()
				.map(v -> { return rest.create(v); })
				.toList();
		}



		//_answer = _answer.replaceAll("/", "_");
		//to replace all the / to _ 

		
		//now it will return the list of cuisines 
	

	// TODO Task 3
	// Use this method to retrive a all restaurants for a particular cuisine
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	//  
	public void getRestaurantsByCuisine() {
		// Implmementation in here
		//fill inn () and void 

	}

	// TODO Task 4
	// Use this method to find a specific restaurant
	// You can add any parameters (if any) 
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//  
	public Optional<Restaurant> getRestaurant() {
		// Implmementation in here

		//fill inn () 

		return null;
		
	}

	// TODO Task 5
	// Use this method to insert a comment into the restaurant database
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//  
	public void addComment(Comment comment) {
		// Implmementation in here

		
		
	}
	
	// You may add other methods to this class

}
