
public class Creditcard extends Card{
    int credit;
    int debt;
    
    public Creditcard(int NIP,int credit,int validityYear,int validityMonth,String numbercard,int month,int year){
        super(NIP,validityYear,validityMonth,numbercard,month,year);
        this.credit=credit;
        debt=0;
    }
    public void buySomething(int userNIP,int price,int userMonth,int userYear){ //with a credit card
        if(enable==true){
            if((validityMonth==userMonth)&&(validityYear==userYear)){
                if(NIP==userNIP){
                    if(credit>price){
                        setDebt(debt+price);
                        System.out.println("pago realizado tu deuda es de: "+debt);
                    }else{
                        System.out.println("pago declinado credito insuficiente");
                    }
                }
            }
        }else{
            System.out.println("compra rechazada tarjeta no activada");
        }
        
    }
    public void payDebt(){
        setDebt(0);
        setCredit(credit+200);
        System.out.println("credito restaurado y aumentado credito igual a: "+credit);
    }
    public void activeCard(int userMonth,int userYear){
        if((month>=userMonth)&&(year>=userYear)){
            System.out.println("tarjeta activada con correctamente");
         setEnable(true);
        }else{
            System.out.println("datos incorrectos tarjeta no activada");
        }
    }
    public void payments(int pagos){
        if(credit>0){
            setCredit(credit-500);
        }else{
            System.out.println("credito insuficiente pago rechazado"); 
        }
    }
    public void stealedCard(){
        enable=false;
    }
    public int getCredit() {
        return credit;
    }
    public int getDebt() {
        return debt;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public void setDebt(int debt) {
        this.debt = debt;
    }
}