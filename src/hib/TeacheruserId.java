package hib;

/**
 * TeacheruserId entity. @author MyEclipse Persistence Tools
 */

public class TeacheruserId implements java.io.Serializable {

	// Fields

	private String userName;
	private String password;

	// Constructors

	/** default constructor */
	public TeacheruserId() {
	}

	/** full constructor */
	public TeacheruserId(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// Property accessors

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TeacheruserId))
			return false;
		TeacheruserId castOther = (TeacheruserId) other;

		return ((this.getUserName() == castOther.getUserName()) || (this
				.getUserName() != null && castOther.getUserName() != null && this
				.getUserName().equals(castOther.getUserName())))
				&& ((this.getPassword() == castOther.getPassword()) || (this
						.getPassword() != null
						&& castOther.getPassword() != null && this
						.getPassword().equals(castOther.getPassword())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result
				+ (getPassword() == null ? 0 : this.getPassword().hashCode());
		return result;
	}

}