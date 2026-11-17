/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class public class NewClass {
    //HOLA MUNDO
    //psvm + Tab
    public static void main(String[] args) {
        //sout + Tab
        // control + shift + c para comentar y descomentar
        System.out.println("HOLA MUNDO SOY SILVIA");
        
        // ---------------------------------------------------------
        // 1. Cálculo de promedio
        // ---------------------------------------------------------
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la primera calificación:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda calificación:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tercera calificación:"));
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio aritmético es: " + promedio);}
    
}
