package com.AllHandmade.service;

import com.AllHandmade.entity.Admin;
import com.AllHandmade.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
@EnableMongoRepositories
@Service
public class AdminResource {
    @Autowired
    private AdminRepository adminRepository;

    public AdminResource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Admin> getAll() {
    	//System.out.println("hena");
    	List<Admin> list = adminRepository.findAll();
    	System.out.println(list.get(0).getusername());
    	//model.addAttribute("admins", adminRepository.findAll());
        return list;
        
    }
    
    public Admin getAdmin(String id) {
    	return adminRepository.findOne(id);
    }
    public void deleteAdmin(String id) {
    	 adminRepository.delete(id);
    }
   
    public String AdminLogin(String id ,String password) {
    	 Admin admin =adminRepository.findByusername(id);
    	 System.out.println(id);
    	 System.out.println(password);
    	 System.out.println(admin.getPassword());
    	 try {
    	 if(admin.getPassword().equals(password)) {
    		 System.out.println("hena");
    		 return id;
    	 }
    	 }
    	 catch(Exception e) {
    		 System.out.println("Cant find id");
    	 }
    	 return "false";
    }
    public boolean AddAdmin(String name,String password,String email ,String type) {
    	
    	Admin admin = new Admin();
    	//admin.setId(id);
    	admin.setusername(name);
    	admin.setPassword(password);
    	admin.setEmail(email);
    	admin.setType(type);
    	
    	adminRepository.save(admin);
    	return true;
    	 
    }
    
    
    
    
    
}
