package home.blackharold.spring5webapp.repositories;

import home.blackharold.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
