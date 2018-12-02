package com.AllHandmade.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AllHandmade.entity.Item;
@Repository
public interface ItemRepository extends MongoRepository<Item, String> {

}




