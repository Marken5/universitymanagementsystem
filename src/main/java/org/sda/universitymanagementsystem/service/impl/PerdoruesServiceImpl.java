package org.sda.universitymanagementsystem.service.impl;

import org.sda.universitymanagementsystem.mapper.PerdoruesMapper;
import org.sda.universitymanagementsystem.model.Perdorues;
import org.sda.universitymanagementsystem.model.dto.PerdoruesDTO;
import org.sda.universitymanagementsystem.repository.PerdoruesRepository;
import org.sda.universitymanagementsystem.service.PerdoruesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PerdoruesServiceImpl implements PerdoruesService  {
    @Autowired
    private PerdoruesRepository perdoruesRepository;

    @Override
    public void save(PerdoruesDTO perdoruesDTO) {
        Perdorues perdorues = PerdoruesMapper.toEntity(perdoruesDTO);
        perdoruesRepository.save(perdorues);
    }

    @Override
    public void update(PerdoruesDTO perdoruesDTO) {
        Perdorues perdorues = perdoruesRepository.findById(perdoruesDTO.getId())
                .orElseThrow(() -> new RuntimeException("Not found"));
        perdorues = PerdoruesMapper.toEntityForUpdate(perdorues, perdoruesDTO);
        perdoruesRepository.save(perdorues);
    }

    @Override
    public PerdoruesDTO findById(Integer id) {
        return PerdoruesMapper
                .toDTO(perdoruesRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found")));
    }

    @Override
    public List<PerdoruesDTO> findAll() {
        return perdoruesRepository.findAll().stream().map(PerdoruesMapper::toDTO).toList();
    }
}
