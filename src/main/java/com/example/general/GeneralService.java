package com.example.general;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneralService {
    private final GeneralMapper generalMapper;

    public GeneralService(GeneralMapper generalMapper) { this.generalMapper = generalMapper; }

    public List<General> findGeneralsStartingWith(String prefix) { return generalMapper.findByGeneralStartingWith(prefix); }

    public General findGeneral(int id) {
        Optional<General> general = generalMapper.findById(id);
        if (general.isPresent()) {
            return general.get();
        } else {
            throw new GeneralNotFoundException("name not found");
        }
    }
}
