import java.util.*;

class Summaxmin {
	public static void main(String[] args) {
		int a = args.length;
		int max, sum, min;
		sum=0;
		int[] x = new int[10];
		for(int i=0;i<a;i++)
		{
		x[i]=Integer.parseInt(args[i]); }
		for(int i = 0;i<a;i++)
		{sum+=x[i];}

		max=x[0];
		

		for(int i = 1;i<a;i++)
		{if(x[i]>max){
			max=x[i];}}

		
		min=x[0];
		for(int i = 1;i<a;i++)
		{if(x[i]<min){
			min=x[i];}}

		System.out.println("Sum: "+sum);
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
}
}