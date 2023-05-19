package lista4;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;

    public Produto(String nome, int codigo, double preco){
        
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCodigo(){
        return this.codigo;

    }

    public double getPreco(){
        return this.preco;
    }
}

