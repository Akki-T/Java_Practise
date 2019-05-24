import java.io.File;


public class Readfilename {
	public static void getfileslist(File f){
	
	File[] listOfFiles = f.listFiles();
	
	for (File file : listOfFiles) 
	{ 
	    if (file.isFile()) 
	    {
	        System.out.println(file.getName());
	    }
	   
	   
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("C:/Learnings");
		System.out.println("Reading files under foler: "+folder.getAbsolutePath());
		Readfilename.getfileslist(folder);
	}

}
