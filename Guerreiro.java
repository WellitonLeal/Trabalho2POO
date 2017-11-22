
import java.util.*;

/**
 * 
 */
public class Guerreiro extends Aldeao implements AldeaoSet {

    /**
     * Default constructor
     */
    public Guerreiro(int id) {
    	super(id);    
    }

    /**
     * 
     */
    private static double movimento = 3;

    /**
     * 
     */
    private final double ataqueGrr = 3;



    /**
     * Metodo para movimentar unidades ou seja, ele seta o novo X e Y (posicao) da unidade.
     * @param SetX Posicao X
     * @param SetY Posicao Y
     */
    public void Movimenta(String direcao) {
        // TODO implement here
    }

    /**
     * Esse metodo serve para desferir ataque atraves da unidade selecionada, cada personagem tem sua propria configuração de ataque.
     * @param ataque Se for tue então o ataque é desferido, caso contrario não.
     */
    public void Atacar(boolean ataque) {
        // TODO implement here
    }

    /**
     * Este metodo diz qual é o tipo de movimento do Personagem. Exemplo: Para Frente ( F ) e Para o Norte ( N ).
     * @param direcao Recebe uma String com as direcoes do movimento no formato:
     * "N S L O F"
     * Letras maiusculas separadas por espaco.
     */
    public void SetTipoMovimento(String direcao) {
        // TODO implement here
    }

}