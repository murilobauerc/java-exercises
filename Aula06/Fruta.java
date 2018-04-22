public class Fruta {
    
    private int gramas;
    private double caloriasPorGrama;
    
    public Fruta(int gramas, double caloriasPorGrama) {
        this.gramas = gramas;
        this.caloriasPorGrama = caloriasPorGrama;
    }

    public int getGramas() {
        return gramas;
    }

    public double getCaloriasPorGrama() {
        return caloriasPorGrama;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    public void setCaloriasPorGrama(double caloriasPorGrama) {
        this.caloriasPorGrama = caloriasPorGrama;
    }
}
