package com.javainstance;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author javainstance
 *
 */
public class ObjectToJson {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudentId(5);
		student.setStudentName("Jain");
		student.setStudentAge(18);

		List<String> subjects = new ArrayList<>();

		subjects.add("Geography");
		subjects.add("History");

		student.setSubjects(subjects);

		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File("D://Workspace1//JSON//src//studentrec.json");

		try {
			objectMapper.writeValue(file, student);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
