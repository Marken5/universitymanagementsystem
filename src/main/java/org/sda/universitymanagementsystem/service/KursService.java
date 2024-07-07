package org.sda.universitymanagementsystem.service;

import org.sda.universitymanagementsystem.model.dto.KursDTO;

import java.util.List;

public interface KursService {
    void save(KursDTO kursDTO);
    void update(KursDTO kursDTO);
    KursDTO findById(Integer id);
    List<KursDTO> findAll();
}
