package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComValorIgualA(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("PSTeste");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("branco");
        cores.add("preto");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Controle");
        componente.setComponenteQuantidade(2);
        componentes.add(componente);

        ComponentePojo segundoComponente = new ComponentePojo();
        componente.setComponenteNome("Fonte de energia");
        componente.setComponenteQuantidade(1);
        componentes.add(segundoComponente);

        produto.setComponentes(componentes);

        return produto;
    }
}
