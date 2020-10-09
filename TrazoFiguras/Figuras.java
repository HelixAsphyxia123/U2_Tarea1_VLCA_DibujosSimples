/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrazoFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author valti
 */
public class Figuras extends JPanel {

    private JFrame ventana;
    private Container contenedor;

    public Figuras() {
        ventana = new JFrame("Dibujando formas basicas");
        ventana.setSize(800, 500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);

        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 550);

        contenedor.add(this, BorderLayout.CENTER);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /*  g.setColor(Color.red);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.gray);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        
      // trazo de rectangulos 
      g.setColor(Color.blue);
      g.drawRect(280, 50, 100, 50);
      g.fillRect(280, 110, 100, 50);
      
      // trazo de rectangulos redondeados(ovalos)
      g.setColor(Color.black);
      g.drawRoundRect(450, 50, 100, 50, 50, 50);
      g.fillRoundRect(450, 110, 100, 50, 20, 20);
      
      // trazo de circulos
      
      g.setCgolor(Color.orange);
      g.drawOval(100, 200, 80, 80);
      g.fillOval(100, 290, 50, 50);
      
      // trazo de ovalos a traves de circunferencias 
      g.setColor(Color.green);
      g.drawOval(280, 200, 80, 40);
      g.fillOval(280, 290, 40, 80);
      
      //dibujar triangulo
      g.setColor(Color.MAGENTA);
      g.drawLine(450, 300, 550, 300);
      g.drawLine(450, 300, 500, 250);
      g.drawLine(550, 300, 500, 250);
      
      // dibujo de cadenas de texto 
      g.setColor(Color.black);
      g.drawString("EJEMPLO DE TRAZO DE FIGURITAS BASIQUITAS, ASI MERO!", 200, 400);
      
      // Agregar como se traza un arco.
      g.setColor(Color.blue);
      
      //fig 1 
    g.setColor(Color.black);
    g.drawArc(550, 350, 150, 100, 0, 270);
      
      // fig 2
      g.setColor(Color.red);
    g.fillArc(400, 400, 150, 100, 0, 270);
 
      
      //Figura 1: Solo contorno
      //Figura 2: Relleno
      
      //Generar un programa que genere el dibujo que tome captura.
      //Generar un reporte, en el desarrollo describir que se esta creando. O generando
      // en el ejercicio
      //en la conclusion lo que aprendimos y las dificultades encontradas.

         */
        //Marco general
        g.setColor(Color.black);
        g.drawRoundRect(10, 10, 760, 440, 20, 20);
        //Marcos de las figuras
        g.setColor(Color.blue);
        g.drawRect(20, 20, 220, 140);

        g.setColor(Color.blue);
        g.drawRect(280, 20, 220, 140);

        g.setColor(Color.blue);
        g.drawRect(540, 20, 220, 140);

        g.setColor(Color.red);
        g.drawRect(20, 220, 220, 140);

        g.setColor(Color.red);
        g.drawRect(540, 220, 220, 140);

        g.setColor(Color.red);
        g.drawRect(280, 220, 220, 140);

        //Textos
        g.setColor(Color.black);
        g.drawString("Dibujando lineas", 80, 180);

        g.setColor(Color.black);
        g.drawString("Dibujando rectangulos ", 320, 180);

        g.setColor(Color.black);
        g.drawString("Dibujando ovalos con rectangulos", 560, 180);

        g.setColor(Color.black);
        g.drawString("Dibujando circulos", 80, 380);

        g.setColor(Color.black);
        g.drawString("Dibujando ovalos con circulos", 320, 380);

        g.setColor(Color.black);
        g.drawString("Dibujando triangulos", 560, 380);

        //Casita
        g.setColor(Color.red);
        g.drawRect(60, 60, 140, 60);

        g.setColor(Color.black);
        g.drawLine(60, 60, 130, 40);
        g.drawLine(200, 60, 130, 40);
        //Puertas
        g.drawRect(120, 80, 20, 40);
        //Caminows
        g.drawLine(80, 150, 120, 120);
        g.drawLine(90, 150, 140, 120);
        //Graficas
        g.setColor(Color.red);
        g.drawRect(300, 100, 20, 40);

        g.setColor(Color.red);
        g.drawRect(330, 90, 20, 50);

        g.setColor(Color.red);
        g.drawRect(360, 80, 20, 60);

        g.setColor(Color.red);
        g.drawRect(390, 70, 20, 70);

        g.setColor(Color.red);
        g.drawRect(420, 60, 20, 80);

        g.setColor(Color.red);
        g.drawRect(450, 50, 20, 90);
        // 3 Ovalos entrecruzados
        g.setColor(Color.orange);
        g.drawOval(580, 80, 140, 30);
        g.drawOval(630, 40, 30, 100);
        g.drawOval(605, 60, 80, 30);
        // Carita
        g.setColor(Color.orange);
        g.drawOval(90, 250, 90, 90);
        g.drawOval(115, 272, 15, 15);
        g.drawOval(140, 272, 15, 15);

        g.fillRect(121, 276, 5, 5);
        g.fillRect(145, 276, 5, 5);

        g.drawOval(122, 300, 25, 25);
        //3 rectangulos redondeados entrecruzados
        g.drawRoundRect(320, 270, 140, 50, 140, 140);
        g.drawRoundRect(350, 245, 80, 40, 80, 80);

        g.drawRoundRect(375, 235, 30, 100, 140, 140);

        //Dubujando triangulos
        g.drawLine(600, 320, 700, 320);
        g.drawLine(600, 320, 650, 280);
        g.drawLine(700, 320, 650, 280);

        g.setColor(Color.magenta);
        g.drawLine(590, 295, 615, 295);
        g.drawLine(590, 295, 590, 260);

        g.setColor(Color.magenta);
        g.drawLine(615, 295, 590, 260);

        g.drawLine(650, 280, 705, 280);
        g.drawLine(650, 280, 650, 265);
                g.setColor(Color.red);
        g.drawLine(705, 280, 650, 265);

    }

}
