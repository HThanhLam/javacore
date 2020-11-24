package entity;

public class Manager {
	int id;
	String Fullname;
	String Email;
	String password;
	public int getId() {
		return id;
	}
	public String getFullname() {
		return Fullname;
	}
	public String getEmail() {
		return Email;
	}
	public String getPassword() {
		return password;
	}
	public int getExpInYear() {
		return ExpInYear;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setExpInYear(int i) {
		ExpInYear = i;
	}
	int ExpInYear;
}
