package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test 
{
public static void main(String[] args) 
{
    Rbi bank=new Sbi();
    Scanner sc=new Scanner(System.in);
    
    
    while(true)
    {
    	System.out.println("Enter choice:1.createAccount,2.DisplayAllDetails,3.depositeMoney,4.withdrawal,5.balanceCheck");
        int x=sc.nextInt();
    switch(x)
    {
    case 1:
          bank.createAccount();
         break;
    case 2:
    	bank.displayAllDetails();
    	break;
    case 3:
    	bank.depositeMoney();
    	break;
    case 4:
    	bank.withdrawal();
    	break;
    case 5:
    	bank.balanceCheck();
    	break;
    }
    }
    
}
}
