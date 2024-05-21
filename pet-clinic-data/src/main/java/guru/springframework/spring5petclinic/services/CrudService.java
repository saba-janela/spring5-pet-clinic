package guru.springframework.spring5petclinic.services;

import guru.springframework.spring5petclinic.model.Owner;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

    Owner save(Owner object);

    void deleteById(Owner id);
}
