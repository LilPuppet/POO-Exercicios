public class Teste {
    public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa(1111111111, 111111, "Luana");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Cpf: " + pessoa.getCpf());
		System.out.println("Rg: " + pessoa.getRg());
		System.out.println();
		
		Politico politico = new Politico(22222222, 222222, "Alvaro", "Partido 2", 2);
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Cpf: " + pessoa.getCpf());
		System.out.println("Rg: " + pessoa.getRg());
		System.out.println("Partido: " + politico.getPartido());
		System.out.println();
		
		Prefeito prefeito = new Prefeito(333333333, 333333, "Liandre", "Partido 3", 3, "Cidade 3");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Cpf: " + pessoa.getCpf());
		System.out.println("Rg: " + pessoa.getRg());
		System.out.println("Partido: " + politico.getPartido());
		System.out.println("Cidade: " + prefeito.getCidadeRepresentada());
		System.out.println();
		
		Governador governador = new Governador(444444444, 444444, "Alastor", "Partido 4", 4, "Estado 4");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Cpf: " + pessoa.getCpf());
		System.out.println("Rg: " + pessoa.getRg());
		System.out.println("Partido: " + politico.getPartido());
		System.out.println("Estado: " + governador.getEstadoRepresentado());
		System.out.println();
	}
}
