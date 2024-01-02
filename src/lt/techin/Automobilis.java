package lt.techin;

public class Automobilis {
    // Privatūs laukai
    private String marke;
    private String modelis;
    private int metai;

    // Konstruktorius
    public Automobilis() {

    }

    // Getteriai
    public String getMarke() {
        return marke;
    }

    public String getModelis() {
        return modelis;
    }

    public int getMetai() {
        return metai;
    }

    // Setteriai
    public void setMarke(String naujaMarke) {
        this.marke = naujaMarke;
    }

    public void setModelis(String naujasModelis) {
        this.modelis = naujasModelis;
    }

    public void setMetai(int naujiMetai) {
        this.metai = naujiMetai;
    }

    public static void main(String[] args) {
        // Kodo main dalyje galima naudoti getterius ir setterius
        Automobilis automobilis = new Automobilis();
        automobilis.setMarke("BMW");
        automobilis.setModelis("120");
        automobilis.setMetai(2010);

        System.out.println("Automobilio markė: " + automobilis.getMarke());
        System.out.println("Automobilio modelis: " + automobilis.getModelis());
        System.out.println("Automobilio metai: " + automobilis.getMetai());
    }
}