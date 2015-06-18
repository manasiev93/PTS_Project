package model;

public class UniversityEducation extends PastEducation {
	
	String specialty;
	String achievedProfQualification;
	String achievedOKS;
	String educationDuration;
	
	public UniversityEducation(int id, String schoolName, String location,
			String graduation, String specialty,
			String achievedProfQualification, String achievedOKS,
			String educationDuration) {
		super(id, schoolName, location, graduation);
		this.specialty = specialty;
		this.achievedProfQualification = achievedProfQualification;
		this.achievedOKS = achievedOKS;
		this.educationDuration = educationDuration;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getAchievedProfQualification() {
		return achievedProfQualification;
	}

	public void setAchievedProfQualification(String achievedProfQualification) {
		this.achievedProfQualification = achievedProfQualification;
	}

	public String getAchievedOKS() {
		return achievedOKS;
	}

	public void setAchievedOKS(String achievedOKS) {
		this.achievedOKS = achievedOKS;
	}

	public String getEducationDuration() {
		return educationDuration;
	}

	public void setEducationDuration(String educationDuration) {
		this.educationDuration = educationDuration;
	}
	
	

}
