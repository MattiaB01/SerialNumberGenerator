package main;

import java.util.Random;

public class CreaSN implements GeneratorSN{

	public boolean controlla(String a)
	{
		char str[] = new char[4];
		int n=0;
		for (int k=0;k<3;k++)
		{
		for (int i=0;i<4;i++)
		{
			str[i+n]=a.charAt(i+n);
		}
		a+=5;
		if (!verificaSN(str)) return false;
		}
		return true;
	}
	
	public boolean verificaSN(char[] ch1)
	{
		//rende maiuscolo 
		if (ch1[0]>96) ch1[0]-=32;
		if (ch1[1]>96) ch1[1]-=32;
		if (ch1[2]>96) ch1[2]-=32;
		if (ch1[3]>96) ch1[3]-=32;
		
		int a= ch1[3];
		int controllo = ch1[0] + ch1[1]- ch1[2] +3;
		if (a==controllo) return true;
		else return false;
	}
	
}
