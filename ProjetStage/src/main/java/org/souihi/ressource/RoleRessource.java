package org.souihi.ressource;


import io.smallrye.common.constraint.NotNull;
import org.jboss.logging.annotations.Param;
import org.souihi.dao.RoleDao;
import org.souihi.model.Role;

import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/roles")
@Consumes("application/json")
@Produces(MediaType.APPLICATION_JSON)
public class RoleRessource {
    @GET
    @RolesAllowed("toto")
    public Response get(){
        List<RoleDao> roleDao = RoleDao.findAll().list();
        return Response.ok(roleDao).build();
    }
    @GET
    @RolesAllowed("toto")
    @Path("{id}")
    public Response getById(@Param Long id){
        RoleDao roleDao = RoleDao.findById(id);
        return  Response.ok(roleDao).build();
    }
    @POST
    @RolesAllowed("toto")
    @Transactional
    public Response post(@NotNull Role model){
        RoleDao roleDao = new RoleDao(model.role);
        roleDao.persist();
        return Response.ok(roleDao).build();
    }
    @PUT
    @RolesAllowed("toto")
    @Path("{id}")
    @Transactional
    public Response put(@Param Long id,@NotNull Role model){
        RoleDao roleDao = RoleDao.findById(id);
        if (roleDao == null){
            throw new WebApplicationException("Ce role n'existe pas", 404);
        }
        roleDao.role = model.role;
        roleDao.persist();
        Response.ok().build();
        return Response.ok(roleDao).build();
    }
    @DELETE
    @RolesAllowed("toto")
    @Path("{id}")
    @Transactional
    public Response delete(@Param Long id){
        RoleDao roleDao = RoleDao.findById(id);
        if (roleDao == null){
            throw new WebApplicationException("Ce role n'existe pas"+" "+ roleDao);
        }
        roleDao.delete();
        return Response.ok(roleDao + "delete").build();
    }
}
