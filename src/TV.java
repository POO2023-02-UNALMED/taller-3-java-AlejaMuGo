package taller3.televisores;
public class TV {
    Marca marca;
    int canal=1;
    int precio=500;
    boolean estado;
    int volumen=1;
    Control control;
    static int numTV;
    public TV(Marca m,boolean e){
        marca=m;
        estado=e;
        numTV++;
    }
    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int n){
        numTV=n;
    }
    public void setMarca(Marca m){
        marca=m;
    }
    public Marca getMarca(){
        return marca;
    }
    public void setCanal(int c){
        if(c>=1 && c<=120 && estado == true)
            canal=c;
    }
    public int getCanal(){
        return canal;
    }
    public void setPrecio(int p){
        precio=p;
    }
    public int getPrecio(){
        return precio;
    }
    public void setVolumen(int v){
        if(v>=0 && v<=7 && estado == true)
            volumen=v;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setControl(Control co){
        control=co;
    }
    public Control getControl(){
        return control;
    }
    public void turnOn(){
        estado = true;
    }
    public void turnOff(){
        estado =false;
    }
    public boolean getEstado() {
        return estado;
    }
    public void CanalUp(){
        if(canal>=1 && canal<=120 && estado == true){
            canal++;
        }

    }
    public void CanalDown(){
        if(canal>=1 && canal<=120 && estado == true){
            canal--;
        }

    }
    public void VolumenUp(){
        if(volumen>=0 && volumen<=7 && estado == true){
        volumen++;
        }
    }
    public void VolumenDown(){
        if(volumen>=0 && volumen<=7 && estado == true){
            volumen--;
        }
    }

}
