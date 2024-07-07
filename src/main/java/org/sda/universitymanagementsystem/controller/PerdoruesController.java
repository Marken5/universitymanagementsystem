package org.sda.universitymanagementsystem.controller;

import org.sda.universitymanagementsystem.model.dto.PerdoruesDTO;
import org.sda.universitymanagementsystem.service.PerdoruesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perdorues")
public class PerdoruesController {
    @Autowired
    private PerdoruesService perdoruesService;

    @PostMapping
    public void save(@RequestBody PerdoruesDTO dto) {
        perdoruesService.save(dto);
    }

    @PutMapping
    public void update(@RequestBody PerdoruesDTO dto) {
        perdoruesService.update(dto);
    }

    @GetMapping("/{id}")
    public PerdoruesDTO findById(@PathVariable Integer id) {
        return perdoruesService.findById(id);
    }

    @GetMapping
    public List<PerdoruesDTO> findAll() {
        return perdoruesService.findAll();
    }
}
