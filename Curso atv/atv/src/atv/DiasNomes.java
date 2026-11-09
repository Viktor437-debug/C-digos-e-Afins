package atv;

public class DiasNomes {

	public static void main(String[] args) {
		int codigodesaida = 9;
		
		for (int codigocarteira = 1; codigocarteira <= 10; codigocarteira++) {
			
			if (codigocarteira == codigodesaida) {
				System.out.println("Código de saída encontrado, interrompendo verificação.");
				break;
			}
			
			if (codigocarteira == codigodesaida) {
				break;
			}
			
			if (codigocarteira == 3 || codigocarteira == 7 || codigocarteira == 10) {
				System.out.println("O código da carteira " + codigocarteira + " é aceito pelo hospital santa clara");
				continue;
			} else {
				System.out.println("O Código da carteira " + codigocarteira + " não é aceito pelo hospital santa clara");
			}
			
		}
		
		
	}

}





