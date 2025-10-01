public class Calculadora {
    private HistoricoDeCalculos historico;

    // A dependência é injetada no construtor
    public Calculadora(HistoricoDeCalculos historico) {
        this.historico = historico;
    }

    public int somar(int a, int b) {
        // Interage com o histórico para registrar a operação
        historico.registrar(a + " + " + b + " = " + (a + b));
        return (a + b);
    }

    public int subtrair(int a, int b) {
        historico.registrar(a + " - " + b + " = " + (a - b));
        return (a - b);
    }
}
