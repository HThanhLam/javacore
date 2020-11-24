package entity;

public class Employee {
		int id;
		String Fullname;
		String Email;
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
		public String getProskill() {
			return Proskill;
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
		public void setProskill(String proskill) {
			Proskill = proskill;
		}
		String password;
		String Proskill;
}
