package principal;

import principal.DAO.PessoaDAO;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Mostrar aqui...");
		System.out.println(mostrarPesso());
		
	
	}
	
	
	
	private static PessoaDAO mostrarPesso() {
		PessoaDAO pes = new PessoaDAO();
		pes.setId((long) 50);
		pes.setNome("Wanderson Felipe");
		return  pes;
	}

}
