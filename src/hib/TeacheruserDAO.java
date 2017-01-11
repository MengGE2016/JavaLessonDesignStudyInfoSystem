package hib;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Teacheruser entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see hib.Teacheruser
 * @author MyEclipse Persistence Tools
 */
public class TeacheruserDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TeacheruserDAO.class);

	// property constants

	public void save(Teacheruser transientInstance) {
		log.debug("saving Teacheruser instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Teacheruser persistentInstance) {
		log.debug("deleting Teacheruser instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Teacheruser findById(hib.TeacheruserId id) {
		log.debug("getting Teacheruser instance with id: " + id);
		try {
			Teacheruser instance = (Teacheruser) getSession().get(
					"hib.Teacheruser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Teacheruser instance) {
		log.debug("finding Teacheruser instance by example");
		try {
			List results = getSession().createCriteria("hib.Teacheruser")
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
		log.debug("finding Teacheruser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Teacheruser as model where model."
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
		log.debug("finding all Teacheruser instances");
		try {
			String queryString = "from Teacheruser";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Teacheruser merge(Teacheruser detachedInstance) {
		log.debug("merging Teacheruser instance");
		try {
			Teacheruser result = (Teacheruser) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Teacheruser instance) {
		log.debug("attaching dirty Teacheruser instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Teacheruser instance) {
		log.debug("attaching clean Teacheruser instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}