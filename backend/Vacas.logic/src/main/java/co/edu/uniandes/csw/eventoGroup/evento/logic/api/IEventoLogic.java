/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.eventoGroup.evento.logic.api;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.CiudadEntity;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import java.util.List;

/**
 *
 * @author poramba
 */
public interface IEventoLogic {

    public EventoDTO createEvento(EventoDTO detail);

    public List<EventoDTO> getEventos();

    public EventoDTO getEvento(String id);

    public void deleteEvento(String id);

    public void updateEvento(EventoDTO detail);

    public void setCiudad(CiudadDTO ciudad, EventoDTO detail);   

    public CiudadEntity getCiudad(EventoDTO detail);

}
