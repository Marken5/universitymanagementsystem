package org.sda.universitymanagementsystem.service;

import org.sda.universitymanagementsystem.model.dto.NotaDTO;

import java.util.List;

public interface NotaService {
    void save(NotaDTO notaDTO);
    NotaDTO findById(Integer id);
    List<NotaDTO> findNotatOfStudent(Integer id);
    List<NotaDTO> findNotatOfCourse(Integer id);
}
