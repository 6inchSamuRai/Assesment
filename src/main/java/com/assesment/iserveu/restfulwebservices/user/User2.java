package com.assesment.iserveu.restfulwebservices.user;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class User2 {
@Id	
private Integer id;
@Size(min=5, message="Name should have only Alphabets, atleast 5 character")
private String name;
@Size(min=0, message="Unique for each User")
private String username;
@Size(min=10,max=10, message="Must be 10 digits")
private Long mobnumer;
@Email
private String email;
@Size(min=2,max=10, message="Atleast 1 uppercase, 1 lower case, 1 special Symbol and 1 number")
private String password;
public User2(Integer id, String name, String username, Long mobnumer, String email, String password) {
	super();
	this.id = id;
	this.name = name;
	this.username = username;
	this.mobnumer = mobnumer;
	this.email = email;
	this.password = password;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Long getMobnumer() {
	return mobnumer;
}
public void setMobnumer(Long mobnumer) {
	this.mobnumer = mobnumer;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", username=" + username + ", mobnumer=" + mobnumer + ", email="
			+ email + ", password=" + password + "]";
}


}
