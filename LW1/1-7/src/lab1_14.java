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

public class lab1_14 {
	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;

		constraints.gridx = 0;
		constraints.gridy = 0;
		pane.add(new JLabel("год"), constraints);

		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 3;
		JTextField telTextField = new JTextField();
		pane.add(telTextField, constraints);
		
		constraints.gridx = 5;
		constraints.gridy = 0;
		JLabel kolLabel = new JLabel("Количество дней");
		pane.add(kolLabel, constraints);

		constraints.gridx = 5;
		constraints.gridy = 1;
		JLabel visLabel = new JLabel("Високосный");
		pane.add(visLabel, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 5;
		JButton podelitButton = new JButton("Проверить");
		podelitButton.setPreferredSize(new Dimension(15, 20));
		pane.add(podelitButton, constraints);

		podelitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer year = Integer.parseInt(telTextField.getText());
				String condition = "Нет";
				int kolvo = 365;
				
				if((year%4)==0) {
					condition = "Да";
					kolvo=366;
				}
				
				visLabel.setText("Високосный " + condition);
				kolLabel.setText("Количество дней " + kolvo);
			}
		});
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Years");
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