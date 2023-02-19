import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChoosingScreen {
    

    public ChoosingScreen() {
        // init
        JFrame frame = new JFrame("tic tac toe game");
        JPanel panelCont = new JPanel();
        JPanel panelFirst = new Board();
        JPanel panelSecond = new JPanel();
        JButton buttonOne = new JButton("switch to game");
        JButton buttonSecond = new JButton("switch to instructions");
        CardLayout cl = new CardLayout();


       
        // set up buttons
        buttonOne.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelFirst, "2");
            }

            
        });
    
        buttonSecond.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent arg0) {
            cl.show(panelCont, "1");
            }
        });

        panelCont.setLayout(cl);
        panelFirst.add(buttonOne);
        panelSecond.add(buttonSecond);
        panelFirst.setBackground(Color.WHITE);
        panelSecond.setBackground(Color.GREEN);

        panelCont.add(panelFirst,"1");
        panelCont.add(panelSecond,"2");
        panelCont.setVisible(true);


    frame.add(panelCont);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}

    
    }

    

