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
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class Windows {

	private JFrame frmWindows;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtShiftName;
	private JTextField txtChooseCs;
	private JTextField txtDate;
	private JTextField txtTime;

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
		
		JPanel csPanel = new JPanel();
		tabbedPane.addTab("Cleaning Schedule", null, csPanel, null);
		csPanel.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(435, 33, 17, 107);
		csPanel.add(scrollBar);
		
		JButton DeleteCS = new JButton("Delete");
		DeleteCS.setBounds(347, 151, 89, 23);
		csPanel.add(DeleteCS);
		
		JButton EditCS = new JButton("Edit");
		EditCS.setBounds(250, 151, 89, 23);
		csPanel.add(EditCS);
		
		JList ListOfCS = new JList();
		ListOfCS.setBounds(39, 33, 397, 107);
		csPanel.add(ListOfCS);
		
		JEditorPane dtrpnCsId = new JEditorPane();
		dtrpnCsId.setText("CS ID");
		dtrpnCsId.setBounds(39, 209, 106, 20);
		csPanel.add(dtrpnCsId);
		
		JEditorPane dtrpnCsName = new JEditorPane();
		dtrpnCsName.setText("CS name");
		dtrpnCsName.setBounds(39, 234, 106, 20);
		csPanel.add(dtrpnCsName);
		
		JCheckBox Skill1forCS = new JCheckBox("Skill 1");
		Skill1forCS.setBounds(39, 261, 62, 23);
		csPanel.add(Skill1forCS);
		
		JCheckBox Skill2forCS = new JCheckBox("Skill 2");
		Skill2forCS.setBounds(39, 287, 62, 23);
		csPanel.add(Skill2forCS);
		
		JCheckBox Skill3forCS = new JCheckBox("Skill 3");
		Skill3forCS.setBounds(39, 313, 62, 23);
		csPanel.add(Skill3forCS);
		
		JCheckBox Skill4forCS = new JCheckBox("Skill 4");
		Skill4forCS.setBounds(103, 261, 62, 23);
		csPanel.add(Skill4forCS);
		
		JCheckBox Skill5forCS = new JCheckBox("Skill 5");
		Skill5forCS.setBounds(103, 287, 97, 23);
		csPanel.add(Skill5forCS);
		
		JCheckBox Skill6forCS = new JCheckBox("Skill 6");
		Skill6forCS.setBounds(103, 313, 97, 23);
		csPanel.add(Skill6forCS);
		
		JCheckBox Skill7forCS = new JCheckBox("Skill 7");
		Skill7forCS.setBounds(167, 261, 62, 23);
		csPanel.add(Skill7forCS);
		
		JButton AddCS = new JButton("Add cleaning schedule");
		AddCS.setBounds(39, 175, 161, 23);
		csPanel.add(AddCS);
		
				
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employee", null, empPanel, null);
		empPanel.setLayout(null);
		
		JList listofemployees = new JList();
		listofemployees.setBounds(38, 34, 199, 137);
		empPanel.add(listofemployees);
		
		JList infoofemployees = new JList();
		infoofemployees.setBounds(282, 34, 185, 137);
		empPanel.add(infoofemployees);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(238, 34, 17, 137);
		empPanel.add(scrollBar_1);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(471, 34, 17, 136);
		empPanel.add(scrollBar_2);
		
		JButton editemployee = new JButton("Edit");
		editemployee.setBounds(38, 182, 89, 23);
		empPanel.add(editemployee);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.setBounds(137, 182, 89, 23);
		empPanel.add(btnDelete_1);
		
		JEditorPane dtrpnNameOfEmployee = new JEditorPane();
		dtrpnNameOfEmployee.setText("First name ");
		dtrpnNameOfEmployee.setBounds(38, 235, 106, 20);
		empPanel.add(dtrpnNameOfEmployee);
		
		JEditorPane dtrpnSirName = new JEditorPane();
		dtrpnSirName.setText("Last name");
		dtrpnSirName.setBounds(154, 235, 106, 20);
		empPanel.add(dtrpnSirName);
		
		JEditorPane dtrpnPhoneNumber = new JEditorPane();
		dtrpnPhoneNumber.setText("Phone number");
		dtrpnPhoneNumber.setBounds(270, 235, 106, 20);
		empPanel.add(dtrpnPhoneNumber);
		
		JButton Saveemployeeinfo = new JButton("Save");
		Saveemployeeinfo.setBounds(287, 323, 89, 23);
		empPanel.add(Saveemployeeinfo);
		
		JCheckBox chckbxSkill_7 = new JCheckBox("Skill 1");
		chckbxSkill_7.setBounds(38, 269, 51, 23);
		empPanel.add(chckbxSkill_7);
		
		JCheckBox chckbxSkill_8 = new JCheckBox("Skill 2");
		chckbxSkill_8.setBounds(38, 295, 51, 23);
		empPanel.add(chckbxSkill_8);
		
		JCheckBox chckbxSkill_9 = new JCheckBox("Skill 3");
		chckbxSkill_9.setBounds(38, 323, 51, 23);
		empPanel.add(chckbxSkill_9);
		
		JCheckBox chckbxSkill_10 = new JCheckBox("Skill 4");
		chckbxSkill_10.setBounds(100, 269, 51, 23);
		empPanel.add(chckbxSkill_10);
		
		JCheckBox chckbxSkill_11 = new JCheckBox("Skill 5");
		chckbxSkill_11.setBounds(100, 295, 97, 23);
		empPanel.add(chckbxSkill_11);
		
		JCheckBox chckbxSkill_12 = new JCheckBox("Skill 6");
		chckbxSkill_12.setBounds(100, 323, 97, 23);
		empPanel.add(chckbxSkill_12);
		
		JCheckBox chckbxSkill_13 = new JCheckBox("Skill 7");
		chckbxSkill_13.setBounds(168, 269, 51, 23);
		empPanel.add(chckbxSkill_13);
		
		JPanel assigPanel = new JPanel();
		tabbedPane.addTab("Assignment", null, assigPanel, null);
		assigPanel.setLayout(null);
		
		JList shiftlist = new JList();
		shiftlist.setBounds(37, 11, 193, 162);
		assigPanel.add(shiftlist);
		
		JList shiftinformation = new JList();
		shiftinformation.setBounds(288, 11, 193, 162);
		assigPanel.add(shiftinformation);
		
		JScrollBar scrollBar_3 = new JScrollBar();
		scrollBar_3.setBounds(227, 11, 17, 158);
		assigPanel.add(scrollBar_3);
		
		JScrollBar scrollBar_4 = new JScrollBar();
		scrollBar_4.setBounds(482, 11, 17, 162);
		assigPanel.add(scrollBar_4);
		
		JButton btnEdit_1 = new JButton("Edit");
		btnEdit_1.setBounds(37, 184, 89, 23);
		assigPanel.add(btnEdit_1);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.setBounds(141, 184, 89, 23);
		assigPanel.add(btnDelete_2);
		
		txtShiftName = new JTextField();
		txtShiftName.setText("Shift name");
		txtShiftName.setBounds(40, 218, 86, 20);
		assigPanel.add(txtShiftName);
		txtShiftName.setColumns(10);
		
		txtChooseCs = new JTextField();
		txtChooseCs.setText("Choose CS");
		txtChooseCs.setBounds(37, 249, 86, 20);
		assigPanel.add(txtChooseCs);
		txtChooseCs.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setText("Date");
		txtDate.setToolTipText("");
		txtDate.setBounds(37, 280, 86, 20);
		assigPanel.add(txtDate);
		txtDate.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setText("Time");
		txtTime.setBounds(37, 311, 86, 20);
		assigPanel.add(txtTime);
		txtTime.setColumns(10);
		
		JScrollBar scrollBar_5 = new JScrollBar();
		scrollBar_5.setBounds(119, 249, 17, 18);
		assigPanel.add(scrollBar_5);
		
		JButton btnAddShift = new JButton("Add shift");
		btnAddShift.setBounds(141, 310, 89, 23);
		assigPanel.add(btnAddShift);
		
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
