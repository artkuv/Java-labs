package divmod;
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
public class lab1_11 
{
	public static void addComponentsToPane(Container pane) 
	{
		pane.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		pane.add(new JLabel("x+"), constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		JTextField addedTextField = new JTextField();
		pane.add(addedTextField, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 0;
		pane.add(new JLabel("="), constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		JTextField resultTextField = new JTextField();
		pane.add(resultTextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		pane.add(new JLabel("Начало интервала"), constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 3;
		JTextField startTextField = new JTextField();
		pane.add(startTextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		pane.add(new JLabel("Конец интервала"), constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 3;
		JTextField endTextField = new JTextField();
		pane.add(endTextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		JLabel sqrLabel = new JLabel("Корень: ");
		pane.add(sqrLabel, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 3;
		JButton calculateButton = new JButton("Подобрать корень");
		calculateButton.setPreferredSize(new Dimension(75, 20));
		pane.add(calculateButton, constraints);
		
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer added = Integer.parseInt(addedTextField.getText());
				Integer result = Integer.parseInt(resultTextField.getText());
				Integer start = Integer.parseInt(startTextField.getText());
				Integer end = Integer.parseInt(endTextField.getText());
				
				int x=result-added;
				
				sqrLabel.setText("Корень: " + x);

				if(x<start || x>end)
				{
					constraints.gridx = 1;
					constraints.gridy = 3;
					JLabel error = new JLabel("Invalid values");
					pane.add(error, constraints);
				}
			}
		});
	}
	
		private static void createAndShowGUI() 
		{
			JFrame frame = new JFrame("Solve equation");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(330, 120);
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