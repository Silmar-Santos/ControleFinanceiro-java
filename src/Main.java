public class Main {
    public static void main(String[] args) {

        // 1. Pessoas (Fornecedor / Cliente)
        Pessoa p1 = new Pessoa(1, "Wle");
        Pessoa p2 = new Pessoa(2, "Condominio Sta Monica");

        // 2. Grupo
        Grupo g1 = new Grupo(1, "Fixas");

        // 3. Plano de Contas
        PlanoContas pc1 = new PlanoContas(10, "Salário", g1.id, 0);  // 0 = Receita
        PlanoContas pc2 = new PlanoContas(20, "Aluguel", g1.id, 1);  // 1 = Despesa

        // 4. Registros unindo Pessoa + Plano de Contas + Valor
        Registro reg1 = new Registro(1001, pc1.id, p1.id, 2800.00);
        Registro reg2 = new Registro(1002, pc2.id, p2.id, 1600.00);

        System.out.println("=== MOVIMENTAÇÕES ===");
        System.out.println("Lançamento " + reg1.id + " | Pessoa: " + p1.razaoSocial + " | Conta: " + pc1.descricao + " | R$ " + reg1.valorReceitaDespesa);
        System.out.println("Lançamento " + reg2.id + " | Pessoa: " + p2.razaoSocial + " | Conta: " + pc2.descricao + " | R$ " + reg2.valorReceitaDespesa);
    }
}