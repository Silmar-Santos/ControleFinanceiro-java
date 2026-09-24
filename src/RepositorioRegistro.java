import java.util.ArrayList;
import java.util.List;

public class RepositorioRegistro{

    private List<Registro> tabelaRegistro = new ArrayList<>();

    public void salvar(Registro registro){
        tabelaRegistro.add(registro);
    }

    public List<Registro> listarTodas(){
        return tabelaRegistro;
    }
}