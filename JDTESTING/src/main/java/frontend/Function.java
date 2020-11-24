package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.presentation.ProjectController;
import entity.Manager;
import utils.Scannerutils;

public class Function { 
	private ProjectController ProjectController;
	public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		ProjectController = new ProjectController();
	};
	public void print_Manager () throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		List<Manager> manager1 = ProjectController.print_Manager();
		System.out.printf("%-15s %-25s %-25s %-25s %-10s\n", "ID", "Email", "Fullname", "Password","ExpInYear");
		for (int i = 0; i < manager1.size(); i++) {
			System.out.printf("%-15s %-25s %-25s %-25s %-10s\n", manager1.get(i).getId(), manager1.get(i).getEmail(), manager1.get(i).getFullname(),
					manager1.get(i).getPassword(),manager1.get(i).getExpInYear())	;

        }
	
	};
	public void print_project_member(String projectname) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		ProjectController.print_project_member(projectname);
	};
	public String loginid() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		while (true) {
			System.out.print("Mời bạn nhập vào Email của account: ");
			String email = Scannerutils.inputEmail("Email chưa đúng định dạng.");

			System.out.print("Mời bạn nhập password: ");
			String password = Scannerutils
					.inputPassword("Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!");
			try {
				return ProjectController.login(email, password);

			} catch (Exception e) {
				System.err.println(e.getMessage() + "\n");
			}
		}
	}
};

