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
public class lab1_7
{
	public static void addComponentsToPane(Container pane) 
	{
		pane.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		pane.add(new JLabel("Число 1"), constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 0;
		pane.add(new JLabel("Число 2"), constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 2;
		JLabel sumLabel = new JLabel("");
		pane.add(sumLabel, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 3;
		JLabel mulLabel = new JLabel("");
		pane.add(mulLabel, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		JTextField firstTextField = new JTextField();
		pane.add(firstTextField, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		JTextField secondTextField = new JTextField();
		pane.add(secondTextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		JButton summButton = new JButton("Сложить");
		summButton.setPreferredSize(new Dimension(10, 20));
		pane.add(summButton, constraints);
		
		summButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer first = Integer.parseInt(firstTextField.getText());
				Integer second = Integer.parseInt(secondTextField.getText());
				
				int x=first+second;
				
				sumLabel.setText("" + x);
			}
		});
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		JButton mulButton = new JButton("Умножить");
		mulButton.setPreferredSize(new Dimension(10, 20));
		pane.add(mulButton, constraints);
		
		mulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer first = Integer.parseInt(firstTextField.getText());
				Integer second = Integer.parseInt(secondTextField.getText());
				
				int x=first*second;
				
				mulLabel.setText("" + x);
			}
		});
	}
	
		private static void createAndShowGUI() 
		{
			JFrame frame = new JFrame("Calculating");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 110);
			frame.setResizable(false);
		
			addComponentsToPane(frame.getContentPane());
			frame.setVisible(true);
		}
		
		public static void main(String[] args) 
		{
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					createAndShowGUI();
				}
			});
		}
}