/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generaisbizantinos;

/**
 *
 * @author Eduardo
 */
import java.util.List;

public class Comandante {
    private String ordem;

    public Comandante(String ordem) {
        this.ordem = ordem;
    }

    public void enviarOrdem(List<General> generais) {
        for (General general : generais) {
            general.receberMensagem(ordem);
        }
    }

    public String getOrdem() {
        return ordem;
    }
}


