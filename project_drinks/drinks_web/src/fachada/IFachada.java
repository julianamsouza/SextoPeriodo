package fachada;

import javax.security.auth.login.LoginException;

import erro.GeralException;
import basicas.Estabelecimento;

public interface IFachada {
	
	//Estabelecimento
	public void salvarEstabelecimento(Estabelecimento estabelecimento) throws GeralException;

	public void alterarEstabelecimento(Estabelecimento estabelecimento) throws GeralException;

	public Estabelecimento pesquisarEstabelecimentoPorLogin(String eMail);

	public Estabelecimento efetuarLogin(String eMail, String senha)
			throws LoginException;	

}