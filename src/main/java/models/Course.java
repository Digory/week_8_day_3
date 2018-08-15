package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    private int id;
    private String title;
    private LevelType type;
    private List<Student> students;

    public Course(){}

    public Course(String title, LevelType type) {
        this.title = title;
        this.type = type;
        this.students = new ArrayList<Student>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "level")
    public LevelType getType() {
        return type;
    }

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Student> getStudents() {
        return students;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(LevelType type) {
        this.type = type;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
