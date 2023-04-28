package com.mycompany.lancamentopreciso;

public final class Calculos {
    
    private static String entrada1 = "En1";
    private static String entrada2 = "En2";
    private static String entrada3 = "En3";
    private static String formula = "Formula";
    
    public Calculos(){}
   
    
    public double PosicaoVerticalTempo(double velocidadeInicial, double tempo, double gravidade){
        
        double x;
        x = (velocidadeInicial * tempo) + (gravidade/2) * (tempo*tempo);
        return x;
    }
    
    public double VelocidadeVerticalTempo(double velocidadeInicial, double tempo, double gravidade){
        
        double x;
        x = velocidadeInicial + (gravidade*tempo);
        return x;
    }
    
    public double TempoSubida(double velociadeInicial, double gravidade){
        
        double x;
        x = velociadeInicial/gravidade;
        return x;
    }
    
    public double AlturaMaxima(double velocidadeInicial, double gravidade){
        
        double x;
        x = (velocidadeInicial*velocidadeInicial)/ (2*gravidade);
        return x;
    }
    
    public double PosicaoHorizontalTempo(double velocidadeInicial, double tempo, double gravidade){
        
        double x;
        x = velocidadeInicial * tempo;
        return x;
    }
    
    public double AlcanceHorizontal(double velocidadeInicial, double angulo, double gravidade){
        
        double x;
        x = ((velocidadeInicial*velocidadeInicial) * Math.sin(angulo*2)) / gravidade;
        return x;
    }
    
    public void setEntrada1(String x){
        entrada1 = x;
    }
    
    public void setEntrada2(String x){
        entrada2 = x;
    }
    
    public void setEntrada3(String x){
        entrada3 = x;
    }
    
    public void setFormula(String x){
        formula = x;
    }
    
    public static String getEntrada1(){
        return entrada1;
    }
    
    public static String getEntrada2(){
        return entrada2;
    }
    
    public static String getEntrada3(){
        return entrada3;
    }
    
    public static String getFormula(){
        return formula;
    }
}
