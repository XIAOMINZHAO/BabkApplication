package BankApplication;

import java.util.Scanner;

public class BankEntrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BankAccount a = new BankAccount();
		
		
		int option = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to AAA BankApplication. How can I help? Slecte option from below:");
		System.out.println("1 -- Show Account Balance\n 2 -- Deposit Money\n 3 -- Withdraw Money\n 4 -- Exit program");
		String s = scan.nextLine();
		option = Integer.parseInt(s);
		
		switch(option){
		
		case 1:
			a.getBalance();
		    break;
		case 2:
			
			System.out.println("how much do you want to deposite? please enter number");
			String s1 = scan.nextLine();
			int n = Integer.parseInt(s1);
			a.deposite(n);
			break;
		case 3:
			
			System.out.println("how much do you want to withdraw? please enter number");
			String s2 = scan.nextLine();
			int n1 = Integer.parseInt(s2);
			a.withdraw(n1);
			break;
			
		default:
			System.out.println("Cannot process with request.");
			
			
		
			
		}
		

	}

}
