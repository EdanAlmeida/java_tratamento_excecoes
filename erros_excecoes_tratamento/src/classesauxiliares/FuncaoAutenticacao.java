package classesauxiliares;

import interfaces.PermitirAcesso;

/*Permitir acesso somente a quem está atendendo o contrato da interface PermitirAcesso*/
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
