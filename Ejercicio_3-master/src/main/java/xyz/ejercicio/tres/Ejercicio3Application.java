/*Una compañoa de ventas de carros usados, paga a su personal de ventas un salario de $1000 mensuales,
más una comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro.
cada mes el capturista de la empresa ingrea en la computadora los datos pertinentes.
hacer un programa que calcule e imprima el salario mensual de un vendedor dado.*/
package xyz.ejercicio.tres;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio3Application.class, args); 
		
		Scanner entrada = new Scanner(System.in);
		
		float salarioVendedor, comisionVendedor, cantidadCarrosVendidos, valorTotalVentas;
		
		System.out.print("Digite la cantidad de carros vendidos: ");
		cantidadCarrosVendidos = entrada.nextFloat();
		
		System.out.print("Digite el valor total de ventas: ");
		valorTotalVentas = entrada.nextFloat();
		
		comisionVendedor = (150*cantidadCarrosVendidos)+(valorTotalVentas*5/100);
		
		salarioVendedor = 1000 + comisionVendedor;
		
		System.out.println("\nEl valor a pagar al trabajador es: "+salarioVendedor);		
		
	}

}
