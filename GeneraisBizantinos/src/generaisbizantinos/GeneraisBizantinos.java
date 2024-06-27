/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaisbizantinos;

/**
 *
 * @author Eduardo
 */
import java.util.ArrayList;
import java.util.List;

public class GeneraisBizantinos {
    public static void main(String[] args) {
        // Configurar generais e comandante
        Comandante comandante = new Comandante("atacar");
        List<General> generais = new ArrayList<>();
        generais.add(new General(1, false));
        generais.add(new General(2, true));
        generais.add(new General(3, false));
        generais.add(new General(4, false));
        generais.add(new General(5, true));

        // Comandante envia a ordem inicial
        comandante.enviarOrdem(generais);

        // Generais enviam suas decisões uns para os outros
        for (General general : generais) {
            for (General outro : generais) {
                if (general != outro) {
                    outro.receberMensagem(general.ehTraidor() ? 
                        (general.getId() % 2 == 0 ? "atacar" : "recuar") : comandante.getOrdem());
                }
            }
        }

        // Generais tomam suas decisões finais
        for (General general : generais) {
            general.tomarDecisao();
        }

        // Exibir resultados
        System.out.println("Ordem do comandante: " + comandante.getOrdem());
        for (General general : generais) {
            System.out.println(general);
        }
    }
}

