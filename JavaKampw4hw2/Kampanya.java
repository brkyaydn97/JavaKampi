public class Kampanya extends KampanyaManager{
    private double discountPrice;
    private int normalPrice;

    public void addCampaign(Game game,double discountRate){
       normalPrice=game.getPrice();
       discountPrice=normalPrice-normalPrice*(discountRate/100);
      game.setPriceBeforeCampaign(game.getPrice());
       game.setPrice((int) discountPrice);
        System.out.println("***Kampanya Eklenmiştir***");
        System.out.println(game.getName()+" Oyununun: ");
        System.out.println("Kampanyadan önceki fiyatı :"+game.getPriceBeforeCampaign());
        System.out.println("Kampanya oranı : %"+discountRate);
        System.out.println("Kampanyadan sonraki fiyatı:"+game.getPrice());

    }
    public void deleteCampaign(Game game){
        System.out.println(game.getName()+"Oyunun Kampanyası silinmiştir");
        System.out.println("Ürünün fiyatı"+game.getPrice()+" TL den" + game.getPriceBeforeCampaign()+" Fiyatına çıkmıştır ");
        game.setPrice(game.getPriceBeforeCampaign());



    }
    public void updateCampaign(Game game,double discountRate){
        discountPrice=normalPrice-normalPrice*(discountRate/100);
        game.setPrice((int) discountPrice);
        System.out.println("Ürünün yeni kampanyalı fiyatı "+game.getPrice()+" TL olarak güncellenmiştir");
    }











}
