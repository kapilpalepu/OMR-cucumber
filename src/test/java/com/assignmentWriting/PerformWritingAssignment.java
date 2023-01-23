package com.assignmentWriting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PerformWritingAssignment {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		//Mention the path where we want to save the json file
		File file = new File("C:\\Users\\SAM\\eclipse-workspace\\APITesting\\src\\test\\resources\\Hellow.json");
		//creating object for object mapper
		ObjectMapper mapper = new ObjectMapper();
		//adding values to data
		ArrayList<POJODataWriting> data = new ArrayList<POJODataWriting>();
		POJODataWriting d1 = new POJODataWriting(7, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
		POJODataWriting d2 = new POJODataWriting(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
		POJODataWriting d3 = new POJODataWriting(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/8-image.jpg");
		POJODataWriting d4 = new POJODataWriting(10, "byron.fields@reqres.in", "Byron", "Fields", "https://reqres.in/img/faces/8-image.jpg");
		POJODataWriting d5 = new POJODataWriting(11, "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/8-image.jpg");
		POJODataWriting d6 = new POJODataWriting(12, "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/8-image.jpg");
		data.add(d1);
		data.add(d2);
		data.add(d3);
		data.add(d4);
		data.add(d5);
		data.add(d6);
		//adding values to support
		POJOSuport support = new POJOSuport("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
		//adding complete values
		POJOWritingClass pwc = new POJOWritingClass(2, 6, 12, 2, data, support);
		//writing all added values into json file
		mapper.writeValue(file, pwc);

	}

}















