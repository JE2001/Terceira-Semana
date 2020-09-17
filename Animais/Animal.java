package HerancaExercicios.Animais;

public class Animal {
    String nome;
    int qtde_patas;

    public Animal(){// construtor padrão
        
    }

    public Animal(String nome){// construtor 2
        this.nome = nome;
        
    }

    public Animal(int qtde_patas, String nome){// construtor 3
        this.qtde_patas = qtde_patas;
        this.nome = nome;
        
    }
    
    
}
