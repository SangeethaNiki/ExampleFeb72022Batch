package StringClasses;

import java.io.FileOutputStream;

public class FileOutputstreamDemo
{
	public static void main(String[] args) 
	{
		writeContent();
	}

	private static void writeContent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("G:\\PoiApiExcercise\\Demo\\Sample.txt", true);
			String str="Java is a programming language";
			str=", It is mainly used in developing the softwares for different applications";
			byte b[]=str.getBytes();
			fout.write(b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
