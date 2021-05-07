public abstract class UserManager implements IUserService {
    public void add(User user ){
       System.out.println("Oyuncu eklendi :"+user.getName());

    }
    public void delete(User user){
        System.out.println("Oyuncu Silindi"+user.getName());

    }
    public void update(User user){
        System.out.println("Kullanıcı güncellendi"+user.getName());
    }


}
