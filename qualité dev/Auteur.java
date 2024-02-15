import java.util.Map;
import java.util.HasMap;

class Auteur{
    private String nom;

    private String citaTrag;
    private int qualiTrag;

    private String citaCome;
    private int qualiCome;

    private String citaDrame;
    private int qualiDrame;

    Map<String.Integer> perfs;

    public Auteur(){
        this.perfs=new HashMap<>();
        this.perf.put("DRAME",100);
        Integer dramePerf = this.perfs.get("DRAME").getQualite();
        this.perf.put("TRAGEDIE",100);
        Integer tragPerf = this.perfs.get("TRAGEDIE").getQualite();
        this.perf.put("COMEDIE",100);
        Integer comPerf = this.perfs.get("COMEDIE").getQualite();
    }

    public Integer getQualiteTragedie(){
        return this.qualiTrag;
    }

    public Integer getQualiteComedie(){
        return this.qualiCome;
    }

    public Integer getQualiteDrame(){
        return this.qualiDrame;
    }

    public String getCitationTragedie(){
        return this.citaTrag;
    }

    public String pointFort(){

    }

    @Override

    public String toString(){
        return "L'honorable" +this.nom ;
    }
}