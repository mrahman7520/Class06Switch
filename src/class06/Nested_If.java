package class06;

public class Nested_If {

	public static void main(String[] args) {

		// if score is greater than or equal 60 then
		// if score is 60 to 69 then print D
		// if score is 70 to 79 then print C
		// if score is 80 to 89 the print B
		// else print A
		// unless print FAIL

		int score;
		score = 60;
		if (score >= 60) {
			if (score >= 60 && score <= 69)
				System.out.println("D");
			else if (score >= 70 && score <= 79)
				System.out.println("C");
			else if (score >= 80 && score <= 89)
				System.out.println("B");
			else
				System.out.println("A");
		} else
			System.out.println("FAIL");
//Q. Write a program if customer age is greater 
//or equal then 60 then print in console �tax will be 0%� 
//and if customer age is greater then 70  then print ("no service charge")
//and  ("discount will be added")
//Otherwise print (�tax wil be 10%");
//and if customer age is less then 25 then print 
//("service charge will be added") and ("no discount");
//	Test Input: 15, 25 ,47, 60, 65, 70,78

		double age;
		age = 20;
		if (age >= 60) {

			System.out.println("tax will be 0%");
			if (age >= 70) {
				System.out.println("no service charge");
				System.out.println("discount will be added");
			}

		} else {
			System.out.println("tax will be 10%");
			if (age < 25) {
				System.out.println("Sevice Charge will be added by Mina");
				System.out.println("no discount");
			}
		}
//Q. Write a program if customer age greater then or equal 63
//then print �Senior Citizen�.
//otherwise print � Junior Citizen�. 
//Among Junior Citizen if age is less then 12 
//than print �Baby�.
//if age is greater then or equal 12 and less then 18 
//than print �Teen� .
//if age is greater than or equal 18 
//then print �Adult�.
//Among Adult if age is greater than or equal 45 
//then print � Senior �adult�.
//if age is less then 45 then print � Junior adult�.
		System.out.println("=============================");
		int age1;
		age1 = 13;
		if (age1 >= 63)
			System.out.println("Senior Citizen");
		else {
			System.out.println("junior Citizen");

			if (age1 < 12)
				System.out.println("Baby");

			if (age1 >= 12 && age1 < 18)
				System.out.println("Teen");
			if (age1 >= 18) {
				System.out.println("Adult");
				if (age1 >= 45)
					System.out.println("Senior Adult");
				if (age1 < 45)
					System.out.println("Junior Adult");
			}
		}
		System.out.println("================");

		int num1 = 5;
		int num2 = 6;
		if (num1 != num2) {
			System.out.println("not equal");
		}
		else if (num1>num2) {
			System.out.println("num1 is greater than num2");
		}
		else if (num2>num1) {
			System.out.println("num2 is greater than num1");
		}
		else {
			System.out.println("equal");
		}
		System.out.println("++++++=======C");	
		int score1=160;
		if(score1>=164 && score1<=170)
			System.out.println("P");
		else if (score1>=160 && score1<=163)
			System.out.println("C");
		
		else if (score1>=155 && score1<=160)
			System.out.println("H");
		
		else if (score1>=149 && score1<=155)
			System.out.println("UM");
		else
			System.out.println("do more research");
		
	}// main

}// class
