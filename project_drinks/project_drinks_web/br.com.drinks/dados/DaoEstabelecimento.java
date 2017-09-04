package dados;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.security.auth.login.LoginException;

import model.Estabelecimento;

public class DaoEstabelecimento extends DaoGenerico<Estabelecimento> implements IDaoEstabelecimento {

	public DaoEstabelecimento(EntityManagerFactory emf) {
		super(emf);
	}

	public Estabelecimento efetuarLogin(String eMail, String senha)
			throws LoginException {

		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			TypedQuery<Estabelecimento> query = em.createNamedQuery(
					"efetuarLogin", Estabelecimento.class);
			query.setParameter("eMail", eMail);
			query.setParameter("senha", senha);
			return query.getSingleResult();

		} catch (NoResultException noe) {
			System.out.println("Login/Senha Inv�lidos!");
			throw new LoginException();

		} catch (Exception e) {
			throw new LoginException();
		}

	}	

}