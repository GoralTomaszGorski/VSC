package goral.psychotherapistoffice.domain.therapy;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface TherapyRepository extends CrudRepository<Therapy, Long> {
    List<Therapy>findAll();

}
