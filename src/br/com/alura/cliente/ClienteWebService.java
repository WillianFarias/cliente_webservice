package br.com.alura.cliente;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws Exception {

		String retorno = Request
			.Post("http://localhost:8080/gerenciador/empresas") 
			.execute() //executa o post
			.returnContent()	//aguarda o retorno
			.asString();	//converte o retorno para string
		
		System.out.println(retorno);
	}

}
