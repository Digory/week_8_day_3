package db;

import models.Course;
import models.Lesson;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCourse {

    private static Session session;

    public static List<Student> getStudentsOnCourse(Course course){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Student> results = null;
        try{
            Criteria cr = session.createCriteria(Student.class);
            cr.add(Restrictions.eq("course", course));
            results = cr.list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        } finally{
            session.close();
        }
        return results;
    }

    public static void addLessonToCourse(Lesson lesson, Course course){
        course.addLesson(lesson);
        DBHelper.update(lesson);
    }
}
