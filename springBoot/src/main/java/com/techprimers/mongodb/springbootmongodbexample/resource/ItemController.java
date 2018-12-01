package com.techprimers.mongodb.springbootmongodbexample.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techprimers.mongodb.springbootmongodbexample.document.Admin;
import com.techprimers.mongodb.springbootmongodbexample.document.Item;
import com.techprimers.mongodb.springbootmongodbexample.repository.ItemRepository;

@Controller
@RequestMapping("/items")
public class ItemController {
	@Autowired
	private ItemResource itemResource ;
	@GetMapping("/")
    public ResponseEntity<List<Item>> getAll() {
        //return new ResponseEntity<>(itemResource.getAll(), HttpStatus.FOUND);
		 HttpHeaders headers = new HttpHeaders();
	     headers.add("Responded", "Items");
        return ResponseEntity.accepted().headers(headers).body(itemResource.getAll());
    }
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Item getItem(@PathVariable("id") String id) {
    	return itemResource.getItem(id);
    }
    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable("id") String id) {
    	itemResource.deleteItem(id);
    }
    
    @RequestMapping(value = "/Add",  method = RequestMethod.POST)
    public void AddItem(@RequestParam("name") String name,@RequestParam("discription") String discription , @RequestParam("price") String price , @RequestParam("urls") String url) {
    	System.out.println("hi"+name+" "+discription+" "+ price+" "+url);
    	itemResource.AddItem(name, discription, price, url);
    
    	 
    }
    
    
	
	
      
}
