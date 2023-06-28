package org.souihi.model;

import io.smallrye.common.constraint.NotNull;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class Booking {
    @NotNull
    @Schema(required = true, example = "Sun")
    public String spaceId;
    @NotNull
    @Schema(required = true, example = "Benard LERMITE")
    public String userId;
    @NotNull
    @Schema(required = true, example = "10/01/2023 - 14:00")
    public String startTime;
    @NotNull
    @Schema(required = true, example = "10/01/2023 - 18:00")
    public String endTime;

    @NotNull
    @Schema(required = true, example = "55€")
    public String price;
    @NotNull
    @Schema(required = true, example = "confirmée")
    public String  status;

    public Booking(){
    }
}
