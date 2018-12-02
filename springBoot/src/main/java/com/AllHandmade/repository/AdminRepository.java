package com.AllHandmade.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AllHandmade.entity.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {
	Admin findByusername(String username);
}
