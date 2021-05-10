package com.nt.controller;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.InvtBank;
import com.nt.entity.UserEntity;
import com.nt.service.UserService;

@RestController
public class UserController {

	@Autowired(required=true)
	private UserService userService;
	
	@GetMapping("/get")
	public List<UserEntity> getAllDataFronDatabase()
	{
		return this.userService.getAllDataFromData();
	}
	

	@PostMapping("/post")
	public UserEntity postAllDataInDataBase(@RequestBody UserEntity userEntity )
	{
		
		return this.userService.postDatainDatabse(userEntity);
	}
	
	
	@GetMapping("/get/{id}")
	public UserEntity findById(@PathVariable int id) {
	    
	    return this.userService.FindByIdMethod(id) ;
	  }
	

	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable(name="id") int id)
	{
		return this.userService.deleteById(id);
	}
	
	@DeleteMapping("/delete")
	public String DeleteAll()
	{
		return this.userService.deleteAll();
	}
	
	  @PutMapping("/update/{id}")
	  public UserEntity replaceLogIn(@RequestBody UserEntity userEntity, @PathVariable(name="id") int id) {
	  
		 return this.userService.updateUser(userEntity,id);
	  }

	
	  @GetMapping("/bank")
	  public List<InvtBank> updateBank()
	  {
		  return this.userService.userBankUpdata();
	  }
	  
	  @PutMapping("/bankup/{id}")
	public InvtBank updateBank(@RequestBody InvtBank invtBank,@PathVariable(name="id") int id)
	{
		return this.userService.updateBankYesNo(invtBank, id);
	}
	  
	
}
