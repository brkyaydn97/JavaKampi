public class Main {

    public static void main(String[] args) {
            User ahmet = new User();
ahmet.setName("Ahmet");
ahmet.setBirthday(1997);
ahmet.setSurName("Anıl");
ahmet.setTcNo(1842184124);
ahmet.setId(1);
    UserCheckManager checkUser= new UserCheckManager();
   checkUser.checkIfRealPerson(ahmet);
          Game game = new Game();
game.setId(1);
game.setName("League of legends");
game.setPrice(500);
            SellGame satış= new SellGame();
Kampanya kampanya= new Kampanya();
kampanya.addCampaign(game,10);

satış.sell(ahmet,game);







    }
}
