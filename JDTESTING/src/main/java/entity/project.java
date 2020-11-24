package entity;

public class project {
	int ProjectID;
	String ProjectName;
	int teamSize ;
	int idManager;
	int idEmployees;
	public int getProjectID() {
		return ProjectID;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public int getIdManager() {
		return idManager;
	}
	public int getIdEmployees() {
		return idEmployees;
	}
	public void setProjectID(int projectID) {
		ProjectID = projectID;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}
	public void setIdEmployees(int idEmployees) {
		this.idEmployees = idEmployees;
	}
}
