package model;

public class PastEducation {
	int id;
	String schoolName;
	String location;
	String graduation;
	
	public PastEducation(int id, String schoolName, String location,
			String graduation) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.location = location;
		this.graduation = graduation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	
	

}
