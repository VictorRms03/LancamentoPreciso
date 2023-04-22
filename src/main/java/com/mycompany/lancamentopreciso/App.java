package com.mycompany.lancamentopreciso;

import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class App extends Application {    
    
    @Override
    public void start(Stage stage) throws IOException {
        
        
        
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
        
        Group grafico = new Group(blocoGraficos);
        
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


        
        /*  **********************************************   CONFIGURAÇÃO DE FUNCIONALIDADES DE BOTÕES   ********************************************** */

        // Funcionalidade para Abrir a Tela Principal
        EventHandler<ActionEvent> abrirTelaPrincipal = (ActionEvent e) -> {
            stage.setScene(telaPrincipal);
        };
        
        //Funcionalidade para Abrir a Tela De Explicações sobre Lançamento Obliquo
        EventHandler<ActionEvent> abrirTelaExplicacoes = (ActionEvent e) -> {
            stage.setScene(telaOQueELancamentoObliquo);
        };

        
        
        /*  **********************************************   ATRIBUIÇÃO DE FUNCIONALIDADES DE BOTÕES   ********************************************** */
        botaoEntendaOQueELancamentoObliquo.setOnAction(abrirTelaExplicacoes);
        botaoRetornarATelaPrincipal.setOnAction(abrirTelaPrincipal);
    
        
        
        /*  **********************************************   SETTING DA CENA INICIAL   ********************************************** */
        stage.setScene(telaPrincipal);
        stage.show();  
    }

    public static void main(String[] args) {
        launch();
    }
}