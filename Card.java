class Card{
    int NIP;
    boolean enable;
    String numberCard;
    int validityYear;
    int validityMonth;
    int month;
    int year;
    public Card(int NIP,int validityYear,int validityMonth,String numberCard,int month,int year){
        enable=false;
        this.NIP=NIP;
        this.numberCard=numberCard;
        this.validityYear=validityYear;
        this.validityMonth=validityMonth;
        this.month=month;
        this.year=year;
    }
    
    public int getNIP() {
        return NIP;
    }
    public String getNumberCard() {
        return numberCard;
    }
    public int getValidityDay() {
        return validityYear;
    }
    public int getValidityMonth() {
        return validityMonth;
    }
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}