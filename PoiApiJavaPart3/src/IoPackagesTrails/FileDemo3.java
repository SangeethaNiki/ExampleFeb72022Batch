package IoPackagesTrails;

import java.io.File;

public class FileDemo3 
{
	public static void main(String[] args) 
	{
		createFolder();
		reNameFolder();
		createNestedFolder();
		deleteFolder();
		folderCollection();
	}

	private static void createFolder()
	{
		try
		{
			File f1=new File("G:\\PoiApiExcercise\\Demo");
			boolean v1=f1.mkdir();
			System.out.println(v1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void reNameFolder()
	{
		try
		
		{
			File f1=new File("G:\\PoiApiExcercise\\Demo");
			File f2=new File("G:\\PoiApiExcercise\\DemoNew");
			f1.renameTo(f2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createNestedFolder()
	{
		try
		{
			File f1=new File("G:\\PoiApiExcercise\\Demo\\D1\\D2\\D3\\D4\\D5");
			boolean v1=f1.mkdir();
			System.out.println(v1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void deleteFolder()
	{
		try
		{
			File f2=new File("G:\\PoiApiExcercise\\DemoNew");
			boolean v1=f2.delete();
			System.out.println(v1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void folderCollection()
	{
		try
		{
			File f1=new File("G:\\PoiApiExcercise\\Demo");
			File f[]=f1.listFiles();
			for(int i=0; i<f.length; i++)
			{
				if(f[i].isDirectory()==true)
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
