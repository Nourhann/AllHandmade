package com.techprimers.mongodb.springbootmongodbexample.repository;

import com.techprimers.mongodb.springbootmongodbexample.document.Admin;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {
}
