public class Calculadora {

    public int calcularSoma(int a, int b){
        return a+b;
    }

    public int calcularSubtracao(int a, int b){
        return a-b;
    }

    public int calcularMultiplicacao(int a, int b){
        return a*b;
    }

    public int calcularDivisao(int a, int b){
        return a/b;
    }

    public int calcularPotencia(int a, int b){
        return a^b;
    }

    public double celciusParaFaren(double celcius){
        return (celcius * 9/5 ) + 32;
    }

    public double farenParaCelcius(double faren){
        return (faren - 32) * 5/9;
    }

    public double areaRetangulo(double base, double altura){
        return base * altura;
    }
}
