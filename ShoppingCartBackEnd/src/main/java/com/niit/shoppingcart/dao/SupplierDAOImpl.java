package com.niit.shoppingcart.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Supplier;


@Repository("supplierDAO")

public  class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	private SessionFactory sessionFactory;
	 public SupplierDAOImpl(SessionFactory sessionFactory) {
		 
		this.sessionFactory = sessionFactory; 
	 }
@Transactional
public void saveOrUpdate(Supplier supplier){
	sessionFactory.getCurrentSession().saveOrUpdate(supplier);
}
@Transactional
public void delete(String id){
	Supplier SupplierToDelete = new Supplier();
	SupplierToDelete.setId(id);
	sessionFactory.getCurrentSession().delete(SupplierToDelete);
}
@Transactional
public Supplier get(String id){
	String hql="from Supplier where id="+"'"+id+"'";
	Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
	List<Supplier> listSupplier = (List<Supplier>) query.getResultList();
	
	if(listSupplier !=null&& !listSupplier.isEmpty()){
		return listSupplier.get(0);
	}
	return null;
}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Supplier>list(){
		List<Supplier>listSupplier=(List<Supplier>)
				sessionFactory.getCurrentSession()
				.createCriteria(Supplier.class).
				setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listSupplier;
				
	}
	
		
	}

		
	
		
	


