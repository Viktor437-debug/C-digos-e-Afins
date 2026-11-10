package bangdicegame;

public class Jogo {
	String nome;
	int vida;
	
	
	
	Jogo(String nomeInit, int vidaInit) {
	nome = nomeInit;
	vida = vidaInit;
	
	}

    public static void main(String[] args) {
    Jogo personagem = new Jogo("Amolas", 10);
    int ven = 1;
    int vend = 3;
    int time = 0;
    
    
    
    if (ven == 1) {
    System.out.println(personagem.nome + " está envenenado.");
    }
 
    
   
    
    
    while (ven == 1) {
    	personagem.vida -= vend;
    	System.out.println("Amolas está com " + personagem.vida + " pontos de vida restantes");
    	time++;
    	
    	if (ven == 1 && personagem.vida <= 0) {
        	System.out.println(personagem.nome + " sucumbiu devido a envenamento");
        	break;
        }
    	
    	if (personagem.vida < 10) {
    		System.out.println(personagem.nome + " usou reversão de feitiço");
    		int rever = 4;
    		int reverc = 1;
    		--rever;
    		personagem.vida += reverc;
    		
    		
    	}
    	
    	if(time == 5) {
    		System.out.println("O envenanemento passou");
    		ven++;
    	}
    	
    	if (ven == 1 && personagem.vida <= 0) {
        	System.out.println(personagem.nome + " sucumbiu devido a envenamento");
        	break;
        }
        
    }
    
    
    }
    

}
