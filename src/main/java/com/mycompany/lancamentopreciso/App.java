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
        textoMovimentoVertical.setFill(Color.BLACK);
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
        textoMovimentoHorizontal.setFill(Color.BLACK);
        textoMovimentoHorizontal.setFont(Font.font("", 14));
        
        Group abaMovimentoHorizontal = new Group(blocoTextoMovimentoHorizontal, textoMovimentoHorizontal);
        
        // Configuração Botão "Posição Vertical em Função do Tempo"
        Button botaoPosicaoVerticalEmFuncaoDoTempo = new Button("Posiçao Vertical em Função do Tempo");
        botaoPosicaoVerticalEmFuncaoDoTempo.setLayoutX(10);
        botaoPosicaoVerticalEmFuncaoDoTempo.setLayoutY(310);
        botaoPosicaoVerticalEmFuncaoDoTempo.setMinWidth(235);
        
        // Configuração Botão "Velocidade Vertical em Função do Tempo"
        Button botaoVelocidadeVerticalEmFuncaoDoTempo = new Button("Velocidade Vertical em Função do Tempo");
        botaoVelocidadeVerticalEmFuncaoDoTempo.setLayoutX(10);
        botaoVelocidadeVerticalEmFuncaoDoTempo.setLayoutY(360);
        botaoVelocidadeVerticalEmFuncaoDoTempo.setMinWidth(235);
        
        // Configuração Botão "Tempo de Subida"
        Button botaoTempoDeSubida = new Button("Tempo de Subida");
        botaoTempoDeSubida.setLayoutX(10);
        botaoTempoDeSubida.setLayoutY(410);
        botaoTempoDeSubida.setMinWidth(235);
        
        // Configuração Botão "Altura Máxima"
        Button botaoAlturaMaxima = new Button("Altura Maxima");
        botaoAlturaMaxima.setLayoutX(10);
        botaoAlturaMaxima.setLayoutY(460);
        botaoAlturaMaxima.setMinWidth(235);

        // Configuração Botão "Posição Horizontal em Função do Tempo"
        Button botaoPosicaoHorizontalEmFuncaoDoTempo = new Button("Posiçao Horizontal em Função do Tempo");
        botaoPosicaoHorizontalEmFuncaoDoTempo.setLayoutX(270);
        botaoPosicaoHorizontalEmFuncaoDoTempo.setLayoutY(310);
        botaoPosicaoHorizontalEmFuncaoDoTempo.setMinWidth(235);
        
        // Configuração Botão "Alcance Horizontal"
        Button botaoAlcanceHorizontal = new Button("Alcance Horizontal");
        botaoAlcanceHorizontal.setLayoutX(270);
        botaoAlcanceHorizontal.setLayoutY(360);
        botaoAlcanceHorizontal.setMinWidth(235);
        
        // Grupo para aba de Seleção de Calculos
        Group abaSeleçãoDeCalculos = new Group(abaOQueDesejaCalcular, abaMovimentoVertical, abaMovimentoHorizontal, 
                botaoPosicaoVerticalEmFuncaoDoTempo, botaoVelocidadeVerticalEmFuncaoDoTempo, botaoTempoDeSubida, 
                botaoAlturaMaxima, botaoPosicaoHorizontalEmFuncaoDoTempo, botaoAlcanceHorizontal);
        
        // Configuração Botão "Entenda o Que é Lançamento Obliquo"
        Button botaoEntendaOQueELancamentoObliquo = new Button("Entenda O Que é Lançamento Obliquo");
        botaoEntendaOQueELancamentoObliquo.setLayoutX(550);
        botaoEntendaOQueELancamentoObliquo.setLayoutY(30);
        botaoEntendaOQueELancamentoObliquo.setMinSize(200, 40);
        
        // Configuração da Area de Graficos
        Rectangle blocoGraficos = new Rectangle(600, 400);
        blocoGraficos.setX(550);
        blocoGraficos.setY(80);
        blocoGraficos.setHeight(400);
        blocoGraficos.setWidth(600);
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
        root.setLayoutX(580);
        root.setLayoutY(80);
        root.setScaleX(1.2);
        root.setScaleY(1);
        
        Group grafico = new Group(blocoGraficos, root);
        
        // Configuração Texto "Resultados"
        Rectangle blocoTextoResultados = new Rectangle(600, 40);
        blocoTextoResultados.setX(550);
        blocoTextoResultados.setY(500);
        blocoTextoResultados.setFill(Color.WHITE);
        blocoTextoResultados.setStroke(Color.BLACK);
        blocoTextoResultados.setArcHeight(10);
        blocoTextoResultados.setArcWidth(10);
        
        Text textoResultados = new Text("*STRING RESULTADO*");
        textoResultados.setX(600);
        textoResultados.setY(525);
        textoResultados.setFill(Color.BLACK);
        textoResultados.setFont(Font.font("", 14));
        
        Group resultados = new Group(blocoTextoResultados, textoResultados);

        // Grupo Tela Principal
        Group grupoTelaPrincipal = new Group(logoViewTelaPrincipal, abaSeleçãoDeCalculos, botaoEntendaOQueELancamentoObliquo, 
                grafico, resultados);
        
        // Configuração da Cena
        var telaPrincipal = new Scene(grupoTelaPrincipal,1200, 600);
        
        
        
        /*  **********************************************   TELA O QUE É LANÇAMENTO OBLIQUO   ********************************************** */  
        
        //Configuracao aba: Posicao Vertical em Funcao do Tempo
        Rectangle blocoTextoPosicaoVerticalEmFuncaoDoTempo = new Rectangle(180, 60);
        blocoTextoPosicaoVerticalEmFuncaoDoTempo.setX(10);
        blocoTextoPosicaoVerticalEmFuncaoDoTempo.setY(10);
        blocoTextoPosicaoVerticalEmFuncaoDoTempo.setArcHeight(10);
        blocoTextoPosicaoVerticalEmFuncaoDoTempo.setArcWidth(10);
        blocoTextoPosicaoVerticalEmFuncaoDoTempo.setFill(Color.TURQUOISE);
        
        Text textoPosicaoVerticalEmFuncaoDoTempo = new Text("Posicao Vertical em\n Função do Tempo");
        textoPosicaoVerticalEmFuncaoDoTempo.setX(40);
        textoPosicaoVerticalEmFuncaoDoTempo.setY(35);
        textoPosicaoVerticalEmFuncaoDoTempo.setFill(Color.BLACK);
        textoPosicaoVerticalEmFuncaoDoTempo.setFont(Font.font("", 14));
        
        Rectangle blocoExplicacaoPosicaoVerticalEmFuncaoDoTempo = new Rectangle(180,200);
        blocoExplicacaoPosicaoVerticalEmFuncaoDoTempo.setX(10);
        blocoExplicacaoPosicaoVerticalEmFuncaoDoTempo.setY(80);
        blocoExplicacaoPosicaoVerticalEmFuncaoDoTempo.setArcHeight(10);
        blocoExplicacaoPosicaoVerticalEmFuncaoDoTempo.setArcWidth(10);
        blocoExplicacaoPosicaoVerticalEmFuncaoDoTempo.setFill(Color.WHITE);
        blocoExplicacaoPosicaoVerticalEmFuncaoDoTempo.setStroke(Color.BLACK);
        
        Group abaPosicaoVerticalEmFuncaoDoTempo = new Group(blocoTextoPosicaoVerticalEmFuncaoDoTempo, textoPosicaoVerticalEmFuncaoDoTempo, 
                blocoExplicacaoPosicaoVerticalEmFuncaoDoTempo);
        
        //Configuracao aba: Velocidade Vertical em Funcao do Tempo
        Rectangle blocoTextoVelocidadeVerticalEmFuncaoDoTempo = new Rectangle(180, 60);
        blocoTextoVelocidadeVerticalEmFuncaoDoTempo.setX(200);
        blocoTextoVelocidadeVerticalEmFuncaoDoTempo.setY(10);
        blocoTextoVelocidadeVerticalEmFuncaoDoTempo.setArcHeight(10);
        blocoTextoVelocidadeVerticalEmFuncaoDoTempo.setArcWidth(10);
        blocoTextoVelocidadeVerticalEmFuncaoDoTempo.setFill(Color.TURQUOISE);
        
        Text textoVelocidadeVerticalEmFuncaoDoTempo = new Text("Velocidade Vertical em\n   Função do Tempo");
        textoVelocidadeVerticalEmFuncaoDoTempo.setX(220);
        textoVelocidadeVerticalEmFuncaoDoTempo.setY(35);
        textoVelocidadeVerticalEmFuncaoDoTempo.setFill(Color.BLACK);
        textoVelocidadeVerticalEmFuncaoDoTempo.setFont(Font.font("", 14));
        
        Rectangle blocoExplicacaoVelocidadeVerticalEmFuncaoDoTempo = new Rectangle(180,200);
        blocoExplicacaoVelocidadeVerticalEmFuncaoDoTempo.setX(200);
        blocoExplicacaoVelocidadeVerticalEmFuncaoDoTempo.setY(80);
        blocoExplicacaoVelocidadeVerticalEmFuncaoDoTempo.setArcHeight(10);
        blocoExplicacaoVelocidadeVerticalEmFuncaoDoTempo.setArcWidth(10);
        blocoExplicacaoVelocidadeVerticalEmFuncaoDoTempo.setFill(Color.WHITE);
        blocoExplicacaoVelocidadeVerticalEmFuncaoDoTempo.setStroke(Color.BLACK);
        
        Group abaVelocidadeVerticalEmFuncaoDoTempo = new Group(blocoTextoVelocidadeVerticalEmFuncaoDoTempo, textoVelocidadeVerticalEmFuncaoDoTempo, 
                blocoExplicacaoVelocidadeVerticalEmFuncaoDoTempo);
        
        //Configuracao aba: Tempo de Subida
        Rectangle blocoTextoTempoDeSubida = new Rectangle(180, 60);
        blocoTextoTempoDeSubida.setX(390);
        blocoTextoTempoDeSubida.setY(10);
        blocoTextoTempoDeSubida.setArcHeight(10);
        blocoTextoTempoDeSubida.setArcWidth(10);
        blocoTextoTempoDeSubida.setFill(Color.TURQUOISE);
        
        Text textoTempoDeSubida = new Text("Tempo de Subida");
        textoTempoDeSubida.setX(425);
        textoTempoDeSubida.setY(45);
        textoTempoDeSubida.setFill(Color.BLACK);
        textoTempoDeSubida.setFont(Font.font("", 14));
        
        Rectangle blocoExplicacaoTempoDeSubida = new Rectangle(180,200);
        blocoExplicacaoTempoDeSubida.setX(390);
        blocoExplicacaoTempoDeSubida.setY(80);
        blocoExplicacaoTempoDeSubida.setArcHeight(10);
        blocoExplicacaoTempoDeSubida.setArcWidth(10);
        blocoExplicacaoTempoDeSubida.setFill(Color.WHITE);
        blocoExplicacaoTempoDeSubida.setStroke(Color.BLACK);
        
        Group abaTempoDeSubida = new Group(blocoTextoTempoDeSubida, textoTempoDeSubida, 
                blocoExplicacaoTempoDeSubida);
        
        //Configuracao aba: Altura Máxima
        Rectangle blocoTextoAlturaMaxima = new Rectangle(180, 60);
        blocoTextoAlturaMaxima.setX(580);
        blocoTextoAlturaMaxima.setY(10);
        blocoTextoAlturaMaxima.setArcHeight(10);
        blocoTextoAlturaMaxima.setArcWidth(10);
        blocoTextoAlturaMaxima.setFill(Color.TURQUOISE);
        
        Text textoAlturaMaxima = new Text("Altura Máxima");
        textoAlturaMaxima.setX(625);
        textoAlturaMaxima.setY(45);
        textoAlturaMaxima.setFill(Color.BLACK);
        textoAlturaMaxima.setFont(Font.font("", 14));
        
        Rectangle blocoExplicacaoAlturaMaxima = new Rectangle(180,200);
        blocoExplicacaoAlturaMaxima.setX(580);
        blocoExplicacaoAlturaMaxima.setY(80);
        blocoExplicacaoAlturaMaxima.setArcHeight(10);
        blocoExplicacaoAlturaMaxima.setArcWidth(10);
        blocoExplicacaoAlturaMaxima.setFill(Color.WHITE);
        blocoExplicacaoAlturaMaxima.setStroke(Color.BLACK);
        
        Group abaAlturaMaxima = new Group(blocoTextoAlturaMaxima, textoAlturaMaxima, 
                blocoExplicacaoAlturaMaxima);
        
        //Configuracao aba: Posição Horizontal Em Função do Tempo
        Rectangle blocoTextoPosicaoHorizontalEmFuncaoDoTempo = new Rectangle(180, 60);
        blocoTextoPosicaoHorizontalEmFuncaoDoTempo.setX(10);
        blocoTextoPosicaoHorizontalEmFuncaoDoTempo.setY(300);
        blocoTextoPosicaoHorizontalEmFuncaoDoTempo.setArcHeight(10);
        blocoTextoPosicaoHorizontalEmFuncaoDoTempo.setArcWidth(10);
        blocoTextoPosicaoHorizontalEmFuncaoDoTempo.setFill(Color.TURQUOISE);
        
        Text textoPosicaoHorizontalEmFuncaoDoTempo = new Text("Posicao Horizontal em\n   Função do Tempo");
        textoPosicaoHorizontalEmFuncaoDoTempo.setX(30);
        textoPosicaoHorizontalEmFuncaoDoTempo.setY(325);
        textoPosicaoHorizontalEmFuncaoDoTempo.setFill(Color.BLACK);
        textoPosicaoHorizontalEmFuncaoDoTempo.setFont(Font.font("", 14));
        
        Rectangle blocoExplicacaoPosicaoHorizontalEmFuncaoDoTempo = new Rectangle(180,200);
        blocoExplicacaoPosicaoHorizontalEmFuncaoDoTempo.setX(10);
        blocoExplicacaoPosicaoHorizontalEmFuncaoDoTempo.setY(370);
        blocoExplicacaoPosicaoHorizontalEmFuncaoDoTempo.setArcHeight(10);
        blocoExplicacaoPosicaoHorizontalEmFuncaoDoTempo.setArcWidth(10);
        blocoExplicacaoPosicaoHorizontalEmFuncaoDoTempo.setFill(Color.WHITE);
        blocoExplicacaoPosicaoHorizontalEmFuncaoDoTempo.setStroke(Color.BLACK);
        
        Group abaPosicaoHorizontalEmFuncaoDoTempo = new Group(blocoTextoPosicaoHorizontalEmFuncaoDoTempo, textoPosicaoHorizontalEmFuncaoDoTempo, 
                blocoExplicacaoPosicaoHorizontalEmFuncaoDoTempo);
        
        //Configuracao aba: Alcance Horizontal
        Rectangle blocoTextoAlcanceHorizontal = new Rectangle(180, 60);
        blocoTextoAlcanceHorizontal.setX(200);
        blocoTextoAlcanceHorizontal.setY(300);
        blocoTextoAlcanceHorizontal.setArcHeight(10);
        blocoTextoAlcanceHorizontal.setArcWidth(10);
        blocoTextoAlcanceHorizontal.setFill(Color.TURQUOISE);
        
        Text textoAlcanceHorizontal = new Text("Alcance Horizontal");
        textoAlcanceHorizontal.setX(230);
        textoAlcanceHorizontal.setY(335);
        textoAlcanceHorizontal.setFill(Color.BLACK);
        textoAlcanceHorizontal.setFont(Font.font("", 14));
        
        Rectangle blocoExplicacaoAlcanceHorizontal = new Rectangle(180,200);
        blocoExplicacaoAlcanceHorizontal.setX(200);
        blocoExplicacaoAlcanceHorizontal.setY(370);
        blocoExplicacaoAlcanceHorizontal.setArcHeight(10);
        blocoExplicacaoAlcanceHorizontal.setArcWidth(10);
        blocoExplicacaoAlcanceHorizontal.setFill(Color.WHITE);
        blocoExplicacaoAlcanceHorizontal.setStroke(Color.BLACK);
        
        Group abaAlcanceHorizontal = new Group(blocoTextoAlcanceHorizontal, textoAlcanceHorizontal, 
                blocoExplicacaoAlcanceHorizontal);
        
        // Configuração Botão "Retornar a Tela Principal"
        Button botaoRetornarATelaPrincipal = new Button("Retornar à Tela Principal");
        botaoRetornarATelaPrincipal.setLayoutX(600);
        botaoRetornarATelaPrincipal.setLayoutY(530);
        botaoRetornarATelaPrincipal.setMinSize(150, 40);

        //Grupo Tela "OQueELancamentoObliquo"
        Group grupoTelaOQueELancamentoObliquo = new Group(abaPosicaoVerticalEmFuncaoDoTempo, abaVelocidadeVerticalEmFuncaoDoTempo, abaTempoDeSubida,
         abaAlturaMaxima, abaPosicaoHorizontalEmFuncaoDoTempo, abaAlcanceHorizontal, botaoRetornarATelaPrincipal);
        
        // Configuração da Cena
        var telaOQueELancamentoObliquo = new Scene(grupoTelaOQueELancamentoObliquo, 800, 600);

        
        
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
        
        Text textoExemploFormula = new Text(Calculos.getFormula());
        textoExemploFormula.setX(115);
        textoExemploFormula.setY(270);
        textoExemploFormula.setFill(Color.BLACK);
        textoExemploFormula.setFont(Font.font("", 14));
        
        Text textoEntrada1 = new Text(Calculos.getEntrada1());
        textoEntrada1.setX(115);
        textoEntrada1.setY(300);
        textoEntrada1.setFill(Color.BLACK);
        textoEntrada1.setFont(Font.font("", 14));
        
        Text textoEntrada2 = new Text(Calculos.getEntrada2());
        textoEntrada2.setX(115);
        textoEntrada2.setY(320);
        textoEntrada2.setFill(Color.BLACK);
        textoEntrada2.setFont(Font.font("", 14));
        
        Text textoEntrada3 = new Text(Calculos.getEntrada3());
        textoEntrada3.setX(115);
        textoEntrada3.setY(340);
        textoEntrada3.setFill(Color.BLACK);
        textoEntrada3.setFont(Font.font("", 14));
        
        Group abaEntradaDeDados = new Group(blocoEntradaDeDados, textoEntradaDeDados, textoExemploFormula, textoEntrada1,
                textoEntrada2, textoEntrada3);
        
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
        
        //Funcionalidade para Abrir a Tela De Explicações sobre Lançamento Obliquo
        EventHandler<ActionEvent> abrirTelaExplicacoes = (ActionEvent e) -> {
            stage.setScene(telaOQueELancamentoObliquo);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosPosicaoVerticalEmFuncaoDoTempo = (ActionEvent e) -> {
            textoExemploFormula.setText("S (t) = Vo.t ± g/2.(t²)");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Gravidade (g) = ");
            textoEntrada3.setText("Tempo (t) = ");
            stage.setScene(telaEntradaDeDados);
        };
        EventHandler<ActionEvent> abrirEntradaCalculosVelocidadeVerticalEmFuncaoDoTempo = (ActionEvent e) -> {
            textoExemploFormula.setText("V (t) = Vo ± g.t ");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Gravidade (g) = ");
            textoEntrada3.setText("Tempo (t) = ");
            stage.setScene(telaEntradaDeDados);
        };
        EventHandler<ActionEvent> abrirEntradaCalculosTempoDeSubida = (ActionEvent e) -> {
            textoExemploFormula.setText("T = Vo / g");
            textoEntrada1.setText("Tempo de Subida (t) = ");
            textoEntrada2.setText("Velocidade Vertical Inicial (Vo) = ");
            textoEntrada3.setText("Gravidade (g) = ");
            stage.setScene(telaEntradaDeDados);
        };
        EventHandler<ActionEvent> abrirEntradaCalculosAlturaMaxima = (ActionEvent e) -> {
            textoExemploFormula.setText("H = Vo² / 2.g");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Gravidade (g) = ");
            textoEntrada3.setText(" ");
            stage.setScene(telaEntradaDeDados);
        };
        EventHandler<ActionEvent> abrirEntradaCalculosPosicaoHorizontalEmFuncaoDoTempo = (ActionEvent e) -> {
            textoExemploFormula.setText("S(t) = Vo.t");
            textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Tempo (t) = ");
            textoEntrada3.setText(" ");
            stage.setScene(telaEntradaDeDados);
        };
        EventHandler<ActionEvent> abrirEntradaCalculosAlcanceHorizontal = (ActionEvent e) -> {
            textoExemploFormula.setText("A = Vo². sen 2Θ / g");
             textoEntrada1.setText("Velocidade Inicial (Vo) = ");
            textoEntrada2.setText("Ângulo realizado pelo objeto (sen Θ) = ");
            textoEntrada3.setText("Gravidade (g) =  ");
            stage.setScene(telaEntradaDeDados);
        };
        
        
        
        /*  **********************************************   ATRIBUIÇÃO DE FUNCIONALIDADES DE BOTÕES   ********************************************** */
        botaoEntendaOQueELancamentoObliquo.setOnAction(abrirTelaExplicacoes);
        
        botaoRetornarATelaPrincipal.setOnAction(abrirTelaPrincipal);
        
        botaoCancelar.setOnAction(abrirTelaPrincipal);
        
        botaoPosicaoVerticalEmFuncaoDoTempo.setOnAction(abrirEntradaCalculosPosicaoVerticalEmFuncaoDoTempo);
        
        botaoVelocidadeVerticalEmFuncaoDoTempo.setOnAction(abrirEntradaCalculosVelocidadeVerticalEmFuncaoDoTempo);
        
        botaoTempoDeSubida.setOnAction(abrirEntradaCalculosTempoDeSubida);
        
        botaoAlturaMaxima.setOnAction(abrirEntradaCalculosAlturaMaxima);
        
        botaoPosicaoHorizontalEmFuncaoDoTempo.setOnAction(abrirEntradaCalculosPosicaoHorizontalEmFuncaoDoTempo);
        
        botaoAlcanceHorizontal.setOnAction(abrirEntradaCalculosAlcanceHorizontal);
        
        
        
        /*  **********************************************   SETTING DA CENA INICIAL   ********************************************** */
        stage.setScene(telaPrincipal); 
        stage.show();  
    }

    public static void main(String[] args) {
        launch();
    }
}