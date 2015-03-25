/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.CiudadGroup.ciudad.logic.api;

import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto.CiudadDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface ICiudadLogic {

    public CiudadDTO createCiudad(CiudadDTO detail);

    public List<CiudadDTO> getCiudades();


    public CiudadDTO getCiudad(Long id);

    public void deleteCiudad(Long id);

}
