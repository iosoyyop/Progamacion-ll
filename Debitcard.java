class Debitcard extends Card{
    int balance;
    int money; //dinero fisico
    public Debitcard(int NIP,int balance, int money,int validityYear,int validityMonth,String numbercard,int month,int year){
        super(NIP,validityYear,validityMonth,numbercard,month,year);
        this.balance=balance;
        this.money=money;
    }
    public void buySomething(int userNIP,int price,int userMonth,int userYear){
        if(enable==true){
            if((validityMonth>=userMonth)&&(validityYear>=userYear)){
                if(NIP==userNIP){
                 if(balance>price){
                     balance=balance-price;
                      System.out.println("pago realizado saldo restante: "+balance);
                 }else{
                      System.out.println("pago fallido saldo insuficiente");
                  }
               }else{
                   System.out.println("NIP incorrrecto");
               }
            }else{
                System.out.println("fecha de vencimiento caduca");
                enable=false;
            }
        }else{
            System.out.println("compra rechazada tarjeta no activada");
        }
    }
    public void deposit(int amount){
        balance=balance+amount;
        money=money-amount;
        System.out.println("tu balance nuevo es: "+balance);
        System.out.println(" nota mental te sobran: "+money);
    }
    public void activeCard(int userMonth,int userYear){
        if((month==userMonth)&&(year==userYear)){
            System.out.println("tarjeta activada con correctamente");
         setEnable(true);
        }else{
            System.out.println("datos incorrectos tarjeta no activada");
        }
    }
    public void stealedCard(){
        enable=false;
    }
}