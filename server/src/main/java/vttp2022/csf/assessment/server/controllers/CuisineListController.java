package vttp2022.csf.assessment.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import vttp2022.csf.assessment.server.services.RestaurantService;


;


@RestController
@RequestMapping(path="/api/cuisines", produces = MediaType.APPLICATION_JSON_VALUE)
public class CuisineListController {

    @Autowired
    private RestaurantService restaurantSvc;

    //should have autowried the service 

    @GetMapping
    public ResponseEntity<String> getCuisines() {		

        List<String> cuisines = restaurantSvc.getCuisines();

        //displayes the results as a json array 

		JsonArrayBuilder arrBuilder = Json.createArrayBuilder();
		for (String c: cuisines)
			arrBuilder.add(c);

		return ResponseEntity.ok(arrBuilder.build().toString());


    }




    
}
