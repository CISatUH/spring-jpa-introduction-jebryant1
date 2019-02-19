package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //tells the compiler to do stuff, like run from CMD; not needed for FX/Web apps
public class FirstApplication implements CommandLineRunner {


    @Autowired //dependency injection
    PersonRepository personRepository;
    ManagerRepository managerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args); //inversion of control (framework calls function)
    } 

    @Override
    public void run(String... args) throws Exception { //IoC
        Person person = new Person();
        person.setName("John"); //sets name
        personRepository.save(person); //saves class

        Person personFromDb = personRepository.findFirstByName("John"); //runs query
        System.out.println(personFromDb);



        ManagerEntity manager = new ManagerEntity();
        manager.setLastName("Bryant");
        managerRepository.save(manager);

        ManagerEntity managerFromDb = managerRepository.findByLastName("Bryant");
        System.out.println(managerFromDb);
    }
}
