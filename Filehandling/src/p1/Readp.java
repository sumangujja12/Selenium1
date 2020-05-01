package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readp {
public static void main(String[] args) throws IOException
{
	int a;
	File f=new File("c://users/suman.gujja/Desktop/su.txt");
	FileReader fr=new FileReader(f);
	while((a=(fr.read()))!=-1)
	{
		System.out.println((char)a);
	}
}
}

