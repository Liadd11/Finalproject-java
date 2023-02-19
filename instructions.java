
import javax.swing.JFrame;
import javax.swing.JTextField;

public class instructions extends JFrame{
    JFrame window = new JFrame();
    JTextField instructions = new JTextField("ברוכים הבאים למשחק איקס עיגול, המשחק הוא משחק בעל שני שחקנים כאשר שחקן אחד מוגדר כאיקס ושחקן שני כעיגול. על כל שחקן בתורו לבחור משבצת אחת בה ירצה לשים את האיקס או את העיגול והשחקן שיצליח לשים שלושה מאותו סוג בתור,שורה, או באכלסון ינצח.");
    int boardHight = 800;
    int boardWidth = 800;

    public instructions(){
        this.setDefaultCloseOperation(ABORT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLayout(null);
        this.setSize(boardWidth,boardHight);
        this.setLocationRelativeTo(null);
    

    }
    public void main(){
        this.add(instructions);
    this.add(instructions);
        this.setVisible(true);
    }
    
}

