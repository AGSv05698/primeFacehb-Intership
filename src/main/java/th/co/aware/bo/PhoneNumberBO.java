package th.co.aware.bo;

import java.util.List;

import th.co.aware.model.PhoneNumber;

public interface PhoneNumberBO {
	
	public void addNumber(PhoneNumber pnb);
	
	public void delete(PhoneNumber pnb) throws Exception;
	
	public List<PhoneNumber> findAll();

}
