/**
 * 
 */
package model;

import java.sql.Time;

/**
 * @author Kumar Albert
 *
 * version 1.0
 * <p> The User class acts as a model which represents User details</p>
 */
public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private long mobileNumber;
	private String password;
	private String address;
	private int createdBy;
	private Time createdAt;
	private int updatedBy;
	private Time updatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Time getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Time createdAt) {
		this.createdAt = createdAt;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Time getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Time updatedAt) {
		this.updatedAt = updatedAt;
	}

}
