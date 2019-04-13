package test.orm.ormtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.orm.ormtest.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
