package main;

import java.util.Random;

public interface GeneratorSN {

	public static String serialnumber()
	{	
		String serial="";
		for(int i=0;i<2;i++)
		{
		char a[] = GeneratorSN.random();
		serial+=a[0]+""+a[1]+""+a[2]+a[3]+"-";
		}
		char a[] = GeneratorSN.random();
		serial+=a[0]+""+a[1]+""+a[2]+a[3];
		
		return serial;
	}

	public static char[] random() {
		Random random= new Random();
		//codice ascii da 48 a 90 escluso da 58 a 64
		char []code=new char[4];
		int a=48;
		int b=90;
		int c=((b-a)+1);
		int d[]= new int[4];
		for(int i=0;i<3;i++)
		{
			do {
				
				d[i]=(random.nextInt(c)+a);
			} while (57<d[i] && d[i]<65);
			char char1 = (char)d[i]; 
			code[i]=char1;
		}
		
		d[3]=d[0]+d[1]-d[2]+3;
		
		while ((d[3]<65 && d[3]>57) || d[3]>90 || d[3]<48 )
		{
			
			do {
				
				d[2]=(random.nextInt(c)+a);
				code[2]=(char)d[2];
			
			} while (57<d[2] && d[2]<65);
			
		d[3]=d[0]+d[1]-d[2]+3;
				
		}
		char char1= (char)d[3] ;
		code[3]=char1;
		
		//System.out.println(code);
				
		return code;
		
		
	
	}
	public boolean controlla(String a);	
	
	public boolean verificaSN(char[] ch1);
	
	
}
