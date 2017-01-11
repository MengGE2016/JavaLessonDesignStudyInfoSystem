package test;

import java.util.Iterator;

import hib.Studyinfo;
import hib.StudyinfoDAO;
import hib.StudyinfoId;
import hib.Teacheruser;
import hib.TeacheruserDAO;
import hib.TeacheruserId;

public class TeacherDaoTest {
	
	 public static void main(String[] args) {
//		TeacheruserDAO tDao = new TeacheruserDAO();
//		System.out.println(tDao.findAll().size());
//		Iterator iterator = tDao.findAll().iterator();
//		while (iterator.hasNext()) {
//			Teacheruser teacher = (Teacheruser) iterator.next();
//			TeacheruserId id = teacher.getId();
//			
//			
//		}
//		
		StudyinfoDAO studyinfoDAO = new StudyinfoDAO();
		System.out.println(studyinfoDAO.findAll().size());
		Iterator iteratorq = studyinfoDAO.findAll().iterator();
		while (iteratorq.hasNext()) {
			Studyinfo Studyinfo = (Studyinfo) iteratorq.next();
			StudyinfoId id = Studyinfo.getId();
			
			
			System.out.println(id.getTeacherUnme()+"\n"+id.getContent()+"\n"+id.getTime());
			
			
		}
		
	}
}
