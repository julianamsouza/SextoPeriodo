package fachada;

import javax.security.auth.login.LoginException;

import controller.ControladorEstabelecimento;
import erro.GeralException;
import basicas.Estabelecimento;


public class Fachada implements IFachada{

	private ControladorEstabelecimento controleEstabelecimento;
	//private 

	private static IFachada fachada;

	private Fachada() {
		this.controleEstabelecimento = new ControladorEstabelecimento();

	}

	public static IFachada getInstancia() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	}

	//Estabelecimento
	
	@Override
	public void salvarEstabelecimento(Estabelecimento estabelecimento) throws GeralException {
		controleEstabelecimento.cadastrarEstabelecimento(estabelecimento);
		
	}

	@Override
	public void alterarEstabelecimento(Estabelecimento estabelecimento) throws GeralException {
		controleEstabelecimento.alterarEstabelecimento(estabelecimento);
		
	}

	@Override
	public Estabelecimento pesquisarEstabelecimentoPorLogin(String eMail) {
		return this.controleEstabelecimento.pesquisarEstabelecimentoPorLogin(eMail);
	}
	
	@Override
	public Estabelecimento efetuarLogin(String eMail, String senha)
			throws LoginException {
		return controleEstabelecimento.efeturarLogin(eMail, senha);
	}
	
	//Outras Fachadas...


}