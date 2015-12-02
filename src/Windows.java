import java.awt.EventQueue;

import javax.swing.JFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Windows {

	private JFrame frmWindows;
	private JTextField skillIDField;
	private JTextField skillNameField;
	private JTextField typeShiftName;
	private JTextField ChooseCs;
	private JTextField chooseassignmentDate;
	private JTextField chooseTime;
	
	private static DefaultListModel employeeList = new DefaultListModel();
	private static DefaultListModel skillList = new DefaultListModel();
	private static DefaultListModel csList = new DefaultListModel();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee ("Bob", "Fan", 123456);
			employeeList.addElement(e1);
			Skill skill1 = new Skill("Basic", 1);
			Skill skill2 = new Skill("Dialysis", 2);
			Skill skill3 = new Skill("Kitchen Morning", 3);
			Skill skill4 = new Skill("Kitchen Evening", 4);
			Skill skill5 = new Skill("Kitchen Help Morning", 5);
			Skill skill6 = new Skill("Kitchen Help Evening", 6);
			Skill skill7 = new Skill("AMA Kitchen Morning", 7);
		 skillList.addElement(skill1);
		 skillList.addElement(skill2);
		 skillList.addElement(skill3);
		 skillList.addElement(skill4);
		 skillList.addElement(skill5);
		 skillList.addElement(skill6);
		 skillList.addElement(skill1);
				
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
		frmWindows.setBounds(150, 150, 700, 700);
		frmWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindows.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmWindows.getContentPane().add(tabbedPane);
		
	// Work schedule tab		
		JPanel wsPanel = new JPanel();
		tabbedPane.addTab("Work Schedule", null, wsPanel, null);
		wsPanel.setLayout(null);
		
		// list containing all shifts
		JList workschedulelist = new JList();
		workschedulelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		workschedulelist.setBounds(153, 106, 273, 180);
		wsPanel.add(workschedulelist);
		
		JLabel lblWorkSchedule = new JLabel("Work schedule");
		lblWorkSchedule.setBounds(50, 21, 99, 14);
		wsPanel.add(lblWorkSchedule);
		
		JScrollPane scrollPane = new JScrollPane(workschedulelist);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(78, 68, 347, 207);
		wsPanel.add(scrollPane);
		
		
	// Employee tab
		
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employee", null, empPanel, null);
		empPanel.setLayout(null);
		
		JList listOfEmp = new JList(employeeList);
		listOfEmp.setBounds(32, 39, 185, 137);
		empPanel.add(listOfEmp);
		
		JScrollPane scrollListEmployee = new JScrollPane(listOfEmp);
		scrollListEmployee.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollListEmployee .setBounds(32, 38, 202, 133);
		empPanel.add(scrollListEmployee );
		
		// list showing information about employee
		JList infoOfEmployeesList = new JList();
		
		infoOfEmployeesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		infoOfEmployeesList.setBounds(282, 34, 185, 137);
		empPanel.add(infoOfEmployeesList);
		
		JScrollPane scrollListEmployeeInfo = new JScrollPane(infoOfEmployeesList);
		scrollListEmployeeInfo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollListEmployeeInfo .setBounds(267, 38, 202, 133);
		empPanel.add(scrollListEmployeeInfo );
		
		
		// edit employee
		
		JButton editemployee = new JButton("Edit");
		editemployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
			}
		});
		editemployee.setBounds(38, 182, 89, 23);
		empPanel.add(editemployee);
		
		//Deleting employee String
		
		JButton Deleteemployee = new JButton("Delete");
		Deleteemployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// when button clicked, create new String that has selected string and delete it.
				String tempEmp = (String) listOfEmp.getSelectedValue();
				employeeList.removeElement(tempEmp);
				
			}
		});
		Deleteemployee.setBounds(137, 182, 89, 23);
		empPanel.add(Deleteemployee);
		
		JEditorPane nameOfEmployee = new JEditorPane();
		nameOfEmployee.setBounds(97, 232, 106, 20);
		empPanel.add(nameOfEmployee);
		
		JEditorPane lastName = new JEditorPane();
		lastName.setBounds(97, 266, 106, 20);
		empPanel.add(lastName);
		
		JEditorPane phoneNumber = new JEditorPane();
		phoneNumber.setBounds(97, 296, 106, 20);
		empPanel.add(phoneNumber);
		
		
		//Saving Employee to the STRING!!!!!
		
		JButton Saveemployeeinfo = new JButton("Save");
		Saveemployeeinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// creating new strings that captures text field value
				String employeeName = nameOfEmployee.getText();
				String surname = lastName.getText();
				// making sure that input is only int
				int number = Integer.parseInt( phoneNumber.getText());
			Employee e3 = new Employee (employeeName, surname, number);
			employeeList.addElement(e3);
			
			}
		});
		Saveemployeeinfo.setBounds(383, 311, 89, 23);
		empPanel.add(Saveemployeeinfo);
		
		
		// skills to for the employee
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
		
		
		
		
		
	// Skill Tab	
		JPanel skillPanel = new JPanel();
		tabbedPane.addTab("Skill", null, skillPanel, null);
		skillPanel.setLayout(null);
		
		JList listOfSkills = new JList(skillList);
		listOfSkills.setBounds(70, 49, 350, 158);
		skillPanel.add(listOfSkills);
		
		JScrollPane scrollPane_1 = new JScrollPane(listOfSkills);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(57, 38, 380, 167);
		skillPanel.add(scrollPane_1);
		
	
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String tempSkill = (String) listOfSkills.getSelectedValue();
				skillList.removeElement(tempSkill);
	
			}
		});
		btnDelete.setBounds(348, 210, 89, 23);
		skillPanel.add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(249, 210, 89, 23);
		skillPanel.add(btnEdit);
		
		skillIDField = new JTextField();
		skillIDField.setBounds(121, 252, 86, 20);
		skillPanel.add(skillIDField);
		skillIDField.setColumns(10);
		
		skillNameField = new JTextField();
		skillNameField.setBounds(121, 282, 86, 20);
		skillPanel.add(skillNameField);
		skillNameField.setColumns(10);
		
		JLabel lblSkillId = new JLabel("Skill ID");
		lblSkillId.setBounds(70, 255, 46, 14);
		skillPanel.add(lblSkillId);
		
		JLabel lblSkillName = new JLabel("Skill name");
		lblSkillName.setBounds(70, 285, 46, 14);
		skillPanel.add(lblSkillName);
		
		
		//Save a skill
		
				
		JButton btnSaveSkill = new JButton("Save");
		btnSaveSkill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int skillIDnumber = Integer.parseInt( skillIDField.getText());
				String skillsname = skillNameField.getText();
				
			Skill tempSkill = new Skill (skillsname, skillIDnumber);
			skillList.addElement(tempSkill);
				
			}
		});
		
		btnSaveSkill.setBounds(348, 310, 89, 23);
		skillPanel.add(btnSaveSkill);
		
		
		
	
	// Assignment tab	
		JPanel assigPanel = new JPanel();
		tabbedPane.addTab("Assignment", null, assigPanel, null);
		assigPanel.setLayout(null);
		
		JScrollBar scrollBar_5 = new JScrollBar();
		scrollBar_5.setBounds(216, 249, 17, 20);
		assigPanel.add(scrollBar_5);
		
		JList shiftList = new JList();
		shiftList.setBounds(37, 11, 193, 162);
		assigPanel.add(shiftList);
		
		JScrollPane scrollPane_2 = new JScrollPane(shiftList);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(37, 11, 205, 162);
		assigPanel.add(scrollPane_2);
		
		JList shiftInformationList = new JList();
		shiftInformationList.setBounds(288, 11, 193, 162);
		assigPanel.add(shiftInformationList);
		
		JScrollPane scrollPane_3 = new JScrollPane(shiftInformationList);
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setBounds(480, 172, -190, -158);
		assigPanel.add(scrollPane_3);
		
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
		
	
		
		
		
		
	// Cleaning schedule tab	
		JPanel csPanel = new JPanel();
		tabbedPane.addTab("Cleaning Schedule", null, csPanel, null);
		csPanel.setLayout(null);
		
		JButton DeleteCS = new JButton("Delete");
		DeleteCS.setBounds(347, 151, 89, 23);
		csPanel.add(DeleteCS);
		
		JButton EditCS = new JButton("Edit");
		EditCS.setBounds(250, 151, 89, 23);
		csPanel.add(EditCS);
		
		//List containing all cleaning schedules 
		JList ListOfCS = new JList();
		ListOfCS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListOfCS.setBounds(39, 33, 89, 49);
		csPanel.add(ListOfCS);
		JScrollPane scrollPane_4 = new JScrollPane(ListOfCS);
		scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_4.setBounds(49, 33, 387, 107);
		csPanel.add(scrollPane_4);
		
		JEditorPane csIdField = new JEditorPane();
		csIdField.setBounds(82, 182, 106, 20);
		csPanel.add(csIdField);
		
		JEditorPane csNameField = new JEditorPane();
		csNameField.setBounds(82, 214, 106, 20);
		csPanel.add(csNameField);
		
		//check boxes for the required skill to the cleaning schedule
		
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
		
		
	
		frmWindows.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmWindows.getContentPane()}));
	}
}
