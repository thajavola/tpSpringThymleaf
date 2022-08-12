package mg.cdan4.tp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mg.cdan4.tp.entity.Entree;
@Repository
public interface EntreeRepository extends JpaRepository<Entree, Integer> {
    
}
