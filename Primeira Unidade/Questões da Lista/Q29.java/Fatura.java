//package Q29.java;

public class Fatura {
    private int id;
    private String desc;
    private int qtd;
    private double preco;
    
    public Fatura(int id, String desc, int qtd, double preco) {
        this.id = id;
        this.desc = desc;
        if (qtd<0){
            this.qtd =0;
        }
        else{
            this.qtd = qtd;
        }
        if (preco<0){
            this.preco = 0;
        }
        else{
        this.preco = preco;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if (qtd<0){
            this.qtd =0;
        }
        else{
            this.qtd = qtd;
        }
        
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco<0){
            this.preco = 0;
        }
        else{
        this.preco = preco;
        }
    }
    
    public double calculaTotal(){
        return preco*qtd;
    }
    
}
