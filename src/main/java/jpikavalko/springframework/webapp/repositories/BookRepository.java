package jpikavalko.springframework.webapp.repositories;

import jpikavalko.springframework.webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
