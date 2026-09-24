public class PlanoContas {

    int id;
    String descricao;
    int id_grupo;
    int tipo_planocontas;
    boolean ativo;

    public PlanoContas(String descricao, int id_grupo, int tipo_planocontas) {
        this.descricao = descricao;
        this.id_grupo = id_grupo;
        this.tipo_planocontas = tipo_planocontas;
        this.ativo = true;
    }
}
