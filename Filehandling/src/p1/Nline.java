package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Nline {
	public void readline(int k) throws IOException
	{
	String a;
	File f=new File("c://users/suman.gujja/Desktop/su.txt");
	FileReader fr=new FileReader(f);
	BufferedReader fb=new BufferedReader(fr);
	int b=0;
	while((a=(fb.readLine()))!=null)
	{
	
     b=b+1;
    if(b==k)
     {
      System.out.println(a);
       break;
}
	}
	}

	public static void main(String[] args) throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the line number ");
		int n=s.nextInt();
		Nline ob=new Nline();
		ob.readline(n);
		s.close();

		
	}
}
