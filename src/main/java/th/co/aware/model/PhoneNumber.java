package th.co.aware.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
//import java.util.List;

/**
 * The persistent class for the phone_numbers database table.
 * 
 */
@Entity
@Table(name = "phone_numbers")
// @NamedQuery(name="PhoneNumber.findAll", query="SELECT p FROM PhoneNumber p")
public class PhoneNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "no")
	private String no;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created")
	private Date created;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "status")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated")
	private Date updated;

	// bi-directional many-to-one association to UserPhoneNumber
	// @OneToMany(mappedBy="phoneNumber")
	// private List<UserPhoneNumber> userPhoneNumbers;

	public PhoneNumber() {
	}

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	
	// public List<UserPhoneNumber> getUserPhoneNumbers() {
	// return this.userPhoneNumbers;
	// }
	//
	// public void setUserPhoneNumbers(List<UserPhoneNumber> userPhoneNumbers) {
	// this.userPhoneNumbers = userPhoneNumbers;
	// }
	//
	// public UserPhoneNumber addUserPhoneNumber(UserPhoneNumber
	// userPhoneNumber) {
	// getUserPhoneNumbers().add(userPhoneNumber);
	// userPhoneNumber.setPhoneNumber(this);
	//
	// return userPhoneNumber;
	// }
	//
	// public UserPhoneNumber removeUserPhoneNumber(UserPhoneNumber
	// userPhoneNumber) {
	// getUserPhoneNumbers().remove(userPhoneNumber);
	// userPhoneNumber.setPhoneNumber(null);
	//
	// return userPhoneNumber;
	// }

}