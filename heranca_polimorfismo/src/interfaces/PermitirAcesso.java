package interfaces;

/*Essa interface será nosso contrato de autenticação*/
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha); /* aumenta a consistência do código */

	public boolean autenticar();

}
