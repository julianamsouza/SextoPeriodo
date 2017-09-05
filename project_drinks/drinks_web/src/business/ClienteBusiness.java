package business;

import java.util.List;

import fachada.DrinksBusiness;
import fachada.IDrinksBusiness;
import basicas.Cliente;

public class ClienteBusiness extends BasicBusiness<Cliente> {
	
	IDrinksBusiness fachada = DrinksBusiness.getInstancia();
	
	private static ClienteBusiness instancia;
	
	public static ClienteBusiness getInstancia() {
		if(instancia == null){
			instancia = new ClienteBusiness();
		}
		return instancia;
	}

	@Override
	public void insert(Cliente entity) {
		fachada.inserirCLiente(entity);
		
	}

	@Override
	public void remove(Cliente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cliente entity) {
		// TODO Auto-generated method stub
		
	}

}
