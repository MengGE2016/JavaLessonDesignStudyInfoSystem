package hib;

/**
 * StudyinfoId entity. @author MyEclipse Persistence Tools
 */

public class StudyinfoId implements java.io.Serializable {

	// Fields

	private String teacherUnme;
	private String content;
	private String time;

	// Constructors

	/** default constructor */
	public StudyinfoId() {
	}

	/** full constructor */
	public StudyinfoId( String teacherUnme, String content,
			String time) {
		this.teacherUnme = teacherUnme;
		this.content = content;
		this.time = time;
	}

	// Property accessors

	public String getTeacherUnme() {
		return this.teacherUnme;
	}

	public void setTeacherUnme(String teacherUnme) {
		this.teacherUnme = teacherUnme;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}