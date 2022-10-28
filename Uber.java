class Uber extends Person{
    private int choise;
    private String vehicle;
    public Uber(int age,String name,String gender,Point point,int stars,int choise){
        super(age,name,gender,point,stars);
        this.choise=choise;
    }
    public int getChoise() {
        return choise;
    }
    public void setChoise(int choise) {
        this.choise = choise;
    
    }
    public String whatIs(int choise){
        if(choise==1){
            vehicle= new String("car");
        }else if(choise==2){
            vehicle= new String("motocycle");
        }
        return vehicle;
    }
}
