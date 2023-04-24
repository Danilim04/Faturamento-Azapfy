public class calcadicionais {
    public static String calcadicionais(String idcontrato, String mesdereferencia, double comprovmesusuario, double Motoristas, double gigas){
        
    double calculocomprov = 0, calculomoto = 0, calculogigas=0, calculofinal = 0;

// Almeida


if (idcontrato.equals("4083")){

    double pagfixo = 750.60;
    double comprovcotas = 6000;
    double motoristascotas = 10;
    double cotagigas = 50;
    double valorexedentecomprov = 0.22;
    double valorexedentemoto = 0.5;
    double valorexedentegigas = 0.20;

    // calculo comprovações
    if (comprovmesusuario > comprovcotas){
        calculocomprov = (comprovmesusuario - comprovcotas) * valorexedentecomprov;
    }
    if (comprovcotas > comprovmesusuario){
        calculocomprov = (6000 - comprovmesusuario) * valorexedentecomprov;
    }
    //calculo motoristas
    if (Motoristas > motoristascotas){
        calculomoto = (Motoristas - motoristascotas) * valorexedentemoto; 
    }
    if (motoristascotas>Motoristas){
        calculomoto = (motoristascotas - Motoristas) * valorexedentemoto;
    }
    //calculo gigas
    if (gigas>cotagigas){
        calculogigas = (gigas - cotagigas) * valorexedentegigas;
    }
    if (cotagigas>gigas){
        calculogigas = (cotagigas - gigas) * valorexedentegigas;
    }
    //calculo final
    calculofinal = pagfixo + calculocomprov + calculogigas + calculomoto;
        }
        
    // retorno do calculo final
    String resultado;      
    
    resultado = "O valor Final de Pagamento: " + calculofinal + "\n";
    
    if (calculocomprov>0){
        resultado += "Valor exedente das comprovações: " + calculocomprov + "\n";
    }
    if (calculomoto>0){
        resultado += "Valor exedente das cotas de Motorista: " + calculomoto + "\n";
    }
    if (calculogigas>0){
        resultado += "Valor exedente dos gigas: " + calculogigas + "\n";
    }
    if (calculocomprov==0){
        resultado += "Não existe Valor exedente para as comprovações: " + calculocomprov + "\n";
    }
    if (calculomoto==0){
        resultado += "Não existe valor exedente para a cota de Motoristas: " + calculomoto + "\n";
    }
    if (calculogigas==0){
        resultado += "Nao existe Valor exedente para a cota de Motorista: " + calculogigas + "\n";
    }
    return resultado;
    } 
}
