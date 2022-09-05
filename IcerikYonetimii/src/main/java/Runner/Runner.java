package Runner;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sinem.icerikyönetimi.Repository.impl.LessonRepositoryImpl;
import com.sinem.icerikyönetimi.Repository.impl.QuestionImpl;
import com.sinem.icerikyönetimi.Repository.impl.UserRepositoryImpl;
import com.sinem.icerikyönetimi.Utility.HibernateUtility;

public class Runner {
	private static Session ss;

	private static Transaction tt;
	private static EntityManager entityManager;
	private static CriteriaBuilder builder;

	public static void main(String[] args) {
		ImplData();
		entityManager = HibernateUtility.getFACTORY().openSession();
		builder = entityManager.getCriteriaBuilder();
		maxArticleUser();
	}

	public static void maxArticleUser() {
		String hql = "select max(s.article) from SubjectDetail as s   ";
		Session session = HibernateUtility.getFACTORY().openSession();
		Integer user = session.createQuery(hql, Integer.class).getSingleResult();
		System.out.println(user);
	}

	private static void ImplData() {
		LessonRepositoryImpl lessonimpl = new LessonRepositoryImpl();
		QuestionImpl questionImpl = new QuestionImpl();
		UserRepositoryImpl userimpl = new UserRepositoryImpl();
	}
}
