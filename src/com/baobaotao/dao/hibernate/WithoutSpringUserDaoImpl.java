package com.baobaotao.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.User;

public class WithoutSpringUserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;

	public Session getSession() {
		if (sessionFactory != null) {
			return sessionFactory.openSession();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public User findUserByUserName(String userName) {
		Session session = getSession();
		if (session == null)
			return null;
		String hql = " from User u where u.userName=:userName";
		List<User> users = session.createQuery(hql)
				.setParameter("userName", userName).list();
		if (users != null && users.size() > 0)
			return users.get(0);
		else
			return null;
	}

	public int getMatchCount(String userName, String password) {
		return 0;
	}

	public void save(User user) {

	}

	public void updateLoginInfo(User user) {

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
