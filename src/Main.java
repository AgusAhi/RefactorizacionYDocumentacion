import java.util.*;
public class Main {
    public static void main(String[] args) {
        int dia, mes, anyo;
        Scanner teclado;
        System.out.println ("Introduce un día: ");
        dia = new Scanner(System.in).nextInt();
        System.out.println ("Introduce un mes: ");
        mes = new Scanner(System.in).nextInt();
        System.out.println ("Introduce un año: ");
        anyo = new Scanner(System.in).nextInt();
        Fecha f1 = new Fecha(dia,mes,anyo);
        if (f1.valida())
            System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" es válida");
        else
            System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" NO es válida");
    }
}