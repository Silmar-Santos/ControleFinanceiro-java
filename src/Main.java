import java.util.Scanner;

public static void main(String[] args) {

    RepositorioPlanoContas repositorio = new RepositorioPlanoContas();

    PlanoContas salario = new PlanoContas("Salário",1,1);

    repositorio.salvar(salario);

    System.out.println(salario.id);

    PlanoContas internet = new PlanoContas("Internet",1,2);

    repositorio.salvar(internet);

    System.out.println(internet.id);

    System.out.println(repositorio.listarTodas());

}
