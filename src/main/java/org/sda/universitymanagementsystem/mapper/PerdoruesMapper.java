package org.sda.universitymanagementsystem.mapper;

import org.sda.universitymanagementsystem.model.Perdorues;
import org.sda.universitymanagementsystem.model.dto.PerdoruesDTO;

public class PerdoruesMapper {
    public static Perdorues toEntity(PerdoruesDTO perdoruesDTO) {
        Perdorues perdorues = new Perdorues();
        perdorues.setEmail(perdoruesDTO.getEmail());
        perdorues.setNid(perdoruesDTO.getNid());
        perdorues.setRol(perdoruesDTO.getRol());
        perdorues.setEmriPlote(perdoruesDTO.getEmriPlote());
        perdorues.setGrupi(perdoruesDTO.getGrupi());
        perdorues.setPasword(perdoruesDTO.getPasword());
        return perdorues;
    }


    public static PerdoruesDTO toDTO(Perdorues perdorues) {
        PerdoruesDTO perdoruesDTO = new PerdoruesDTO();
        perdoruesDTO.setEmail(perdorues.getEmail());
        perdoruesDTO.setNid(perdorues.getNid());
        perdoruesDTO.setRol(perdorues.getRol());
        perdoruesDTO.setEmriPlote(perdorues.getEmriPlote());
        perdoruesDTO.setGrupi(perdorues.getGrupi());
        perdoruesDTO.setPasword(perdorues.getPasword());
        return perdoruesDTO;
    }

    public static Perdorues toEntityForUpdate(Perdorues perdorues, PerdoruesDTO perdoruesDTO) {
        perdorues.setEmail(perdoruesDTO.getEmail());
        perdorues.setNid(perdoruesDTO.getNid());
        perdorues.setRol(perdoruesDTO.getRol());
        perdorues.setEmriPlote(perdoruesDTO.getEmriPlote());
        perdorues.setGrupi(perdoruesDTO.getGrupi());
        perdorues.setPasword(perdoruesDTO.getPasword());
        return perdorues;
    }
}
