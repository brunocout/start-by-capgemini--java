package aula13;

import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) throws Exception {
        App window = new App();

        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("My first JFrame screen");
        //add Swing objects here
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
