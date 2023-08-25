package taller3.televisores;
public class Control {
    TV tv;
    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }
    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp() {
        tv.CanalUp();
    }

    public void canalDown() {
        tv.CanalDown();
    }

    public void volumenUp() {
        tv.VolumenUp();
    }

    public void volumenDown() {
        tv.VolumenDown();
    }

    public void setCanal(int canal) {
        tv.setCanal(canal);
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
