
public class Main {
    public static void main(String[] args) {
        Funcionarios[] funcionarios = {
                new Funcionarios("Ana", 3000.0, 170),
                new Funcionarios("Carlos", 2800.0, 160),
                new Funcionarios("Mariana", 3500.0, 180),
                new Funcionarios("Joao", 2500.0, 155)
        };

        System.out.println("\nRelatorio de funcionarios:");
        for (Funcionarios funcionario : funcionarios) {
            funcionario.exibirDados();
        }
    }
}