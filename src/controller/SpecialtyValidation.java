package controller;

import model.Specialty;

public class SpecialtyValidation {
	Specialty specialty;

	public SpecialtyValidation(Specialty specialty) {
		super();
		this.specialty = specialty;
	}
	
	public boolean isSpecialtyNameTooShort(){
		return ValidationUtils.isTooShort(specialty.getSpecialtyName(), 2);
	}
	
	public boolean isTotalPlacesNegative(){
		return ValidationUtils.isNegative(specialty.getTotalPlaces());
	}
	
	public boolean isRemainingPlacesNegative(){
		return ValidationUtils.isNegative(specialty.getRemainingPlaces());
	}
	
	public boolean isApplicantsNull(){
		return ValidationUtils.isNull(specialty.getApplicants());
	}

}

