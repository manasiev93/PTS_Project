package model;

import java.util.List;

public class Faculty {
	int id;
	String facultyName;
	List<Specialty> specialties;
	
	public Faculty(int id, String facultyName, List<Specialty> specialties) {
		super();
		this.id = id;
		this.facultyName = facultyName;
		this.specialties = specialties;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<Specialty> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(List<Specialty> specialties) {
		this.specialties = specialties;
	}
}
