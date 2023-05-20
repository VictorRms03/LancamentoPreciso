package com.mycompany.lancamentopreciso;

import java.util.ArrayList;

public final class Calculos {
    
    private double velocidadeInicial;
    private double angulo;
    private double resultado;
    private int qualEixo = 1;
    private int qualCalculo = 1;
    private ArrayList listaPosicaoX = new ArrayList();
    private ArrayList listaPosicaoY = new ArrayList();
    
    // Construtor Padrão
    public Calculos(){}
    
    // Calcula dependendo do "qualCalculo" selecionado
    public double calcular (){
        switch (qualCalculo) {
            case 1:
                return tempoSubida();
            case 2:
                return tempoTotal();
            case 3:
                return alturaMaxima();
            case 4:
                return alcanceHorizontal();
            default:
                break;
        }
        return -9999999;
    }
    
    
    /* ********************** FORMULAS ******************** */
    public double tempoSubida(){
        if(qualEixo == 1){
            return (velocidadeInicial * Math.sin(angulo)) / 10.0;
        } else if (qualEixo == 2){
            return (velocidadeInicial * Math.cos(angulo)) / 10.0;
        }
        return -9999999;
    }
    
    public double tempoTotal(){
        return (tempoSubida() * 2);
    }
    
    public double alturaMaxima(){
        if(qualEixo == 1){
            return Math.pow(velocidadeInicial * Math.sin(angulo), 2) / 20.0;
        } else if (qualEixo == 2){
            return Math.pow(velocidadeInicial * Math.cos(angulo), 2) / 20.0;
        }
        return -999999999;
    }
    
    public double alcanceHorizontal(){
        if(qualEixo == 1){
            return velocidadeInicial * Math.cos(angulo) * tempoTotal();
        } else if (qualEixo == 2){
            return velocidadeInicial * Math.sin(angulo) * tempoTotal();
        }
        return -999999999;
    }
    
    
    /* ****************** Sets ********************** */
    
    public void setQualCalculo(int qualCalculo){
        this.qualCalculo = qualCalculo;
    }
    
    public void setQualEixo(int qualEixo){
        this.qualEixo = qualEixo;
    }
    
    public void setVelocidadeInicial(String x){
        this.velocidadeInicial = Double.parseDouble(x);
    }
    
    public void setAngulo(String x){
        double anguloGraus = Double.parseDouble(x);
        this.angulo = Math.toRadians(anguloGraus);
    }
    
    public void setResultado(double x){
        this.resultado = x;
    }
    
    
    /* ***************** Gets ****************** */
    
    public double getQualEixo(){
        return qualEixo;
    }
    public double getVelocidadeInicial(){
        return velocidadeInicial;
    }
    
    public double getAngulo(){
        return angulo;
    }
    
    public double getResultado(){
        return resultado;
    }
    
    public String getResultadoString(){
        switch (qualCalculo) {
            case 1:
                return "ts = " + Double.toString(resultado);
            case 2:
                return "t_total = " + Double.toString(resultado);
            case 3:
                return "Hmax = " + Double.toString(resultado);
            case 4:
                return "ΔSx = " + Double.toString(resultado);
            default:
                break;
        }
        return "erro";
    }
    
    
    public String getExplicacao(){
        switch (qualCalculo) {
            case 1:
                return "O tempo de subida é igual ao tempo de \ndescida, logo, o tempo total é duas vezes o \ntempo de subida."; //explicacao TempoSubida
            case 2:
                return "???????????????"; //explicacao TempoTotal
            case 3:
                return "A altura máxima do lançamento oblíquo pode \nser obtida utilizando as fórmulas do movimento \nuniformemente variado, já que ele está \nrelacionado com o movimento vertical."; //explicacao AlturaMaxima;
            case 4:
                return "O alcance horizontal é a distância entre \nos pontos de partida e chegada do objeto \nlançado obliquamente."; //explicacao AlcanceHorizontal;
            default:
                break;
        }
        return "";
    }
    
    /* **************************************** GRAFICO ************************************ */
    
    
}
