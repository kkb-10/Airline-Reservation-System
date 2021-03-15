package guiPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Server {
	String userId,email,password;
	
	String name;
	String gender;
	String dob;
	String mobile;
	
	boolean adminValidation(String userId,String password)
	{
		if(userId.equals("admin") && password.equals("admin"))
		{
			return true;
		}
		return false;
	}
	
	boolean userValidation(String emailId,String passWord)
	{
		int flag=0;
		try 
		{
            FileReader reader = new FileReader("src/data/customerData.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            BufferedWriter addFirst = new BufferedWriter(new FileWriter("src/data/currentCustomer.txt"));
            addFirst.write("");
            addFirst.close();
            
            BufferedWriter add = new BufferedWriter(new FileWriter("src/data/currentCustomer.txt",true));
            
            while ((email = bufferedReader.readLine()) != null) 
            {
            	password = bufferedReader.readLine();
            	name= bufferedReader.readLine();
            	gender= bufferedReader.readLine();
            	dob=bufferedReader.readLine();
            	mobile=bufferedReader.readLine();
            	if(emailId.equals(email) && passWord.equals(password))
                {
            		flag=1;
            		System.out.println(email);
                	System.out.println(password);
                	System.out.println(name);
                	System.out.println(gender);
                	System.out.println(dob);
                	System.out.println(mobile);
                	add.write(email+"\n");
                	add.write(password+"\n");
                	add.write(name+"\n");
                	add.write(gender+"\n");
                	add.write(dob+"\n");
                	add.write(mobile+"\n");
                	
                }
            }
            reader.close();
            add.close();
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
		if(flag==1) return true;
		return false;
	}
}
