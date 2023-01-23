import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReqresAssignment {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader("C:\\Users\\SAM\\eclipse-workspace\\APITesting\\src\\test\\resources\\ReqresAssignement.json");
		
		JSONParser jsonParser = new JSONParser();
		
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) parse;
		
		Object objData = jsonObject.get("data");
		System.out.println(objData);
		 JSONObject jsonObject2 = (JSONObject) objData;
		 Object objID = jsonObject2.get("id");
		 String stringID = objID.toString();
		 System.out.println(stringID);
		 
		 Object objEm = jsonObject2.get("email");
		 String stringEm = objEm.toString();
		 System.out.println(stringEm);
		 
		 Object objFn = jsonObject2.get("first_name");
		 String stringFn = objFn.toString();
		 System.out.println(stringFn);
		 
		 Object objLn = jsonObject2.get("last_name");
		 String stringLn = objLn.toString();
		 System.out.println(stringLn);
		 
		 Object objAvatar = jsonObject2.get("avatar");
		 String stringAV = objAvatar.toString();
		 System.out.println(stringAV); 
		 Object objSupport = jsonObject.get("support");
		 System.out.println(objSupport);
		 JSONObject jsonObject3 = (JSONObject) objSupport;
		 
		 Object objUrl = jsonObject3.get("url");
		 String stringUrl = objUrl.toString();
		 System.out.println(stringUrl);
		 
		 Object objText = jsonObject3.get("text");
		 String stringText = objText.toString();
		 System.out.println(stringText);
		 
	}

}
