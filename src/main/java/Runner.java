import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args) {
        Mentor mentorMike = new Mentor("Mike");
        DBHelper.save(mentorMike);

        Student studentStoo = new Student("Stoo", 30, 2);
        DBHelper.save(studentStoo);

        Lesson lessonMath = new Lesson("Maths", 3);
        DBHelper.save(lessonMath);

        Instructor instructorAlex = new Instructor("Alex");
        DBHelper.save(instructorAlex);

        Course courseSwimming = new Course("Ultimate swimming", LevelType.SWIMMING_LEVEL_ONE);
        DBHelper.save(courseSwimming);


    }
}
