import java.util.Scanner;
public class EventoAcademico{
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        String[] nomes = new String[8]; // criando vetor para armazenar nomes

        System.out.println("Digite " +  nomes.length + " nomes");// instrucao para digita

        // primeiro for usado para armazenamentos de dados
        for(int i = 0; i < nomes.length; i++){
            nomes[i] = teclado.nextLine(); // cada nome digitado esta sendo armazenado em um dos espacos  do vetor
        }

        System.out.println("Digite um nome para buscar"); //instrucao para o usuario digitar um nome que deseja saber quantas vezes esta armazenado no vetor

            String nomebusca = teclado.nextLine();// nome que buscado e comparado  com os nomes do vetor
        
            int cont = 0;// o contador de quantas vezes o nome e digitado no vetor
        
            // este for e para percorrer o vetor e comparar o nome digitado para busca
            for(int j = 0; j < nomes.length; j++){

                // o if  esta comparando  os nomes armazenados no vetor com nome busca
                // .equalsIgnoreCase para comparar nomes ignorando maiusculas e minusculas
                if(nomes[j].equalsIgnoreCase(nomebusca)){

                cont++;// toda vez que o nome da busca   e igual   nome que ta no vetor este contador soma mais  um
            }
        }

        System.out.println("O nome "+ nomebusca+ " aparece " + cont + "vezes");
        //Exibe ao usuario a quantidade de vezes  o nome da busca aparece no vetor por meio do cotador con++


    }


}


