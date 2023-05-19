package com.mycompany.lancamentopreciso;

public final class Calculos {
    
    private double velocidadeInicial;
    private double angulo;
    private double resultado;
    private int qualEixo = 1;
    private int qualCalculo = 1;
    
    // Construtor Padrão
    public Calculos(){}
    
    // Calcula dependendo do "qualCalculo" selecionado
    public double calcular (){
        switch (qualCalculo) {
            case 1:
                return tempoSubida(velocidadeInicial, angulo);
            case 2:
                return tempoTotal(velocidadeInicial, angulo);
            case 3:
                return alturaMaxima(velocidadeInicial, angulo);
            case 4:
                return alcanceHorizontal(velocidadeInicial, angulo);
            default:
                break;
        }
        return -9999999;
    }
    
    
    /* ********************** FORMULAS ******************** */
    public double tempoSubida(double velocidadeInicial, double angulo){
        if(qualEixo == 1){
            return (velocidadeInicial * Math.sin(angulo)) / 10.0;
        } else if (qualEixo == 2){
            return (velocidadeInicial * Math.cos(angulo)) / 10.0;
        }
        return -9999999;
    }
    
    public double tempoTotal(double velocidadeInicial, double angulo){
        return tempoSubida(velocidadeInicial, angulo) * 2;
    }
    
    public double alturaMaxima(double velocidadeInicial, double angulo){
        if(qualEixo == 1){
            return Math.pow(velocidadeInicial * Math.sin(angulo), 2) / 20.0;
        } else if (qualEixo == 2){
            return Math.pow(velocidadeInicial * Math.cos(angulo), 2) / 20.0;
        }
        return -999999999;
    }
    
    public double alcanceHorizontal(double velocidadeInicial, double angulo){
        if(qualEixo == 1){
            return velocidadeInicial * Math.cos(angulo) * tempoTotal(velocidadeInicial, angulo);
        } else if (qualEixo == 2){
            return velocidadeInicial * Math.sin(angulo) * tempoTotal(velocidadeInicial, angulo);
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
        this.angulo = Double.parseDouble(x);
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
        return Double.toString(resultado);
    }
    
    public String getExplicacao(){
        switch (qualCalculo) {
            case 1:
                return "O tempo de subida é igual ao tempo de \ndescida, logo, o tempo total é duas vezes o \ntempo de subida."; //explicacao TempoSubida
            case 2:
                return "Dois valores são importantes no movimento \nvertical: a altura máxima o tempo até alcançar \no ponto mais alto da trajetória."; //explicacao TempoTotal
            case 3:
                return "A altura máxima do lançamento oblíquo pode \nser obtida utilizando as fórmulas do movimento \nuniformemente variado, já que ele está \nrelacionado com o movimento vertical."; //explicacao AlturaMaxima;
            case 4:
                return "O alcance horizontal é a distância entre \nos pontos de partida e chegada do objeto \nlançado obliquamente."; //explicacao AlcanceHorizontal;
            default:
                break;
        }
        return "";
    }
}
