package hiragi.innovatracker.repository;

import hiragi.innovatracker.model.TdDepartamento;
<<<<<<< HEAD
import hiragi.innovatracker.model.TdDepartamento;
=======
>>>>>>> 727916a3be1f627dd737096541b04258693b5e00
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TdDepartamentoRepository extends JpaRepository<TdDepartamento, Long> {

    Optional<TdDepartamento> findBySglDepartamentoIgnoreCase(String sglDepartamento);

<<<<<<< HEAD
    List<TdDepartamento> findBySglDepartamentoContainingOrNmeDepartamentoContaining(String sgl, String nme);

    boolean existsBySglDepartamentoIgnoreCase(String sglDepartamento);

    // Busca exata pelo nome
=======
    boolean existsBySglDepartamentoIgnoreCase(String sglDepartamento);

>>>>>>> 727916a3be1f627dd737096541b04258693b5e00
    Optional<TdDepartamento> findByNmeDepartamentoIgnoreCase(String nmeDepartamento);

    boolean existsByNmeDepartamentoIgnoreCase(String nmeDepartamento);

<<<<<<< HEAD
    // Busca parcial pelo nome (LIKE %valor%), ordenada
    List<TdDepartamento> findByNmeDepartamentoContainingIgnoreCaseOrderByNmeDepartamentoAsc(String nmeDepartamento);

}
=======
    List<TdDepartamento> findByNmeDepartamentoContainingIgnoreCaseOrderByNmeDepartamentoAsc(
            String nmeDepartamento
    );
}
>>>>>>> 727916a3be1f627dd737096541b04258693b5e00
