import java.util.Scanner;

public class AppEscola { //Pascalcasing
    //main = principal
    //public = publico 
    //void = retorno
    //static = da classe
    //String args[] = parâmetro inicial
    public static void main(String[] args) {
        //método principal
        //Classe objeto = new Construtor(parametros)
        
        //entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();

        System.out.println("Tem faculdade: 0-não  e 1-sim");
        int temFaculdade = teclado.nextInt();
        boolean faculdade = (temFaculdade == 1);
        


        Aluno aluno = new Aluno(nome, idade,faculdade);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());

        /*Desafio
         * 
         * Implementar uma interface com usuário com o Scanner
         */
        

    }

}
