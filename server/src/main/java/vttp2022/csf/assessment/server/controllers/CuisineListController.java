package vttp2022.csf.assessment.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import vttp2022.csf.assessment.server.services.RestaurantService;
import vttp2022.csf.assessment.server.models.Restaurant;


@RestController
@RequestMapping(path="/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CuisineListController {

    @Autowired
    private RestaurantService restaurantSvc;

    //should have autowried the service 

    @GetMapping("/cuisines")
    public ResponseEntity<String> getCuisines() {		

        return null;
		

    }

    @GetMapping("/{cuisine}/restaurants")
    public ResponseEntity<String> getRestaurantsByCuisine(@PathVariable String cuisine){

        return null;

    } 

    @GetMapping("/map")
    public ResponseEntity<String> getCoordinates(@RequestParam() int lat, @RequestParam() int lng){
        return null;
    }



    
}
