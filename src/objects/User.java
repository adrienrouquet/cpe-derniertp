package objects;

public abstract class User
{
	private String _firstName = "";
	private String _lastName = "";
	private String _email = "";
	
	public User(){}
	public User(String firstName, String lastName, String email)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
	}
	
	public void print()
	{
		System.out.println("First name: " + _firstName);
		System.out.println("Last name: " + _lastName);
		System.out.println("Email address: " + _email);
	}
	
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String lastName) {
		this._lastName = lastName;
	}
	public String getEmail() {
		return _email;
	}
	public void setEmail(String email) {
		this._email = email;
	}
}
