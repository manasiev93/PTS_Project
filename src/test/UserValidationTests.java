package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import model.Faculty;
import model.PastEducation;
import model.SchoolEducation;
import model.SchoolType;
import model.Specialty;
import model.StudentApplicant;
import model.UserType;

import org.junit.Before;
import org.junit.Test;

import controller.UserValidation;
import data.Storage;

public class UserValidationTests {
	
	StudentApplicant applicant = new StudentApplicant();
	UserValidation userValidation;

	@Before
	public void init(){
		applicant.setId(7777);
		applicant.setUsername("manasiev93");
		applicant.setPassword("abc123".toCharArray());
		applicant.setFirstName("Ivaylo");
		applicant.setSecondName("Vasilev");
		applicant.setLastName("Manasiev");
		applicant.setAge(22);
		applicant.setApplicationNumber(154612);
		
		Faculty fksu = new Faculty(123, "FKSU", new ArrayList<Specialty>());
		Faculty ftk = new Faculty(124, "FTK", new ArrayList<Specialty>());
		Faculty fett = new Faculty(125, "FETT", new ArrayList<Specialty>());
		
		Specialty s1 = new Specialty(12, "KSI", 240, 180, new ArrayList<StudentApplicant>(), fksu);
		Specialty s2 = new Specialty(13, "Telekomunikacii", 200, 150, new ArrayList<StudentApplicant>(), ftk);
		Specialty s3 = new Specialty(14, "Elektronika", 180, 120, new ArrayList<StudentApplicant>(), fett);
		
		applicant.setSpecialties(Arrays.asList(s1, s2, s3));
		applicant.setCorepetitorNeeded(false);
		applicant.setDisabled(false);
		applicant.setUserType(UserType.STUDENT_APPLICANT);
		
		PastEducation pastEducation = new SchoolEducation(542, "SOU Nikola Vapcarov", "Petrich", "2012", SchoolType.GENERAL);
		applicant.setPastEducation(pastEducation);
		
		Storage.insertUser(applicant);
		userValidation = new UserValidation(applicant);
	}
	
	@Test
	public void validateUsernameTest(){
		assertFalse(userValidation.isUsernameTooShort());
	}
	
	
	@Test
	public void validateFirstNameTest(){
		assertFalse(userValidation.isFirstNameTooShort());
	}
	
	@Test
	public void validateSecondNameTest(){
		assertFalse(userValidation.isSecondNameTooShort());
	}
	
	@Test
	public void validateLastNameTest(){
		assertFalse(userValidation.isLastNameTooShort());
	}
	
	@Test
	public void validateAgeTest(){
		assertFalse(userValidation.isAgeNegative());
	}
	
	@Test
	public void validateUserTypeTest(){
		assertFalse(userValidation.hasImproperType());
	}
	
	@Test
	public void validateUpdateUserTest(){
		applicant.setAge(25);
		Storage.updateUser(applicant);
		assertEquals(applicant, Storage.getUserByID(applicant.getId()));
	}
	
	@Test
	public void validateUserExistence(){
		assertNotNull(Storage.getUserByID(applicant.getId()));
	}

}
