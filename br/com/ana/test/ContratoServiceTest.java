package br.com.ana.test;

import br.com.ana.dao.ContratoDao;
import br.com.ana.dao.IContratoDao;
import br.com.ana.dao.mocks.ContratoDaoMock;
import br.com.ana.service.ContratoService;
import br.com.ana.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
}