import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;


public class List2Json {

	public static void main(String[] args) {
        // Converts a List into JSON string.
        List<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("Melley");

        Gson gson = new Gson();
        String jsonNames = gson.toJson(names);
        System.out.println("Names = " + jsonNames);
       // System.out.println("names in List = "+names);


		
	}

}
