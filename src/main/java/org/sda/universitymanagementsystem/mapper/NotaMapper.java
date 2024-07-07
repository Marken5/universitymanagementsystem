package org.sda.universitymanagementsystem.mapper;

import org.sda.universitymanagementsystem.model.Kurs;
import org.sda.universitymanagementsystem.model.Nota;
import org.sda.universitymanagementsystem.model.Perdorues;
import org.sda.universitymanagementsystem.model.dto.NotaDTO;

public class NotaMapper {
    public static NotaDTO toDTO(Nota nota) {
        NotaDTO notaDTO = new NotaDTO();
        notaDTO.setId(nota.getId());
        notaDTO.setNota(nota.getNota());
        notaDTO.setSezoni(nota.getSezoni());

        notaDTO.setKurs(KursMapper.toDTO(nota.getKurs()));
        notaDTO.setStudent(PerdoruesMapper.toDTO(nota.getStudent()));

        return notaDTO;
    }

    public static Nota toEntity(NotaDTO notaDTO, Perdorues student, Kurs kurs) {
        Nota nota = new Nota();
        nota.setNota(notaDTO.getNota());
        nota.setKurs(kurs);
        nota.setStudent(student);
        nota.setSezoni(notaDTO.getSezoni());
        return nota;
    }
}
