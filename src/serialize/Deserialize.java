package serialize;

import java.io.*;

public class Deserialize{

	public static void main(String[] args) throws IOException, ClassNotFoundException  {

		User user = null;
		
		FileInputStream fileIn = new FileInputStream("UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
	}

}
