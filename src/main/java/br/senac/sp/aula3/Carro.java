package br.senac.sp.aula3;
import java.util.Scanner;
public class Carro {
    static Scanner sc = new Scanner(System.in);
    private static String fabricante ;
    
    public String [] rodas = {};
    public String cor ;
    public String modelo ;
    public int velocidade ;
    public int gasolina = 20;
    public int max_gasolina = 40;
    public int abastece = 0;
    
    
    public Carro (){
        
    }
    public int MaxGasolina (){
        int valor = max_gasolina;
        return max_gasolina;
    }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String[] getRodas() {
        return rodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getGasolina() {
        return gasolina;
    }

    public int getMax_gasolina() {
        return max_gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public void setMax_gasolina(int max_gasolina) {
        this.max_gasolina = max_gasolina;
    }

    
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String descreve (){
        boolean verfCor = true;
        boolean verfModelo = true;
        String resposta = " ";
        if(cor == null){
            verfCor =false;
        }
        if(modelo == null){
            verfModelo = false;
        }
        if ((cor != null) && (modelo != null)){
        resposta = ("Um "+modelo+" na cor "+cor);
        }else if((cor == null)&&(modelo != null)){
            resposta = ("Um "+modelo);
        }else if((modelo == null) &&(cor == null)){
            resposta = ("Um carro");
        }
        
        return resposta;
    }
    
    public int abastece (int litros){
        
        gasolina = gasolina + litros;
        
        if (gasolina > max_gasolina){
         
        gasolina = max_gasolina;
        
            
        }else {
            gasolina = gasolina + litros;
        }
        return gasolina;
    }
    
    
    
}
