package models;

import javax.persistence.*;

@Entity
@Table(name = "mentors")
public class Mentor {
    private int id;
    private String name;
    private Student student;

    public Mentor() {
    }

    public Mentor(String name) {
        this.name = name;
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

    @OneToOne(mappedBy = "mentor", fetch = FetchType.LAZY)
    public Student getStudent() {
        return student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
