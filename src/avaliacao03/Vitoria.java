package avaliacao03;

import javax.swing.JOptionPane;

public class Vitoria {
    int i = 0;
    private boolean z;
    
    private String v[] = new String[9];
                                                                        
                                                                        
    public String getV(int i) {                                         
        return v[i];
    }

    public void setV(String v, int i) {
        this.v[i] = v;       
    }

    void vitoria(){
        if (getV(0).equals(getV(1)) && getV(1).equals(getV(2)) && getV(2).equals("X")) {

            JOptionPane.showMessageDialog(null, "Jogador X Vencedor");
            setZ(true);
        }
        if (getV(0).equals(getV(4)) && getV(4).equals(getV(8)) && getV(8).equals("X")) {

            JOptionPane.showMessageDialog(null, "Jogador X Vencedor");  
            setZ(true);
        }
        if (getV(0).equals(getV(3)) && getV(3).equals(getV(6)) && getV(6).equals("X")) {

            JOptionPane.showMessageDialog(null, "Jogador X Vencedor");
            setZ(true);
        }
        if (getV(1).equals(getV(4)) && getV(4).equals(getV(7)) && getV(7).equals("X")) {

            JOptionPane.showMessageDialog(null, "Jogador X Vencedor");
            setZ(true);
        }
        if (getV(2).equals(getV(5)) && getV(5).equals(getV(8)) && getV(8).equals("X")) {

            JOptionPane.showMessageDialog(null, "Jogador X Vencedor");
            setZ(true);
        }
        if (getV(2).equals(getV(4)) && getV(4).equals(getV(6)) && getV(6).equals("X")) {

            JOptionPane.showMessageDialog(null, "Jogador X Vencedor");
            setZ(true);
        }
        if (getV(3).equals(getV(4)) && getV(4).equals(getV(5)) && getV(5).equals("X")) {

            JOptionPane.showMessageDialog(null, "Jogador X Vencedor");
            setZ(true);
        }
        if (getV(6).equals(getV(7)) && getV(7).equals(getV(8)) && getV(8).equals("X")) {

            JOptionPane.showMessageDialog(null, "Jogador X Vencedor");
            setZ(true);
        }
        if (getV(0).equals(getV(1)) && getV(1).equals(getV(2)) && getV(2).equals("O")) {

            JOptionPane.showMessageDialog(null, "Jogador O Vencedor");
            setZ(true);
        }
        if (getV(0).equals(getV(4)) && getV(4).equals(getV(8)) && getV(8).equals("O")) {

            JOptionPane.showMessageDialog(null, "Jogador O Vencedor");  
            setZ(true); 
        }
        if (getV(0).equals(getV(3)) && getV(3).equals(getV(6)) && getV(6).equals("O")) {

            JOptionPane.showMessageDialog(null, "Jogador O Vencedor");
            setZ(true);
        }
        if (getV(1).equals(getV(4)) && getV(4).equals(getV(7)) && getV(7).equals("O")) {

            JOptionPane.showMessageDialog(null, "Jogador O Vencedor");
            setZ(true);
        }
        if (getV(2).equals(getV(5)) && getV(5).equals(getV(8)) && getV(8).equals("O")) {

            JOptionPane.showMessageDialog(null, "Jogador O Vencedor");
            setZ(true);
        }
        if (getV(2).equals(getV(4)) && getV(4).equals(getV(6)) && getV(6).equals("O")) {

            JOptionPane.showMessageDialog(null, "Jogador O Vencedor");
            setZ(true);
        }
        if (getV(3).equals(getV(4)) && getV(4).equals(getV(5)) && getV(5).equals("O")) {

            JOptionPane.showMessageDialog(null, "Jogador O Vencedor");
            setZ(true);
        }
        if (getV(6).equals(getV(7)) && getV(7).equals(getV(8)) && getV(8).equals("O")) {

            JOptionPane.showMessageDialog(null, "Jogador O Vencedor");
            setZ(true);
        }
    }

    public boolean isZ() {
        return z;
    }

    public void setZ(boolean z) {
        this.z = z;
    }
}
