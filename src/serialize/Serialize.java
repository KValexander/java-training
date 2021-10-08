package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Serialize {

	public static void main(String[] nargs) throws IOException {
		
		User user = new User();
		
		user.name = "Alexander";
		user.password = "jfhwqjhg";
		
		FileOutputStream fileOut= new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved");
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
		
	}
}
