package data;

import java.util.ArrayList;
import java.util.List;

import model.Specialty;
import model.User;

public class Storage {
	public static List<User> usersList = new ArrayList<>();
	public static List<Specialty> specialtiesList = new ArrayList<>();
	
	public static void insertUser(User u){
		usersList.add(u);
	}
	
	public static void insertSpecialty(Specialty s){
		specialtiesList.add(s);
	}
	
	public static void updateUser(User u){
		for(User user : usersList){
			if(user.getId() == u.getId()){
				usersList.set(usersList.indexOf(user), u);
			}
		}
	}
	
	public static void updateSpecialty(Specialty s){
		for(Specialty specialty : specialtiesList){
			if(specialty.getId() == s.getId()){
				specialtiesList.set(specialtiesList.indexOf(specialty), s);
			}
		}
	}
	
	public static User getUserByID(int id){
		for(User u : usersList)
			if(u.getId() == id)
				return u;
		return null;
	}
	
	public static Specialty getSpecialtyByID(int id){
		for(Specialty s : specialtiesList){
			if(s.getId() == id)
				return s;
		}
		return null;
	}

}
