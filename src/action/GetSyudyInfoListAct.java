package action;

import hib.Studyinfo;
import hib.StudyinfoDAO;
import hib.StudyinfoId;
import hib.Teacheruser;
import hib.TeacheruserDAO;
import hib.TeacheruserId;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class GetSyudyInfoListAct extends ActionSupport implements
		ServletRequestAware, SessionAware, ServletContextAware {
	private static final long SerialVersionUID = 1L;
	private HttpServletRequest request;
	private Map<String, String> session;
	private ServletContext application;
	private java.util.List list;

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
		
		StudyinfoDAO studyinfoDAO = new StudyinfoDAO();
		
		Iterator iterator = studyinfoDAO.findAll().iterator();
		
		while (iterator.hasNext()) {
			Studyinfo Studyinfo = (Studyinfo) iterator.next();
			StudyinfoId id = Studyinfo.getId();
			
			System.out.println(id.getTeacherUnme()+"\n"+id.getContent()+"\n"+id.getTime());
			list.add(id);
		}
		
		request.setAttribute("list", list);
		
		return SUCCESS;
	}

}
