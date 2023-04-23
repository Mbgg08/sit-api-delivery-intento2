package upao.edu.pe.apidelivery.entities;

public class Food {
    private String name;
    private String descritpion;
    private int price;

    public Food(String name, String descritpion, int price){
        this.name = name;
        this.descritpion = descritpion;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
