package iteration_1;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Patient_Personal_Information extends JPanel {
	
	private JFrame frame;
	private JTextField txtNameField;
	private JTextField textField;
	private Patient_Auth auth;


	/**
	 * Create the panel.
	 */
	public Patient_Personal_Information(final JFrame frame,final Patient_Auth auth) {
		
		this.auth =auth;
		this.frame = frame;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{34, 21, 17, 86, 74, 50, 89, 0};
		gridBagLayout.rowHeights = new int[]{20, 23, 21, 14, 23, 23, 23, 31, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblPatientName = new JLabel("Name");
		GridBagConstraints gbc_lblPatientName = new GridBagConstraints();
		gbc_lblPatientName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPatientName.insets = new Insets(0, 0, 5, 5);
		gbc_lblPatientName.gridx = 0;
		gbc_lblPatientName.gridy = 0;
		add(lblPatientName, gbc_lblPatientName);
		
		txtNameField = new JTextField();
		GridBagConstraints gbc_txtNameField = new GridBagConstraints();
		gbc_txtNameField.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtNameField.insets = new Insets(0, 0, 5, 5);
		gbc_txtNameField.gridwidth = 3;
		gbc_txtNameField.gridx = 1;
		gbc_txtNameField.gridy = 0;
		add(txtNameField, gbc_txtNameField);
		txtNameField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.WEST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridwidth = 2;
		gbc_lblGender.gridx = 0;
		gbc_lblGender.gridy = 1;
		add(lblGender, gbc_lblGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnNewRadioButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridwidth = 2;
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 1;
		add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("F");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnNewRadioButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridwidth = 2;
		gbc_rdbtnNewRadioButton_1.gridx = 3;
		gbc_rdbtnNewRadioButton_1.gridy = 1;
		add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Date of birth");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.SOUTHWEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridwidth = 2;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblAgeFormat = new JLabel("dd/mm/yyyy");
		GridBagConstraints gbc_lblAgeFormat = new GridBagConstraints();
		gbc_lblAgeFormat.anchor = GridBagConstraints.NORTH;
		gbc_lblAgeFormat.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAgeFormat.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgeFormat.gridx = 4;
		gbc_lblAgeFormat.gridy = 2;
		add(lblAgeFormat, gbc_lblAgeFormat);
		
		JLabel lblNewLabel_1 = new JLabel("Pre-conditions :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("heart disease");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridwidth = 2;
		gbc_chckbxNewCheckBox.gridx = 2;
		gbc_chckbxNewCheckBox.gridy = 4;
		add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("diabete");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.anchor = GridBagConstraints.NORTH;
		gbc_chckbxNewCheckBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridwidth = 2;
		gbc_chckbxNewCheckBox_1.gridx = 2;
		gbc_chckbxNewCheckBox_1.gridy = 5;
		add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Aniexty");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.anchor = GridBagConstraints.NORTH;
		gbc_chckbxNewCheckBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_2.gridwidth = 2;
		gbc_chckbxNewCheckBox_2.gridx = 2;
		gbc_chckbxNewCheckBox_2.gridy = 6;
		add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Patient_Login new_login = new Patient_Login(frame,auth);
				frame.setContentPane(new_login);
				frame.revalidate();
				
			}
		});
		
		JButton btnNewButton = new JButton("done");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			/*
			 *  should have some way of saving the data here . I was thinking creating an object before 
			 *  getting to this panel. then we can get more information on to object from here . 
			 *  i will write some code or psudo-code in comments. You can try it by uncomment them.
			 *  This solution is only a reference for you.
			 */
				
		// going back to login screen after after finish the profile of patient 
				Patient_Login login = new Patient_Login(frame, auth);
				frame.setContentPane(login);
				frame.revalidate();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 8;
		add(btnNewButton, gbc_btnNewButton);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.gridx = 6;
		gbc_btnNewButton_1.gridy = 8;
		add(btnNewButton_1, gbc_btnNewButton_1);
		

	}
}
