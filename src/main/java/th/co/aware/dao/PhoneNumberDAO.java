package th.co.aware.dao;

import java.util.List;

import th.co.aware.model.PhoneNumber;

public interface PhoneNumberDAO {
	
	public void addNumber(PhoneNumber pnb);
	
	public void delete(PhoneNumber pnb);
	
	public List<PhoneNumber> findAll();

}
