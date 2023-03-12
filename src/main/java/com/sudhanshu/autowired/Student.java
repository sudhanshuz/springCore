package com.sudhanshu.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("StudentBean")
public class Student {
@Value("Sudhanshu")
private String name;
@Value("22")
private int age;
@Autowired
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
}


}
