public class User extends UserManager {
    private int id;
    private long tcNo;
    private String name;
    private String surName;
    private int birthday;

    public User(int id, long tcNo, String name, String surName, int birthday) {
        this.id = id;
        this.tcNo = tcNo;
        this.name = name;
        this.surName = surName;
        this.birthday = birthday;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public void add() {
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
