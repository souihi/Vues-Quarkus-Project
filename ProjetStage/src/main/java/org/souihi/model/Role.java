package org.souihi.model;

import io.smallrye.common.constraint.NotNull;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class Role {
    @NotNull
    public Long id;
    @NotNull
    @Schema(required = true, example = "Proprietary")
    public String role;
    public Role(){}
}
