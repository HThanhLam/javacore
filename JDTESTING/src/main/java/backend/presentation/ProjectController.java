package backend.presentation;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.businesslayer.ProjectService;
import entity.Manager;
public class ProjectController {
		private ProjectService ProjectService;
		public ProjectController() {
			ProjectService = new ProjectService();
		};
		public String login(String Email,String password) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
			return  ProjectService.login(Email, password);
			
		};
		public int print_project_member(String projectname) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
			return ProjectService.print_project_member(projectname);
		}
		public List<Manager> print_Manager() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
			return ProjectService.print_Manager();
		};

}	
