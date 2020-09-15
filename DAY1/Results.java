import java.util.*;

class Results {
	public static void main(String[] args) {
	int y;
	y=Integer.parseInt(args[0]);
	
	if(y>70)
	{
	System.out.println("First class with Distinction");}
	
	else if(y>60 && y<=70) {
	System.out.println("First class");}

	else if(y>50 && y<=60) {
	System.out.println("Second class");}

	else if(y>35 && y<=50) {
	System.out.println("Pass");}

	else if(y<=35) {
	System.out.println("Fail");}


		
}
}	