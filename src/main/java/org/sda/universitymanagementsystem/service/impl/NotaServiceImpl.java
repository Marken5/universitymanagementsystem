package org.sda.universitymanagementsystem.service.impl;

import org.sda.universitymanagementsystem.mapper.NotaMapper;
import org.sda.universitymanagementsystem.model.Kurs;
import org.sda.universitymanagementsystem.model.Nota;
import org.sda.universitymanagementsystem.model.Perdorues;
import org.sda.universitymanagementsystem.model.dto.NotaDTO;
import org.sda.universitymanagementsystem.repository.KursRepository;
import org.sda.universitymanagementsystem.repository.NotaRepository;
import org.sda.universitymanagementsystem.repository.PerdoruesRepository;
import org.sda.universitymanagementsystem.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotaServiceImpl implements NotaService {
    @Autowired
    private NotaRepository notaRepository;
    @Autowired
    private PerdoruesRepository perdoruesRepository;
    @Autowired
    private KursRepository kursRepository;

    @Override
    public void save(NotaDTO notaDTO) {
        Kurs kurs = kursRepository.findById(notaDTO.getKurs().getId())
                .orElseThrow(() -> new RuntimeException("Nota not found"));
        Perdorues student = perdoruesRepository.findById(notaDTO.getStudent().getId())
                .orElseThrow(() -> new RuntimeException("Stuenti not found"));

        Nota nota = NotaMapper.toEntity(notaDTO,student,kurs);
        notaRepository.save(nota);
    }

    @Override
    public NotaDTO findById(Integer id) {
        Nota nota = notaRepository.findById(id).orElseThrow(() -> new RuntimeException("Nota not found"));
        return NotaMapper.toDTO(nota);
    }

    @Override
    public List<NotaDTO> findNotatOfStudent(Integer id) {
        return notaRepository.findAllByStudentId(id).stream().map(NotaMapper::toDTO).toList();
    }

    @Override
    public List<NotaDTO> findNotatOfCourse(Integer id) {
        return notaRepository.findAllByKursId(id).stream().map(NotaMapper::toDTO).toList();
    }
}
