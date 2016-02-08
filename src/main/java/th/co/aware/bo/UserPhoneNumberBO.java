package th.co.aware.bo;

import java.util.List;

import th.co.aware.model.UserPhoneNumber;

public interface UserPhoneNumberBO {

	public void addUserNumber(UserPhoneNumber upnb);

	public List<UserPhoneNumber> findAll();

}
