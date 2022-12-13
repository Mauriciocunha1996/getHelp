package main;


public class Cartao extends Pagamento {
    private String numCartao, bandeiraCartao;

    public Cartao(int id, String nome, String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String bandeiraCartao, double porcentagem) {
        super(id, nome, dataHoraPagamento, numeroPagamento, valorPago, porcentagem);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }



    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }


    public String imprimiCupomFiscal;

}         