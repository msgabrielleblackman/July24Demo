public class MainApp {

    public static void main(String[] args) {

        Building build = new Building("1785 Woodward",7500);
        House allieHouse = new House("1570 Woodward", 900, "Blackman's");

        //System.out.println(build.getLocation());

        System.out.println();allieHouse.getSqft();
        allieHouse.setSqft(1200);
        System.out.println("I added a 300 ft addition: ");
        System.out.println(allieHouse.getSqft() );

        System.out.println("Selling house to the Smith's: ");
        allieHouse.setFamilyName("Smith's");
        System.out.println(allieHouse.getFamilyName());
    }
}
