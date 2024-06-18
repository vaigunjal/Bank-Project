package com.braindata.bankmanagement.model;

public class Account 
{
private String accNo;
private String name;
private String adharNo;
private String mobno;
private String gender;
private int age;
private double balance;
public String getAccNo() {
	return accNo;
}
public void setAccNo(String acc_no) {
	this.accNo = acc_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdharNo() {
	return adharNo;
}
public void setAdharNo(String adharNo) {
	this.adharNo = adharNo;
}
public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
