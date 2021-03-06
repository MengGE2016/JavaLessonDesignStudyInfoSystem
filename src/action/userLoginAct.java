package action;

import hib.Teacheruser;
import hib.TeacheruserDAO;
import hib.TeacheruserId;

import java.awt.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class userLoginAct extends ActionSupport implements ServletRequestAware,
		SessionAware, ServletContextAware {

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
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		TeacheruserId tId = new TeacheruserId();
		tId.setUserName(userName);
		tId.setPassword(password);
		TeacheruserDAO tDao = new TeacheruserDAO();
		if (tDao.findById(tId)==null) return ERROR;
		session.put("user_name", userName);
		return SUCCESS;
	}

}
