package model;

import java.util.List;

public class StudentApplicant extends User {

	long applicationNumber;
	List<Specialty> specialties;
	boolean corepetitorNeeded;
	boolean isDisabled;
	PastEducation pastEducation;
	
	public StudentApplicant(int id, String username, char[] password,
			String firstName, String secondName, String lastName, int age, int applicationNumber, List<Specialty> specialties,
			boolean corepetitorNeeded, boolean isDisabled, PastEducation pastEducation, UserType userType) {
		
		super(id, username, password, firstName, secondName, lastName, age, userType);
		this.applicationNumber = applicationNumber;
		this.specialties = specialties;
		this.corepetitorNeeded = corepetitorNeeded;
		this.isDisabled = isDisabled;
		this.pastEducation = pastEducation;
	}
	
	public StudentApplicant(){}

	public PastEducation getPastEducation() {
		return pastEducation;
	}

	public void setPastEducation(PastEducation pastEducation) {
		this.pastEducation = pastEducation;
	}

	public long getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(long applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public List<Specialty> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(List<Specialty> specialties) {
		this.specialties = specialties;
	}

	public boolean isCorepetitorNeeded() {
		return corepetitorNeeded;
	}

	public void setCorepetitorNeeded(boolean corepetitorNeeded) {
		this.corepetitorNeeded = corepetitorNeeded;
	}

	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	
	
}
