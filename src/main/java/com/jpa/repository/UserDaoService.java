package com.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jpa.entity.User;


@Repository
@Transactional
public class UserDaoService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Integer insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
	
}
