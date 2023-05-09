package jpikavalko.springframework.webapp.repositories;

import jpikavalko.springframework.webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
