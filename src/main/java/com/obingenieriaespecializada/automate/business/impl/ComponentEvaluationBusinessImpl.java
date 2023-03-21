package com.obingenieriaespecializada.automate.business.impl;

import com.obingenieriaespecializada.automate.business.ComponentEvaluationBusiness;
import com.obingenieriaespecializada.automate.dto.entity.SaveComponentEvaluationDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationDto;
import com.obingenieriaespecializada.automate.dto.entity.readwrite.RWComponentEvaluationInventoryDto;
import com.obingenieriaespecializada.automate.service.ComponentEvaluationService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ComponentEvaluationBusinessImpl implements ComponentEvaluationBusiness {
    private final ComponentEvaluationService componentEvaluationService;

    public ComponentEvaluationBusinessImpl(ComponentEvaluationService componentEvaluationService) {
        this.componentEvaluationService = componentEvaluationService;
    }

    @Override
    public Optional<SaveComponentEvaluationDto> save(SaveComponentEvaluationDto saveComponentEvaluationDto) {

        try{
            saveComponentEvaluationDto.getComponentEvaluationDto().setCreationDate(LocalDateTime.now());
            Optional<RWComponentEvaluationDto> isEvaluationSaved =
                    this.componentEvaluationService.save(saveComponentEvaluationDto.getComponentEvaluationDto());
            if (isEvaluationSaved.isPresent()){

                saveComponentEvaluationDto.setComponentEvaluationDto(isEvaluationSaved.get());
                saveComponentEvaluationDto.getComponentEvaluationInventory()
                        .forEach(inventory -> {
                            inventory.setIdComponentEvaluation(isEvaluationSaved.get().getId());
                            inventory.setCreationDate(LocalDateTime.now());
                        });

                saveComponentEvaluationDto.setComponentEvaluationInventory(
                        this.componentEvaluationService.save(saveComponentEvaluationDto.getComponentEvaluationInventory()));
            }
            return Optional.of(saveComponentEvaluationDto);
        }catch (Exception e){
            //TODO: Log error
        }

        return Optional.empty();
    }

}
