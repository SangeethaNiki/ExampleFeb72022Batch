package StringClasses;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo 
{
	public static void main(String[] args)
	{
		writeContent();
	}
	
	private static void writeContent()
	{
		BufferedWriter bw=null;
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("G:\\PoiApiExcercise\\Demo\\Sample.txt");
			bw=new BufferedWriter(fw);
			bw.write("Bangalore has cool climate and is very good during night time");
			bw.newLine();
			bw.write("In order to survive here one must have a job with decent income");
			bw.newLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
