package org.sda.universitymanagementsystem.service.impl;

import org.sda.universitymanagementsystem.mapper.KursMapper;
import org.sda.universitymanagementsystem.model.Kurs;
import org.sda.universitymanagementsystem.model.Perdorues;
import org.sda.universitymanagementsystem.model.dto.KursDTO;
import org.sda.universitymanagementsystem.repository.KursRepository;
import org.sda.universitymanagementsystem.repository.PerdoruesRepository;
import org.sda.universitymanagementsystem.service.KursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KursServiceImpl implements KursService {
    @Autowired
    private KursRepository kursRepository;
    @Autowired
    private PerdoruesRepository perdoruesRepository;

    @Override
    public void save(KursDTO kursDTO) {
        Perdorues pedagog = perdoruesRepository.findById(kursDTO.getPedagogu().getId()).orElseThrow(() -> new RuntimeException("Pedagogu not Found"));

        Kurs kurs = KursMapper.toEntity(kursDTO, pedagog);
        kursRepository.save(kurs);
    }

    @Override
    public void update(KursDTO kursDTO) {
        Perdorues pedagog = perdoruesRepository.findById(kursDTO.getPedagogu().getId())
                .orElseThrow(() -> new RuntimeException("Pedagogu not Found"));

        Kurs kurs = kursRepository.findById(kursDTO.getId())
                .orElseThrow(() -> new RuntimeException("Kursi not found"));

        kurs = KursMapper.toEntityForUpdate(kursDTO, pedagog, kurs);

        kursRepository.save(kurs);
    }

    @Override
    public KursDTO findById(Integer id) {
        Kurs kurs = kursRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
        return KursMapper.toDTO(kurs);
    }

    @Override
    public List<KursDTO> findAll() {
        return kursRepository.findAll().stream().map(KursMapper::toDTO).toList();
    }
}
