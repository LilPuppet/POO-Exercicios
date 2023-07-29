public class Q21{
    public static void main (String [] args){
        int n = 7;
 
        if (primo(n, 2))
            System.out.println("Oso primo");
        else
            System.out.println("No so primo");    
    }
    public static boolean primo(int p, int i){
        //Primeiro, sabemos que todo número é divisível por 1
        //Então a única verificação é se é divisível por outro além dele mesmo
        
        //Passos Base    
        //Já que 1 não é primo, começamos com 2
        if (p==2){
            return true;
        }
        //Se qualquer resto rolar, é falso.
        if(p!=i && p%i==0){
            return false;
        }
        //Se por ventura o contador chegar a ser igual ao número e
        //ele não chegar em falso em nenhuma hora, é primo.
        if(p==i){
            return true;
        }
        else{
            return primo(p, i+1);    
        }
    }
}