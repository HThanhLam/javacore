package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.datalayer.ProjectRepository;

public class program {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Function Function= new Function();
		/*Viết function để user nhập vào tên project, sau đó in ra tất cả các employee &
Manager trong project đó (in ra dạng table)*/
		Function.print_project_member("Work");
		Function.print_Manager();
		/*Viết function để user có thể lấy ra tất cả Manager của các project (in ra dạng
table)*/
		System.out.println(Function.loginid());
}
};
