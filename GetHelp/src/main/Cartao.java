package main;

import java.util.List;

public class Cartao{
    String numeroCartao;
    private int cvv_cartao;
    String vencimentoCartao;
    public Cartao(String numeroCartao, int cvv_cartao, String vencimentoCartao ){
        this.numeroCartao = numeroCartao;
        this.cvv_cartao = cvv_cartao;
        this.vencimentoCartao = vencimentoCartao;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public int getCvv_cartao() {
        return cvv_cartao;
    }
    public void setCvv_cartao(int cvv_cartao) {
        this.cvv_cartao = cvv_cartao;
    }
    public String getVencimentoCartao() {
        return vencimentoCartao;
    }
    public void setVencimentoCartao(String vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }
    
   

    public List<Cartao> cadastrar(List<Cartao> cartoes, Cartao cartao){
        cartoes.add(cartao);
        return cartoes;
    }

    public List<Cartao> deletar(List<Cartao> cartoes, Cartao cartao){
        cartoes.remove(cartao);
        return cartoes;
    }

    public void atualizar(Cartao cartao){
        this.setNumeroCartao(cartao.getNumeroCartao());
        this.setCvv_cartao(cartao.getCvv_cartao());
        this.setVencimentoCartao(cartao.getVencimentoCartao());
        

    }
}         
