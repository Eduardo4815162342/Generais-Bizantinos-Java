/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generaisbizantinos;

/**
 *
 * @author Eduardo
 */

import java.util.ArrayList;
import java.util.List;

public class General {
    private int id;
    private boolean ehTraidor;
    private String decisao;
    private List<String> mensagensRecebidas;

    public General(int id, boolean ehTraidor) {
        this.id = id;
        this.ehTraidor = ehTraidor;
        this.mensagensRecebidas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public boolean ehTraidor() {
        return ehTraidor;
    }

    public String getDecisao() {
        return decisao;
    }

    public void receberMensagem(String mensagem) {
        mensagensRecebidas.add(mensagem);
    }

    public List<String> getMensagensRecebidas() {
        return mensagensRecebidas;
    }

    public void tomarDecisao() {
        if (ehTraidor) {
            // Traidores enviam mensagens conflitantes
            decisao = mensagensRecebidas.size() % 2 == 0 ? "atacar" : "recuar";
        } else {
            int contarAtacar = 0;
            int contarRecuar = 0;
            for (String msg : mensagensRecebidas) {
                if (msg.equals("atacar")) {
                    contarAtacar++;
                } else {
                    contarRecuar++;
                }
            }
            decisao = contarAtacar > contarRecuar ? "atacar" : "recuar";
        }
    }

    @Override
    public String toString() {
        return "General{" +
                "id=" + id +
                ", ehTraidor=" + ehTraidor +
                ", decisao='" + decisao + '\'' +
                ", mensagensRecebidas=" + mensagensRecebidas +
                '}';
    }
}

