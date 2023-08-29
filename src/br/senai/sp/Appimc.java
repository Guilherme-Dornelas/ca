package br.senai.sp;

import br.senai.sp.model.coleta;
import br.senai.sp.model.imc;

public class Appimc {
    public static void main(String[] args) {

        // instanciar o imc
        imc objimc = new imc();
        coleta user = new coleta();

        user.RegistroUser();
        objimc.calcularImc(user);
        objimc.classificarimc();





    }
}
