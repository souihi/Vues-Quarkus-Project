package org.souihi.ressource;

import io.smallrye.common.constraint.NotNull;
import org.jboss.logging.annotations.Param;
import org.souihi.dao.BookingDao;
import org.souihi.model.Booking;

import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/bookings")
@Consumes("application/json")
@Produces(MediaType.APPLICATION_JSON)
public class BookingRessource {

    @GET
    @RolesAllowed("toto")
    public Response get(){
        List<BookingDao> bookingDaos = BookingDao.findAll().list();
        return Response.ok(bookingDaos).build();
    }
    @GET
    @RolesAllowed("toto")
    @Path("{id}")
    public Response getById(@Param Long id){
        BookingDao bookingDaos = BookingDao.findById(id);
        return Response.ok(bookingDaos).build();
    }
    @POST
    @RolesAllowed("toto")
    @Transactional
    public Response post(@NotNull Booking model){
        BookingDao bookingDaos = new BookingDao(model.spaceId, model.userId, model.startTime, model.endTime, model.price, model.status);
        bookingDaos.persist();
        return Response.ok(bookingDaos).build();
    }
    @PUT
    @RolesAllowed("toto")
    @Path("{id}")
    @Transactional
    public Response put(@Param Long id, @NotNull Booking model){
        BookingDao bookingDaos = BookingDao.findById(id);
        if (bookingDaos == null){
            throw new WebApplicationException("Introuvable",404);
        }
        bookingDaos.spaceId = model.spaceId;
        bookingDaos.userId = model.userId;
        bookingDaos.startTime = model.startTime;
        bookingDaos.endTime = model.endTime;
        bookingDaos.price = model.price;
        bookingDaos.status = model.status;
        bookingDaos.persist();
        return Response.ok(bookingDaos).build();
    }
    @DELETE
    @RolesAllowed("toto")
    @Path("{id}")
    @Transactional
    public Response delete(@Param Long id){
        BookingDao bookingDaos = BookingDao.findById(id);
        if (bookingDaos == null){
            throw new WebApplicationException("Introuvable",404);
        }
        bookingDaos.delete();
        return Response.ok(bookingDaos).build();
    }
}
