package IoPackagesTrails;

import java.io.File;

public class FileDemo1 
{
	public static void main(String[] args) 
	{
		File f1=new File("G:\\PoiApiExcercise\\Welcome1.xlsx");
		String name=f1.getName();
		
		System.out.println("First Name:"+name);
		System.out.println("------------");
		
		String path1=f1.getAbsolutePath();
		System.out.println("Path : "+path1);
		System.out.println("------------");
		
		String parentfolder=f1.getParent();
		System.out.println("Parent Folder: "+parentfolder);
		System.out.println("------------");
		
		File parentfolder1=f1.getParentFile();
		System.out.println("Parent Folder: "+parentfolder1);
		System.out.println("------------");
		
		String path=f1.getPath();
		System.out.println("Path :"+path);
		System.out.println("---------------");
		
		boolean isFile=f1.isFile();
		System.out.println("Is it a file: "+isFile);
		System.out.println("--------------");
		
		boolean isFolder=f1.isDirectory();
		System.out.println("Is it a folder: "+isFolder);
		System.out.println("-----------------");
		
		boolean read=f1.canRead();
		System.out.println("Can do read operation: "+read);
		System.out.println("------------------");
		
		boolean write=f1.canWrite();
		System.out.println("Can do write operation: "+write);
		System.out.println("--------------");
		
		boolean execute=f1.canExecute();
		System.out.println("Can do execute operation: "+execute);
		System.out.println("----------------");
		
		boolean v1=f1.isHidden();
		System.out.println("Is it a hidden file: "+v1);
		System.out.println("-----------------");
		
	}

}
