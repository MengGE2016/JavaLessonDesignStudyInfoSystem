package action;

import hib.Studyinfo;
import hib.StudyinfoDAO;
import hib.StudyinfoId;

import java.awt.List;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class StudyInfoDeployAct extends ActionSupport implements
		ServletRequestAware, SessionAware, ServletContextAware {
	private static final long SerialVersionUID = 1L;
	private HttpServletRequest request;
	private Map<String, String> session;
	private ServletContext application;
	private List list;

	@Override
	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
		this.application = application;
	}

	@Override
	public void setSession(Map session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		Studyinfo studyinfo = new Studyinfo();
		StudyinfoId id = new StudyinfoId();
		String userNameStr = session.get("user_name");
		id.setTeacherUnme(userNameStr);
		id.setContent(request.getParameter("studyInfo"));
		Calendar calendar = Calendar.getInstance();
		String year = calendar.get(Calendar.YEAR)+"-";
		String month = (calendar.get(Calendar.MONTH)+1)+"-";
		String day = calendar.get(Calendar.DATE)+" ";
		String hour = calendar.get(Calendar.HOUR_OF_DAY)+":";
		String minute = calendar.get(Calendar.MINUTE)+"";
		String time = year+month+day+hour+minute;
		id.setTime(time);
		studyinfo.setId(id);

		new StudyinfoDAO().save(studyinfo);
		
		return SUCCESS;
	}
}
