public class Employee {

	private String socialSecurityNumber;
	private String name;
	private String email;

	/**
	 * 
	 * @param newEmail
	 */
	public void updateEmail(String newEmail) {
		// TODO - implement Employee.updateEmail
		throw new UnsupportedOperationException();
	}

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}