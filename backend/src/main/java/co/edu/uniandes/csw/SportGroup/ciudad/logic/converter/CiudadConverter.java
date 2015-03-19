/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.SportGroup.ciudad.logic.converter;

import co.edu.uniandes.csw.SportGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.converter.*;
import co.edu.uniandes.csw.SportGroup.transporte.logic.converter.*;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.entity.CountryEntity;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public class CiudadConverter {
    public static CiudadDTO entity2PersistenceDTO(CiudadEntity entity) {
        if (entity != null) {
            CiudadDTO dto = new CiudadDTO();
            dto.setId(entity.getId());            
            dto.setNombre(entity.getNombre());
            dto.setDescripcion(entity.getDescripcion());
            dto.setLink(entity.getLink());
            /*dto.setPopulation(entity.getPopulation());*/
            return dto;
        } else {
            return null;
        }
    }

    public static CiudadEntity persistenceDTO2Entity(CiudadDTO dto) {
        if (dto != null) {
            CiudadEntity entity = new CiudadEntity();
            entity.setId(dto.getId());

            entity.setPasaporte(dto.getPasaporte());
            entity.setNombre(dto.getNombre());
            entity.setDescripcion(dto.getDescripcion());
            entity.setLink(dto.getLink());

            return entity;
        } else {
            return null;
        }
    }

    public static List<CiudadDTO> entity2PersistenceDTOList(List<CiudadEntity> entities) {
        List<c> dtos = new ArrayList<CiudadDTO>();
        for (CiudadEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<CiudadEntity> persistenceDTO2EntityList(List<CiudadDTO> dtos) {
        List<v> entities = new ArrayList<CiudadEntity>();
        for (CiudadDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}