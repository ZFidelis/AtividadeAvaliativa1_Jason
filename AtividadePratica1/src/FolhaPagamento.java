public class FolhaPagamento {

    private String nomeFuncionario;
    private float horasTrabalhadas;
    private float valorHora;

    private float salarioBruto;
    private float ir;
    private float inss;
    private float fgts;
    private float salarioLiquido;

    
    // Construtores
    public FolhaPagamento() {
    }

    public FolhaPagamento(String nomeFuncionario, float horasTrabalhadas, float valorHora) {
        this.nomeFuncionario = nomeFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        
        calcularSalBruto();
        calcularIR();
        calcularINSS();
        calcularFGTS();
        calcularSalLiquido();
    }

    // Getters e Setters
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }


    // Métodos
    public void calcularSalBruto() {
        salarioBruto = valorHora * horasTrabalhadas;
    }

    public void calcularIR() {
        if (salarioBruto <= 1372.81) {
            ir = 0;
        }
        else if (salarioBruto <= 2743.25) {
            ir = (salarioBruto*0.15f);
        }
        else{
            ir = (salarioBruto*0.275f);
        }
    }

    public void calcularINSS() {
        if (salarioBruto <= 868.29) {
            inss = (salarioBruto*0.08f);
        }
        else if (salarioBruto <= 1447.14) {
            inss = (salarioBruto*0.09f);
        }
        else if (salarioBruto <= 2894.27) {
            inss = (salarioBruto*0.11f);
        }
        else{
            inss = 318.37f;
        }
    }

    public void calcularFGTS() {
        fgts = (salarioBruto * 0.08f);
    }
    
    public void calcularSalLiquido() {
        salarioLiquido = (salarioBruto - ir - inss);
    }

    public void mostrarDados(){
        System.out.println("\nFolha de Pagamento do Funcionário: " + nomeFuncionario);
        System.out.println("Salário Bruto: " + salarioBruto);
        if(ir == 0){
            System.out.println("IR: Isento");
        }
        else{
            System.out.println("IR: " + ir);
        }
        System.out.println("INSS: " + inss);
        System.out.println("FGTS: " + fgts);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
    

}
