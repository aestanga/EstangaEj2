//Crear la clase Auto con los atributos marca, modelo y kilometraje, elegir el tipo de dato adecuado para ellos.
//Además se debe crear el método estadoAuto() que depende el kilometraje muestre un mensaje:
//0 km Esta nuevo
//<10000km Poco usado
//<100000km Usado
//>100000km Bastante usado
//Crear un objeto de esta clase y comprobar el funcionamiento

package estangaej2;
import java.util.Scanner;
public class EstangaEj2 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int km=0, codmarc;
        String marc="no", mod="", conf1;
        
        Auto datos = new Auto(marc,mod,km);
        
        do {
        //OBJETO DATOS DE LA CLASE Auto
        System.out.print("¡BIENVENIDOS!");
        System.out.println("\n==========================");
        System.out.println("     Código    | MARCA");
        System.out.println("      1        | Ford");
        System.out.println("      2        | Chevrolet");
        System.out.println("      3        | Renault");
        System.out.println("      4        | Fiat");
        System.out.println("      5        | Citroen");
        System.out.println("      6        | Peugeot");
        System.out.println("==========================");
        System.out.print("\nIngrese el código de marca de su auto: ");
        codmarc = intro.nextInt();
        switch (codmarc){
                 case 1:
                    marc = "Ford";
                    break;
                 case 2:
                    marc = "Chevreolet";
                    break;
                 case 3:
                    marc = "Renault";
                    break;
                 case 4:
                    marc = "Fiat";
                    break;
                 case 5:
                    marc = "Citroen";
                    break;
                 case 6:
                    marc = "Peugeot";
                    break;
             }

        datos.setmarca(codmarc,marc);
        if(!datos.getmarca().equals(marc)){
            System.out.println(codmarc+" CÓDIGO INVÁLIDO");
            System.exit(0);
        }
        
        System.out.print("Ingrese el modelo de su auto : ");
        //Como se hace para que el atributo tome valor int y string segùn el Scanner? Ya que el modelo puede ser de tipo int
        mod = intro.next();
        
        System.out.print("Ingrese el kilometraje de su auto: ");
        km = intro.nextInt();
        datos.setkilometraje(km);
        if(datos.getkilometraje() != km){
            System.out.println(km+" KILOMETRAJE INVÁLIDO");
            System.exit(0);
        }
        
        datos = new Auto (marc,mod,km);
        
        datos.mostrar();
        System.out.print("\n¿Los datos ingresados son correctos? (Responda con SI / NO) ");
        conf1 = intro.next();
        while(!conf1.equalsIgnoreCase("si") && !conf1.equalsIgnoreCase("no")){
                   System.out.print("\n¿Los datos ingresados son correctos? (Responda con SI / NO) ");
                   conf1 = intro.next();
                }
        datos.mostrar();
        datos.estadoAuto();
        }while(conf1.equalsIgnoreCase("NO"));

    }
    
}
