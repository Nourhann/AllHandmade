package com.techprimers.mongodb.springbootmongodbexample.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techprimers.mongodb.springbootmongodbexample.document.Admin;
import com.techprimers.mongodb.springbootmongodbexample.repository.AdminRepository;

@EnableMongoRepositories
@Controller
@RequestMapping("/admins")
@SessionAttributes("id")
public class AdminController {
	    @Autowired
	    private AdminResource AdminResource;
	    @GetMapping("/")
	    public List<Admin> getAll() {
	    	try {
	        return AdminResource.getAll();
	    	}
	    	catch(Exception handlerException) {
	    		 System.out.println("Cant get All Admins");
	    		 return null;
	    	}
	    }
	    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	    public Admin getAdmin(@PathVariable("id") String id) {
	    	try{
	    		return AdminResource.getAdmin(id);
	    	}
	    	catch(Exception handlerException) {
	    		 System.out.println("Cant get Admin");
	    		 return null;
	    	}
	    }
	    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
	    public void deleteAdmin(@PathVariable("id") String id) {
	    	try{
	    		AdminResource.deleteAdmin(id);
	    	}
	    	catch(Exception handlerException) {
	    		 System.out.println("Cant delete Admin");
	    		 
	    	}
	    }
	    
	    @RequestMapping(value = "/login",  method = RequestMethod.POST)
	    @ModelAttribute("id")
	    public String AdminLogin(@RequestParam("id") String id ,@RequestParam("password") String password) {
	    	return AdminResource.AdminLogin(id, password);
	    }
	    @RequestMapping(value = "/Add",  method = RequestMethod.POST)
	    public boolean AddAdmin(@RequestParam("name") String name,@RequestParam("password") String password , @RequestParam("email") String email , @RequestParam("type") String type) {
	    	try {
	    	return AdminResource.AddAdmin(name, password, email, type);
	    	}
	    	catch(Exception handlerException) {
	    		 System.out.println("Cant Add Admin");
	    		 return false;
	    	}
	    }
}
