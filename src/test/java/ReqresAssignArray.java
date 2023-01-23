import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReqresAssignArray {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader fileReader = new FileReader(
				"C:\\Users\\SAM\\eclipse-workspace\\APITesting\\src\\test\\resources\\ReqresAssignArray.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) parse;
		Object object = jsonObject.get("data");
		System.out.println(object);

		JSONArray array = (JSONArray) object;
		for (int i = 0; i < array.size(); i++) {
			Object object2 = array.get(i);
			JSONObject jObj = (JSONObject) object2;
			Object idObj = jObj.get("id");
			System.out.println(idObj);
			Object emailObj = jObj.get("email");
			System.out.println(emailObj);
			Object fNameObj = jObj.get("first_name");
			System.out.println(fNameObj);
			Object lNameObj = jObj.get("last_name");
			System.out.println(lNameObj);
			Object avObj = jObj.get("avatar");
			System.out.println(avObj);

		}

	}

}
