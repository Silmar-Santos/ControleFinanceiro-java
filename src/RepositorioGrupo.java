import java.util.ArrayList;
import java.util.List;

public class RepositorioGrupo{

    private List<Grupo> tabelaGrupo = new ArrayList<>();

    public void salvar(Grupo grupo){
        tabelaGrupo.add(grupo);
    }

    public List<Grupo> listarTodas(){
        return tabelaGrupo;
    }
}