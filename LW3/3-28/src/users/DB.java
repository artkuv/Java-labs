package users;

import java.util.ArrayList;

public class DB {

	 public static ArrayList<String> database; 
	 
	 public DB() {
		 database = new ArrayList<>();
	 }
	 
	 public static void addToDB(String name) {
		 if(database.contains(name))
			 return;
		 database.add(name);
	 }
	 
	 public static void deleteFromDB(String name) {
		try {
		if(!database.remove(name))
			throw new RuntimeException();
		}
		catch (RuntimeException e) {
			System.out.println("Cannot delete the user");
		}
	 }
}
