package users;

import java.util.ArrayList;

public class DB {

	 public static ArrayList<String> database; 
	 
	 public DB() {
		 database = new ArrayList<>();
	 }
	 
	 public static void addToDB(String name) {
		 database.add(name);
	 }
	 
	 public static boolean deleteFromDB(String name) {
		if(database.remove(name))
			return true;
		else
			return false;
	 }
}
