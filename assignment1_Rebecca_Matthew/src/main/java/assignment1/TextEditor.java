package assignment1;

import javax.swing.*;

public class TextEditor extends JFrame {

    public TextEditor(){
        JFrame frame = new JFrame("Text Editor");
        JTextArea textArea = new JTextArea();
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu search = new JMenu("Search");
        JMenu manage = new JMenu("Manage");
        JMenu help = new JMenu("Help");

        JMenuItem fileNew = new JMenuItem("New");
        JMenuItem fileOpen = new JMenuItem("Open");
        JMenuItem fileSave = new JMenuItem("Save");

        file.add(fileNew);
        file.add(fileOpen);
        file.add(fileSave);

        // add menu to menu bar
        menuBar.add(file);
        menuBar.add(search);
        menuBar.add(manage);
        menuBar.add(help);

        textArea.setBounds(5,5,360,320);
        frame.add(menuBar);
        frame.add(textArea);
        frame.setJMenuBar(menuBar);
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {
        new TextEditor();
    }


}

