package org.sda.universitymanagementsystem.repository;

import org.sda.universitymanagementsystem.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotaRepository extends JpaRepository<Nota,Integer> {
    List<Nota> findAllByKursId(Integer id);
    List<Nota> findAllByStudentId(Integer id);
}
