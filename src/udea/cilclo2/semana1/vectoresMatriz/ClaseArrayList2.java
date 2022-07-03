package udea.cilclo2.semana1.vectoresMatriz;

import java.util.ArrayList;
import java.util.Collections;

public class ClaseArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> datos = new ArrayList<Integer>();

        datos.add(12);
        datos.add(2);
        datos.add(413);
        datos.add(43);
        datos.add(43);
        datos.add(5);
        datos.add(67);
        datos.add(56);
        datos.add(1);
        datos.add(43);
        datos.add(99);
        datos.add(23);

        // Imprimir normal
        for (int estudiante : datos) {

            System.out.println(" Valor ::  " + estudiante);
        }

        // ordena
        Collections.sort(datos);

        for (int i : datos) {

            System.out.println(" Valor Ordenado ::  " + i);
        }

        // Ordena inverso
        Collections.sort(datos, Collections.reverseOrder());

        for (int i : datos) {

            System.out.println(" Valor Descendente ::  " + i);
        }

        // Maximos y minimos
        System.out.println("Maximo " + Collections.max(datos).toString());
        System.out.println("Minimo " + Collections.min(datos).toString());

        // Buscar un elemento
        Integer datoBuscar = 43;

        if (datos.contains(datoBuscar)) {

            System.out.println("Si contiene el valor :: " + datoBuscar);
        } else {
            System.out.println("El valor " + datoBuscar + " No esta dentro del arreglo. ");
        }

        // Numeros repetidos - Frecuencia
        System.out.println(" El numeor " + datoBuscar + "  Se repite " + Collections.frequency(datos, datoBuscar) + " Veces");

// copiar un ArrayList a Otro
        ArrayList<Integer> datosCopia = (ArrayList<Integer>) datos.clone();

        datosCopia.add(1000);

        for (int i : datosCopia) {

            System.out.println(" Valores desde datosCopia ::  " + i);
        }

        // Reemeplazar elementos (arreglo, valor a Buscar, Por que reemplazar)
        Collections.replaceAll(datos, 1, 2000);
        for (int i : datos) {

            System.out.println(" Valor reemplazado ::  " + i);
        }
        
        //Elimiar indice
        
        System.out.println(" Ultimo valor  " + datos.remove(1)); 

    }

}
