package action;

import java.awt.List;
import java.util.Map;

import javassist.SerialVersionUID;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class userSelectAct extends ActionSupport implements ServletRequestAware, SessionAware, ServletContextAware {
	
	
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
		this.request=request;
	}
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String user = request.getParameter("users");
		if (user.equals("��ʦ")) return SUCCESS;
		if (user.equals("�οͣ�ѧ����")) return ERROR;
		return ERROR;
	}
}
