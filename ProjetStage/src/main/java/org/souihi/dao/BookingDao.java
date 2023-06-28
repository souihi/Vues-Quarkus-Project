package org.souihi.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.Entity;
@Entity
public class BookingDao extends PanacheEntity {
    @NotNull
    @Schema(required = true, example = "Sun")
    public String spaceId;
    @NotNull
    public String userId;
    @NotNull
    public String startTime;
    @NotNull
    public String endTime;

    @NotNull
    public String price;
    @NotNull
    public String  status;

    //CONSTRUCTOR

    public BookingDao() {
    }
    public BookingDao(String spaceId, String userId, String startTime, String endTime, String price, String status) {
        this.spaceId = spaceId;
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.status = status;
    }
    //GETTER AND SETTER

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
