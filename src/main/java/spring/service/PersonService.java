package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.domain.Person;
import spring.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void add(Person person) {
        Person newPerson = new Person(person.getFirstname(), person.getLastname());
        personRepository.save(newPerson);
    }

    public void delete(Integer id) {
        personRepository.deleteById(id);
    }

    public void update(Person person) {
        personRepository.save(person);
    }

    public Person getPersonById(Integer id) {
        return personRepository.findById(id).get();
    }
}
