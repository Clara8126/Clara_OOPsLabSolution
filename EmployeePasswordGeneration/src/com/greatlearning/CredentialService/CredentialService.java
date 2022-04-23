package com.greatlearning.CredentialService;
import java.util.Random;

public class CredentialService {
	public String password;
	public String generatePassword()
	{
		 String pswd = new String();
		 String alphabets = "abcdefghijklmnopqrstuvwxyz";
		 String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String special = "!@#$%^&*()/*";
		 Random random = new Random();
			pswd = pswd + random.nextInt(500);
			pswd = pswd + alphabets.charAt(random.nextInt(alphabets.length()));
			pswd = pswd + caps.charAt(random.nextInt(caps.length()));
			pswd = pswd + special.charAt(random.nextInt(special.length()));
			while(pswd.length()<=8)
			{
				pswd = pswd + caps.charAt(random.nextInt(caps.length()));
			}
		 this.password=pswd;
		return pswd;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String generateEmail(String firstName, String lastName, String department ,String company)
	{
		return firstName.toLowerCase()+ lastName.toLowerCase()+ "@" + department.toLowerCase()+"." + company.toLowerCase()+ ".com";

}  
}