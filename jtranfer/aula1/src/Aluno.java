//encapsulamento
//public
//private
//protected
//package

//inicio da classe
public class Aluno {

    //variáveis = atributos
    //características
    private String nome; //atributo do tipo texto
    private int idade; //atributo do tipo numero
    private boolean temFaculdade;//atributo do tipo Booleano (0 e 1)
    
    //construtor
    public Aluno(){

    }//fim construtor

    public Aluno(String nome, int idade, boolean temFaculdade){
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;
    }

    //método get
    public String getNome(){// método para pegar nome
        return nome;
    }

    public int getIdade(){// método para pegar idade
        return idade;
    }

    public boolean getTemFaculdade(){// método para pegar temFaculdade
        return temFaculdade;
    }


    //classes Wrappers
    /*
     * Considerando a explicação do professor:
     * tipo primitivo x classes wrappers
     * 
     * Você tem que descobrir quantos alunos tem a faculdade
     * sim/não - 0 ou 1
     * como declarar um atributo booleano?
     */

}//fim da classe
