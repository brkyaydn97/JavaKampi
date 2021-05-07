public class Game {
    private String name;
    private int price;
    private int id;
    private int priceBeforeCampaign;

    public Game(String name, int price, int id, int priceBeforeCampaign) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.priceBeforeCampaign = priceBeforeCampaign;
    }
    public Game(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriceBeforeCampaign() {
        return priceBeforeCampaign;
    }

    public void setPriceBeforeCampaign(int priceBeforeCampaign) {
        this.priceBeforeCampaign = priceBeforeCampaign;
    }
}
