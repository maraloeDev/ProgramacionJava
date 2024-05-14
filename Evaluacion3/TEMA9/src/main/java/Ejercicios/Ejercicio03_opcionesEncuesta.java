package Ejercicios;


public class Ejercicio03_opcionesEncuesta {
    
    int si;
    int no;
    int nSnC;

    public Ejercicio03_opcionesEncuesta() {
    }

    public Ejercicio03_opcionesEncuesta(int si, int no, int nSnC) {
        this.si = si;
        this.no = no;
        this.nSnC = nSnC;
    }

    @Override
    public String toString() {
        return si + "," + no + "," + nSnC;
    }
    
    public String[] toArray(){
            
        String[] datosEncuesta ={"Si", "No", "NS/NC"};
        return datosEncuesta;
    
    }
    
    
    
}
