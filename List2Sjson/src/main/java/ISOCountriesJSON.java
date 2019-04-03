import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.google.gson.Gson;

public class ISOCountriesJSON {

	public static void main(String[] args) {
		ISOCountriesJSON iso = new ISOCountriesJSON();
		iso.run();

	    }

	    public void run() {

		String[] locales = Locale.getISOCountries();
		List<String> CountryNames = new ArrayList<String>();
		
		for (String countryCode : locales) {

			Locale iso = new Locale("", countryCode);

			
			CountryNames.add(iso.getDisplayCountry());

		}
		Gson gson = new Gson();
        String jsonNames = gson.toJson(CountryNames);
        System.out.println("CountryNames = " + jsonNames);
	}

}
