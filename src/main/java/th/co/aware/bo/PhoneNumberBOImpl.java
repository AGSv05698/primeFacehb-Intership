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
import th.co.aware.model.PhoneNumber;

@Service("PhoneNumberBOImpl")
@Transactional(readOnly = true)
public class PhoneNumberBOImpl implements PhoneNumberBO {

	@Autowired
	private PhoneNumberDAO pnblDAO;

	@Transactional(readOnly = false)
	public void addNumber(PhoneNumber pnb) {
		// TODO Auto-generated method stub
		pnblDAO.addNumber(pnb);

	}
	
	public void delete(PhoneNumber pnb) throws Exception {
		if(pnb == null || pnb.getNo() == null){
			throw  new Exception("number doesn't exist");
		}else{
			pnblDAO.delete(pnb);
		}
		
	}

	@Transactional
	public List<PhoneNumber> findAll() {
		// TODO Auto-generated method stub
		return pnblDAO.findAll();
	}

}
