package ru.scarletarrow.dbrestjpa.entity;


import javax.persistence.*;

@Entity
@Table(name = "speedtest")
//@AllArgsConstructor
public class SpeedTest {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "OperatorId", fetch = FetchType.LAZY)
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="OperatorId")
    @Column(name = "OperatorId")
//    @OneToOne(mappedBy = "id")
//    @JoinColumn(referencedColumnName = "OperatorId")
    private int operator;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="LocationId")
    @Column(name = "LocationId")
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "id")
//    @JoinColumn(referencedColumnName = "LocationId")
    private int location;


    @Column(name = "DownloadSpeed")
    private double downloadSpeed;

    @Column(name = "UploadSpeed")
    private double uploadSpeed;

    @Column(name = "Latency")
    private int latency;

    public SpeedTest(int operator, int location, double downloadSpeed, double uploadSpeed, int latency){
        this.operator=operator;
        this.location=location;
        this.downloadSpeed=downloadSpeed;
        this.uploadSpeed=uploadSpeed;
        this.latency=latency;
    }

    public SpeedTest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public double getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(double downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public double getUploadSpeed() {
        return uploadSpeed;
    }

    public void setUploadSpeed(double uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }
}
