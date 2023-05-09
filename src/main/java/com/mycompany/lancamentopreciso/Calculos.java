package com.mycompany.lancamentopreciso;

public final class Calculos {
    
    private double entrada1;
    private double entrada2;
    private double entrada3;
    private double resultado;
    private int qualCalculo = 1;
    private String ResultadoString = "RESULTADO";
    private String explicacao;
    
    public Calculos(){}
   
    public double calcular (){
        switch (qualCalculo) {
            case 1:
                return PosicaoVerticalTempo(entrada1, entrada3, entrada2);
            case 2:
                return VelocidadeVerticalTempo(entrada1, entrada3, entrada2);
            case 3:
                return TempoSubida(entrada1, entrada2);
            case 4:
                return AlturaMaxima(entrada1, entrada2);
            case 5:
                return PosicaoHorizontalTempo(entrada1, entrada2);
            case 6:
                return AlcanceHorizontal(entrada1, entrada2, entrada3);
            default:
                break;
        }
        return 0.361;
    }
    
    public double PosicaoVerticalTempo(double velocidadeInicial, double tempo, double gravidade){
        
        double x;
        
        //Calculando Resultado
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
    
    public double PosicaoHorizontalTempo(double velocidadeInicial, double tempo){
        
        double x;
        x = velocidadeInicial * tempo;
        return x;
    }
    
    public double AlcanceHorizontal(double velocidadeInicial, double angulo, double gravidade){
        
        double x;
        x = ((velocidadeInicial*velocidadeInicial) * Math.sin(angulo*2)) / gravidade;
        return x;
    }
    
    public void setQualCalculo(int x){
        this.qualCalculo = x;
    }
    
    public void setEntrada1(String x){
        double entrada = Double.parseDouble(x);
        this.entrada1 = entrada;
    }
    
    public void setEntrada2(String x){
        double entrada = Double.parseDouble(x);
        this.entrada2 = entrada;
    }
    
    public void setEntrada3(String x){
        double entrada = Double.parseDouble(x);
        this.entrada3 = entrada;
    }
    
    public void setResultado(double x){
        this.resultado = x;
    }
    
    public double getEntrada1(){
        return entrada1;
    }
    
    public double getEntrada2(){
        return entrada2;
    }
    
    public double getEntrada3(){
        return entrada3;
    }
    
    public double getResultado(){
        return resultado;
    }
    
    public String getResultadoString(){
        ResultadoString = Double.toString(resultado);
        return ResultadoString;
    }
    
    public String getExplicacao(){
        switch (qualCalculo) {
            case 1:
                return ""; //explicacao PosicaoVerticalTempo
            case 2:
                return ""; //explicacao VelocidadeVertical Tempo
            case 3:
                return ""; //explicacao TempoSubida
            case 4:
                return ""; //explicacao AlturaMaxima;
            case 5:
                return ""; //explicacao PosicaoHorizontalTempo;
            case 6:
                return ""; //explicacao AlcanceHorizontal;
            default:
                break;
        }
        return "";
    }
}
