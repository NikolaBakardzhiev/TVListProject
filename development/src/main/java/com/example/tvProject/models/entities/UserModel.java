package com.example.tvProject.models.entities;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "channel")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String radioOrTv;
    String name;
    String site;
    String logo;
    String frame;
    String specifications;
    String streamLocation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRadioOrTv() {
        return radioOrTv;
    }

    public void setRadioOrTv(String radioOrTv) {
        this.radioOrTv = radioOrTv;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getStreamLocation() {
        return streamLocation;
    }

    public void setStreamLocation(String streamLocation) {
        this.streamLocation = streamLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(id, userModel.id) &&
                Objects.equals(radioOrTv, userModel.radioOrTv) &&
                Objects.equals(name, userModel.name) &&
                Objects.equals(site, userModel.site) &&
                Objects.equals(logo, userModel.logo) &&
                Objects.equals(frame, userModel.frame) &&
                Objects.equals(specifications, userModel.specifications) &&
                Objects.equals(streamLocation, userModel.streamLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, radioOrTv, name, site, logo, frame, specifications, streamLocation);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "radioOrTv='" + radioOrTv + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
