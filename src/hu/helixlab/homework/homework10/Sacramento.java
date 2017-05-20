package hu.helixlab.homework.homework10;

public class Sacramento {

    private String cdTime;
    private String address;
    private int district;
    private String beat;
    private int grid;
    private String crimedescr;
    private int ucr_ncic_code;
    private float latitude;
    private float longitude;

    public void setCdTime(String cdTime) {
        this.cdTime = cdTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }

    public String getCrimedescr() {
        return crimedescr;
    }

    public void setCrimedescr(String crimedescr) {
        this.crimedescr = crimedescr;
    }

    public int getUcr_ncic_code() {
        return ucr_ncic_code;
    }

    public void setUcr_ncic_code(int ucr_ncic_code) {
        this.ucr_ncic_code = ucr_ncic_code;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getCdTime() {
        return cdTime;
    }

    @Override
    public String toString() {
        return "Sacramento{" +
                "cdTime='" + cdTime + '\'' +
                ", address='" + address + '\'' +
                ", district=" + district +
                ", beat='" + beat + '\'' +
                ", grid=" + grid +
                ", crimedescr='" + crimedescr + '\'' +
                ", ucr_ncic_code=" + ucr_ncic_code +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}