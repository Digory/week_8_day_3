package models;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private int id;
    private String name;
    private int age;
    private int enrolmentNumber;

    public Student(){}

    public Student(String name, int age, int enrolmentNumber) {
        this.name = name;
        this.age = age;
        this.enrolmentNumber = enrolmentNumber;
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
}
