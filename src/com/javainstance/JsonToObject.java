package com.javainstance;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author javainstance
 *
 */
public class JsonToObject {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File("D://Workspace1//JSON//src//student.json");
		Student student = null;

		try {
			student = objectMapper.readValue(file, Student.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(student);

	}

}
