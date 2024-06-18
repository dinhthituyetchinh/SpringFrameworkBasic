import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JButton btnShow;
    private JPanel panelEmp;
    private JLabel lbl_ID;
    private JLabel lbl_Name;
    private JLabel lbl_Address;
    private JTextField txtID;
    private JTextField txtName;
    private JTextField txtAddress;

    public JPanel getPanelEmp() {
        return panelEmp;
    }

    public HelloWorld() {
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String emplID = txtID.getText();
                String emplName = txtName.getText();
                String emplAddress = txtAddress.getText();
                JOptionPane.showConfirmDialog(null, "Information: "+ emplID+", " + emplName+", "+emplAddress);
                if(JOptionPane.YES_OPTION == 0)
                {
                    System.exit(0);
                }
            }
        });
    }
}
