package estangaej2;
public class Auto {
    private String marca="", modelo="";
    private int kilometraje;
    //MÉTODO CONSTRUCTOR QUE SOLICITE COMO PARÁMETRO LOS 3 ATRIBUTOS DE LA CLASE Auto
    public Auto (String marc, String mod, int km){
        this.modelo=mod;
    }
    //METODOS SET Y GET
       public void setmarca(int codmarc, String marc){
           if (6>=codmarc && codmarc>=1) this.marca=marc;
       }    
       public String getmarca(){
           return marca;
       }
       public void setkilometraje(int km){
           if (km>=0) this.kilometraje=km;
       }
       public int getkilometraje(){
           return kilometraje;
       }
    //METODO MOSTRAR
       public void mostrar(){
           System.out.println("\nLos datos de su auto son:");
           System.out.println("Marca: "+this.marca);
           System.out.println("Modelo: "+this.modelo);
           System.out.println("Kilometraje: "+this.kilometraje);
       }
    //MÉTODO estadoAuto()
       public void estadoAuto(){
           if(kilometraje == 0){
               System.out.println("\nSu auto esta nuevo");
           } else if(kilometraje < 10000){
               System.out.println("\nSu auto esta poco usado");
           } else if(kilometraje < 100000){
               System.out.println("\nSu auto esta usado");
           } else {
               System.out.println("\nSu auto esta bastante usado");
           }
       }
}
