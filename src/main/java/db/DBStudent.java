package db;

import models.Lesson;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBStudent {
    private static Session session;

    public static List<Lesson> getLessonsForStudent(Student student){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Lesson> results = null;
        try{
            Criteria cr = session.createCriteria(Lesson.class);
            cr.add(Restrictions.eq("course", student.getCourse()));
            results = cr.list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
