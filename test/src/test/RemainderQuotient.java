package test;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class RemainderQuotient {
public static void addComponentsToPane(Container pane) {
pane.setLayout(new GridBagLayout());
GridBagConstraints constraints = new GridBagConstraints();
constraints.fill = GridBagConstraints.HORIZONTAL;
constraints.weightx = 1;

constraints.gridx = 0;
constraints.gridy = 0;
pane.add(new JLabel("�������"), constraints);
constraints.gridx = 1;
constraints.gridy = 0;
constraints.gridwidth = 2;
JTextField dividendTextField = new JTextField();
pane.add(dividendTextField, constraints);
constraints.gridx = 0;
constraints.gridy = 1;
pane.add(new JLabel("��������"), constraints);

constraints.gridx = 1;
constraints.gridy = 1;
constraints.gridwidth = 2;
JTextField dividerTextField = new JTextField();
pane.add(dividerTextField, constraints);
constraints.gridx = 4;
constraints.gridy = 1;
JButton calculateButton = new JButton("��������");
calculateButton.setPreferredSize(new Dimension(75, 20));
pane.add(calculateButton, constraints);
constraints.gridx = 0;
constraints.gridy = 2;
JLabel quotientLabel = new JLabel("�������: ");
pane.add(quotientLabel, constraints);
constraints.gridx = 1;
constraints.gridy = 2;
constraints.gridwidth = 2;
JLabel remainderLabel = new JLabel("�������: ");
pane.add(remainderLabel, constraints);


calculateButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
Integer dividend = Integer.parseInt(dividendTextField.getText());
Integer divider = Integer.parseInt(dividerTextField.getText());
quotientLabel.setText("�������: " + dividend / divider);
remainderLabel.setText("�������: " + dividend % divider);
}
});
}
private static void createAndShowGUI() {
JFrame frame = new JFrame("Find out remainder and quotient");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(330, 90);
frame.setResizable(false);

addComponentsToPane(frame.getContentPane());
frame.setVisible(true);
}
public static void main(String[] args) {
javax.swing.SwingUtilities.invokeLater(new Runnable() {
public void run() {
createAndShowGUI();
}
});
}
}