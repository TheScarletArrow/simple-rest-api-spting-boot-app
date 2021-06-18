package ru.scarletarrow.dbrestjpa.entity;


import javax.persistence.*;


@Entity
@Table(name = "location_list")
public class Location {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;

    public Location() {
    }

    public Location(double longitude, double latitude, int typeid) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.typeid = typeid;
    }

    @Column(name = "typeid")
    private int typeid;

    public int getType_id() {
        return typeid;
    }

    public void setType_id(int type_id) {
        this.typeid = typeid;
    }
}
