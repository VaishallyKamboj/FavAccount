package com.vk.springboot.accntdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.vk.springboot.accntdemo.entity.Bank;
import com.vk.springboot.accntdemo.entity.FavAccounts;
import com.vk.springboot.accntdemo.rest.NoDataFoundException;



@Repository
public class FavAccountDAOImpl implements FavAccountDAO {

	
	private EntityManager entityManager;
		
	
	@Autowired
	public FavAccountDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	

	@Override
	public void save(FavAccounts theacnt) {

		
		Session currentSession = entityManager.unwrap(Session.class);
		
		String bcd = theacnt.getIban();
		bcd = bcd.substring(5,9);
		int bcode = Integer.parseInt(bcd);
		
		Bank thebnk = currentSession.get(Bank.class, bcode);
				
		if(thebnk != null)
		{
				theacnt.setBankCode(bcode);
		}
		else
		{
			throw new NoDataFoundException("Bank Code is not available "+ bcd);
		}
		currentSession.saveOrUpdate(theacnt);
	}


	

}







