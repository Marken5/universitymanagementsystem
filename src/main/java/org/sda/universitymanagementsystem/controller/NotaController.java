package org.sda.universitymanagementsystem.controller;

import org.sda.universitymanagementsystem.model.dto.NotaDTO;
import org.sda.universitymanagementsystem.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nota")
public class NotaController {

    @Autowired
    private NotaService notaService;

    @PostMapping
    public void save(@RequestBody NotaDTO notaDTO) {
        notaService.save(notaDTO);
    }

    @GetMapping("/{id}")
    public NotaDTO findById(@PathVariable Integer id) {
        return notaService.findById(id);
    }

    @GetMapping("/student/{id}")
    public List<NotaDTO> findNotatOfStudent(@PathVariable Integer id) {
        return notaService.findNotatOfStudent(id);
    }

    @GetMapping("/kurs/{id}")
    public List<NotaDTO> findNotatOfCourse(@PathVariable Integer id) {
        return notaService.findNotatOfCourse(id);
    }
}
