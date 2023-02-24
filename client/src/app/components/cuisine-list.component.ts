import { Component, OnInit } from '@angular/core';
import { Restaurant } from '../models';
import { RestaurantService } from '../restaurant-service';

@Component({
  selector: 'app-cuisine-list',
  templateUrl: './cuisine-list.component.html',
  styleUrls: ['./cuisine-list.component.css']
})
export class CuisineListComponent implements OnInit{

  cuisines: Restaurant[] = []

  constructor(private restSvc: RestaurantService) { }
  
  ngOnInit(): void {
      this.restSvc.getCuisineList()
        .then(result => {
          this.cuisines = result
          //console.info['result: ', result]
        })
        .catch(error => {
          console.error('>>>>>>error:', error);
        })
  }

	// TODO Task 2
	// For View 1
  


}


