package com.techprimers.mongodb.springbootmongodbexample.repository;

import com.techprimers.mongodb.springbootmongodbexample.document.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ItemRepository extends MongoRepository<Item, String> {

}




