import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class lab1_5 
{
	public static void addComponentsToPane(Container pane) 
	{
		pane.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		JTextField TextField = new JTextField();
		pane.add(TextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		JButton minus1Button = new JButton("-1");
		minus1Button.setPreferredSize(new Dimension(10, 20));
		pane.add(minus1Button, constraints);
		
		minus1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer x = Integer.parseInt(TextField.getText());
				x--;
				TextField.setText("" + x);
			}
		});
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		JButton minus10Button = new JButton("-10");
		minus10Button.setPreferredSize(new Dimension(10, 20));
		pane.add(minus10Button, constraints);
		
		minus10Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer x = Integer.parseInt(TextField.getText());
				x-=10;
				TextField.setText("" + x);
			}
		});
		
		constraints.gridx = 3;
		constraints.gridy = 0;
		JButton plus1Button = new JButton("+1");
		plus1Button.setPreferredSize(new Dimension(10, 20));
		pane.add(plus1Button, constraints);
		
		plus1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer x = Integer.parseInt(TextField.getText());
				x++;
				TextField.setText("" + x);
			}
		});
		
		constraints.gridx = 3;
		constraints.gridy = 1;
		JButton plus10Button = new JButton("+10");
		plus10Button.setPreferredSize(new Dimension(10, 20));
		pane.add(plus10Button, constraints);
		
		plus10Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Integer x = Integer.parseInt(TextField.getText());
				x+=10;
				TextField.setText("" + x);
			}
		});
		
		
	}
	
		private static void createAndShowGUI() 
		{
			JFrame frame = new JFrame("Counter");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 90);
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