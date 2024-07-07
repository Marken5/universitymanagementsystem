package org.sda.universitymanagementsystem.controller;

import org.sda.universitymanagementsystem.model.Kurs;
import org.sda.universitymanagementsystem.model.dto.KursDTO;
import org.sda.universitymanagementsystem.service.KursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kurs")
public class KursController {

    @Autowired
    private KursService kursService;

    @PostMapping
    public void save(@RequestBody KursDTO kursDTO) {
        kursService.save(kursDTO);
    }

    @PutMapping
    public void update(@RequestBody KursDTO kursDTO) {
        kursService.update(kursDTO);
    }
    @GetMapping("/{id}")
    public KursDTO findById(@PathVariable Integer id) {
        return kursService.findById(id);
    }

    @GetMapping
    public List<KursDTO> findAll() {
        return kursService.findAll();
    }
}
