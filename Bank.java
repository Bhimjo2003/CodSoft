/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numbergame;

import java.util.Scanner;
public class Bank {
  
	int accno,amount;

   String accname;
   
  Scanner sc=new Scanner(System.in);
   
  
 
   Bank(int accno,String accname,int amount)
   {
	   this.accno=accno;
	   this.accname=accname;
	   this.amount=amount;
   }
   
   int i=0;
  
  
	   void bigB()
	   {
		   System.out.print("**********BANK OF MAHARASHTRA*********");
		   do {
			  
		   System.out.println("\n1)Deposite\n2)Withdraw\n3)Check Balance\n4)Exit\n");
		   int choice = sc.nextInt();
		   switch(choice)
		   {
		   case 1:
			   deposite();
			   break;
			   
		   case 2:
			   withdraw();
			   break;
		   case 3:
			   check();
			   break;
		   case 4:
			   display();
			   System.exit(0);
			   
			   
		   }
		   
		   }while(true);
	   }
  
  
	   void display()
	   {
		   System.out.println("Enter 4 digit pin:");
		   int pin = sc.nextInt();
		   if(pin==1234)
		   {
			   bigB();
		   }
		   else
		   {
			   System.out.println("Entered Wrong Pin");
			   display();
		   }
		}
   void deposite()
   {
	   
	   System.out.println("Enter amount to be deposited:");
	   int dep=sc.nextInt();
	   this.amount+=dep;
	   System.out.println("Amount after deposite is:"+this.amount);
	   
   }
   
   
   void withdraw()
   {
	   
	   System.out.println("Enter amount to be withdraw:");
	   int withdraw=sc.nextInt();
	   
	   if(this.amount>withdraw)
	   {
		   this.amount-=withdraw;
		   System.out.println("Amount successfully withdrawed:");
		   
		   System.out.println("Remaining Balance is:"+this.amount);
		   
		   
	   }
	   else
	   {
		  
		   System.out.println("Insuffiecient Balance");
	   }
	   
   }
   void check()
   {
	   System.out.println("balance is:"+amount);
   }
   public static void main(String args[])
   {
	   Bank b=new Bank(1000,"Tanvi",10000);
	  b.display();
   }
}

