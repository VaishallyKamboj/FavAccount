package com.vk.springboot.accntdemo.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vk.springboot.accntdemo.entity.FavAccounts;
import com.vk.springboot.accntdemo.service.FavAccountService;
@RestController
public class FavAccountController {
	
	private FavAccountService acntdao;

	@Autowired
	public FavAccountController(FavAccountService theacntdao)
	{
		acntdao = theacntdao;
	}
	

	@PutMapping("/favaccounts")
	public FavAccounts updateAccount(@Valid @RequestBody FavAccounts favact)
	{
		 
		acntdao.save(favact); 
		 return favact;
	}
	

}
