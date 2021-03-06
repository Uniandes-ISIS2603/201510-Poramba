package co.edu.uniandes.csw.Vacas.service;

import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.api.IHotelLogic;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author estudiante
 */
@Path("/hotels")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HotelService {

    @Inject
    protected IHotelLogic hotelLogic;

    @POST
    public HotelDTO createHotel(HotelDTO Hotel) {
        return hotelLogic.createHotel(Hotel);
    }

    @DELETE
    @Path("{id}")
    public void deleteHotel(@PathParam("id") String id) {
        hotelLogic.deleteHotel(id);
    }

    @GET
    public List<HotelDTO> getHoteles() {
        return hotelLogic.getHoteles();
    }

    @GET
    @Path("{id}")
    public HotelDTO getHotel(@PathParam("id") String id) {
        return hotelLogic.getHotel(id);
    }

    @PUT
    @Path("{id}")
    public void updateHotel(HotelDTO hotel) 
    {
        hotelLogic.updateHotel(hotel);
    }
}
