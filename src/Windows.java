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
	private JTextField typeShiftName;
	private JTextField ChooseCs;
	private JTextField chooseassignmentDate;
	private JTextField chooseTime;

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
		
		JList workschedulelist = new JList();
		workschedulelist.setBounds(50, 46, 376, 240);
		wsPanel.add(workschedulelist);
		
		JLabel lblWorkSchedule = new JLabel("Work schedule");
		lblWorkSchedule.setBounds(50, 21, 99, 14);
		wsPanel.add(lblWorkSchedule);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(424, 46, 17, 240);
		wsPanel.add(scrollBar);
		
		JPanel csPanel = new JPanel();
		tabbedPane.addTab("Cleaning Schedule", null, csPanel, null);
		csPanel.setLayout(null);
		
		JScrollBar scrollBarCSlist = new JScrollBar();
		scrollBarCSlist.setBounds(435, 33, 17, 107);
		csPanel.add(scrollBarCSlist);
		
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
		dtrpnCsId.setBounds(82, 182, 106, 20);
		csPanel.add(dtrpnCsId);
		
		JEditorPane dtrpnCsName = new JEditorPane();
		dtrpnCsName.setBounds(82, 214, 106, 20);
		csPanel.add(dtrpnCsName);
		
		JCheckBox Skill1forCS = new JCheckBox("Skill 1");
		Skill1forCS.setBounds(39, 247, 62, 23);
		csPanel.add(Skill1forCS);
		
		JCheckBox Skill2forCS = new JCheckBox("Skill 2");
		Skill2forCS.setBounds(39, 273, 62, 23);
		csPanel.add(Skill2forCS);
		
		JCheckBox Skill3forCS = new JCheckBox("Skill 3");
		Skill3forCS.setBounds(39, 299, 62, 23);
		csPanel.add(Skill3forCS);
		
		JCheckBox Skill4forCS = new JCheckBox("Skill 4");
		Skill4forCS.setBounds(103, 247, 62, 23);
		csPanel.add(Skill4forCS);
		
		JCheckBox Skill5forCS = new JCheckBox("Skill 5");
		Skill5forCS.setBounds(103, 273, 97, 23);
		csPanel.add(Skill5forCS);
		
		JCheckBox Skill6forCS = new JCheckBox("Skill 6");
		Skill6forCS.setBounds(103, 299, 97, 23);
		csPanel.add(Skill6forCS);
		
		JCheckBox Skill7forCS = new JCheckBox("Skill 7");
		Skill7forCS.setBounds(167, 247, 62, 23);
		csPanel.add(Skill7forCS);
		
		JButton AddCS = new JButton("Save");
		AddCS.setBounds(347, 299, 89, 23);
		csPanel.add(AddCS);
		
		JLabel lblCsId = new JLabel("CS ID");
		lblCsId.setBounds(39, 188, 46, 14);
		csPanel.add(lblCsId);
		
		JLabel lblNewLabel = new JLabel("CS name");
		lblNewLabel.setBounds(39, 220, 46, 14);
		csPanel.add(lblNewLabel);
		
				
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employee", null, empPanel, null);
		empPanel.setLayout(null);
		
		JList listofemployees = new JList();
		listofemployees.setBounds(38, 34, 199, 137);
		empPanel.add(listofemployees);
		
		JList infoofemployees = new JList();
		infoofemployees.setBounds(282, 34, 185, 137);
		empPanel.add(infoofemployees);
		
		JScrollBar scrollBarlistofemployees = new JScrollBar();
		scrollBarlistofemployees.setBounds(238, 34, 17, 137);
		empPanel.add(scrollBarlistofemployees);
		
		JScrollBar scrollBarinfoofemployees = new JScrollBar();
		scrollBarinfoofemployees.setBounds(471, 34, 17, 136);
		empPanel.add(scrollBarinfoofemployees);
		
		JButton editemployee = new JButton("Edit");
		editemployee.setBounds(38, 182, 89, 23);
		empPanel.add(editemployee);
		
		JButton Deleteemployee = new JButton("Delete");
		Deleteemployee.setBounds(137, 182, 89, 23);
		empPanel.add(Deleteemployee);
		
		JEditorPane dtrpnNameOfEmployee = new JEditorPane();
		dtrpnNameOfEmployee.setBounds(97, 235, 106, 20);
		empPanel.add(dtrpnNameOfEmployee);
		
		JEditorPane dtrpnSirName = new JEditorPane();
		dtrpnSirName.setBounds(97, 266, 106, 20);
		empPanel.add(dtrpnSirName);
		
		JEditorPane dtrpnPhoneNumber = new JEditorPane();
		dtrpnPhoneNumber.setBounds(97, 296, 106, 20);
		empPanel.add(dtrpnPhoneNumber);
		
		JButton Saveemployeeinfo = new JButton("Save");
		Saveemployeeinfo.setBounds(383, 311, 89, 23);
		empPanel.add(Saveemployeeinfo);
		
		JCheckBox Skill1forEmp = new JCheckBox("Skill 1");
		Skill1forEmp.setBounds(238, 232, 51, 23);
		empPanel.add(Skill1forEmp);
		
		JCheckBox Skill2forEmp = new JCheckBox("Skill 2");
		Skill2forEmp.setBounds(238, 263, 51, 23);
		empPanel.add(Skill2forEmp);
		
		JCheckBox Skill3forEmp = new JCheckBox("Skill 3");
		Skill3forEmp.setBounds(238, 296, 51, 23);
		empPanel.add(Skill3forEmp);
		
		JCheckBox Skill4forEmp = new JCheckBox("Skill 4");
		Skill4forEmp.setBounds(291, 232, 51, 23);
		empPanel.add(Skill4forEmp);
		
		JCheckBox Skill5forEmp = new JCheckBox("Skill 5");
		Skill5forEmp.setBounds(291, 263, 97, 23);
		empPanel.add(Skill5forEmp);
		
		JCheckBox Skill6forEmp = new JCheckBox("Skill 6");
		Skill6forEmp.setBounds(291, 296, 97, 23);
		empPanel.add(Skill6forEmp);
		
		JCheckBox Skill7forEmp = new JCheckBox("Skill 7");
		Skill7forEmp.setBounds(344, 232, 51, 23);
		empPanel.add(Skill7forEmp);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(41, 241, 64, 14);
		empPanel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(41, 272, 64, 14);
		empPanel.add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel("Phone #");
		lblPhoneNumber.setBounds(41, 302, 64, 14);
		empPanel.add(lblPhoneNumber);
		
		JPanel assigPanel = new JPanel();
		tabbedPane.addTab("Assignment", null, assigPanel, null);
		assigPanel.setLayout(null);
		
		JScrollBar scrollBar_5 = new JScrollBar();
		scrollBar_5.setBounds(216, 249, 17, 20);
		assigPanel.add(scrollBar_5);
		
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
		
		typeShiftName = new JTextField();
		typeShiftName.setBounds(144, 218, 86, 20);
		assigPanel.add(typeShiftName);
		typeShiftName.setColumns(10);
		
		ChooseCs = new JTextField();
		ChooseCs.setBounds(144, 249, 77, 20);
		assigPanel.add(ChooseCs);
		ChooseCs.setColumns(10);
		
		chooseassignmentDate = new JTextField();
		chooseassignmentDate.setToolTipText("");
		chooseassignmentDate.setBounds(144, 280, 86, 20);
		assigPanel.add(chooseassignmentDate);
		chooseassignmentDate.setColumns(10);
		
		chooseTime = new JTextField();
		chooseTime.setBounds(144, 311, 86, 20);
		assigPanel.add(chooseTime);
		chooseTime.setColumns(10);
		
		JButton btnAddShift = new JButton("Save");
		btnAddShift.setBounds(392, 310, 89, 23);
		assigPanel.add(btnAddShift);
		
		JLabel lblShiftName = new JLabel("Shift name");
		lblShiftName.setBounds(47, 218, 67, 14);
		assigPanel.add(lblShiftName);
		
		JLabel lblChooseCs = new JLabel("Choose CS");
		lblChooseCs.setBounds(49, 252, 77, 14);
		assigPanel.add(lblChooseCs);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(47, 283, 46, 14);
		assigPanel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(47, 314, 46, 14);
		assigPanel.add(lblTime);
		
		JPanel skillPanel = new JPanel();
		tabbedPane.addTab("Skill", null, skillPanel, null);
		skillPanel.setLayout(null);
		
		JList list_1 = new JList();
		list_1.setBounds(70, 49, 350, 158);
		skillPanel.add(list_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(348, 210, 89, 23);
		skillPanel.add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(249, 210, 89, 23);
		skillPanel.add(btnEdit);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 252, 86, 20);
		skillPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 282, 86, 20);
		skillPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSkillId = new JLabel("Skill ID");
		lblSkillId.setBounds(70, 255, 46, 14);
		skillPanel.add(lblSkillId);
		
		JLabel lblSkillName = new JLabel("Skill name");
		lblSkillName.setBounds(70, 285, 46, 14);
		skillPanel.add(lblSkillName);
		
		JButton btnAdd = new JButton("Save");
		btnAdd.setBounds(348, 310, 89, 23);
		skillPanel.add(btnAdd);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(420, 49, 17, 158);
		skillPanel.add(scrollBar_1);
	
		frmWindows.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmWindows.getContentPane()}));
	}
}
