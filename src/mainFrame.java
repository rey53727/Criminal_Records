import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {

    private final int WIDTH = 800;
    private final int HEIGTH = 600;
    JFrame mframe = new JFrame("Criminal Records");

    JPanel panel2 = new JPanel();

   /* public int getWidthFrame()
    {
        return WIDTH;
    }*/

    public int getHeightFrame(){
        return HEIGTH;
    }

    public void frameAdd(Object pan)
    {
        mframe.add((Component) pan);
    }

    public mainFrame() {

        // User Panel 1
        Panel1 panel1 = new Panel1();

        panel2.setBackground(Color.BLUE);
        panel2.setBounds(WIDTH/2, 0, WIDTH/2, HEIGTH);
        panel2.setLayout(null);

        // the windows frame
        mframe.setSize(WIDTH, HEIGTH);
        mframe.setIconImage(new ImageIcon("City_Pho.png").getImage());
        mframe.setLayout(null);
        mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mframe.add(panel2);
        mframe.setResizable(false);
        mframe.setVisible(true);
    }

}
