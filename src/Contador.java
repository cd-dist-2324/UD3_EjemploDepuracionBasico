
public class Contador {
    private int resultado = 0;

    public int getResultado() {
        return resultado;
    }

    public void contar() {
        for (int i = 0; i < 100; i++) {
            int resultado_antes_modificacion = resultado;
            resultado = resultado + i + 1;
            // ++
            System.out.printf("resultado + i + 1 = %d + %d + 1 = %d \n", resultado_antes_modificacion, i, resultado);
        }
    }
}
