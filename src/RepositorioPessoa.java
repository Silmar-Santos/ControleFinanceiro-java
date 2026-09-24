import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoa {

    //Esta lista é a nossa tabela PESSOA no BD
    private List<Pessoa> tabelaPessoas = new ArrayList<>();

    //Metodo correspondete ao Insert Into tb_pessoa
    public void salvar(Pessoa pessoa){
        tabelaPessoas.add(pessoa);
    }

    //metodo corrsponede ao select * from tb_pessoa

    public List<Pessoa> ListarTodas(){
        return tabelaPessoas;

    }
}


