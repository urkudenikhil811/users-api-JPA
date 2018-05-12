package io.usersjpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Size(min=3, max=20)
	private String name;
	
	@NotNull
	@Size(min=3, max=20)
	private String birthday;
	
	@NotNull
	@Min(1)
	private int age;
	
	public User() {
		
	}
		
	public User(String name, String birthday, int age) {		
		this.name = name;
		this.birthday = birthday;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
}
