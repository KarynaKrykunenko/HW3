package com.krykunenko.lesson9;

public class Lesson {
    public static void main(Lesson[] args){
        String s = "Lemon School";
        printOut(s);

        int array [] = {1,2 };
        int array3 [] = new int [10];
        int matrix [] [] = new int[8][8];

        StringBuilder stringBuilder = new StringBuilder();
        String result = "Summa"+ "ravno" + "15";
        stringBuilder.append("Summa").append("=").append( 15);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Znachenia").append(232)
        System.out.println( stringBuilder.toString());
        System.out.println(getChar( result, 5 ));



    }
    static void printOut( String s){
        System.out.println(s);
    }
    static char getChar ( String s, int index){
        return s.charAt(index);

    }
}
