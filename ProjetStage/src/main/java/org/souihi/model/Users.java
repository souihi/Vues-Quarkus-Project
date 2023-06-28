package org.souihi.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;
import org.eclipse.microprofile.openapi.annotations.media.Schema;


import javax.persistence.Entity;

@Entity
public class Users extends PanacheEntity {
    @NotNull
    public Long id;
    @NotNull
    @Schema(required = true, example = "SOUIHI")
    public String firstName;
    @NotNull
    @Schema(required = true, example = "MOMS")
    public String lastName;
    @NotNull
    @Schema(required = true, example = "@GMAIL")
    public String email;
    @NotNull
    @Schema(required = true, example = "12345")
    public String password;

    @NotNull
    @Schema(required = true, example = "+33 65 21 11 23")
    public String phoneNumber;

    @NotNull
    @Schema(required = true, example = "Locataire")
    public String roleID;
    public Users(){

    }
}
