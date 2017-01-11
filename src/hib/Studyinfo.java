package hib;

/**
 * Studyinfo entity. @author MyEclipse Persistence Tools
 */

public class Studyinfo implements java.io.Serializable {

	// Fields

	private StudyinfoId id;

	// Constructors

	/** default constructor */
	public Studyinfo() {
	}

	/** full constructor */
	public Studyinfo(StudyinfoId id) {
		this.id = id;
	}

	// Property accessors

	public StudyinfoId getId() {
		return this.id;
	}

	public void setId(StudyinfoId id) {
		this.id = id;
	}

}