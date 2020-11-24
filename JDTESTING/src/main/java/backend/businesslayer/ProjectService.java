package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.datalayer.ProjectRepository;
import entity.Manager;

public class ProjectService {
	private ProjectRepository ProjectRepository;
	public ProjectService() {
		ProjectRepository = new ProjectRepository();
	};
	public String login(String Email,String password) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		return  ProjectRepository.login(Email, password);
		
	};
	public int print_project_member(String projectname) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		return ProjectRepository.print_project_member(projectname);
	}
	public List<Manager> print_Manager() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		return ProjectRepository.print_Manager();
	};
}
