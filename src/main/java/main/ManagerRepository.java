package main;

import org.springframework.data.repository.CrudRepository;

public interface ManagerRepository extends CrudRepository {

    ManagerEntity findByLastName (String last_name);
}
