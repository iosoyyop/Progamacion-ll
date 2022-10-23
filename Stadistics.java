class Count{

    private int life;
    private int counter;

    public Count(){
        life=3;
        counter=0;
    }

    public int getCount() {
        return counter;
    }
    public int getLife() {
        return life;
    }
    public void incrementCount() {
        counter+=10;
    }
    public void lostLife() {
        life-=1;
    }
}