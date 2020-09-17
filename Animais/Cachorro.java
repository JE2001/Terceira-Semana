package Animais;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, int qtde_patas, boolean AlimentarLeite){
        super(nome, qtde_patas, AlimentarLeite);
        System.out.println("\n\nConstruindo Animal...");
        System.out.printf("\nNome: " + nome + "\nPatas: " + qtde_patas + "\nLeite?: " + AlimentarLeite);

    }
    
}
