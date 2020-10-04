package br.univille.poo.logger;

class ConsoleLogger implements Logger{

	@Override
	public void mensagem(String mensagem) {
		 System.out.println(mensagem);
		
	}

}
