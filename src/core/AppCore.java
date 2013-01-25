package core;

import fileUtils.TextFileAnaliser;
import objects.User;

public class AppCore
{
	public AppCore(){}
	
	public static void main(String[] args)
	{
		TextFileAnaliser app = new TextFileAnaliser("Files/File");
		
		User user = app.createObject();
		
		user.print();
	}
}
