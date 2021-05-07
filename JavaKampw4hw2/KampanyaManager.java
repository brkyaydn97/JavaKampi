public abstract class KampanyaManager implements IKampanyaService{

    @Override
    public void addCampaign(Game game,double discountRate) {
        System.out.println("Kampanya eklendi : "+game.getName());
    }

    @Override
    public void updateCampaign(Game game,double discountRate) {
        System.out.println("Kampanya güncellendi : "+game.getName());
    }

    @Override
    public void deleteCampaign(Game game) {
        System.out.println("Kampanya Silindi : "+game.getName());
    }
}
