package th.co.aware.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import th.co.aware.model.UserPhoneNumber;

@Component
public class UserPhoneNumberDAOImpl implements UserPhoneNumberDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUserNumber(UserPhoneNumber upnb) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(upnb);
		tx.commit();
		session.close();

	}

	@SuppressWarnings("unchecked")
	public List<UserPhoneNumber> findAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<UserPhoneNumber> userphonenumberList = session.createCriteria(UserPhoneNumber.class).list();
		session.close();
		return userphonenumberList;
	}

}
