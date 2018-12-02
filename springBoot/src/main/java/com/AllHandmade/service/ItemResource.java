package com.AllHandmade.service;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.AllHandmade.entity.Item;
import com.AllHandmade.repository.ItemRepository;
@EnableMongoRepositories
@Service
public class ItemResource {
	@Autowired 
	private ItemRepository itemRepository;
    public List<Item> getAll() {

    	try {
    	return itemRepository.findAll();
    	//System.out.println(list.size());
    	}
    	catch(Exception e) {
    		System.out.println("Cant get items");
    	}
        return null;    
    }
    public Item getItem(String id) {
    	try {
    	return itemRepository.findOne(id);
    	}
    	catch(Exception handlerException) {
    		System.out.println("Cant find item");
    		return null;
    	}
    	}
    public void deleteItem(String id) {
    	try {
    	itemRepository.delete(id);
    	}
    	catch(Exception handlerException) {
    		System.out.println("Cant delete item");
    	}
    }
    public void AddItem(String Name , String Discription , String Price ,String Url) 
    {
         Item item = new Item();
         item.setName(Name);
         item.setDiscription(Discription);
         item.setPrice(Price);
         item.setUrl(Url);
         //System.out.println("llll"+item.getName()+item.getDiscription()+item.getPrice()+item.getUrl());
         //itemRepository.deleteAll();
         try {
        	 itemRepository.save(item);
         } catch (Exception handlerException) {
             System.out.println("Cant save item");
         }
        
         
    }
    
}
