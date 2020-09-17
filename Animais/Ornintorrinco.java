package Animais;

public class Ornintorrinco extends Oviparos{

    public Ornintorrinco(String nome, int qtde_patas, boolean AlimentarLeite, boolean botarOvos, boolean fecundacaoExterna){
        super(nome, qtde_patas, AlimentarLeite, botarOvos, fecundacaoExterna);
        System.out.println("\nConstruindo Animal...");
        System.out.printf("\nNome: " + nome + "\nPatas: " + qtde_patas + "\nLeite?: " + AlimentarLeite + "\nEle bota ovos?: " + botarOvos + "\nSua Fecundação é externa?: " + fecundacaoExterna);
    }


}
