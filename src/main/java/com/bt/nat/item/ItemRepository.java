package com.bt.nat.item;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ItemRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<TEsitestItems> findByEin(Integer ein) {
		try {
			System.out.println("in find By ein -- "+ein);
			return entityManager.createNamedQuery(TEsitestItems.FIND_BY_EIN, TEsitestItems.class)
					.setParameter("ein", ein)
					.getResultList();
		} catch (Exception e) {
			System.out.println("Error in loading username");
			e.printStackTrace();
			return null;
		}
	}

	
}
