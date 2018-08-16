package db;

import models.Course;
import models.Lesson;
import models.Student;
import org.hibernate.Session;

public class DBLesson {
    private static Session session;

    public static void addLessonsToStudent(Student student){
        for(Lesson lesson : student.getCourse().getLessons()){
            student.addLesson(lesson);
        }
        DBHelper.update(student);
    }
}
