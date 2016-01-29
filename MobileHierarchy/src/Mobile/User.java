package Mobile;

public class User {
	private String userName;
	private String password;
	
	public User(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		if(userName != null && !userName.equals("")){
			this.userName = userName;
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		if(password != null && !password.equals("")){
			this.password = password;
		}
	}
}
