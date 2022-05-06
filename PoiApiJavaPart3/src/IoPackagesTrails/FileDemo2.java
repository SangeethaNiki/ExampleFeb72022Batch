package IoPackagesTrails;

import java.io.File;

public class FileDemo2 
{
	public static void main(String[] args) 
	{
		createFile();
		reNameFile();
		deleteFile();
		fileCollection();
	}

	private static void createFile()
	{
		try
		{
			File f1=new File("G:\\PoiApiExcercise\\Demo\\Welcome1.xlsx");
			f1.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void reNameFile()
	{
		try
		{
			File f1=new File("G:\\PoiApiExcercise\\Demo\\Welcome1.xlsx");
			File f2=new File("G:\\PoiApiExcercise\\Demo\\WelcomeNew.xlsx");
			f1.renameTo(f2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteFile()
	{
		try
		{
			File f2=new File("G:\\PoiApiExcercise\\Demo\\WelcomeNew.xlsx");
			boolean isDelete=f2.delete();
			System.out.println(isDelete);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void fileCollection()
	{
		try
		{
			File f1=new File("G:\\PoiApiExcercise\\Demo");
			File f[]=f1.listFiles();
			for(int i=0; i<f.length; i++)
			{
				if(f[i].isFile()==true)
				{
					String path=f[i].getPath();
					System.out.println(path);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
