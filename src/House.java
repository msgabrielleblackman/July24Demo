public class House extends Building {

    private String familyName;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public House(String location, int sqft, String familyName) {
        super(location, sqft);

    }
}
