package org.souihi.model;

import io.smallrye.common.constraint.NotNull;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class Space {
    @NotNull
    @Schema(required = true,example = "Sun")
    public String name;
    @NotNull
    @Schema(required = true, example = "COWORKING ORIENTE SUD")
    public String descritpion;
    @NotNull
    @Schema(required = true, example = "56 Rue des pissenlis")
    public String adress;
    @NotNull
    @Schema(required = true, example = "San Francisco")
    public String city;
    @NotNull
    @Schema(required = true,example = "USA")
    public String country;
    @NotNull
    @Schema(required = true, example = "8080")
    public String zipCode;
    @NotNull
    @Schema(required = true, example = "15 personnes")
    public String capacity;
    @NotNull
    @Schema(required = true,example = "BUREAU")
    public String type;
    @NotNull
    @Schema(required = true, example = "WIFI6, IMPRIMANTES, DISTRIBUTEUR")
    public String ameneties;
    @NotNull
    @Schema(required = true, example = "src/img/bureau.png")
    public String image;
    @NotNull
    @Schema(required = true, example = "Richard LERMITE")
    public String userId;
    public Space(){}
}
