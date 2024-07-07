package org.sda.universitymanagementsystem.service;

import org.sda.universitymanagementsystem.model.dto.PerdoruesDTO;

import java.util.List;

public interface PerdoruesService {
    void save(PerdoruesDTO perdoruesDTO);
    void update(PerdoruesDTO perdoruesDTO);
    PerdoruesDTO findById(Integer id);
    List<PerdoruesDTO> findAll();
}
