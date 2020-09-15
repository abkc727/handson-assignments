import java.util.*;

class TaxC {
	public static void main(String[] args) {
	double pay;
	pay=0;
	char state = args[0].charAt(0);
	double p = Double.parseDouble(args[1]);
	switch(state) {
		case 'K': 
			pay = p+(p*(10.1/100));
			break;

		case 'M': 
			pay = p+(p*(9.1/100));
			break;

		case 'J': 
			pay = p+(p*(9.5/100));
			break;


		case 'G': 
			pay = p+(p*(10.5/100));
			break;

		default: pay = p;
}

		System.out.println("Payable: "+p);





		
}
}	