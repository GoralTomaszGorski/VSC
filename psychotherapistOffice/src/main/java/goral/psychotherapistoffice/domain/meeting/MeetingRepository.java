package goral.psychotherapistoffice.domain.meeting;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MeetingRepository extends CrudRepository <Meeting, Long>{


    List<Meeting> findAll();


}
