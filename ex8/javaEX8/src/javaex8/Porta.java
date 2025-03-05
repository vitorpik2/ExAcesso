package javaex8;

public class Porta {

    private boolean aberta;

    public void abrir() {
        aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fechar() {
        aberta = false;
        System.out.println("A porta foi fechada.");
    }

    public void estadoDaPorta() {
        System.out.println("A porta esta " + (aberta ? "aberta." : "fechada."));
    }

}
