package guru.springframework.repositories;


import guru.springframework.models.Receipe;
import org.springframework.data.repository.CrudRepository;

public interface ReceipeRepository extends CrudRepository<Receipe, Long> {
}
