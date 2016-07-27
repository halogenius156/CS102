/*
 * @Author: Ege Darcin
 * 24.03.2016
 * Lab04b
 * Version 1.1
 */
//importing methods that we need
import java.awt.LayoutManager;
import java.io.PrintStream;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Lab04b
extends JFrame {
    
    public Lab04b() {
        this.setTitle("Lab04b - Balloons");
        this.setDefaultCloseOperation(3);
        BalloonsGamePanel balonPanel = new BalloonsGamePanel();
        this.add(balonPanel);
        this.pack();
        this.setVisible(true);
    }
    //running the game
    public static void main(String[] args) {
        new Lab04b();
    }
}

