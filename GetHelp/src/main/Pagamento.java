package main;

public class Pagamento {
    private int id;
    private String nome;
    private String dataHoraPagamento;
    private int numeroPagamento;
    private double valorPago;
    private double porcentagem;

    public Pagamento(int id, String nomeTitular, String dataHoraPagamento, int numeroPagamento, double valorPago, double porcentagem) {
        this.id = id;
        this.nome = nomeTitular;
        this.dataHoraPagamento = dataHoraPagamento;
        this.numeroPagamento = numeroPagamento;
        this.valorPago = valorPago;
        this.porcentagem = porcentagem;
    }
    public int getId(){
        return id;
    }
    public void setId(int idPagamento) {
        this.id = idPagamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(String dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPocentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String imprimirCupomFiscal;

}