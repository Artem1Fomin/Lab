package ru.mirea.lab6.ex3;

public class ex11 {
        public static void main(String[] args) {
            Convertable c1 = new CK_Convertor();
            Convertable c2 = new CF_Convertor();
            double tempC = 68.89;
            System.out.printf("C: %.2f\nK: %.2f\nF: %.2f", tempC, c1.convert(tempC), c2.convert(tempC));
        }
    }
    interface Convertable{
        double convert(double tempC);
    }
    class CK_Convertor implements Convertable{
        @Override
        public double convert(double tempC){
            return tempC - 273;
        }
    }
    class CF_Convertor implements Convertable{
        @Override
        public double convert(double tempC){
            return (tempC * (double)9/5) + 32;
        }
    }

