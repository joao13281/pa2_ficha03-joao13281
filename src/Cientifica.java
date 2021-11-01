public class Cientifica{

    public double soma (double numA, double numB, double numC){
        double resultado;
        resultado = numA + numB + numC;
        return resultado;
    }

    public double subtrai (double numA, double numB) {
        double resultado;
        resultado = numA - numB;
        return resultado;
    }
    public double multiplica (double numA, double numB) {
        double resultado;
        resultado = numA * numB;
        return resultado;
    }

    public double divide (double numA, double numB) {
        double resultado;
        resultado = numA / numB;
        return resultado;
    }
    public double potencia (double numA, double numB) {
        double resultado;
        resultado = Math.pow(numA, numB);
        return resultado;
    }
}
