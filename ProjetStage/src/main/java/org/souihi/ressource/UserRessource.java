package org.souihi.ressource;

import io.quarkus.security.identity.SecurityIdentity;
import io.smallrye.common.constraint.NotNull;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.souihi.dao.UserDao;
import org.souihi.model.Users;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/users")
@Consumes("application/json")
@Produces(MediaType.APPLICATION_JSON)
public class UserRessource {

    //private List<UserDomaine> usersList = new ArrayList<>();
    @GET
    @RolesAllowed("toto")
    public Response get(){
        List<UserDao> usersDomaine= UserDao.findAll().list();
        return Response.ok(usersDomaine).build();
    }
    @GET
    @RolesAllowed("toto")
    @Path("{id}")
    public Response getSingle(@PathParam Long id ){
        UserDao userDao = UserDao.findById(id);
        return Response.ok(userDao).build();
    }
    @POST
    @RolesAllowed("toto")
    @Transactional
    public Response post(@NotNull Users model){
        UserDao userDao = new UserDao(model.firstName, model.lastName, model.   email, model.password, model.phoneNumber, model.roleID);
        userDao.persist();
        return Response.ok("SUCESS").build();
    }
    @PUT
    @RolesAllowed("toto")
    @Path("{id}")
    @Transactional
    public Response put(@PathParam Long id,@NotNull Users model){
        UserDao userDao = UserDao.findById(id);
        if (userDao == null){
            throw new WebApplicationException("Cette user avec cet ID"+ userDao +"n'existe pas ", 404);
        }
        userDao.firstName = model.firstName;
        userDao.lastName = model.lastName;
        userDao.email = model.email;
        userDao.password = model.password;
        userDao.phoneNumber = model.phoneNumber;
        userDao.roleId = model.roleID;
        userDao.persist();
        return Response.ok(userDao).build();
    }

    @DELETE
    @RolesAllowed("toto")
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam Long id){
        UserDao userDao = UserDao.findById(id);
        if (userDao == null){
            throw new WebApplicationException("Cette user avec cet ID"+ userDao +"n'existe pas ", 404);
        }
        userDao.delete();
        return Response.ok("DELETE SUCESS").build();
    }

}