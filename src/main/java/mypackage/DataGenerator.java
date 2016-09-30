package mypackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Peter
 */
public class DataGenerator {

    private Random random = new Random();

    private String[] fnames = {"Homer", "Marge", "Bart", "lisa", "Maggie"};
    private String[] lnames = {"Simpson", "Burns", "Flanders", "Szyslak"};
    private String[] cities = {"Springfield", "Cypress Creek", "Shelbyville"};
    private String[] streets = {"Evergreen Terrace", "Elm Street", "West Oak Street"};

    public String getData(int amount, String args) {

        List<String> arguements = Arrays.asList(args.split("\\s*,\\s*"));  //splits the string on a delimiter defined as: zero or more whitespace, a literal comma, zero or more whitespace
        JSONArray people = new JSONArray();

        for (int i = 0; i < amount; i++) {
            JSONObject obj = new JSONObject();

            if (arguements.contains("fname")) {
                obj.put("fname", fnames[random.nextInt(fnames.length)]);
            }
            if (arguements.contains("lname")) {
                obj.put("lname", lnames[random.nextInt(lnames.length)]);
            }
            if (arguements.contains("city")) {
                obj.put("city", cities[random.nextInt(cities.length)]);
            }
            if (arguements.contains("street")) {
                obj.put("street", streets[random.nextInt(streets.length)]);
            }

            people.put(obj);
        }

        Gson gson = new GsonBuilder().create();
        String data = gson.toJson(people);
        return data;
    }

}
