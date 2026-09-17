public class PlanoContas {

    //Determinando tipo de dados
    int id;
    String descricao;
    int id_grupo;
    int tipo_plano_contas;

    //Construindo as informações
    public PlanoContas(int id, String descricao, int id_grupo, int tipo_plano_contas) {
        this.id = id;
        this.descricao = descricao;
        this.id_grupo = id_grupo;
        this.tipo_plano_contas = tipo_plano_contas;
    }
}
