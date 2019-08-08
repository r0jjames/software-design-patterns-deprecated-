package structural_patterns.adapter;

public class EmployeeAdapterLdap implements Employee {

	EmployeeLdap instance;
	public EmployeeAdapterLdap(EmployeeLdap employee) {
		this.instance = employee;
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getMail();
	}
	
	public String toString() {
		return "ID: " + getId()  + " FirstName: " + getFirstName() + " LastName: " + getLastName() + " Email: " + getEmail();
				
	}
	

}
