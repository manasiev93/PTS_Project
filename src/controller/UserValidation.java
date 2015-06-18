package controller;

import model.User;

public class UserValidation {
	
	User user;

	public UserValidation(User user) {
		super();
		this.user = user;
	}
	
	public boolean isUsernameTooShort(){
		return ValidationUtils.isTooShort(user.getUsername(), 2);
	}
	
	public boolean isFirstNameTooShort(){
		return ValidationUtils.isTooShort(user.getFirstName(), 2);
	}
	
	public boolean isSecondNameTooShort(){
		return ValidationUtils.isTooShort(user.getSecondName(), 2);
	}
	
	public boolean isLastNameTooShort(){
		return ValidationUtils.isTooShort(user.getLastName(), 2);
	}
	
	public boolean isAgeNegative(){
		return ValidationUtils.isNegative(user.getAge());
	}
	
	public boolean hasImproperType(){
		switch(user.getUserType()){
		case STUDENT_APPLICANT:
		case FACULTY_SECRETARY:
		case EXAM_COMMISSION: return false;
		default: return true;
		}
	}

}
