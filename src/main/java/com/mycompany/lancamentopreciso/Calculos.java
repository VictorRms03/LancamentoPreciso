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
                return "A posição vertical em função do tempo é a \nposição vertical em determinado instante \napós o lançamento."; //explicacao PosicaoVerticalTempo
            case 2:
                return "Dois valores são importantes no movimento \nvertical: a altura máxima o tempo até alcançar \no ponto mais alto da trajetória."; //explicacao VelocidadeVertical Tempo
            case 3:
                return "O tempo de subida é igual ao tempo de \ndescida, logo, o tempo total é duas vezes o \ntempo de subida."; //explicacao TempoSubida
            case 4:
                return "A altura máxima do lançamento oblíquo pode \nser obtida utilizando as fórmulas do movimento \nuniformemente variado, já que ele está \nrelacionado com o movimento vertical."; //explicacao AlturaMaxima;
            case 5:
                return "No movimento horizontal de um lançamento \noblíquo, temos uma relação do espaço com o \ntempo utilizando a velocidade no eixo x (vx) \nvai ser sempre constante."; //explicacao PosicaoHorizontalTempo;
            case 6:
                return "O alcance horizontal é a distância entre \nos pontos de partida e chegada do objeto \nlançado obliquamente."; //explicacao AlcanceHorizontal;
            default:
                break;
        }
        return "";
    }
}
