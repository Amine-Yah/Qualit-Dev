import java.util.Map;
import java.util.HasMap;

class Journee{
    private int matin;
    private int apresmidi; 
    private int soiree;
    public Journee(int matin, int apresmidi, int soiree){
        this.matin=matin;
        this.apresmidi=apresmidi;
        this.soiree=soiree;
    }
    public Journee(){
        this.matin=null;
        this.apresmidi=null;
        this.soiree=null;
    }
    public int getmatin(){
        return this.matin;
    }
    public int getapresmidi(){
        return this.apresmidi;
    }
    public int getsoiree(){
        return this.soiree;
    }
}