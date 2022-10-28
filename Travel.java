class Travel{
    public static void main(String arguments[]){
    Point personPoint=new Point(5, 5);
    Point uberPoint=new Point(20, 14);
    Point destiny=new Point(2,14);
    Client client=new Client(16, "Juan","male",personPoint,destiny,4, 500);
    Uber uber=new Uber(30,"Anna", "female", uberPoint,4,2);
    System.out.println("nombre:"+uber.getName()+" Vehiculo utilizado es:"+uber.whatIs(1)+"  tu ubicacion es:"+ uber.getX()+" "+uber.getY());
    System.out.println("nombre:"+client.getName()+" su destino es parque azul y se ubica:"+destiny.getX()+" "+destiny.getY()+" tu ubicacion es:"+client.getPoint().getX()+" "+client.getPoint().getY());
    System.out.println("el costo del viaje es "+uber.calculateTravel(personPoint,destiny,uber.getChoise()));

    
    
    }

}
