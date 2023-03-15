package com.example.pilasycolas;

import java.util.Scanner;
import java.util.Stack;

public class prueba2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ecuación a comprobar:");

        String ecuacion = sc.nextLine();


        if (estaBalanceada(ecuacion)) {
            System.out.println("La ecuación está balanceada.");


        } else {
            System.out.println("La ecuación no está balanceada.");
        }
    }

    public static boolean estaBalanceada(String ecuacion) {


        Stack<Character> pila = new Stack<>();
        Stack<Character> pilaInversa = new Stack<>();

        for (int i = 0; i < ecuacion.length(); i++) {


            char caracter = ecuacion.charAt(i);


            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
                pilaInversa.push(caracter);

            } else if (caracter == ')' || caracter == ']' || caracter == '}') {

                if (pila.empty()) {
                    System.out.println("hace falta el símbolo " + caracter + " de apertura");
                    return false;
                }


                char simboloApertura = pila.pop();
                char simboloAperturaInverso = pilaInversa.pop();

                if ((caracter == ')' && simboloApertura != '(') ||
                        (caracter == ']' && simboloApertura != '[') ||
                        (caracter == '}' && simboloApertura != '{')) {
                    System.out.println("falta el símbolo " + simboloApertura + " de cierre ");
                    return false;
                }


                if ((caracter == '(' && simboloAperturaInverso != ')') ||
                        (caracter == '[' && simboloAperturaInverso != ']') ||
                        (caracter == '{' && simboloAperturaInverso != '}')) {
                    System.out.println("falta el símbolo " + caracter + " de apertura1");
                    return false;
                }
            }
        }


        if (!pila.empty()) {
            System.out.println("falta el símbolo " + pila.pop() + " de cierre.");
            return false;
        }

        if (!pilaInversa.empty()) {
            System.out.println("    falta el símbolo " + pilaInversa.pop() + " de apertura.");
            return false;
        }
        return true;
    }
}
