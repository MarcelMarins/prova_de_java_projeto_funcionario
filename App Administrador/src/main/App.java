package main;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        int opcao = 0;
        int menusete = 0;
        Funcionario f = new Funcionario();
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n1- Cadastrar Funcionário\n2- Calcular imposto de renda\n3- Calcular plano de saúde\n4- Calcular salário família\n5- Calcular salário líquido\n6- Exibir salário líquido\n7- Exibir demais cálucos\n0- Sair"));
            switch (opcao) {
                case 1:

                    f.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário:"));
                    f.setSalariobruto(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário Bruto:")));
                    f.setDependentes(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de Dependentes")));
                    f.setIr(Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto de renda.")));
                    f.setDesconto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto")));
                    f.setSalariofamilia(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário familiar")));
                    f.setSalarioliquido(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário líquido.")));

                    break;
                case 2:

                    f.getsalariobruto();
                    JOptionPane.showMessageDialog(null, "O valor é de: " + f.calcularImpostoRenda());

                    break;
                case 3:

                    f.getsalariobruto();
                    JOptionPane.showMessageDialog(null, "O valor é de: " + f.CalcularPlanoSaude());

                    break;
                case 4:

                    f.getDependentes();
                    f.getsalariobruto();
                    JOptionPane.showMessageDialog(null, "O valor do bônus é de:" + f.calcularSalarioFamilia());

                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "O valor do salário líquido é de: " + f.calcularSalarioLiquido());

                    break;
                case 6:

                    JOptionPane.showMessageDialog(null, f.getNome());
                    JOptionPane.showMessageDialog(null, f.getDependentes());
                    JOptionPane.showMessageDialog(null, f.getsalariobruto());
                    JOptionPane.showMessageDialog(null, f.CalcularPlanoSaude());
                    JOptionPane.showMessageDialog(null, f.calcularImpostoRenda());
                    JOptionPane.showMessageDialog(null, f.calcularSalarioFamilia());
                    JOptionPane.showMessageDialog(null, f.calcularSalarioLiquido());

                    break;
                case 7:
                    do {
                        menusete = Integer.parseInt(JOptionPane.showInputDialog("M E N U  E X I B I Ç Ã O \n1-Exibir IR\n2-Exibir Plano de Saúde\n3-Exibir Salário Família\n0-Voltar"));

                        switch (menusete) {
                            case 1:

                                JOptionPane.showMessageDialog(null, "O valor do imposto de renda é de: " + f.calcularImpostoRenda());

                                break;

                            case 2:

                                JOptionPane.showMessageDialog(null, "O valor do plano de saúde é de: " + f.CalcularPlanoSaude());
                                break;
                            case 3:

                                JOptionPane.showMessageDialog(null, " O valor do salário Família é de: " + f.calcularSalarioFamilia());
                                break;

                        }
                    } while (menusete != 0);
                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Opção inválida!!! Tente novamente ou digite 0 para sair.");
                    break;
            }
        } while (opcao != 0);
    }
}
