package model;

import java.util.List;

public class Specialty {

	int id;
	String specialtyName;
	int totalPlaces;
	int remainingPlaces;
	int applicantsForPlace;
	List<StudentApplicant> applicants;
	Faculty faculty;
	
	
	
	public Specialty(int id, String specialtyName, int totalPlaces,
			int remainingPlaces, 
			List<StudentApplicant> applicants, Faculty faculty) {
		super();
		this.id = id;
		this.specialtyName = specialtyName;
		this.totalPlaces = totalPlaces;
		this.remainingPlaces = remainingPlaces;
		this.applicants = applicants;
		this.faculty = faculty;
		this.applicantsForPlace = applicants.size() / totalPlaces;
	}
	
	public Specialty() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialtyName() {
		return specialtyName;
	}
	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}
	public int getTotalPlaces() {
		return totalPlaces;
	}
	public void setTotalPlaces(int totalPlaces) {
		this.totalPlaces = totalPlaces;
	}
	public int getRemainingPlaces() {
		return remainingPlaces;
	}
	public void setRemainingPlaces(int remainingPlaces) {
		this.remainingPlaces = remainingPlaces;
	}
	public int getApplicantsForPlace() {
		return applicantsForPlace;
	}

	public List<StudentApplicant> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<StudentApplicant> applicants) {
		this.applicants = applicants;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
}
