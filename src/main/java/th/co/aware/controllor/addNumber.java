package th.co.aware.controllor;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


import th.co.aware.bo.PhoneNumberBO;
import th.co.aware.model.PhoneNumber;

@ManagedBean
@SessionScoped
public class addNumber implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{PhoneNumberBOImpl}")
	private PhoneNumberBO phonenumberImpl;;

	public PhoneNumberBO getPhonenumberImpl() {
		return phonenumberImpl;
	}


	public void setPhonenumberImpl(PhoneNumberBO phonenumberImpl) {
		this.phonenumberImpl = phonenumberImpl;
	}


	public List<PhoneNumber> getPhonenumbers() {
		return phonenumbers;
	}


	public void setPhonenumbers(List<PhoneNumber> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}


	public PhoneNumber getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(PhoneNumber phonenumber) {
		this.phonenumber = phonenumber;
	}




	private List<PhoneNumber> phonenumbers;
	private PhoneNumber phonenumber = new PhoneNumber();

	@PostConstruct
	public void init() {
		this.phonenumbers = phonenumberImpl.findAll();
	}

	
	public PhoneNumberBO getPhoneNumberImpl() {
		return phonenumberImpl;
	}

	
	public void setPhoneNumberImpl(PhoneNumberBO phonenumberImpl) {
		this.phonenumberImpl = phonenumberImpl;
	}

	
	public List<PhoneNumber> getPhoneNumbers() {
		return phonenumbers;
	}

	
	public void setPhoneNumbers(List<PhoneNumber> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}


	public PhoneNumber getPhoneNumber() {
		return phonenumber;
	}

	
	public void setPhoneNumber(PhoneNumber phonenumber) {
		phonenumber= (PhoneNumber) phonenumberImpl.findAll();
		this.phonenumber = phonenumber;
	}
	
	public String delete() {
		try {
			phonenumberImpl.delete(phonenumber);
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("The Phone Number " + e.getMessage()));
		}

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("this Phone Number " + this.phonenumber.getNo() + "Is Deleted."));
		init();
		return "";
	}

	public String addNumber() {
		phonenumberImpl.addNumber(phonenumber);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Phonenumber :"+this.phonenumber.getNo()+"Is Success"));
		init();
		return "";
	}

	
}
