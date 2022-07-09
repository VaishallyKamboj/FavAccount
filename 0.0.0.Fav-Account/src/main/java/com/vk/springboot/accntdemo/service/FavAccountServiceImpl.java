package com.vk.springboot.accntdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.springboot.accntdemo.dao.FavAccountDAO;
import com.vk.springboot.accntdemo.entity.FavAccounts;
@Service
public class FavAccountServiceImpl implements FavAccountService {
	
	private FavAccountDAO acntdao;
	
	@Autowired
	public FavAccountServiceImpl(FavAccountDAO theacntdao)
	{
		acntdao=theacntdao;
	}


	@Override
	@Transactional
	public void save(FavAccounts theacnt) {
		// TODO Auto-generated method stub
		acntdao.save(theacnt);

	}



}
