package lista4;

import java.util.ArrayList;

public class fatura {
    private ArrayList<item> itens;
    private double valorTotal;

    public fatura(){
        itens = new ArrayList<>();
        valorTotal = 0.0;
    }

    public void adicionarItem(item itens){
        this.itens.add(itens);
        valorTotal += itens.getValorTotal();
    }

    public ArrayList<item> getItens(){
        return itens;
    }

    public double getValorTotalFatura(){
        return valorTotal;
    }
}
