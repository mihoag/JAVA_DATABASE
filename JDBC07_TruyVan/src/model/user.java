package model;

public class user {
    private String pass;
    private String user;
    private String name;
    
    public user()
    {
    }

	public user(String pass, String user, String name) {
		this.pass = pass;
		this.user = user;
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "user [pass=" + pass + ", user=" + user + ", name=" + name + "]";
	}
}
