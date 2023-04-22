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
        logoView.setX(185);
        logoView.setY(30);
        
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
        textoOQueDesejaCalcular.setFont(Font.font("Liberation Sans", 14));
        
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
        textoMovimentoVertical.setFont(Font.font("Orbitron", 14));
        
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
        textoMovimentoHorizontal.setFont(Font.font("Orbitron", 14));
        
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
        
        // grupo tela inteira
        Group telaInteira = new Group(logoView, abaSeleçãoDeCalculos, botaoEntendaOQueELancamentoObliquo);
        
        // configuração da cena
        var scene = new Scene(telaInteira,1200, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}