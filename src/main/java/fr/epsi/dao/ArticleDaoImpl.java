package fr.epsi.dao;

import fr.epsi.entite.Article;
import fr.epsi.entite.Client;

import javax.persistence.EntityManager;
import javax.transaction.*;
import java.util.List;

public class ArticleDaoImpl implements ArticleDao {

	EntityManager em;
	UserTransaction utx;

	public ArticleDaoImpl(EntityManager em, UserTransaction utx) {
		this.em=em;
		this.utx=utx;
	}
	public void create(Article p) {
		try {
			utx.begin();
			em.persist(p);
			
			utx.commit();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public List<Article> getArticles() {
		return em.createQuery("select a from Article a", Article.class).getResultList();
	}
}
