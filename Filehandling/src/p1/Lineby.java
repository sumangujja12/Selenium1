package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lineby {
	public static void main(String[] args) throws IOException
	{
		String a;
		File f=new File("c://users/suman.gujja/Desktop/su.txt");
		FileReader fr=new FileReader(f);
		BufferedReader fb=new BufferedReader(fr);
		int b=0;
		while((a=(fb.readLine()))!=null)
		{
			System.out.println(a);
		
//b=b+1;
//if(b==2)
//{
	//System.out.println(a);
	//break;
//}

	}
}
}
