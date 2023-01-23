import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
	//1. mention the path of the json file to read.
		FileReader fileReader = new FileReader("C:\\Users\\SAM\\eclipse-workspace\\APITesting\\src\\test\\resources\\Employee.json");
		
	//2. create the object for JSONparserClass.
		JSONParser jsonParser= new JSONParser();
		
	//3. pass the json file to fetch the data throw jsonparser.
		Object parse = jsonParser.parse(fileReader);
		
	//4. convert object to JSONObject---> ClassCasting.
		JSONObject jsonObject = (JSONObject) parse;
		Object object = jsonObject.get("name");
		String string = object.toString();
		//String string = (String) object;
		System.out.println(string);
		
		//System.out.println(parse);

		Object object2 = jsonObject.get("address");
//		String string2 = object2.toString();
//		System.out.println(string2);
		JSONObject jsonObject2 = (JSONObject) object2;
		Object object3 = jsonObject2.get("state");
		String string2 = object3.toString();
		System.out.println(string2);
		
	}

}
