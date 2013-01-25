package fileUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

import objects.User;
import objects.UserA;

public class TextFileAnaliser
{	
	private String _fileName = "";
	private String _fileContent = "";
	
	public TextFileAnaliser(String fileName)
	{
		_fileName = fileName;
	}
	
	public UserA createObject()
	{
		UserA user = new UserA();
		
		try
		{
			HashMap<String, String> parameters = parse(readFile());
			
			user.setFirstName(parameters.get("firstname"));
			user.setLastName(parameters.get("lastname"));
			user.setEmail(parameters.get("email"));
		}
		catch (IOException e)
		{
			System.out.println("Error in createObject: " + e.getMessage());
		}
		
		return user;
	}
	
	private String readFile() throws IOException
	{
	    String fileContent = "";
	    BufferedReader buffer = null;
	    
		try
		{
			buffer = new BufferedReader(new java.io.FileReader(_fileName));
			
			String line = "";
			
			do
			{
				fileContent += line;
			}
			while ((line = buffer.readLine()) !=null);
	        
	    }
		catch (IOException e)
		{
			System.out.println("Error in readFile: " + e.getMessage());
		}
	    
	    return fileContent;
	}
	
	private HashMap<String, String> parse(String input)
	{
		HashMap<String, String> parametersMap = new HashMap<String, String>();
		
		try
		{
			String[] allParameters = input.split(";");
			
			for (String parameter : allParameters)
			{
				String[] entry = parameter.split("=");
				
				parametersMap.put(entry[0], entry[1].replace(";", ""));
			}
		}
		catch (Exception e)
		{
			System.out.println("Error in Parse: " + e.getMessage());
		}
				
		return parametersMap;
	}
}
