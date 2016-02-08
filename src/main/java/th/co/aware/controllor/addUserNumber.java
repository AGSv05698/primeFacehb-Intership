package th.co.aware.controllor;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import th.co.aware.bo.UserPhoneNumberBO;
import th.co.aware.model.UserPhoneNumber;

public class addUserNumber {
	
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{UserPhoneNumberBOImpl}")
	private UserPhoneNumberBO userphonenumberImpl;;

	public UserPhoneNumberBO getUserPhonenumberImpl() {
		return userphonenumberImpl;
	}


	public void setUserPhonenumberImpl(UserPhoneNumberBO userphonenumberImpl) {
		this.userphonenumberImpl = userphonenumberImpl;
	}


	public List<UserPhoneNumber> getUserPhonenumbers() {
		return userphonenumbers;
	}


	public void setUserPhonenumbers(List<UserPhoneNumber> userphonenumbers) {
		this.userphonenumbers = userphonenumbers;
	}


	public UserPhoneNumber getUserPhonenumber() {
		return userphonenumber;
	}


	public void setUserPhonenumber(UserPhoneNumber userphonenumber) {
		this.userphonenumber = userphonenumber;
	}




	private List<UserPhoneNumber> userphonenumbers;
	private UserPhoneNumber userphonenumber = new UserPhoneNumber();

	@PostConstruct
	public void init() {
		this.userphonenumbers = userphonenumberImpl.findAll();
	}

	
	public UserPhoneNumberBO getUserPhoneNumberImpl() {
		return userphonenumberImpl;
	}

	
	public void setUserPhoneNumberImpl(UserPhoneNumberBO userphonenumberImpl) {
		this.userphonenumberImpl = userphonenumberImpl;
	}

	
	public List<UserPhoneNumber> getUserPhoneNumbers() {
		return userphonenumbers;
	}

	
	public void setUserPhoneNumbers(List<UserPhoneNumber> userphonenumbers) {
		this.userphonenumbers = userphonenumbers;
	}


	public UserPhoneNumber getUserPhoneNumber() {
		return userphonenumber;
	}

	
	public void setUserPhoneNumber(UserPhoneNumber userphonenumber) {
		userphonenumber= (UserPhoneNumber) userphonenumberImpl.findAll();
		this.userphonenumber = userphonenumber;
	}




	public String addUserNumber() {
		userphonenumberImpl.addUserNumber(userphonenumber);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Register User ID :"+this.userphonenumber.getUserPhoneNumbersId()+"Is Success"));
		init();
		return "";
	}

	
}


