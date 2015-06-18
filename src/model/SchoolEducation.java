package model;

public class SchoolEducation extends PastEducation {
	SchoolType schoolType;

	public SchoolEducation(int id, String schoolName, String location,
			String graduation, SchoolType schoolType) {
		super(id, schoolName, location, graduation);
		this.schoolType = schoolType;
	}

	public SchoolType getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(SchoolType schoolType) {
		this.schoolType = schoolType;
	}
	
	

}


class HighSchool extends SchoolEducation {
	String specialty;
	String profile;
	
	public HighSchool(int id, String schoolName, String location,
			String graduation, SchoolType schoolType, String specialty,
			String profile) {
		super(id, schoolName, location, graduation, schoolType);
		this.specialty = specialty;
		this.profile = profile;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
	
	
}
