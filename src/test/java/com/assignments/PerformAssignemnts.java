package com.assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.objectMapper.ObjectMapperPOJOClass;

public class PerformAssignemnts {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("C:\\Users\\SAM\\eclipse-workspace\\APITesting\\src\\test\\resources\\ReqresAssignmentsObjectMapper.json");
		ObjectMapper mapper = new ObjectMapper();
		POJOclass value = mapper.readValue(file, POJOclass.class);
		int page = value.getPage();
		System.out.println(page);
		int per_page = value.getPer_page();
		System.out.println(per_page);
		int total = value.getTotal();
		System.out.println(total);
		int total_pages = value.getTotal_pages();
		System.out.println(total_pages);
		Support support = value.getSupport();
		String url = support.getUrl();
		System.out.println(url);
		String text = support.getText();
		System.out.println(text);
		//System.out.println(support);
		ArrayList<DataPojo> data = value.getData();
		for (DataPojo dp : data) {
			System.out.println(dp.getFirst_name());
			System.out.println(dp.getLast_name());
			System.out.println(dp.getEmail());
			System.out.println(dp.getAvatar());
			System.out.println(dp.getId());
		}
	}

}
