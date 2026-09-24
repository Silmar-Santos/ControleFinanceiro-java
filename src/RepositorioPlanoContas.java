import java.util.ArrayList;
import java.util.List;

public class RepositorioPlanoContas {

    //Cria a lista
    private List<PlanoContas> tabelaPlanoContas = new ArrayList<>();

    //Adiciona cadastro
    public void salvar(PlanoContas planoContas){
        tabelaPlanoContas.add(planoContas);

    }

    //Consulta cadastro
    public List<PlanoContas> listarTodas(){
        return tabelaPlanoContas;
    }
}