import java.awt.EventQueue;

import javax.swing.JFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollBar;

public class Windows {

	private JFrame frmWindows;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows window = new Windows();
					window.frmWindows.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Windows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWindows = new JFrame();
		frmWindows.setTitle("Windows");
		frmWindows.setBounds(100, 100, 530, 424);
		frmWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindows.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmWindows.getContentPane().add(tabbedPane);
		
		JPanel wsPanel = new JPanel();
		tabbedPane.addTab("Work Schedule", null, wsPanel, null);
		wsPanel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(50, 46, 310, 240);
		wsPanel.add(list);
		
		JLabel lblWorkSchedule = new JLabel("Work schedule");
		lblWorkSchedule.setBounds(50, 21, 99, 14);
		wsPanel.add(lblWorkSchedule);
		
				
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employee", null, empPanel, null);
		empPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(34, 48, 46, 14);
		empPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(124, 45, 86, 20);
		empPanel.add(textField);
		textField.setColumns(10);
		
		JPanel csPanel = new JPanel();
		tabbedPane.addTab("Cleaning Schedule", null, csPanel, null);
		csPanel.setLayout(null);
		
		JPanel assigPanel = new JPanel();
		tabbedPane.addTab("Assignment", null, assigPanel, null);
		assigPanel.setLayout(null);
		
		JPanel skillPanel = new JPanel();
		tabbedPane.addTab("Skill", null, skillPanel, null);
		skillPanel.setLayout(null);
		
		JList list_1 = new JList();
		list_1.setBounds(70, 49, 367, 158);
		skillPanel.add(list_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(348, 210, 89, 23);
		skillPanel.add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(249, 210, 89, 23);
		skillPanel.add(btnEdit);
		
		JLabel lblAddSkill = new JLabel("Add/edit skill");
		lblAddSkill.setBounds(70, 247, 65, 14);
		skillPanel.add(lblAddSkill);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 268, 86, 20);
		skillPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(70, 299, 86, 20);
		skillPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSkillId = new JLabel("Skill ID");
		lblSkillId.setBounds(166, 271, 46, 14);
		skillPanel.add(lblSkillId);
		
		JLabel lblSkillName = new JLabel("Skill name");
		lblSkillName.setBounds(166, 302, 46, 14);
		skillPanel.add(lblSkillName);
		
		JButton btnAdd = new JButton("Add/edit");
		btnAdd.setBounds(123, 330, 89, 23);
		skillPanel.add(btnAdd);
	
		frmWindows.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmWindows.getContentPane()}));
	}
}
