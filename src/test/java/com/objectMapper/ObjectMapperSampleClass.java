package com.objectMapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperSampleClass {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		//1. create the path of json file.
		File file=new  File("C:\\Users\\SAM\\eclipse-workspace\\APITesting\\src\\test\\resources\\ObjectMapperClassExample1.json");
		//2. create the object for ObjectMapper class
		ObjectMapper mapper = new ObjectMapper();
		//3. pass the json file to fetch vaues.
		ObjectMapperPOJOClass oMPC = mapper.readValue(file, ObjectMapperPOJOClass.class);
		String name = oMPC.getName();
		System.out.println(name);
		String email = oMPC.getEmail();
		System.out.println(email);
		long phoneNo = oMPC.getPhoneNo();
		System.out.println(phoneNo);
//		String address = oMPC.getAddress();
//		System.out.println(address);
		Address address = oMPC.getAddress();
		String sName = address.getStreetName();
		System.out.println(sName);
		String state = address.getState();
		System.out.println(state);
		int pinCode = address.getPinCode();
		System.out.println(pinCode);
		
	}

}
