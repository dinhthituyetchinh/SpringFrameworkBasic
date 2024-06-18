import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Test Application");
        jFrame.setContentPane(new HelloWorld().getPanelEmp());
    //  jFrame.setContentPane(new test().getJpanelParent());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setSize(900, 600);
        jFrame.setVisible(true);
    }
}