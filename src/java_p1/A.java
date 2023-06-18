package java_p1;

import java.sql.DriverManager;

public class A {
public static void main(String[] args) {
	try {
		DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_db","root","text");
	} catch (Exception e) {
e.printStackTrace();

	}
}
}
