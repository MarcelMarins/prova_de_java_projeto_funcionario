package main;

public class Funcionario {

    private String nome;
    private double salariobruto;
    private int dependentes;
    private double ir;
    private double desconto;
    private double salariofamilia;
    private double salarioliquido;
    private double planosaude;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getsalariobruto() {
        return salariobruto;
    }

    public void setSalariobruto(double salariobruto) {
        this.salariobruto = salariobruto;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getIr() {
        return ir;
    }

    public void setIr(double ir) {
        this.ir = ir;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getSalariofamilia() {
        return salariofamilia;
    }

    public void setSalariofamilia(double salariofamilia) {
        this.salariofamilia = salariofamilia;
    }

    public double getSalarioliquido() {
        return salarioliquido;
    }

    public void setSalarioliquido(double salarioliquido) {
        this.salarioliquido = salarioliquido;
        salarioliquido = desconto - ir + salariofamilia;
    }

    public double calcularImpostoRenda() {
        double imposto = this.salariobruto;
        if (salariobruto <= 1099.99) {
            imposto = salariobruto;
            return imposto;
        }
        if (salariobruto >= 100.00 && salariobruto <= 1999.99) {
            imposto = salariobruto * 0.15;
            return imposto;
        }
        if (salariobruto > 1999.99) {
            imposto = salariobruto * 0.25;
        }
        return imposto;

    }

    void getsalariobruto(double parseDouble) {

    }

    public double CalcularPlanoSaude() {
        double planosaude = this.salariobruto;
        if (salariobruto < 499.99 && salariobruto == 499.99) {
            planosaude = 0;
        }
        if (salariobruto < 999.99 && salariobruto == 999.99) {
            return salariobruto * 0.01;
        }
        if (salariobruto < 1999.99 && salariobruto == 1999.99) {
        }
        return salariobruto * 0.03;

    }

    public double calcularSalarioFamilia() {
        double familia = this.salariobruto;
        if (salariobruto <= 549.80) {
            return salariobruto + (dependentes * 16.53);
        }
        if (salariobruto > 549.80) {
            return salariobruto + (dependentes * 8.83);
        }
        return familia;
    }

    public double calcularSalarioLiquido() {
        double salarioliquido = desconto - ir - salariofamilia;
        double desconto = this.desconto;
        double ir = this.ir;
        double salariofamilia = this.salariofamilia;
        return salarioliquido;
    }
}
