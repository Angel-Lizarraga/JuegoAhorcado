import java.util.ArrayList;
/*
 */

/**
 *
 * @author Lenovo
 */
public class ControlJuego {
    private ArrayList<PalabraSecreta> palabras;
    private PalabraSecreta palabraSeleccionada;
    private boolean palabraAdivinada;
    private int intentoFallido = 0;
    private boolean juegoIniciado;
    
    public ControlJuego(){
    intentoFallido = 0;
    palabraAdivinada = false;
    juegoIniciado = false;
    }
    
    public void inicializarJuego(){
    intentoFallido = 0;
    palabraAdivinada = false;
    juegoIniciado = true;
    }
    
    public void reiniciarJuego(){
    inicializarJuego();
    }

    public void hayGanador(){
        if(palabraAdivinada == true){
            System.out.println("¡Felicidades, has adivinado la palabra!");
        }else if(intentoFallido == 6){
            System.out.println("Has perdido.");
        }
    }

    public void dibujarAhorcado(){
        switch(intentoFallido){
            case 1: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O"  );
                    System.out.println("   |        ");
                    System.out.println("   |        ");
                    System.out.println("___|________");
                    break;
            case 2: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |     | ");
                    System.out.println("   |      ");
                    System.out.println("___|________");
                    break;  
            case 3: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |    /| ");
                    System.out.println("   |        ");
                    System.out.println("___|________");
                    break;
            case 4: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |    /|/ ");
                    System.out.println("   |        ");
                    System.out.println("___|________");
                    break;
            case 5: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |    /|/ ");
                    System.out.println("   |    /  ");
                    System.out.println("___|________");
                    break;
            case 6: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |    /|/ ");
                    System.out.println("   |    / /");
                    System.out.println("___|________");
                    break;
        }
}
    
    public char compararLetra(){
    
    }
    
    public String compararPalabra(){
    
    }
}
    
