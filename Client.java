public class Client extends Person{
    private int money;
    private Point destiny;
    public Client(int age,String name,String gender,Point point,Point destiny,int stars,int money){
        super(age,name,gender,point,stars);
        this.money=money;
        this.destiny=destiny;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public Point getDetiny() {
        return destiny;
    }
    public void setDetiny(Point destiny) {
        this.destiny = destiny;
    }
}