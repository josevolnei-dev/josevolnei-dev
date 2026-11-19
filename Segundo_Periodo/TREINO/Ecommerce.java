import java.util.Scanner;

public class Ecommerce{

    public static  Double calculardesconto(Double valorcompra) {
        double desconto = 0;

        if(valorcompra > 200){
            desconto = valorcompra * 0.10;
        
    
    
    } else if(valorcompra > 100){
        desconto =valorcompra * 0.05;
    }
        return desconto;
    }

    //funcao pra calcular frete
    public static Double calcularfrete(int quantidadeItens, boolean  vip){
        double frete = 0;
if( vip  == true){
frete = 0;

    }else{
// para clinte comum
if(quantidadeItens < 5){
        frete = 10;
}else{
        frete = 20;
    }
    }
    return frete;
}

    // funcao calcular valor final
    public static double calcularValorFinal(double valorCompra, double desconto,  double frete){
    double valorFinal;

    valorFinal = valorCompra - desconto + frete;
    return valorFinal;

        }

//chamo o metodo principal com scanner   registro entrada de dados  em seguida chamo as funcoes  depois  exibir o resultado
public static void main(String []args){
    Scanner teclado = new Scanner (System.in);


    System.out.println(" valor da compra");
    double valorCompra = teclado.nextDouble();
    System.out.println("quantidade de intens");
    int quantidadeItens = teclado.nextInt();
    System.out.println(" clinte vip (true/false )");
    boolean vip = teclado.nextBoolean();

    // chama as funcoes que declarei
double desconto  = calculardesconto (valorCompra);
double  frete = calcularfrete (quantidadeItens,vip);
double valorFinal = calcularValorFinal (valorCompra,desconto,frete);

//EXIBI NA TELA

System.out.println("Desconto  R$ "  +  desconto);
System.out.println("Frete  R$  "  + frete);
System.out.println("ValorFinal R$  "  + valorFinal);

}

}
