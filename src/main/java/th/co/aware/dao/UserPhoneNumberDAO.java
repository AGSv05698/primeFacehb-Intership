package th.co.aware.dao;

import java.util.List;

import th.co.aware.model.UserPhoneNumber;

public interface UserPhoneNumberDAO {

	public void addUserNumber(UserPhoneNumber upnb);

	public List<UserPhoneNumber> findAll();

}
