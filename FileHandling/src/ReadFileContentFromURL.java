import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class ReadFileContentFromURL {

	public static void main(String[] args) {
		//Case 1:Read content from URL
			try {
            
            URL url = new URL("http://humanstxt.org/humans.txt");
             
            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
             
        }
        catch (MalformedURLException e)
        {
            System.out.println("Check you the url!");
        }
			catch(UnknownHostException ue)
			{
	        	System.out.println("Unknown Host exception");
	        	System.out.println("Could be caused due to proxy. Set appropriate proxy as mentioned in case 2");
	        	ue.printStackTrace();
			}
        
         catch(IOException ie)
         {
             System.out.println("IO exception occured");
             ie.printStackTrace();
         }
		
		
		
		
		
		//Case 2: Read content from URL with proxy
				URL url=null;
				try {
		            System.out.println("Setting URL");
		            url = new URL("http://humanstxt.org/humans.txt");
		             System.out.println("preparing buffered Reader");
		            // read text returned by server
		             
		             //setting proxy details
		             System.setProperty("http.proxyHost", "10.125.155.11");
		             System.setProperty("http.proxyPort", "8080");
		             
		            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		             //BufferedReader in = new BufferedReader(new InputStreamReader( null, url.getContent().toString()));
		            System.out.println("reading input file content");
		            String line;
		            while ((line = in.readLine()) != null) {
		                System.out.println(line);
		            }
		            
		            //removing proxy details
		            System.clearProperty("http.proxyHost");
		            System.clearProperty("http.proxyPort");
		            in.close();
		             
		        }
		        catch (MalformedURLException e)
		        {
		            System.out.println("Check you the url!");
		            e.printStackTrace();
		        }
		        catch(UnknownHostException ue)
				{
		        	System.out.println("Unknown Host exception");
		        	ue.printStackTrace();
				}
		         catch(IOException ie)
		         {
		             System.out.println("IO exception occured");
		             ie.printStackTrace();
		         }
				
				/*fileURL = new URL("http://www.google.com:80/");
		        URLConnection uc = fileURL.openConnection();
		        BufferedReader in = new BufferedReader(new InputStreamReader(uc.openStream()));
		        		//new InputStreamReader(
		                                    //uc.getInputStream()));
		                                     
		        String inputLine;
		        while ((inputLine = in.readLine()) != null) 
		            System.out.println(inputLine);
		        in.close();
		        
				}*/
					
				//URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
				/*try{
				URL fileURL = new URL("http://www.oracle.com/");
		        BufferedReader in = new BufferedReader(new InputStreamReader(fileURL.openStream()));

		        String inputLine;
		        System.out.println("reading contents from the specified url");
		        while ((inputLine = in.readLine()) != null)
		            System.out.println(inputLine);
		        
		        in.close();
				}
				*/
				
				
					
				}

}
