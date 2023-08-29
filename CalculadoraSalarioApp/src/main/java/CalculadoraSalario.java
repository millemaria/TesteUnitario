public class CalculadoraSalario {
    double Taxa1 = 0.075;
    double Taxa2 = 0.09;
    double Taxa3 = 0.12;
    double Taxa4 = 0.14;
    double SALARIO1 = 1320.00;
    double SALARIO2 = 2571.29;
    double SALARIO3 = 3856.94;
    double SALARIO4 = 7507.49;
    public double calcularINSS(double salarioBruto) {

        double totalRecolher;

        if (salarioBruto <= SALARIO1){
            totalRecolher = salarioBruto * Taxa1;
            return totalRecolher;

        }
        else if (salarioBruto <= SALARIO2){
            double faixa1 = 1320*Taxa1;
            double faixa2 = (salarioBruto-1320.01)*Taxa2;
            totalRecolher = faixa1+faixa2;
            return totalRecolher;
        }
        else if (salarioBruto <= SALARIO3){
            double faixa1 = 1320*Taxa1;
            double faixa2 = (2571.29-1320.01)*Taxa2;
            double faixa3 = (salarioBruto - 2571.29) * Taxa3;
            totalRecolher = faixa1+faixa2+faixa3;
           return totalRecolher;
        }
        else  if (salarioBruto<=SALARIO4) {
            double faixa1 = 1320*Taxa1;
            double faixa2 = (2571.29-1320.01)*Taxa2;
            double faixa3 = (3856.94 - 2571.29) * Taxa3;
            double faixa4 = (salarioBruto - 3856.94) * Taxa4;
            totalRecolher = faixa1+faixa2+faixa3+faixa4;
            return totalRecolher;
        } else {
            double faixa1 = 1320*Taxa1;
            double faixa2 = (2571.29-1320.01)*Taxa2;
            double faixa3 = (3856.94 - 2571.29) * Taxa3;
            double faixa4 = (7507.49 - 3856.94) * Taxa4;
            totalRecolher = faixa1+faixa2+faixa3+faixa4;
            return totalRecolher;
        }

    }
}
