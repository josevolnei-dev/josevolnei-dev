import java.util.Scanner;

public class Fator {

public static  int calcularFatorial(int numero){
    int Fatorial = 1;

    // FOR MULTIPLICAR OS NUMEROS
    for(int i = 1; i <= numero; i++){
        Fatorial = Fatorial * i;

    }
return Fatorial;
}

// chamo o metodo pricipal para digita entrada de numeros

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo");
        int numero = teclado.nextInt();



        //chamo a funcao que criei no inicioe exibir o resultado
        int resultado = calcularFatorial(numero);

        System.out.println("fatorial de " + numero +  " = " + resultado);

        teclado.close();
    }
}