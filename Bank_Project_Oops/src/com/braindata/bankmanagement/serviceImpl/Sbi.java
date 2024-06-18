package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;


import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi
{
	Account a=new Account();
	Scanner sc=new Scanner(System.in);
public void createAccount()
{
	System.out.println("Enter Account No:");
	String acc_no=sc.next();
	long a1=acc_no.length();
	if(a1>=11)
	{
		a.setAccNo(acc_no);
		System.out.println("Account Number is valid");
	}
	else
	{
		System.out.println("Account Number is Invalid");
	}
	System.out.println("Enter Name:");
	a.setName(sc.next()+sc.nextLine());
	System.out.println("Enter AdharNo:");
	String adharno=sc.next();
	System.out.println("Enter Moblie Number:");
	 String x=sc.next();
	long number=x.length();
	if (number>1000000000 && number<9999999999L)
	{
		a.setMobno(x);
		System.out.println("Number is Valid");
	}
	else
	{
		System.out.println("Number is Invalid");
	}
	System.out.println("Enter Gender:");
	a.setGender(sc.next()+sc.nextLine());
	 String gender ="male/female";
	 switch(gender)
	 {
	 case "M":
	 case "m":
		 System.out.println("Male");
		break;
	 case "F":
	 case "f":
		 System.out.println("Female");
		 break;
	 default:
		 System.out.println("Unspecified Gender");
	 }
	
	System.out.println("Enter Age:");
    int age=sc.nextInt();
	if(age>=18)
	{
		a.setAge(age);
		System.out.println("Age is valid");
	}
	else
	{
		System.out.println("age Invalid");
	}
}
 public void displayAllDetails()
 {
	 System.out.println("Account No:"+a.getAccNo());
	 System.out.println("Name:"+a.getName());
	 System.out.println("MobileNo:"+a.getMobno());
	 System.out.println("AdharNo:"+a.getAdharNo());
	 System.out.println("Gender"+a.getGender());
	 System.out.println("Age"+a.getAge());
	 System.out.println("Balance:"+a.getBalance());
	
 }
 public void depositeMoney()
 {
	 System.out.println("Enter Deposite Money:");
	 double d=sc.nextDouble();
	 double dep=a.getBalance()+d;
	 a.setBalance(dep);
	 System.out.println("Deposit successful. Updated balance: " );
 }
 public void withdrawal()
 {
	 System.out.println("Enter Withdrawal Amount:");
	 double withdrawal=sc.nextDouble();
	 double withdrawal1=a.getBalance()-withdrawal;
	 a.setBalance(withdrawal1);
	 System.out.println("WithDrawal Successfully");
	 
 }
 public void balanceCheck()
 {
	 System.out.println("Balance check:"+a.getBalance());
 }
}
