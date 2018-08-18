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
public class lab1_30 
{
	public static void addComponentsToPane(Container pane) 
	{
		pane.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		pane.add(new JLabel("Делимое"), constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		JTextField moeTextField = new JTextField();
		pane.add(moeTextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		pane.add(new JLabel("Делитель"), constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		JTextField telTextField = new JTextField();
		pane.add(telTextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		JLabel chastLabel = new JLabel("Частное");
		pane.add(chastLabel, constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 2;
		JLabel ostLabel = new JLabel("Остаток");
		pane.add(ostLabel, constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 1;
		JButton podelitButton = new JButton("Поделить");
		podelitButton.setPreferredSize(new Dimension(15, 20));
		pane.add(podelitButton, constraints);
		
		podelitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer moe = Integer.parseInt(moeTextField.getText());
				Integer tel = Integer.parseInt(telTextField.getText());
				
				chastLabel.setText("Частное: " + moe/tel);
				ostLabel.setText("Остаток: " + moe%tel);
			}
		});
	}
	
		private static void createAndShowGUI() 
		{
			JFrame frame = new JFrame("Division");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(330, 90);
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