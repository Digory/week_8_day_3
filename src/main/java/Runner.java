import db.DBHelper;
import db.DBStudent;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Mentor mentorMike = new Mentor("Mike");
        DBHelper.save(mentorMike);

        Course courseSwimming = new Course("Ultimate swimming", LevelType.SWIMMING_LEVEL_ONE);
        DBHelper.save(courseSwimming);

        Student studentStoo = new Student("Stoo", 30, 2, mentorMike, courseSwimming);
        DBHelper.save(studentStoo);

        Instructor instructorAlex = new Instructor("Alex");
        DBHelper.save(instructorAlex);

        Lesson lessonSwim1 = new Lesson("How to breathe underwater", 3, courseSwimming, instructorAlex);
        DBHelper.save(lessonSwim1);

        Lesson lessonSwim2 = new Lesson("How to not drown", 3, courseSwimming, instructorAlex);
        DBHelper.save(lessonSwim2);

//        studentStoo.addLesson(lessonSwim1);
//        lessonSwim1.addStudent(studentStoo);
//        DBHelper.update(studentStoo);

        List<Lesson> lessons = DBStudent.getLessonsForStudent(studentStoo);

    }
}
