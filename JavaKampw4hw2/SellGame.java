public class SellGame {
    private String gameName;
    private String buyerName;
    private int soldPrice;

    public void sell(User user,Game game){



        System.out.println("Tebrikler, Oyun Başarıyla Satıldı !!!!");
        System.out.println(user.getName()+" Kullanıcısına "+game.getName()+" oyunu "+game.getPrice()+" TL fiyatına satılmıştır");

    }

 }
