//package Q32.java e Q33.java;

public class Lampada {
    private boolean estadoDaLampada;
    Contador c = new Contador();

    public void acende(){
        estadoDaLampada = true;
        c.contar();
    }

    public void apaga(){
        estadoDaLampada = false;
    }

    public boolean estaLigada(){
        if (estadoDaLampada==true){
            return true;
        }
        else{
            return false;
        }
    }

    public void mostraEstado(){
        if (estadoDaLampada==true){
            System.out.println("A lâmpada está acesa.");;
        }
        else{
            System.out.println("A lâmpada está apagada.");;
        }
    }

    public void quantas(){
        System.out.println(c.retornar() );
    }

    
}
