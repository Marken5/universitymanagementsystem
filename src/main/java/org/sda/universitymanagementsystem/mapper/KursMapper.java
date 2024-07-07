package org.sda.universitymanagementsystem.mapper;

import org.sda.universitymanagementsystem.model.Kurs;
import org.sda.universitymanagementsystem.model.Perdorues;
import org.sda.universitymanagementsystem.model.dto.KursDTO;

public class KursMapper {
    public static KursDTO toDTO(Kurs kurs) {
        KursDTO kursDTO = new KursDTO();
        kursDTO.setId(kurs.getId());
        kursDTO.setEmer(kurs.getEmer());
        kursDTO.setDepartament(kurs.getDepartament());
        kursDTO.setKredite(kurs.getKredite());
        kursDTO.setVitAkademik(kurs.getVitAkademik());
        kursDTO.setPedagogu(PerdoruesMapper.toDTO(kurs.getPedagogu()));
        return kursDTO;
    }

    public static Kurs toEntity(KursDTO kursDTO, Perdorues pedagog) {
        Kurs kurs = new Kurs();
        kurs.setEmer(kursDTO.getEmer());
        kurs.setDepartament(kursDTO.getDepartament());
        kurs.setKredite(kursDTO.getKredite());
        kurs.setVitAkademik(kursDTO.getVitAkademik());
        kurs.setPedagogu(pedagog);
        return kurs;
    }

    public static Kurs toEntityForUpdate(KursDTO kursDTO, Perdorues pedagog, Kurs kurs) {
        kurs.setEmer(kursDTO.getEmer());
        kurs.setDepartament(kursDTO.getDepartament());
        kurs.setKredite(kursDTO.getKredite());
        kurs.setVitAkademik(kursDTO.getVitAkademik());
        kurs.setPedagogu(pedagog);
        return kurs;
    }
}
