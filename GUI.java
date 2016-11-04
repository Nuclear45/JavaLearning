package selfProject.calc;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame
{
    JButton button1 = new JButton("1");   // создание кнопок
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPl = new JButton("+");
    JButton buttonMn = new JButton("-");
    JButton zero = new JButton("0");
    JButton division =  new JButton("/");
    JButton multi = new JButton("*");
    JButton clear = new JButton("Clear");

    JTextField textArea = new JTextField(10); // создание текстового окна

    void creatureButton (JButton button, int x, int y, int weight, int height ){// метод для локализации кнопки
        button.setBounds(x,y,weight,height);
        add(button);
    }
    public GUI(){
        super("Калькулятор");
        setLayout(null);

        creatureButton(button1, 0,271,41,41 );
        creatureButton(button2, 41,271,41,41);
        creatureButton(button3, 82,271,41,41);
        creatureButton(button4, 0,230,41,41);
        creatureButton(button5, 41,230,41,41);
        creatureButton(button6,82,230, 41, 41);
        creatureButton(button7,0, 189, 41,41);
        creatureButton(button8, 41, 189, 41,41);
        creatureButton(button9, 82, 189, 41,41);
        creatureButton(buttonPl, 164, 230, 41,82);
        creatureButton(buttonMn, 164, 189, 41,41);
        creatureButton(zero,123, 271, 41,41);
        creatureButton(multi, 123, 230, 41, 41);
        creatureButton(division, 123, 189, 41, 41);
        creatureButton(clear, 0, 147, 210, 41);
        add(textArea);
        textArea.setBounds(0, 50, 205, 40);
    }

   private void action(){

   }

 public static void main(String args[]){
     GUI gui = new GUI();
     gui.setSize(210,340);
     gui.setVisible(true);
     gui.setResizable(false);
     gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
}