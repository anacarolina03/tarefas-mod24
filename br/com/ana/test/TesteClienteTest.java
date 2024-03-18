package br.com.ana.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.ana.TesteCliente;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Ana");
        cli.adicionarNome1("Ana");

        Assert.assertEquals("Ana", cli.getNome());
    }
}