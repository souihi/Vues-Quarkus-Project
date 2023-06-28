package org.souihi.ressource;

import io.smallrye.common.constraint.NotNull;
import org.jboss.logging.annotations.Param;
import org.souihi.dao.SpaceDao;
import org.souihi.model.Space;

import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/spaces")
@Consumes("application/json")
@Produces(MediaType.APPLICATION_JSON)
public class SpaceRessource {
    @GET
    @RolesAllowed("toto")
    public Response get(){
        List<SpaceDao> spaceDao = SpaceDao.findAll().list();
        return Response.ok(spaceDao).build();
    }
    @GET
    @RolesAllowed("toto")
    @Path("{id}")
    public Response getById(@Param Long id){
        SpaceDao spaceDomains = SpaceDao.findById(id);
        return Response.ok(spaceDomains).build();
    }
    @POST
    @RolesAllowed("toto")
    @Transactional
    public Response post(@NotNull Space model){
        SpaceDao spaceDao = new SpaceDao(model.name, model.descritpion, model.adress, model.city, model.country, model.zipCode, model.capacity, model.type, model.ameneties, model.image, model.userId);
        spaceDao.persist();
        return Response.ok(spaceDao).build();
    }
    @PUT
    @RolesAllowed("toto")
    @Path("{id}")
    @Transactional
    public Response put(@Param Long id, @NotNull Space model){
        SpaceDao spaceDao = SpaceDao.findById(id);
        if (spaceDao == null){
            throw new WebApplicationException("Introuvable",404);
        }
        spaceDao.name= model.name;
        spaceDao.descritpion = model.descritpion;
        spaceDao.adress = model.adress;
        spaceDao.city = model.city;
        spaceDao.country = model.country;
        spaceDao.zipCode = model.zipCode;
        spaceDao.capacity = model.capacity;
        spaceDao.type = model.type;
        spaceDao.ameneties = model.ameneties;
        spaceDao.image= model.image;
        spaceDao.userId= model.userId;
        spaceDao.persist();
        return Response.ok(spaceDao).build();
    }
    @DELETE
    @RolesAllowed("toto")
    @Path("{id}")
    @Transactional
    public Response delete(@Param Long id){
        SpaceDao spaceDomains = SpaceDao.findById(id);
        if (spaceDomains == null){
            throw new WebApplicationException("Introuvable",404);
        }
        spaceDomains.delete();
        return Response.ok(spaceDomains).build();
    }
}
