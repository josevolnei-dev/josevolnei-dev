import java.util.Scanner;

public class Questao24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite a  primeira idade");

        int idade1 = sc.nextInt();
        System.out.println(" Digite a segunda idade");
        int idade2 = sc.nextInt();
        if(idade1 < idade2){
            System.out.println("segunda idade e maior ");

        }else{
         System.out.println(" pimeira idade e a maior");   
        }


        sc.close();
    }
}