package com.example.pilasycolas;


import java.util.Scanner;
import java.util.Stack;

public class pruebas {

    static String[] ingresar = {"(", " ["};
    static String[] cerrar = {" )", " ] "};

    static boolean isOpen(String c) {
        for (int i = 0; i < ingresar.length; i++)
            if (ingresar[i] == c)
                return true;
        return false;
    }
    static String getInv(String c) {
        for (int i = 0; i < ingresar.length; i++)
            if (ingresar[i] == c)
                return cerrar[i];
        for (int i = 0; i < cerrar.length; i++)
            if (cerrar[i] == c)
                return ingresar[i];
        return " ";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.next();
        char[] expr = expression.toCharArray();
        Stack<Character> s = new Stack<>();
        boolean correct = true;
        for (int i = 0; i < expr.length; i++) {
            if (isOpen(String.valueOf(expr[i]))) {
                s.push(expr[i]);
                {

                if (s.isEmpty()){
                    correct = false;
                    break;
                } else if (!(s.peek() .equals(expr[i]))) {
                        correct = false;
                        break;
                    }else
                        s.pop();
                }
            }
            if ((!s.empty()))
                correct=false;

            if (correct)
                System.out.println(expression + " ES UNA EXPRESION CORRECTA " );
            else
                System.out.println(expression+ " ES UN SIMBOLO DIFERENTE A ( ) [ ] ");
        }
    }
}
