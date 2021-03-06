package main;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DOG", schema = "PUBLIC", catalog = "MYDB")
public class DogEntity {
    private int id;
    private String name;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 24)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogEntity dogEntity = (DogEntity) o;
        return id == dogEntity.id &&
                Objects.equals(name, dogEntity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
