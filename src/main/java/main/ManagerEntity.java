package main;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.Objects;
import java.util.Optional;

@Entity
@Table(name = "MANAGER", schema = "PUBLIC", catalog = "MYDB")
public class ManagerEntity implements CrudRepository<ManagerRepository, Integer> {
    private int id;
    private String firstName;
    private String lastName;
    private String department;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 24)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = true, length = 24)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "DEPARTMENT", nullable = true, length = 24)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagerEntity that = (ManagerEntity) o;
        return id == that.id &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(department, that.department);
    }

    @Override
    public String toString(){
        return "Manager: " + getFirstName() + getLastName();
    }

    @Override
    public <S extends ManagerRepository> S save(S s) {
        return null;
    }

    @Override
    public <S extends ManagerRepository> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<ManagerRepository> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<ManagerRepository> findAll() {
        return null;
    }

    @Override
    public Iterable<ManagerRepository> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(ManagerRepository managerRepository) {

    }

    @Override
    public void deleteAll(Iterable<? extends ManagerRepository> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
