package home.blackharold.spring5webapp.repositories;

import home.blackharold.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
