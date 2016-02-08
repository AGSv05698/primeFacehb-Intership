package th.co.aware.bo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.aware.dao.PhoneNumberDAO;
import th.co.aware.dao.UserPhoneNumberDAO;
import th.co.aware.model.PhoneNumber;
import th.co.aware.model.UserPhoneNumber;

@Service("UserPhoneNumberBOImpl")
@Transactional(readOnly = true)
public class UserPhoneNumberBOImpl implements UserPhoneNumberBO {

	@Autowired
	private UserPhoneNumberDAO upnblDAO;

	@Transactional(readOnly = false)
	public void addUserNumber(UserPhoneNumber upnb) {
		// TODO Auto-generated method stub
		upnblDAO.addUserNumber(upnb);

	}

	@Transactional
	public List<UserPhoneNumber> findAll() {
		// TODO Auto-generated method stub
		return upnblDAO.findAll();
	}

}
