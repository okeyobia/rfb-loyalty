package com.okey.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.okey.domain.RfbUser} entity.
 */
public class RfbUserDTO implements Serializable {

    private Long id;

    private String userName;


    private Long homeLocationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getHomeLocationId() {
        return homeLocationId;
    }

    public void setHomeLocationId(Long rfbLocationId) {
        this.homeLocationId = rfbLocationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RfbUserDTO rfbUserDTO = (RfbUserDTO) o;
        if (rfbUserDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), rfbUserDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "RfbUserDTO{" +
            "id=" + getId() +
            ", userName='" + getUserName() + "'" +
            ", homeLocation=" + getHomeLocationId() +
            "}";
    }
}
