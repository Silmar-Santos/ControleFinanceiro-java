import java.util.ArrayList;
import java.util.List;

public class RepositorioPlanoContas {

    private int proximoId = 1;
    private List<PlanoContas> tabelaPlanoContas = new ArrayList<>();

    public void salvar(PlanoContas planoContas){
        planoContas.id = proximoId;
        proximoId++;
        tabelaPlanoContas.add(planoContas);
    }

    public List<PlanoContas> listarTodas(){
        return tabelaPlanoContas;
    }
}