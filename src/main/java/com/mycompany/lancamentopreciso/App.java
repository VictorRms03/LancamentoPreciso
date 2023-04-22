package com.mycompany.lancamentopreciso;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
        InputStream inputLogo = new FileInputStream("logo.PNG");
        Image logo = new Image(inputLogo);
        ImageView logoView = new ImageView();
        logoView.setImage(logo);
        logoView.setX(185);
        logoView.setY(30);
        
        // Texto "O QUE DESEJA CALCULAR"
        Rectangle blocoTextoOQueDesejaCalcular = new Rectangle(120, 200, 300, 30);
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
        
        // Texto "Movimento Vertical"
        Rectangle blocoTextoMovimentoVertical = new Rectangle(40, 250, 180, 40);
        blocoTextoMovimentoVertical.setArcHeight(10);
        blocoTextoMovimentoVertical.setArcWidth(10);
        blocoTextoMovimentoVertical.setFill(Color.TURQUOISE);
        
        Text textoMovimentoVertical = new Text("Movimento Vertical");
        textoMovimentoVertical.setX(68);
        textoMovimentoVertical.setY(275);
        textoMovimentoVertical.setFill(Color.BLACK);
        textoMovimentoVertical.setFont(Font.font("Orbitron", 14));
        
        Group abaMovimentoVertical = new Group(blocoTextoMovimentoVertical, textoMovimentoVertical);
        
        // Texto "Movimento Horizontal"
        Rectangle blocoTextoMovimentoHorizontal = new Rectangle(290, 250, 180, 40);
        blocoTextoMovimentoHorizontal.setArcHeight(10);
        blocoTextoMovimentoHorizontal.setArcWidth(10);
        blocoTextoMovimentoHorizontal.setFill(Color.TURQUOISE);
        
        Text textoMovimentoHorizontal = new Text("Movimento Horizontal");
        textoMovimentoHorizontal.setX(312);
        textoMovimentoHorizontal.setY(275);
        textoMovimentoHorizontal.setFill(Color.BLACK);
        textoMovimentoHorizontal.setFont(Font.font("Orbitron", 14));
        
        Group abaMovimentoHorizontal = new Group(blocoTextoMovimentoHorizontal, textoMovimentoHorizontal);
        
        // Botão "Posição Vertical em Função do Tempo"
        Button botaoPosicaoVerticalEmFuncaoDoTempo = new Button("Posiçao Vertical em Função do Tempo");
        botaoPosicaoVerticalEmFuncaoDoTempo.setLayoutX(10);
        botaoPosicaoVerticalEmFuncaoDoTempo.setLayoutY(310);
        botaoPosicaoVerticalEmFuncaoDoTempo.setMinWidth(235);
        
        // Botão "Velocidade Vertical em Função do Tempo"
        Button botaoVelocidadeVerticalEmFuncaoDoTempo = new Button("Velocidade Vertical em Função do Tempo");
        botaoVelocidadeVerticalEmFuncaoDoTempo.setLayoutX(10);
        botaoVelocidadeVerticalEmFuncaoDoTempo.setLayoutY(360);
        botaoVelocidadeVerticalEmFuncaoDoTempo.setMinWidth(235);
        
        // Botão "Tempo de Subida"
        Button botaoTempoDeSubida = new Button("Tempo de Subida");
        botaoTempoDeSubida.setLayoutX(10);
        botaoTempoDeSubida.setLayoutY(410);
        botaoTempoDeSubida.setMinWidth(235);
        
        // Botão "Altura Máxima"
        Button botaoAlturaMaxima = new Button("Altura Maxima");
        botaoAlturaMaxima.setLayoutX(10);
        botaoAlturaMaxima.setLayoutY(460);
        botaoAlturaMaxima.setMinWidth(235);

        // Botão "Posição Horizontal em Função do Tempo"
        Button botaoPosicaoHorizontalEmFuncaoDoTempo = new Button("Posiçao Horizontal em Função do Tempo");
        botaoPosicaoHorizontalEmFuncaoDoTempo.setLayoutX(270);
        botaoPosicaoHorizontalEmFuncaoDoTempo.setLayoutY(310);
        botaoPosicaoHorizontalEmFuncaoDoTempo.setMinWidth(235);
        
        // Botão "Alcance Horizontal"
        Button botaoAlcanceHorizontal = new Button("Alcance Horizontal");
        botaoAlcanceHorizontal.setLayoutX(270);
        botaoAlcanceHorizontal.setLayoutY(360);
        botaoAlcanceHorizontal.setMinWidth(235);

        
        // Grupo para aba Seleção de Calculos
        Group abaSeleçãoDeCalculos = new Group(abaOQueDesejaCalcular, abaMovimentoVertical, abaMovimentoHorizontal, 
                botaoPosicaoVerticalEmFuncaoDoTempo, botaoVelocidadeVerticalEmFuncaoDoTempo, botaoTempoDeSubida, 
                botaoAlturaMaxima, botaoPosicaoHorizontalEmFuncaoDoTempo, botaoAlcanceHorizontal);
        
        // grupo tela inteira
        Group telaInteira = new Group(logoView, abaSeleçãoDeCalculos);
        
        // configuração da cena
        var scene = new Scene(telaInteira,1200, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}