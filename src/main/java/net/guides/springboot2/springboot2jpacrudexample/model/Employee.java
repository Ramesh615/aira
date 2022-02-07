package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	
	private String fee;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId,String fee) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.fee=fee;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ",fee="+fee+", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}
	
}
