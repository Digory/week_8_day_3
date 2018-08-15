package models;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private int id;
    private String name;
    private int age;
    private int enrolmentNumber;
    private Mentor mentor;
    private Course course;

    public Student(){}

    public Student(String name, int age, int enrolmentNumber, Mentor mentor, Course course) {
        this.name = name;
        this.age = age;
        this.enrolmentNumber = enrolmentNumber;
        this.mentor = mentor;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    @Column(name = "enrolment_number")
    public int getEnrolmentNumber() {
        return enrolmentNumber;
    }


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentor_id", nullable = false)
    public Mentor getMentor() {
        return mentor;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEnrolmentNumber(int enrolmentNumber) {
        this.enrolmentNumber = enrolmentNumber;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
