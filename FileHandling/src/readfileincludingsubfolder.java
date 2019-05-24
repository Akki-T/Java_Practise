import java.io.File;


public class readfileincludingsubfolder {
	public static void getfileslist(File[] arr1, int searchlevel){


		for (File f : arr1)  
        { 
            // tabs for internal levels 
            for (int i = 0; i < searchlevel; i++) 
                System.out.print("\t"); 
             
            if(f.isFile())  
                System.out.println(f.getName()); 
              
            else if(f.isDirectory())  
            {  
                System.out.println("[" + f.getName() + "]"); 
              
                // recursion for sub-directories 
                getfileslist(f.listFiles(), searchlevel + 1); 
            } 
		
        }
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("C:/Learnings");
		System.out.println("Reading files under folder: "+folder.getAbsolutePath());
		File arr[] = folder.listFiles();
		readfileincludingsubfolder.getfileslist(arr,0);
	}

}
