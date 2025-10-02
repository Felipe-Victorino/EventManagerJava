package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public abstract class Dao<T> implements InterfaceDao<T>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenciaPU");

	Class<T> cls;

	public Dao(Class<T> cls){
		this.cls = cls;
	}

	public void insert(T t){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	};
	public void delete(T t){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		em.close();
	};
	public void update(T t){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	};
	public T searchBy(long id){
		EntityManager em = emf.createEntityManager();
		try{
			return em.find(cls, id);
		} finally{
			em.close();
		}
	};
	public List<T> searchAll(){
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("from " + cls.getSimpleName());
		return (List<T>) query.getResultList();
	};
}