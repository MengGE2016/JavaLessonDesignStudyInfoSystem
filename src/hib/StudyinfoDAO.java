package hib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.MidiChannel;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Studyinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see hib.Studyinfo
 * @author MyEclipse Persistence Tools
 */
public class StudyinfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(StudyinfoDAO.class);

	// property constants

	public void save(Studyinfo transientInstance) {
		log.debug("saving Studyinfo instance");
		Transaction transaction = null;
		Session session = getSession();
		try {
			transaction = session.beginTransaction();
			session.save(transientInstance);
			transaction.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
		} finally{
			session.close();
		}
	}

	public void delete(Studyinfo persistentInstance) {
		log.debug("deleting Studyinfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Studyinfo findById(hib.StudyinfoId id) {
		log.debug("getting Studyinfo instance with id: " + id);
		try {
			Studyinfo instance = (Studyinfo) getSession().get("hib.Studyinfo",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Studyinfo instance) {
		log.debug("finding Studyinfo instance by example");
		try {
			List results = getSession().createCriteria("hib.Studyinfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Studyinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Studyinfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Studyinfo instances");
		
		try {
			
			String queryString = "from Studyinfo";
			Query queryObject = getSession().createQuery(queryString);
			
			return queryObject.list();
			
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Studyinfo merge(Studyinfo detachedInstance) {
		log.debug("merging Studyinfo instance");
		try {
			Studyinfo result = (Studyinfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Studyinfo instance) {
		log.debug("attaching dirty Studyinfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Studyinfo instance) {
		log.debug("attaching clean Studyinfo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}