package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.Faculty;
import model.Specialty;
import model.StudentApplicant;

import org.junit.Before;
import org.junit.Test;

import controller.SpecialtyValidation;
import data.Storage;

public class SpecialtyValidationTests {
	
	Specialty specialty = new Specialty();
	SpecialtyValidation specialtyValidation;
	
	@Before
	public void init(){
		specialty.setId(12);
		specialty.setSpecialtyName("KSI");
		specialty.setTotalPlaces(240);
		specialty.setRemainingPlaces(180);
		specialty.setApplicants(new ArrayList<StudentApplicant>());
		specialty.setFaculty(new Faculty(123, "FKSU", new ArrayList<Specialty>()));
		
		Storage.insertSpecialty(specialty);
		specialtyValidation = new SpecialtyValidation(specialty);
	}
	
	@Test
	public void validateSpecialtyNameTest(){
		assertFalse(specialtyValidation.isSpecialtyNameTooShort());
	}
	
	@Test
	public void validateTotalPlacesTest(){
		assertFalse(specialtyValidation.isTotalPlacesNegative());
	}
	
	@Test
	public void validateRemainingPlacesTest(){
		assertFalse(specialtyValidation.isRemainingPlacesNegative());
	}
	
	@Test
	public void validateApplicantsTest(){
		assertFalse(specialtyValidation.isApplicantsNull());
	}
	
	@Test
	public void validateUpdateSpecialtyTest(){
		specialty.setRemainingPlaces(150);
		Storage.updateSpecialty(specialty);
		assertEquals(specialty, Storage.getSpecialtyByID(specialty.getId()));
	}
	
	@Test
	public void validateSpecialtyExistence(){
		assertNotNull(Storage.getSpecialtyByID(specialty.getId()));
	}

}
