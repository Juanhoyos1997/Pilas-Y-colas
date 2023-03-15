package com.example.pilasycolas;
import java.util.Scanner;
import java.util.Stack;

public class PilasyColas {
public static void main(String args []){

    String ecu= "[ ( x + y ) * ( x + z   ";
    String[] v= ecu.split(" ");
    Stack<Integer> parentesis = new Stack<Integer>();

    for (int i= 0; i< v.length; i++ ){
        System.out.println(v[i]);
        if (v[i].equals('('))
            parentesis.push(1);

        if (v[i].equals(')'))
            parentesis.pop();
    }
    if (parentesis.size() == 1)
        System.out.println("Esta balanceada");
    else
        System.out.println("No esta balanceada ");
    }

}

