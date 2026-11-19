import java.util.Scanner;

public class Questao25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome1");
        String nome1 = sc.nextLine();


        System.out.println("digite a idade1");
        int idade1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("digite o nome2");
        String nome2 = sc.nextLine();
        
        System.out.println("digite a idade2");
        int idade2 = sc.nextInt();
sc.nextLine();
    if(idade1 < idade2){
        System.out.println("a pessoa mais nova e " + nome1 + " que tem " +  idade1 + " anos");
    }else{
        System.out.println("a pessoa mais nova e " + nome2 + " que tem " +  idade2 + " anos");
    }
    }
    }