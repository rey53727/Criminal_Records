import javax.swing.*;
import java.awt.*;


public class Panel1 extends mainFrame{

    JPanel panel1 = new JPanel();

    JLabel labelusern = new JLabel();
    JLabel labelpass = new JLabel();

    JTextField tfUsern = new JTextField();
    JTextField tfPass = new JTextField();

    JButton btnSubmit = new JButton();
    JButton btnCancel = new JButton();

    public Panel1()
    {
        panel1.setBackground(Color.white);
        panel1.setBounds(0, 0, getWidthFrame()/2, getHeightFrame());
        panel1.setLayout(null);

        labelusern.setBounds(50,100, 100, 50);
        labelusern.setText("User name");
        labelusern.setForeground(Color.BLACK);
        labelusern.setFont(new Font("Times New Roman", Font.BOLD, 12));

        tfUsern.setBounds(50,140, 200,20);

        labelpass.setBounds(50, 200, 100, 50);
        labelpass.setText("Password");
        labelpass.setFont(new Font("Times New Roman", Font.BOLD, 12));

        tfPass.setBounds(50,240, 200,20);

        btnSubmit.setText("Submit");
        btnSubmit.setBounds(50, 300, 100, 20);
        btnSubmit.setFocusable(false);
        btnSubmit.setBorder(BorderFactory.createEtchedBorder());

        panel1.add(tfPass);
        panel1.add(tfUsern);
        panel1.add(btnSubmit);
        panel1.add(labelusern);
        panel1.add(labelpass);

        this.frameAdd(this);

    }

}
