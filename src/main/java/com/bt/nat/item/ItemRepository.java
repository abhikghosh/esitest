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

	@Transactional
	public TEsitestItems update(TEsitestItems item) {
		entityManager.merge(item);
		return item;
	}

	public List<TEsitestItems> findByEin(Integer ein) {
		try {
			return entityManager
					.createNamedQuery(TEsitestItems.FIND_BY_EIN,
							TEsitestItems.class).setParameter("ein", ein)
					.getResultList();
		} catch (Exception e) {
			System.out.println("Error in findByEin");
			e.printStackTrace();
			return null;
		}
	}

	public TEsitestItems findById(Long id) {
		try {
			return entityManager.find(TEsitestItems.class, id);
		} catch (Exception e) {
			System.out.println("Error in findById");
			e.printStackTrace();
			return null;
		}
	}
}
