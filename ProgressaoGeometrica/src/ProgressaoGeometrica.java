public class ProgressaoGeometrica {
    public double somaProgressaoGeo(double razao, double n) {
        return ((1 * ((Math.pow(razao, n)) - 1))/(razao - 1));
    }
}
