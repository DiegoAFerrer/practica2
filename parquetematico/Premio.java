package parquetematico;

public class Premio {
    private String name;
    private int price;

    public Premio(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getPrice() + " tickets)";
    }
}