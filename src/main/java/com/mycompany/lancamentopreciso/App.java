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
        
        /*  **********************************************   TELA SELEÇÃO DE EIXO   ********************************************** */  
        
        // Configura Visualização da Logo
        ImageView logoViewTelaSelecaoEixo = new ImageView(logo);
        logoViewTelaSelecaoEixo.setX(100);
        logoViewTelaSelecaoEixo.setY(-40);
        logoViewTelaSelecaoEixo.setFitHeight(300);
        logoViewTelaSelecaoEixo.setFitWidth(300);
        
        //Configuracao aba: Seleção de Eixo
        Rectangle blocoSelecaoDeEixo = new Rectangle(400, 200);
        blocoSelecaoDeEixo.setX(50);
        blocoSelecaoDeEixo.setY(200);
        blocoSelecaoDeEixo.setArcHeight(10);
        blocoSelecaoDeEixo.setArcWidth(10);
        blocoSelecaoDeEixo.setFill(Color.WHITE);
        blocoSelecaoDeEixo.setStroke(Color.BLACK);
        
        Text textoSelecaoDeEixo = new Text("O ângulo esta em: ");
        textoSelecaoDeEixo.setX(185);
        textoSelecaoDeEixo.setY(240);
        textoSelecaoDeEixo.setFill(Color.BLACK);
        textoSelecaoDeEixo.setFont(Font.font("", 16));
        
        Button botaoRelacaoHorizontal = new Button("Em relação a horizontal (eixo x)");
        botaoRelacaoHorizontal.setLayoutX(160);
        botaoRelacaoHorizontal.setLayoutY(265);
        botaoRelacaoHorizontal.setMinSize(150, 40);
        
        Button botaoRelacaoVertical = new Button("Em relação a vertical (eixo y)");
        botaoRelacaoVertical.setLayoutX(167);
        botaoRelacaoVertical.setLayoutY(325);
        botaoRelacaoVertical.setMinSize(150, 40);

        Group botoesHorizontalVertical = new Group(botaoRelacaoHorizontal, botaoRelacaoVertical);
        
        // Grupo Tela Principal
        Group selecaoDeEixo = new Group(blocoSelecaoDeEixo, textoSelecaoDeEixo, botoesHorizontalVertical);
       
        Group grupoTelaSelecaoDeEixo = new Group(logoViewTelaSelecaoEixo, selecaoDeEixo);
        
        var telaSelecaoDeEixo = new Scene(grupoTelaSelecaoDeEixo,500, 600);
        
        
        /*  **********************************************   TELA SELEÇÃO DE CALCULO   ********************************************** */
        
        // Configura Visualização da Logo
        ImageView logoViewTelaSelecaoCalculo = new ImageView(logo);
        logoViewTelaSelecaoCalculo.setX(100);
        logoViewTelaSelecaoCalculo.setY(-40);
        logoViewTelaSelecaoCalculo.setFitHeight(300);
        logoViewTelaSelecaoCalculo.setFitWidth(300);
        
        // Configuração Texto "O QUE DESEJA CALCULAR"
        Rectangle blocoTextoOQueDesejaCalcular = new Rectangle(300, 30);
        blocoTextoOQueDesejaCalcular.setX(100);
        blocoTextoOQueDesejaCalcular.setY(200);
        blocoTextoOQueDesejaCalcular.setArcHeight(10);
        blocoTextoOQueDesejaCalcular.setArcWidth(10);
        blocoTextoOQueDesejaCalcular.setFill(Color.WHITE);
        blocoTextoOQueDesejaCalcular.setStroke(Color.BLACK);
        
        Text textoOQueDesejaCalcular = new Text("O QUE DESEJA CALCULAR");
        textoOQueDesejaCalcular.setX(170);
        textoOQueDesejaCalcular.setY(220);
        textoOQueDesejaCalcular.setFill(Color.BLACK);
        textoOQueDesejaCalcular.setFont(Font.font("", 14));
        
        Rectangle blocoMovimentoVertical = new Rectangle(180, 40);
        blocoMovimentoVertical.setX(35);
        blocoMovimentoVertical.setY(250);
        blocoMovimentoVertical.setArcHeight(10);
        blocoMovimentoVertical.setArcWidth(10);
        blocoMovimentoVertical.setFill(Color.CYAN);
        blocoTextoOQueDesejaCalcular.setStroke(Color.WHITE);
        
        Text textoMovimentoVertical = new Text("Movimento Vertical");
        textoMovimentoVertical.setX(65);
        textoMovimentoVertical.setY(275);
        textoMovimentoVertical.setFill(Color.BLACK);
        textoMovimentoVertical.setFont(Font.font("", 14));
        
        Rectangle blocoMovimentoHorizontal = new Rectangle(180, 40);
        blocoMovimentoHorizontal.setX(285);
        blocoMovimentoHorizontal.setY(250);
        blocoMovimentoHorizontal.setArcHeight(10);
        blocoMovimentoHorizontal.setArcWidth(10);
        blocoMovimentoHorizontal.setFill(Color.CYAN);
        blocoTextoOQueDesejaCalcular.setStroke(Color.WHITE);
        
        Text textoMovimentoHorizontal = new Text("Movimento Horizontal");
        textoMovimentoHorizontal.setX(305);
        textoMovimentoHorizontal.setY(275);
        textoMovimentoHorizontal.setFill(Color.BLACK);
        textoMovimentoHorizontal.setFont(Font.font("", 14));

        Group abaOQueDesejaCalcular = new Group(blocoTextoOQueDesejaCalcular, textoOQueDesejaCalcular);
        
        // Configuração Botão "Tempo de Subida"
        Button botaoTempoDeSubida = new Button("Tempo de Subida");
        botaoTempoDeSubida.setLayoutX(35);
        botaoTempoDeSubida.setLayoutY(320);
        botaoTempoDeSubida.setMinWidth(180);
        botaoTempoDeSubida.setMinHeight(40);
        botaoTempoDeSubida.setStyle("-fx-base: #ffffff; ");
             
        // Configuração Botão "Tempo Total"
        Button botaoTempoTotal = new Button("Tempo Total");
        botaoTempoTotal.setLayoutX(35);
        botaoTempoTotal.setLayoutY(380);
        botaoTempoTotal.setMinWidth(180);
        botaoTempoTotal.setMinHeight(40);
        botaoTempoTotal.setStyle("-fx-base: #ffffff; ");
        
        // Configuração Botão "Altura Máxima"
        Button botaoAlturaMaxima = new Button("Altura Maxima");
        botaoAlturaMaxima.setLayoutX(35);
        botaoAlturaMaxima.setLayoutY(440);
        botaoAlturaMaxima.setMinWidth(180);
        botaoAlturaMaxima.setMinHeight(40);
        botaoAlturaMaxima.setStyle("-fx-base: #ffffff; ");
                
        // Configuração Botão "Alcance Horizontal"
        Button botaoAlcanceHorizontal = new Button("Alcance Horizontal");
        botaoAlcanceHorizontal.setLayoutX(285);
        botaoAlcanceHorizontal.setLayoutY(320);
        botaoAlcanceHorizontal.setMinWidth(180);
        botaoAlcanceHorizontal.setMinHeight(40);
        botaoAlcanceHorizontal.setStyle("-fx-base: #ffffff; ");
        
        // Configuração Botão "Voltar"
        Button voltarParaSelecaoEixos = new Button("Voltar");
        voltarParaSelecaoEixos.setLayoutX(100);
        voltarParaSelecaoEixos.setLayoutY(550);
        voltarParaSelecaoEixos.setMinWidth(300);
        voltarParaSelecaoEixos.setMinHeight(30);
        voltarParaSelecaoEixos.setStyle("-fx-base: #ffffff; ");

        Group abaSeleçãoDeCalculos = new Group(abaOQueDesejaCalcular,  blocoMovimentoVertical,
                textoMovimentoVertical, blocoMovimentoHorizontal, textoMovimentoHorizontal, 
                botaoTempoDeSubida, botaoTempoTotal, botaoAlturaMaxima, botaoAlcanceHorizontal);
        
        // Grupo Tela Principal
        Group grupoTelaSelecaoCalculo = new Group(logoViewTelaSelecaoCalculo, abaSeleçãoDeCalculos, voltarParaSelecaoEixos);
        
        // Configuração da Cena
        var telaSelecaoCalculo = new Scene(grupoTelaSelecaoCalculo,500, 600);
     
        
        /*  **********************************************   TELA ENTRADAS   ********************************************** */  
        
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
        
        Text textoExemploFormula = new Text("");
        textoExemploFormula.setX(115);
        textoExemploFormula.setY(270);
        textoExemploFormula.setFill(Color.BLACK);
        textoExemploFormula.setFont(Font.font("", 14)); 
        
        Text textoVelocidadeInicial = new Text("Velocidade Inicial (Vo) =");
        textoVelocidadeInicial.setX(115);
        textoVelocidadeInicial.setY(310);
        textoVelocidadeInicial.setFill(Color.BLACK);
        textoVelocidadeInicial.setFont(Font.font("", 14));
        
        TextField velocidadeInicial = new TextField();
        velocidadeInicial.setLayoutX(360);
        velocidadeInicial.setLayoutY(295);
        velocidadeInicial.setMinSize(40, 20);
        velocidadeInicial.setMaxSize(40, 20);
        
        Text textoAngulo = new Text("Angulo (Θ) =");
        textoAngulo.setX(115);
        textoAngulo.setY(345);
        textoAngulo.setFill(Color.BLACK);
        textoAngulo.setFont(Font.font("", 14));
        
        TextField angulo = new TextField();
        angulo.setLayoutX(360);
        angulo.setLayoutY(335);
        angulo.setMinSize(40, 20);
        angulo.setMaxSize(40, 20);
        
        Group abaEntradaDasContas= new Group(blocoEntradaDeDados, textoEntradaDeDados, textoExemploFormula, textoVelocidadeInicial,
                velocidadeInicial, textoAngulo, angulo);
        
        Text textoGravidade10 = new Text("ATENÇÃO: Gravidade(g) = 10 para todos os resultados");
        textoGravidade10.setX(80);
        textoGravidade10.setY(550);
        textoGravidade10.setFill(Color.BLACK);
        textoGravidade10.setFont(Font.font("", 14));
        
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
        Group grupoTelaEntradaDeDados = new Group(logoViewTelaEntradaDeDados, abaEntradaDasContas, botaoEfetuarCalculo, botaoCancelar, textoGravidade10);
        
        // Configuração da Cena
        var telaEntradaDeDados = new Scene(grupoTelaEntradaDeDados, 500, 600);
        
        
        /*  **********************************************   TELA RESULTADOS   ********************************************** */  
        
        Group grupoTelaResultados = new Group();
        var telaResultados = new Scene (grupoTelaResultados, 1200, 600);
        
        
        
        
        
        
        /*  **********************************************   CONFIGURAÇÃO DE FUNCIONALIDADES DE BOTÕES   ********************************************** */
                
        EventHandler<ActionEvent> abrirSelecaoDeCalculoEixoX = (ActionEvent e) -> {
            calculo.setQualEixo(1);
            stage.setScene(telaSelecaoCalculo);
        };
        
        EventHandler<ActionEvent> abrirSelecaoDeCalculoEixoY = (ActionEvent e) -> {
            calculo.setQualEixo(2);
            stage.setScene(telaSelecaoCalculo);
        };

        // Funcionalidade para Abrir a tela Seleção de Eixos
        EventHandler<ActionEvent> abrirTelaSelecaoEixo = (ActionEvent e) -> {
            stage.setScene(telaSelecaoDeEixo);
        };
        
        // Funcionalidade para Abrir a Tela Principal
        EventHandler<ActionEvent> abrirTelaSelecaoCalculo = (ActionEvent e) -> {
            stage.setScene(telaSelecaoCalculo);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosTempoDeSubida = (ActionEvent e) -> {
            if(calculo.getQualEixo() == 1){
                textoExemploFormula.setText("ts = (Vo . senΘ) / g");
            } else if (calculo.getQualEixo() == 2){
                textoExemploFormula.setText("ts = (Vo . cosΘ) / g");
            }
            calculo.setQualCalculo(1);
            stage.setScene(telaEntradaDeDados);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosTempoTotal = (ActionEvent e) -> {
            if(calculo.getQualEixo() == 1){
                textoExemploFormula.setText("t_total = 2 . (Vo . senΘ) / g");
            } else if (calculo.getQualEixo() == 2){
                textoExemploFormula.setText("t_total = 2 . (Vo . cosΘ) / g");
            }
            calculo.setQualCalculo(2);
            stage.setScene(telaEntradaDeDados);
        };
       
        EventHandler<ActionEvent> abrirEntradaCalculosAlturaMaxima = (ActionEvent e) -> {
            if(calculo.getQualEixo() == 1){
                textoExemploFormula.setText("Hmax = (Vo . senΘ)² / 2g");
            } else if (calculo.getQualEixo() == 2){
                textoExemploFormula.setText("Hmax = (Vo . cosΘ)² / 2g");
            }
            calculo.setQualCalculo(3);
            stage.setScene(telaEntradaDeDados);
        };
        
        EventHandler<ActionEvent> abrirEntradaCalculosAlcanceHorizontal = (ActionEvent e) -> {
            if(calculo.getQualEixo() == 1){
                textoExemploFormula.setText("ΔSx = Vo . cosΘ . Δt_total");
            } else if (calculo.getQualEixo() == 2){
                textoExemploFormula.setText("ΔSx = Vo . senΘ . Δt_total");
            }
            calculo.setQualCalculo(4);
            stage.setScene(telaEntradaDeDados);
        };
        
        EventHandler<ActionEvent> efetuarCalculo = (ActionEvent e) -> {
            calculo.setVelocidadeInicial(velocidadeInicial.getText());
            calculo.setAngulo(angulo.getText());
            calculo.setResultado(calculo.calcular());
            //textoResultados.setText("RESULTADO = " + calculo.getResultadoString());
            //textoExplicacao.setText(calculo.getExplicacao());
            stage.setScene(telaResultados);
        };

        
        /*  **********************************************   ATRIBUIÇÃO DE FUNCIONALIDADES DE BOTÕES   ********************************************** */
        
        botaoRelacaoHorizontal.setOnAction(abrirSelecaoDeCalculoEixoX);
        
        botaoRelacaoVertical.setOnAction(abrirSelecaoDeCalculoEixoY);
        
        botaoTempoDeSubida.setOnAction(abrirEntradaCalculosTempoDeSubida);
        
        botaoTempoTotal.setOnAction(abrirEntradaCalculosTempoTotal);
        
        botaoAlturaMaxima.setOnAction(abrirEntradaCalculosAlturaMaxima);
        
        botaoAlcanceHorizontal.setOnAction(abrirEntradaCalculosAlcanceHorizontal);
        
        voltarParaSelecaoEixos.setOnAction(abrirTelaSelecaoEixo);
        
        botaoEfetuarCalculo.setOnAction(efetuarCalculo);
        
        botaoCancelar.setOnAction(abrirTelaSelecaoCalculo);
        
        
        /*  **********************************************   SETTING DA CENA INICIAL   ********************************************** */
        stage.setScene(telaSelecaoDeEixo); 
        stage.show();  
    }

    public static void main(String[] args) {
        launch();
    }
}



/*    
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
        textoExplicacao.setY(495);
        textoExplicacao.setFill(Color.BLACK);
        textoExplicacao.setFont(Font.font("", 14));
        
        Group explicacao = new Group(blocoTextoExplicacao, textoExplicacao);
        */