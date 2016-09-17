package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UCO1CadastrarEmpresa {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
/**
 * verificar comportamento do sistema bla bla bla bla
 * de uma empresa com sucesso
 */
	@Test
	public void CT01UC01FBCadastrarEmpresa_com_sucesso(){
		assertEquals(1, empresaDAO.adiciona(empresa));
	}

}
