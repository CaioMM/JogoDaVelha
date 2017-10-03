package avaliacao03;

public class XO {
    
    private boolean x;
    private boolean o;

    public boolean isX() {
        return x;
    }
    
    public void setX(boolean x) {
        this.x = x;
    }

    public boolean isO() {
        return o;
    }

    public void setO(boolean o) {
        this.o = o;
    }
    
    public void xTrue(){
        setX(true);
        setO(false);
    }
    
    public void oTrue(){
        setX(false);
        setO(true);
    }
}
