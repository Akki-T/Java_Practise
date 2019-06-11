import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;



import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class ReadFileContent {

	public static void main(String[] args) {
		
//Commonly Used Methods for Small Files are readAllBytes() and readAllLines()
		
		//File inputFile=new File("inputfiles/text files/sample.txt");
		try {
			//using readAllBytes
            byte[] content = Files.readAllBytes(Paths.get("inputfiles/text files/sample.txt"));
            System.out.println(new String(content));
            System.out.println();
            
			//using readAllLines
            List<String> output1=Files.readAllLines(Paths.get("inputfiles/text files/sample.txt"));
			System.out.println(output1);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		//using stream java8 approach
		try(Stream<String> stream = Files.lines(Paths.get("inputfiles/text files/filedata.txt"))){
			stream.forEach(System.out::println);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
			
		}

}
//}
