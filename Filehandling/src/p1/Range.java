package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Range {
	public void rangeline(int k,int j) throws IOException
	{
	String a;
	File f=new File("c://users/suman.gujja/Desktop/su.txt");
	FileReader fr=new FileReader(f);
	BufferedReader fb=new BufferedReader(fr);
	int b=0;
	while((a=(fb.readLine()))!=null)
	{
	
     b=b+1;
    if((b>=k)&&(b<=j))
     {
      System.out.println(a);
}
	}
	}

	public static void main(String[] args) throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the initial line number ");
		int n=s.nextInt();
		System.out.println("Enter the end line number");
		int m=s.nextInt();
		Range ob=new Range();
		ob.rangeline(n, m);
		s.close();

		
	}
}



