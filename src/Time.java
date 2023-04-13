/**
 * La classe rappresenta e gestisce dati di tipo temporale
 */

public class Time 
{
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
    public Time(int secondi, int minuti, int ore) 
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
     * @param secondi numero di secondi dell'oggetto Time
     */
    public Time(int secondi)
    {

    }
    /**
     * 
     * @return
     */
    public int getSecondi() {
        return secondi;
    }
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }
    public int getMinuti() {
        return minuti;
    }
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }
    public int getOre() {
        return ore;
    }
    public void setOre(int ore) {
        this.ore = ore;
    }
    //private Time converti()
    {

    }
    
}
