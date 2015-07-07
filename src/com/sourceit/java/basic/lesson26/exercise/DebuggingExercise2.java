package com.sourceit.java.basic.lesson26.exercise;

public class DebuggingExercise2 {
	public static void main(String[] args) 
    { 
        Account a = new Account("a"); 
        a.deposit(100); 
        System.out.println(a.getOwner() + " has $" + a.getBalance()); 
        
    } 

}
