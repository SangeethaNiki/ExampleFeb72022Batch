package StringClasses;

import java.io.FileInputStream;

public class FileInputStreamDemo 
{
	public static void main(String[] args) 
	{
		readContent();
	}

	private static void readContent()
	{
		FileInputStream fin=null;
		int n=0;
		try
		{
			fin=new FileInputStream("G:\\PoiApiExcercise\\Demo\\Sample.txt");
			while(true)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char)n;
				System.out.println(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
