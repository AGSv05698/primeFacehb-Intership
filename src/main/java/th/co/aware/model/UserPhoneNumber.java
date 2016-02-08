package th.co.aware.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the user_phone_numbers database table.
 * 
 */
@Entity
@Table(name = "user_phone_numbers")
@NamedQuery(name = "UserPhoneNumber.findAll", query = "SELECT u FROM UserPhoneNumber u")
public class UserPhoneNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_phone_numbers_id")
	private int userPhoneNumbersId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "billing_date")
	private Date billingDate;

	private String isactive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_date")
	private Date registerDate;

	private String type;

	@Column(name = "id_card_number")
	private String idCardNumber;

	// bi-directional many-to-one association to PhoneNumber
	@ManyToOne
	@JoinColumn(name = "no")
	private PhoneNumber phoneNumber;

	// bi-directional many-to-one association to MainPackage

	@Column(name = "main_package_id")
	private int mainPackage;

	public UserPhoneNumber() {
	}

	public int getUserPhoneNumbersId() {
		return this.userPhoneNumbersId;
	}

	public void setUserPhoneNumbersId(int userPhoneNumbersId) {
		this.userPhoneNumbersId = userPhoneNumbersId;
	}

	public Date getBillingDate() {
		return this.billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PhoneNumber getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public int getMainPackage() {
		return mainPackage;
	}

	public void setMainPackage(int mainPackage) {
		this.mainPackage = mainPackage;
	}

}