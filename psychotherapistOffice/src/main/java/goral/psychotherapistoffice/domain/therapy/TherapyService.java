package goral.psychotherapistoffice.domain.therapy;


import goral.psychotherapistoffice.domain.therapy.dto.TherapyDto;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class TherapyService {
    private final TherapyRepository therapyRepository;

    public TherapyService(TherapyRepository therapyRepository) {
        this.therapyRepository = therapyRepository;
    }

    public List<TherapyDto>findAllTherapies(){
        return therapyRepository.findAll().stream()
                .map(TherapyDtoMapper::map).toList();
    }

    public Optional<TherapyDto>findTherapyById(long id){
        return therapyRepository.findById(id).map(TherapyDtoMapper::map);
    }



}
