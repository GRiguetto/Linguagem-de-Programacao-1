//Faça um algoritmo para calcular, considerando que o usuário informe a idade (inteira), as seguintes informações: 

// - Número de semestres; 
// - Número de meses; 
// - Número de semanas; 
// - Número de dias; 
// - Número de horas; 
// - Número de minutos; 
// - Número de segundos; 

// No final deseja-se visualizar todos os cálculos realizados e exibir se o usuário é infantil, adolescente, jovem, adulto ou idoso. A tabela abaixo demonstra as idades que definem essas categorias

// Idade 		Categoria 
// Até 12 		Infantil 
// 13 a 16 	Adolescente 
// 17 a 20 	Jovem 
// 21 a 50 	Adulto 
// Acima de 50 	Idoso

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        int semestre = idade * 2;
        int meses = idade * 12;
        int semanas = idade * 52;
        int dias = idade * 365;
        int horas = dias * 24;
        int minutos = horas * 60;
        int segundos = minutos * 60;

        String categoria;

        if (idade <= 12) {
            categoria = "Infantil";
        } else if (idade <= 16) {
            categoria = "Adolescente";
        } else if (idade <= 20) {
            categoria = "Jovem";
        } else if (idade <= 50) {
            categoria = "Adulto";
        } else {
            categoria = "Idoso";
        }

        System.out.println("Número de semestres: " + semestre);
        System.out.println("Número de meses: " + meses);
        System.out.println("Número de semanas: " + semanas);
        System.out.println("Número de dias: " + dias);
        System.out.println("Número de horas: " + horas);
        System.out.println("Número de minutos: " + minutos);
        System.out.println("Número de segundos: " + segundos);
        System.out.println("Categoria: " + categoria);

        scanner.close();
    }
}