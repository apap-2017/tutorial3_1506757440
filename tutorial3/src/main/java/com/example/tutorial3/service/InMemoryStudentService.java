package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		for(StudentModel s : studentList) {
			if(s.getNpm().equals(npm)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		studentList.add(student);
	}

	@Override
	public StudentModel deleteStudent(String npm) {
		// TODO Auto-generated method stub
		for(StudentModel s : studentList) {
			if(npm.equals(s.getNpm())) {
				studentList.remove(s);
			}
		}
		return null;
	}
}