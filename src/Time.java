/**
 * La classe rappresenta e gestisce dati di tipo temporale
 */

public class Time 
{
    /**
     * @param secondi numero di secondi dell'oggetto Time
     * @param minuti numero di minuti dell'oggetto Time
     * @param ore numero di ore dell'oggetto Time
     */
    protected int secondi;
    protected int minuti;
    protected int ore;
    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     * Se i parametri di ingresso non sono validi (es. minuti 78) allora l'oggetto Time verrÃ  inizializzato con tutti ore, minuti e secondi impostati a 0
     * @param secondi numero di secondi dell'oggetto Time
     * @param minuti numero di minuti dell'oggetto Time
     * @param ore numero di ore dell'oggetto Time
     */
    public Time(int ore, int minuti, int secondi) 
    {
        if(secondi<0||secondi>60||minuti<0||minuti>60||ore<0||ore>24)
        {
            this.secondi = 0;
            this.minuti = 0;
            this.ore = 0;
        }
        else
        {
            this.secondi = secondi;
            this.minuti = minuti;
            this.ore = ore;  
        }
    }
    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     * Vengono distribuite in automatico i secondi tra le ore, minuti e secondi. Esempio: se in input viene passato 100 allora ora 0, minuti 1 e secondi 40
     * @param secondi secondi da assegnare al nuovo oggetto
     */
    public Time(int s)
    {
        Time a;
        a=Time.normalizza(s);
        this.secondi=a.getSecondi();
        this.minuti=a.getMinuti();
        this.ore=a.getOre();
    }
    /**
     * Restituisce il numero di secondi
     * @return il numero di secondi dell'oggetto Time
     */
    public int getSecondi() {
        return secondi;
    }
    /**
     * @deprecated
     * @param secondi-
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }
    /**
     * Restituisce il numero di minuti
     * @return il numero di minuti dell'oggetto Time
     */
    public int getMinuti() {
        return minuti;
    }
    /**
     * @deprecated
     * @param minuti-
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }
    /**
     * Restituisce il numero delle ore
     * @return il numero di ore dell'oggetto Time
     */
    public int getOre() {
        return ore;
    }
    /**
     * @deprecated
     * @param ore-
     */
    public void setOre(int ore) {
        this.ore = ore;
    }
    private static Time normalizza(int s)
    {
        Time conv=null;
        if(s<3600)
        {
            if(s<60)
            {
                return conv=new Time(0, 0, s);
            }
            else
            {
                int sec=0;
                int min=(int)(s/60);
                sec=  s-(min*60);
                return conv=new Time(0, min, sec);
            }
        }
        else
        {
            //
            return conv=new Time(0, 0, 0);
        }
    }
    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi. Esempio. 1 ora, 20 min, 10 secondi -> 4810s
     * @return il numero totale dei secondi
     */
    public int convertiSecondi()
    {
        int tot=0;
        tot=this.getOre()*3600+this.getMinuti()*60+this.getSecondi();
        return tot;
    }
    /**
     * Vengono addizionati il numero di secondi specificati. Il tempo viene normalizzato in automatico.
     * @param secondi - numero di secondi da aggiungere
     */
    public void addSecondi(int secondi)
    {
        int tot=0;
        tot=tot+this.convertiSecondi()+secondi;
        Time t1=Time.normalizza(tot);
        this.setOre(t1.getOre());
        this.setMinuti(t1.getMinuti());
        this.setSecondi(t1.getSecondi());;
    }
    
    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @Override
     * @return Rappresentazione testuale dell'oggetto Time {ore:minuti:secondi}
     */
    public String toString()
    {
        String s="";
        s=s+"\nL'oggetto ha "+this.getOre()+" ore, "+this.getMinuti()+" minuti e "+this.getSecondi()+" secondi";
        return s;
    }
}
