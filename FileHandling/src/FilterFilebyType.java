import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

public class FilterFilebyType {
	public static void main(String[] args) {
		
	File folder=new File("inputfiles/text files/");
	File[] listOfFiles = folder.listFiles();
	List<String> textfiles=new ArrayList<String>();
	List<String> pptfiles=new ArrayList<String>();
	List<String> pdffiles=new ArrayList<String>();
	
	String name=null;
	for(File f: listOfFiles)
	{
		name=f.getName();
		
		if(FilenameUtils.getExtension(name).equalsIgnoreCase("txt"))
		{	
			textfiles.add(name);
			
		}
		if(FilenameUtils.getExtension(name).equalsIgnoreCase("ppt"))
		{	
			pptfiles.add(name);
			
		}
		
		if(FilenameUtils.getExtension(name).equalsIgnoreCase("pdf"))
		{	
			pdffiles.add(name);
			
			
		}
	}
	System.out.println("Printing files by type level 0:");
System.out.println("List of text files are: " +textfiles.toString());
System.out.println("List of ppt files are: " +pptfiles.toString());
System.out.println("List of text files are: " +pdffiles.toString());


	}
}