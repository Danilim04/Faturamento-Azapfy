import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
   
    //variaveis calculo adicionais 
        double gigas;
        double Motoristas;
        double comprovmesusuario=0;
        String mesdereferencia = "";
        String idcontrato = "";

    //variaveis cadastro 
        double idcontratocadastro = 0;
        double cobrançafixa = 0;
        double cotagigas = 0;
        double cotamotoristas = 0;
        double cotacomprovacoes = 0;
        String nomeempresa = "";

    //Cadastro de dados (Sera enviado para um banco de dados)
        
        System.out.println("deseja Adicionar Uma Nova empresa ?");
            String cadastrodeempresa = sc.nextLine();
        
    if (cadastrodeempresa.equals("sim")){
            
            System.out.println("Digite O id do contrato");
                idcontratocadastro = sc.nextDouble();
 
                sc.nextLine();
            System.out.println("Digite o nome da Empresa");
                nomeempresa = sc.next();
                
            System.out.println("Digite o Numero de cotas de Comprovação");
                cotacomprovacoes = sc.nextDouble();

            System.out.println("Digite o Numero de cotas de Motoristas");
                cotamotoristas = sc.nextDouble();

            System.out.println("Digite o Numero da Cota de Gigas");
                cotagigas = sc.nextDouble();
            
            System.out.println("Digite a cobrança Fixa");
                 cobrançafixa = sc.nextDouble();

        }  

    //Pergunta para calcular os adicionais 
      
            
        System.out.println("Você deseja o calculo dos Adicionais ? ");
            String pergunta = sc.nextLine();
        
    if (pergunta.equals("sim")) {       

    //Insersão de dados
        
        System.out.println("Digite O id do Contrato");
            idcontrato = sc.nextLine();
            sc.nextLine();
        System.out.println("Digite o Mês de Referência");
            mesdereferencia = sc.next();
        
        System.out.println("Digie O numero de comprovações efetuadas Neste Mês");
            comprovmesusuario = sc.nextDouble();

        System.out.println("Digite o Numero do Motoristas do Mês");
            Motoristas = sc.nextDouble();

        System.out.println("Digite o Numero de Gigas utilizados no Mês");
            gigas = sc.nextDouble();
        }
    
    // Volta de resultados 
        String retornovaloresadicionais = calcadicionais.calcadicionais(idcontrato, mesdereferencia, comprovmesusuario, cotamotoristas, cotagigas);

    //Relatorio para usuario
        System.out.println(retornovaloresadicionais);

        
    }
}
