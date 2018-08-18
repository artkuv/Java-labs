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
public class lab1_16
{
	public static void addComponentsToPane(Container pane) 
	{		
		pane.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		JTextField TextField = new JTextField();
		pane.add(TextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		JLabel resultLabel = new JLabel("Угадайте число от 1 до 100");
		pane.add(resultLabel, constraints);
		
		JTextField xTextField = new JTextField();
		
		constraints.gridx = 2;
		constraints.gridy = 2;
		JButton newButton = new JButton("Новое");
		newButton.setPreferredSize(new Dimension(15, 20));
		pane.add(newButton, constraints);
		
		newButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int a = 0; 
			    int b = 100; 
			    int x = a + (int) (Math.random() * b);
			    
			    xTextField.setText("" + x);
				resultLabel.setText("Новое число сгенерировано");

			}
		});
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		JButton guessButton = new JButton("Угадать");
		guessButton.setPreferredSize(new Dimension(15, 20));
		pane.add(guessButton, constraints);
		
		guessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer x = Integer.parseInt(xTextField.getText());
				Integer guess = Integer.parseInt(TextField.getText());
				if(guess==x)
					resultLabel.setText("Вы угадали");
				else if(guess<x)
					resultLabel.setText("Ваше число меньше загаданного");
				else
					resultLabel.setText("Ваше число больше загаданного");

			}
		});
	}
	
		private static void createAndShowGUI() 
		{
			JFrame frame = new JFrame("Guess the number");
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