public class Building {

    private String location;
    private int sqft;

    public Building(String location, int sqft){
        this.location = location;
        this.sqft = sqft;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }
}
