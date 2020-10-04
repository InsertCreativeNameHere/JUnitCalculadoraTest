/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.junit;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class CalculadoraJUnit {

    private float num1;
    private float num2;
    
    public  float suma() {
        return this.num1 + this.num2;
    }

    public  float resta() {
        return this.num1 - this.num2;
    }

    public  float producto() {
        return this.num1 * this.num2;
    }

    public  float cociente() {
        return this.num1 / this.num2;
    }

    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese la operacion que desaea hacer: (1: Suma, 2: Resta, 3: Producto, 4: Cociente)");
            int op = scan.nextInt();
            System.out.println("Ingrese los dos numero que desea operar");
            this.num1 = scan.nextFloat();
            this.num2 = scan.nextFloat();

            switch (op) {
                case 1:
                    System.out.println("El resultado es: " + suma());
                    break;
                case 2:
                    System.out.println("El resultado es: " + resta());
                    break;
                case 3:
                    System.out.println("El resultado es: " + producto());
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se pude dividir por 0");
                    } else {
                        System.out.println("El resultado es: " + cociente());
                    }
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
                    break;
            }
        }
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    
    
}
