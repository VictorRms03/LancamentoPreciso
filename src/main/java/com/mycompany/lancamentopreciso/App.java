package com.mycompany.lancamentopreciso;

import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

/**
 * JavaFX App
 */
public class App extends Application {    
    
    @Override
    public void start(Stage stage) throws IOException {
        
        // Importa e configura visualização da logo
        Image logo = new Image(new FileInputStream("logo.PNG"));
        ImageView logoView = new ImageView(logo);
        logoView.setX(125);
        logoView.setY(-40);
        logoView.setFitHeight(300);
        logoView.setFitWidth(300);
        
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
        
        // Grupo para aba Seleção de Calculos
        Group abaSeleçãoDeCalculos = new Group(abaOQueDesejaCalcular, abaMovimentoVertical, abaMovimentoHorizontal, 
                botaoPosicaoVerticalEmFuncaoDoTempo, botaoVelocidadeVerticalEmFuncaoDoTempo, botaoTempoDeSubida, 
                botaoAlturaMaxima, botaoPosicaoHorizontalEmFuncaoDoTempo, botaoAlcanceHorizontal);
        
        // Configuração Botão "Entenda o Que é Lançamento Obliquo"
        Button botaoEntendaOQueELancamentoObliquo = new Button("Entenda O Que é Lançamento Obliquo");
        botaoEntendaOQueELancamentoObliquo.setLayoutX(550);
        botaoEntendaOQueELancamentoObliquo.setLayoutY(30);
        botaoEntendaOQueELancamentoObliquo.setMinSize(200, 40);
        
        // Configuração Graficos
        Rectangle blocoGraficos = new Rectangle(600, 400);
        blocoGraficos.setX(550);
        blocoGraficos.setY(80);
        blocoGraficos.setHeight(400);
        blocoGraficos.setWidth(600);
        blocoGraficos.setFill(Color.WHITE);
        blocoGraficos.setStroke(Color.BLACK);
        blocoGraficos.setArcHeight(10);
        blocoGraficos.setArcWidth(10);
        
        Group grafico = new Group(blocoGraficos);
        
        // Configuração Texto "Resultados"
        Rectangle blocoTextoResultados = new Rectangle(300, 40);
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
        
        // Configuração Botão "Calculo Completo"
        Button botaoCalculoCompleto = new Button("Cálculo Completo");
        botaoCalculoCompleto.setLayoutX(950);
        botaoCalculoCompleto.setLayoutY(500);
        botaoCalculoCompleto.setMinSize(200, 40);
        
        // grupo tela inteira
        Group telaInteira = new Group(logoView, abaSeleçãoDeCalculos, botaoEntendaOQueELancamentoObliquo, 
                grafico, botaoCalculoCompleto, resultados);
        
        // configuração da cena
        var scene = new Scene(telaInteira,1200, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}