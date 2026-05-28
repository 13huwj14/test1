public abstract class Product {
    private String id;
    private String name;
    private double price;
    private int buynum;
    private String type;
    public Product(){
    }
    public Product(String id,String name,double price,int buynum,String type){
        this.id = id;
        this.name = name;
        this.price = price;
        this.buynum = buynum;
        this.type = type;
    }


    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setBuynum(int buynum){
        this.buynum = buynum;
    }
    public int getBuynum(){
        return buynum;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public abstract double getTotal();
    public abstract double discount(Product p);

}