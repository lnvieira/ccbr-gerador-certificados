package org.codeclubbrail.certificategenerator.resources.model;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class Certificate {

	private String leaderName;
	private String students;
	private String course;

	public List<String> getStudentsNamesList() {
		setStudents(getStudents().replaceAll("\n", ";"));
		setStudents(getStudents().replaceAll("\r", ""));
		List<String> students = Arrays.asList(getStudents().split(";"));
		return students;
	}
}
