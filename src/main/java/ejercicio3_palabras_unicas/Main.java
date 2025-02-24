package ejercicio3_palabras_unicas;

import java.util.Scanner;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            TreeSet<String> palabras = new TreeSet<>();
            String menu = "1";
            do{
                
                System.out.println("Ingrese la cantidad de palabras que desea registrar");
                int cantidad = sc.nextInt();
                sc.nextLine();

                for(int i = 1; i <= cantidad; i++){
                    System.out.print("ingrese la palabra= ");
                    String name = sc.nextLine();
                    palabras.add(name);
                    System.out.println();
                }

                System.out.print("Quieres buscar una palabra? \n1. si\n2. no \nElije =  ");
                int buscar = sc.nextInt();
                sc.nextLine();

                if (buscar == 1) {
                    System.out.print("ingrese la palabra que buscas = ");
                    String names = sc.nextLine();
                    boolean existe = palabras.contains(names);
                    if (existe == true) {
                        System.out.println("la palabra que buscas si esta");
                    }else{
                        System.out.println("la palabra que buscas no esta");
                    }
                }

                System.out.println("Elementos del TreeSet:");
                for (String palabra : palabras) {
                    System.out.println(palabra);
                }
            
            }while(!menu.equals("2"));
        }catch (Exception e) {
        System.out.println("error por favor vuelve a ejecutrar el programa");
    }
    }
}