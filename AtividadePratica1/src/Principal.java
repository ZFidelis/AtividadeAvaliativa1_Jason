public class Principal {
    public static void main(String[] args) {
        String nomeFuncionario;
        float horasTrabalhadas, valorHora;

        System.out.print("Digite o nome do Funcionário: ");
        nomeFuncionario = Console.lerString();
        System.out.print("Digite a quantidade de horas trabalhadas pelo Funcionário: ");
        horasTrabalhadas = Console.lerFloat();
        System.out.print("Digite o valor da hora trabalhado do Funcionário: ");
        valorHora = Console.lerFloat();

        FolhaPagamento funcionario = new FolhaPagamento(nomeFuncionario, horasTrabalhadas, valorHora);

        int op;

        boolean loop = true;
        while(loop){
            System.out.println("1)Alterar Dados Funcionário (Todos os Dados)\n2)Mostrar Dados Funcionario (Encerra Programa Após Mostragem)\n3)Sair");
            System.out.print("Escolha: ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    String temp1;
                    float temp2;
                    System.out.print("\nNome Funcionário: ");
                    temp1 = Console.lerString();
                    funcionario.setNomeFuncionario(temp1);
                    System.out.print("Horas Trabalhadas: ");
                    temp2 = Console.lerFloat();
                    funcionario.setHorasTrabalhadas(temp2);
                    System.out.print("Valor Hora: ");
                    temp2 = Console.lerFloat();
                    funcionario.setValorHora(temp2);
                    break;
                case 2:
                    funcionario.mostrarDados();
                    loop = false;
                    System.out.println("Programa Encerrado"); // Solicitado no pdf arquivado
                    break;
                case 3:
                    System.out.println("\nPrograma Encerrado");
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
