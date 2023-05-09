package com.mycompany.lancamentopreciso;

import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class App extends Application {    
    
    @Override
    public void start(Stage stage) throws IOException {
        
        
        /* ***********************************************   DECLARAÇÃO DE OBJETOS   ********************************************** */
        Calculos calculo = new Calculos();
                
                
        /* ***********************************************   IMPORTAÇÕES   ********************************************** */
        
        // Importação da Imagem Logo
        Image logo = new Image(new FileInputStream("logo.PNG"));
        
        
        
        /*  **********************************************   TELA PRINCIPAL   ********************************************** */
        
        // Configura Visualização da Logo
        ImageView logoViewTelaPrincipal = new ImageView(logo);
        logoViewTelaPrincipal.setX(125);
        logoViewTelaPrincipal.setY(-40);
        logoViewTelaPrincipal.setFitHeight(300);
        logoViewTelaPrincipal.setFitWidth(300);
        
        // Configuração Texto "O QUE DESEJA CALCULAR"
        Rectangle blocoTextoOQueDesejaCalcular = new Rectangle(300, 30);
        blocoTextoOQueDesejaCalcular.setX(120);
        blocoTextoOQueDesejaCalcular.setY(200);
        blocoTextoOQueDesejaCalcular.setArcHeight(10);
        blocoTextoOQueDesejaCalcular.setArcWidth(10);
        blocoTextoOQueDesejaCalcular.setFill(Color.WHITE);
        blocoTextoOQueDesejaCalcular.setStroke(Color.BLACK);
        
        Text textoOQueDesejaCalcular = new Text("O QUE DESEJA CALCULAR");
        textoOQueDesejaCalcular.setX(190);
        textoOQueDesejaCalcular.setY(220);
        textoOQueDesejaCalcular.setFill(Color.BLACK);
        textoOQueDesejaCalcular.setFont(Font.font("", 14));
        
        Group abaOQueDesejaCalcular = new Group(blocoTextoOQueDesejaCalcular, textoOQueDesejaCalcular);
        
        // Configuração Texto "Movimento Vertical"
        Rectangle blocoTextoMovimentoVertical = new Rectangle(180, 40);
        blocoTextoMovimentoVertical.setX(40);
        blocoTextoMovimentoVertical.setY(250);
        blocoTextoMovimentoVertical.setArcHeight(10);
        blocoTextoMovimentoVertical.setArcWidth(10);
        blocoTextoMovimentoVertical.setFill(Color.TURQUOISE);
        
        Text textoMovimentoVertical = new Text("Movimento Vertical");
        textoMovimentoVertical.setX(68);
        textoMovimentoVertical.setY(275);
        textoMovimentoVertical.setFill(Color.WHITE);
        textoMovimentoVertical.setFont(Font.font("", 14));
        
        Group abaMovimentoVertical = new Group(blocoTextoMovimentoVertical, textoMovimentoVertical);
        
        // Configuração Texto "Movimento Horizontal"
        Rectangle blocoTextoMovimentoHorizontal = new Rectangle(180, 40);
        blocoTextoMovimentoHorizontal.setX(290);
        blocoTextoMovimentoHorizontal.setY(250);
        blocoTextoMovimentoHorizontal.setArcHeight(10);
        blocoTextoMovimentoHorizontal.setArcWidth(10);
        blocoTextoMovimentoHorizontal.setFill(Color.TURQUOISE);
        
        Text textoMovimentoHorizontal = new Text("Movimento Horizontal");
        textoMovimentoHorizontal.setX(312);
        textoMovimentoHorizontal.setY(275);
        textoMovimentoHorizontal.setFill(Color.WHITE);
        textoMovimentoHorizontal.setFont(Font.font("", 14));
        
        Group abaMovimentoHorizontal = new Group(blocoTextoMovimentoHorizontal, textoMovimentoHorizontal);
        
        // Configuração Botão "Posição Vertical em Função do Tempo"
        Button botaoPosicaoVerticalEmFuncaoDoTempo = new Button("Posiçao Vertical \nem Função do Tempo");
        botaoPosicaoVerticalEmFuncaoDoTempo.setLayoutX(40);
        botaoPosicaoVerticalEmFuncaoDoTempo.setLayoutY(310);
        botaoPosicaoVerticalEmFuncaoDoTempo.setMinWidth(180);
        botaoPosicaoVerticalEmFuncaoDoTempo.setMinHeight(40);
        botaoPosicaoVerticalEmFuncaoDoTempo.setStyle("-fx-base: #ffffff; ");
             
        // Configuração Botão "Velocidade Vertical em Função do Tempo"
        Button botaoVelocidadeVerticalEmFuncaoDoTempo = new Button("Velocidade Vertical \nem Função do Tempo");
        botaoVelocidadeVerticalEmFuncaoDoTempo.setLayoutX(40);
        botaoVelocidadeVerticalEmFuncaoDoTempo.setLayoutY(360);
        botaoVelocidadeVerticalEmFuncaoDoTempo.setMinWidth(180);
        botaoVelocidadeVerticalEmFuncaoDoTempo.setMinHeight(40);
        botaoVelocidadeVerticalEmFuncaoDoTempo.setStyle("-fx-base: #ffffff; ");
        
        // Configuração Botão "Tempo de Subida"
        Button botaoTempoDeSubida = new Button("Tempo de Subida");
        botaoTempoDeSubida.setLayoutX(40);
        botaoTempoDeSubida.setLayoutY(410);
        botaoTempoDeSubida.setMinWidth(180);
        botaoTempoDeSubida.setMinHeight(40);
        botaoTempoDeSubida.setStyle("-fx-base: #ffffff; ");
                
        // Configuração Botão "Altura Máxima"
        Button botaoAlturaMaxima = new Button("Altura Maxima");
        botaoAlturaMaxima.setLayoutX(40);
        botaoAlturaMaxima.setLayoutY(460);
        botaoAlturaMaxima.setMinWidth(180);
        botaoAlturaMaxima.setMinHeight(40);
        botaoAlturaMaxima.setStyle("-fx-base: #ffffff; ");
        
        // Configuração Botão "Posição Horizontal em Função do Tempo"
        Button botaoPosicaoHorizontalEmFuncaoDoTempo = new Button("Posiçao Horizontal \nem Função do Tempo");
        botaoPosicaoHorizontalEmFuncaoDoTempo.setLayoutX(290);
        botaoPosicaoHorizontalEmFuncaoDoTempo.setLayoutY(310);
        botaoPosicaoHorizontalEmFuncaoDoTempo.setMinWidth(180);
        botaoPosicaoHorizontalEmFuncaoDoTempo.setMinHeight(40);
        botaoPosicaoHorizontalEmFuncaoDoTempo.setStyle("-fx-base: #ffffff; ");
        
        // Configuração Botão "Alcance Horizontal"
        Button botaoAlcanceHorizontal = new Button("Alcance Horizontal");
        botaoAlcanceHorizontal.setLayoutX(290);
        botaoAlcanceHorizontal.setLayoutY(360);
        botaoAlcanceHorizontal.setMinWidth(180);
        botaoAlcanceHorizontal.setMinHeight(40);
        botaoAlcanceHorizontal.setStyle("-fx-base: #ffffff; ");
        
        // Grupo para aba de Seleção de Calculos
        Group abaSeleçãoDeCalculos = new Group(abaOQueDesejaCalcular, abaMovimentoVertical, abaMovimentoHorizontal, 
                botaoPosicaoVerticalEmFuncaoDoTempo, botaoVelocidadeVerticalEmFuncaoDoTempo, botaoTempoDeSubida, 
                botaoAlturaMaxima, botaoPosicaoHorizontalEmFuncaoDoTempo, botaoAlcanceHorizontal);
            
        // Configuração da Area de Graficos
        Rectangle blocoGraficos = new Rectangle(600, 300);
        blocoGraficos.setX(500);
        blocoGraficos.setY(40);
        blocoGraficos.setHeight(430);
        blocoGraficos.setWidth(650);
        blocoGraficos.setFill(Color.WHITE);
        blocoGraficos.setStroke(Color.BLACK);
        blocoGraficos.setArcHeight(10);
        blocoGraficos.setArcWidth(10);
        
        //Defining the x axis             
        NumberAxis xAxis = new NumberAxis(0, 60, 5); 
        xAxis.setLabel("T"); 
        
        //Defining the y axis   
        NumberAxis yAxis = new NumberAxis   (0, 300, 20); 
        yAxis.setLabel("So"); 

        //Creating the line chart 
        LineChart linechart = new LineChart(xAxis, yAxis);


        //Prepare XYChart.Series objects by setting data 
        XYChart.Series series = new XYChart.Series(); 
        series.setName("RESULTADO");

        series.getData().add(new XYChart.Data(5, 15)); 
        series.getData().add(new XYChart.Data(10, 30)); 
        series.getData().add(new XYChart.Data(15, 60)); 
        series.getData().add(new XYChart.Data(20, 90)); 
        series.getData().add(new XYChart.Data(25, 120)); 
        series.getData().add(new XYChart.Data(30, 150));
        series.getData().add(new XYChart.Data(35, 180));
        series.getData().add(new XYChart.Data(40, 210));
        series.getData().add(new XYChart.Data(45, 240));
        series.getData().add(new XYChart.Data(50, 270));
        series.getData().add(new XYChart.Data(55, 300));
        series.getData().add(new XYChart.Data(60, 300));

        //Setting the data to Line chart    
        linechart.getData().add(series);        

        //Creating a Group object  
        Group root = new Group(linechart);
        root.setLayoutX(570);
        root.setLayoutY(45);
        root.setScaleX(1.2);
        root.setScaleY(1);
        
        Group grafico = new Group(blocoGraficos, root);
        
        // Configuração Texto "Resultados"
        Rectangle blocoTextoResultados = new Rectangle(300, 40);
        blocoTextoResultados.setX(500);
        blocoTextoResultados.setY(480);
        blocoTextoResultados.setFill(Color.WHITE);
        blocoTextoResultados.setStroke(Color.BLACK);
        blocoTextoResultados.setArcHeight(10);
        blocoTextoResultados.setArcWidth(10);
        
        Text textoResultados = new Text("*STRING RESULTADO*");
        textoResultados.setX(525);
        textoResultados.setY(505);
        textoResultados.setFill(Color.BLACK);
        textoResultados.setFont(Font.font("", 14));
        
        Group resultados = new Group(blocoTextoResultados, textoResultados);
        
        //Configuração Texto "Explicação"
        Rectangle blocoTextoExplicacao = new Rectangle(340, 80);
        blocoTextoExplicacao.setX(810);
        blocoTextoExplicacao.setY(480);
        blocoTextoExplicacao.setFill(Color.WHITE);
        blocoTextoExplicacao.setStroke(Color.BLACK);
        blocoTextoExplicacao.setArcHeight(10);
        blocoTextoExplicacao.setArcWidth(10);
        
        Text textoExplicacao = new Text("explicacão"); // fazer if no botão para mudar isso
        textoExplicacao.setX(835);
        textoExplicacao.setY(505);
        textoExplicacao.setFill(Color.BLACK);
        textoExplicacao.setFont(Font.font("", 14));
        
        Group explicacao = new Group(blocoTextoExplicacao, textoExplicacao);
        

        // Grupo Tela Principal
        Group grupoTelaPrincipal = new Group(logoViewTelaPrincipal, abaSeleçãoDeCalculos,  
                grafico, resultados, explicacao);
        
        // Configuração da Cena
        var telaPrincipal = new Scene(grupoTelaPrincipal,1200, 600);
        
        
        /*  **********************************************   TELA ENTRADA DE DADOS   ********************************************** */  
        
        // Configura Visualização da Logo
        ImageView logoViewTelaEntradaDeDados = new ImageView(logo);
        logoViewTelaEntradaDeDados.setX(100);
        logoViewTelaEntradaDeDados.setY(-40);
        logoViewTelaEntradaDeDados.setFitHeight(300);
        logoViewTelaEntradaDeDados.setFitWidth(300);

        //Configuracao aba: Entrada de Dados
        Rectangle blocoEntradaDeDados = new Rectangle(400, 200);
        blocoEntradaDeDados.setX(50);
        blocoEntradaDeDados.setY(200);
        blocoEntradaDeDados.setArcHeight(10);
        blocoEntradaDeDados.setArcWidth(10);
        blocoEntradaDeDados.setFill(Color.WHITE);
        blocoEntradaDeDados.setStroke(Color.BLACK);
        
        Text textoEntradaDeDados = new Text("ENTRADA DE DADOS");
        textoEntradaDeDados.setX(185);
        textoEntradaDeDados.setY(240);
        textoEntradaDeDados.setFill(Color.BLACK);
        textoEntradaDeDados.setFont(Font.font("", 16));
        
        Text textoExemploFormula = new Text("Formula");
        textoExemploFormula.setX(115);
        textoExemploFormula.setY(270);
        textoExemploFormula.setFill(Color.BLACK);
        textoExemploFormula.setFont(Font.font("", 14)); 
        
        Text textoEntrada1 = new Text("Entrada 1");
        textoEntrada1.setX(115);
        textoEntrada1.setY(300);
        textoEntrada1.setFill(Color.BLACK);
        textoEntrada1.setFont(Font.font("", 14));
        
        TextField Entrada1 = new TextField();
        Entrada1.setLayoutX(315);
        Entrada1.setLayoutY(285);
        Entrada1.setMinSize(30, 20);
        Entrada1.setMaxSize(30, 20);
        
        Text textoEntrada2 = new Text("Entrada 2");
        textoEntrada2.setX(115);
        textoEntrada2.setY(320);
        textoEntrada2.setFill(Color.BLACK);
        textoEntrada2.setFont(Font.font("", 14));
        
        TextField Entrada2 = new TextField();
        Entrada2.setLayoutX(315);
        Entrada2.setLayoutY(310);
        Entrada2.setMinSize(30, 20);
        Entrada2.setMaxSize(30, 20);
        
        Text textoEntrada3 = new Text("Entrada 3");
        textoEntrada3.setX(115);
        textoEntrada3.setY(340);
        textoEntrada3.setFill(Color.BLACK);
        textoEntrada3.setFont(Font.font("", 14));
        
        TextField Entrada3 = new TextField();
        Entrada3.setLayoutX(315);
        Entrada3.setLayoutY(335);
        Entrada3.setMinSize(30, 20);
        Entrada3.setMaxSize(30, 20);
        
        Group abaEntradaDeDados = new Group(blocoEntradaDeDados, textoEntradaDeDados, textoExemploFormula, textoEntrada1,
                Entrada1, textoEntrada2, Entrada2,  textoEntrada3, Entrada3);
        
        // Configuração Botão "Efetuar Calculo"
        Button botaoEfetuarCalculo = new Button("Efetuar Calculo");
        botaoEfetuarCalculo.setLayoutX(50);
        botaoEfetuarCalculo.setLayoutY(450);
        botaoEfetuarCalculo.setMinSize(150, 40);
        
        // Configuração Botão "Cancelar"
        Button botaoCancelar = new Button("Cancelar");
        botaoCancelar.setLayoutX(300);
        botaoCancelar.setLayoutY(450);
        botaoCancelar.setMinSize(150, 40);
        
        // Grupo Tela "EntradaDeDados"
        Group grupoTelaEntradaDeDados = new Group(logoViewTelaEntradaDeDados, abaEntradaDeDados, botaoEfetuarCalculo, botaoCancelar);
        
        // Configuração da Cena
        var telaEntradaDeDados = new Scene(grupoTelaEntradaDeDados, 500, 600);
        
        
        
        /*  **********************************************   CONFIGURAÇÃO DE FUNCIONALIDADES DE BOTÕES   ********************************************** */

        // Funcionalidade para Abrir a Tela Principal
        EventHandler<ActionEvent> abrirTelaPrincipal = (ActionEvent e) -> {
            stage.setScene(telaPrincipal);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosPosicaoVerticalEmFuncaoDoTempo = (ActionEvent e) -> {
            textoExemploFormula.setText("S (t) = Vo.t ± g/2.(t²)");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Gravidade (g) = ");
            textoEntrada3.setText("Tempo (t) = ");
            calculo.setQualCalculo(1);
            stage.setScene(telaEntradaDeDados);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosVelocidadeVerticalEmFuncaoDoTempo = (ActionEvent e) -> {
            textoExemploFormula.setText("V (t) = Vo ± g.t ");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Gravidade (g) = ");
            textoEntrada3.setText("Tempo (t) = ");
            calculo.setQualCalculo(2);
            stage.setScene(telaEntradaDeDados);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosTempoDeSubida = (ActionEvent e) -> {
            textoExemploFormula.setText("T = Vo / g");
            textoEntrada1.setText("Velocidade Vertical Inicial (Vo) = ");
            textoEntrada2.setText("Gravidade (g) = ");
            textoEntrada3.setText(" ");
            calculo.setQualCalculo(3);
            stage.setScene(telaEntradaDeDados);
        };
       
        EventHandler<ActionEvent> abrirEntradaCalculosAlturaMaxima = (ActionEvent e) -> {
            textoExemploFormula.setText("H = Vo² / 2.g");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Gravidade (g) = ");
            textoEntrada3.setText(" ");
            calculo.setQualCalculo(4);
            stage.setScene(telaEntradaDeDados);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosPosicaoHorizontalEmFuncaoDoTempo = (ActionEvent e) -> {
            textoExemploFormula.setText("S(t) = Vo.t");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Tempo (t) = ");
            textoEntrada3.setText(" ");
            calculo.setQualCalculo(5);
            stage.setScene(telaEntradaDeDados);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosAlcanceHorizontal = (ActionEvent e) -> {
            textoExemploFormula.setText("A = Vo². sen 2Θ / g");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Ângulo realizado pelo objeto (sen Θ) = ");
            textoEntrada3.setText("Gravidade (g) =  ");
            calculo.setQualCalculo(6);
            stage.setScene(telaEntradaDeDados);
        };
        
        EventHandler<ActionEvent> efetuarCalculo = (ActionEvent e) -> {
            calculo.setEntrada1(Entrada1.getText());
            calculo.setEntrada2(Entrada1.getText());
            calculo.setEntrada3(Entrada1.getText());
            calculo.setResultado(calculo.calcular());
            textoResultados.setText("RESULTADO = " + calculo.getResultadoString());
            textoExplicacao.setText(calculo.getExplicacao());
            stage.setScene(telaPrincipal);
        };
        
        
        
        /*  **********************************************   ATRIBUIÇÃO DE FUNCIONALIDADES DE BOTÕES   ********************************************** */
        
        botaoCancelar.setOnAction(abrirTelaPrincipal);
        
        botaoPosicaoVerticalEmFuncaoDoTempo.setOnAction(abrirEntradaCalculosPosicaoVerticalEmFuncaoDoTempo);
        
        botaoVelocidadeVerticalEmFuncaoDoTempo.setOnAction(abrirEntradaCalculosVelocidadeVerticalEmFuncaoDoTempo);
        
        botaoTempoDeSubida.setOnAction(abrirEntradaCalculosTempoDeSubida);
        
        botaoAlturaMaxima.setOnAction(abrirEntradaCalculosAlturaMaxima);
        
        botaoPosicaoHorizontalEmFuncaoDoTempo.setOnAction(abrirEntradaCalculosPosicaoHorizontalEmFuncaoDoTempo);
        
        botaoAlcanceHorizontal.setOnAction(abrirEntradaCalculosAlcanceHorizontal);
        
        botaoEfetuarCalculo.setOnAction(efetuarCalculo);
        
        
        
        /*  **********************************************   SETTING DA CENA INICIAL   ********************************************** */
        stage.setScene(telaPrincipal); 
        stage.show();  
    }

    public static void main(String[] args) {
        launch();
    }
}