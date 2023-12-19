package goral.psychotherapistoffice.domain.therapy;


import goral.psychotherapistoffice.domain.therapy.dto.TherapyDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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

    @Transactional
    public void addTherapy(TherapyDto therapyDto){
        Therapy therapyToSave = new Therapy();
        therapyToSave.setKindOfTherapy(therapyDto.getKindOfTherapy());
        therapyToSave.setDescription(therapyDto.getDescription());
        therapyToSave.setPrice(therapyDto.getPrice());
        therapyRepository.save(therapyToSave);
    }

}