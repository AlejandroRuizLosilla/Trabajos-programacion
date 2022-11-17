import java.util.*;
class Problema6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma=0;
        int contador=0;
        System.out.print("Introduzca numeros mayores que el 0 para saber la suma de los puestos: ");
        numero=teclado.nextInt();
        suma +=numero;
        contador++;
        while(numero>0){
            System.out.print(" Siga introduciendo numeros mayores que el 0: ");
        numero=teclado.nextInt();
        suma += numero;
        contador++;
        }
       if(numero<=0)
       System.out.print("La suma de los numeros es: " + suma+"\n");
       System.out.print("Ha introducido " + contador+ " numeros.");

    }
}