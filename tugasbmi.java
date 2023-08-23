/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bisma
 */
import java.util.Scanner;

public class tugasbmi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    System.out.println("Berat Badan Anda");
    double berat = input.nextDouble();
    
    System.out.println("Tinggi Anda");
    double tinggi = input.nextDouble();
    
    double konversipound = berat * 2.20;
    double konversiinci = tinggi/2.54;
    double rumusbmi = konversipound/konversiinci*konversiinci * 703;
        System.out.println("BMI Anda Adalah=" + rumusbmi);
    }
}
