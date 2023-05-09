package jpikavalko.springframework.webapp.repositories;

import jpikavalko.springframework.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
