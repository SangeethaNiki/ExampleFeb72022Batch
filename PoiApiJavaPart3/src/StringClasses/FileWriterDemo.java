package StringClasses;

import java.io.FileWriter;

public class FileWriterDemo 
{
	public static void main(String[] args) 
	{
		writeContent();
	}
	
	private static void writeContent()
	{
		FileWriter fw=null;
		try
		{
			fw= new FileWriter("G:\\PoiApiExcercise\\Demo\\Sample.txt", true);
			String str="Java is a developing language";
			str=", it is widely used across the globe for developing softwares";
			char ch[]=str.toCharArray();
			fw.write(ch);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
