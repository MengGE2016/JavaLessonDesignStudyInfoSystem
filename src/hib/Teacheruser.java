package hib;

/**
 * Teacheruser entity. @author MyEclipse Persistence Tools
 */

public class Teacheruser implements java.io.Serializable {

	// Fields

	private TeacheruserId id;

	// Constructors

	/** default constructor */
	public Teacheruser() {
	}

	/** full constructor */
	public Teacheruser(TeacheruserId id) {
		this.id = id;
	}

	// Property accessors

	public TeacheruserId getId() {
		return this.id;
	}

	public void setId(TeacheruserId id) {
		this.id = id;
	}

}