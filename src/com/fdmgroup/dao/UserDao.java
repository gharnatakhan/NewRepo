package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.Trainee;
import com.fdmgroup.model.User;

public class UserDao {
	
	private DbConnection connection;

	public UserDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	public User create(User user){
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		
		return user;
	}
	
	public Trainee create(Trainee trainee){
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(trainee);
		em.getTransaction().commit();
		em.close();
		
		return trainee;
	}
	
	public void remove(User user){
		EntityManager em = connection.getEntityManager();
		User foundUser = em.find(User.class, user.getUserId());
		em.getTransaction().begin();
		em.remove(foundUser);
		em.getTransaction().commit();
		em.close();
	}
	
/*	public void update(User user){
		EntityManager em = connection.getEntityManager();
		User foundUser = em.find(User.class, user.getUserId());
		em.getTransaction().begin();
		
		if (user.getPassword() != null && !user.getPassword().equals(""))
			foundUser.setPassword(user.getPassword());
		if (user.getFirstname() != null && !user.getFirstname().equals(""))
			foundUser.setFirstname(user.getFirstname());
		if (user.getLastname() != null && !user.getLastname().equals(""))
			foundUser.setLastname(user.getLastname());

		em.getTransaction().commit();
		em.close();
	}*/
	
	public void updateTraineeStatus(Trainee trainee) {
		EntityManager em = connection.getEntityManager();
		Trainee foundTrainee = em.find(Trainee.class, trainee.getUserId());
		em.getTransaction().begin();
		foundTrainee.setStatus(trainee.getStatus());
		em.getTransaction().commit();
		em.close();
	}
	
	public User findById(int id) {
		EntityManager em = connection.getEntityManager();
		User user = em.find(User.class, id);
		em.close();
		return user;
	}
	
	public List<User> findAll() {
		EntityManager em = connection.getEntityManager();
		TypedQuery<User> query = em.createNamedQuery("user.findAll", User.class);
		List<User> users = query.getResultList();
		em.close();
		return users;
	}
	
/*	public List<User> findAllActive() {
		EntityManager em = connection.getEntityManager();
		TypedQuery<User> query = em.createNamedQuery("user.findAllActive", User.class);
		List<User> users = query.getResultList();
		em.close();
		return users;
	}*/
	
	public User findByEmail(String uEmail) {
		EntityManager em = connection.getEntityManager();
		TypedQuery<User> query = em.createNamedQuery("user.findByEmail", User.class);
		query.setParameter("uemail", uEmail);
		List<User> users = query.getResultList();
		em.close();
		if (users != null && users.size() == 1){
			return users.get(0);
		}
		
		return null;
	}
	
/*	public List<AdminUser> findAllAdmins() {
		EntityManager em = connection.getEntityManager();
		TypedQuery<AdminUser> query = em.createNamedQuery("user.findAllAdmins", AdminUser.class);
		List<AdminUser> users = query.getResultList();
		em.close();
		return users;
	}*/
	
	public List<User> findByType(Class type) {
		EntityManager em = connection.getEntityManager();
		TypedQuery<User> query = em.createNamedQuery("user.findByType", User.class);
		query.setParameter("type", type);
		List<User> users = query.getResultList();
		em.close();
		return users;
	}

}
