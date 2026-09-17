public class Registro {

    //Definindo tipos de dados
    int id;
    int id_plano_contas;
    int id_pessoa;
    double valorReceitaDespesa;

    //Construindo classe registro
    public Registro(int id, int id_plano_contas, int id_pessoa, double valorReceitaDespesa) {
        this.id = id;
        this.id_plano_contas = id_plano_contas;
        this.id_pessoa = id_pessoa;
        this.valorReceitaDespesa = valorReceitaDespesa;
    }
}
