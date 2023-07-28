public class PiSeis {
    public static void main (String[]args){
        double termosDaSerie[]= new double[1000000];

        for(int i = 0; i <termosDaSerie.length; i++){
            termosDaSerie[i] = 1/Math.pow(i+1, 2.0);
        }

        for(int num = 10; num<1000000; num*=10){
            System.out.println("Aproximação com " + num + " elementos é "+ calculaEMostraSomatoria(termosDaSerie, num));
        }
    }
    
    public static double calculaEMostraSomatoria(double[] v, int num){
        double soma = 0.0;
        for(int i = 0; i < num; i++){
            soma += v[i];
        }   
        return soma;
    }

}


