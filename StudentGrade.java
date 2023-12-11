package com.mycompany.numbergame;

import java.util.Scanner;


public class StudentGrade {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5,sum;
        float average;
        
        System.out.println("Enter 5 subject mark out of 100:");
       
        System.out.print("\nM1:");
        m1=sc.nextInt();
        System.out.print("\nM2:");
        m2=sc.nextInt();
        System.out.print("\nM3:");
        m3=sc.nextInt();
        System.out.print("\nM4:");
        m4=sc.nextInt();
        System.out.print("\nM5:");
        m5=sc.nextInt();
        
        sum=m1+m2+m3+m4+m5;
        
        average=sum/5;
        
        System.out.print(average);
        
        
        if( average>85 && average<=100)
        {
            System.out.println("Total Marks:"+sum+"Average percentage:"+average+" Grade:O");
        }
        else if( average>75 && average<=84)
        {
            System.out.println("Total Marks:"+sum+"Average percentage:"+average+" Grade:A+");
        }
        else if(average>65 && average<=74)
        {
            System.out.println("Total Marks:"+sum+"Average percentage:"+average+" Grade:A");
        }
        else if( average>55 && average<=64)
        {
            System.out.println("Total Marks:"+sum+"Average percentage:"+average+" Grade:B");
        }
        else if(average>45 && average<=54)
        {
            System.out.println("Total Marks:"+sum+"Average percentage:"+average+" Grade:C");
        }
        else
        {
            System.out.println("Total Marks:"+sum+"Average percentage:"+average+" Grade:F");
        }
        
    }
    
}
