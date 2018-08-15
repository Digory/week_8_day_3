package models;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    private int id;
    private String title;
    private LevelType type;

    public Course(){}

    public Course(String title, LevelType type) {
        this.title = title;
        this.type = type;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(LevelType type) {
        this.type = type;
    }
}
