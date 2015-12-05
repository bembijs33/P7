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
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JPopupMenu;

public class Windows {

	private JFrame frmWindows;
	private JTextField skillIDField;
	private JTextField skillNameField;
	private JTextField typeShiftName;
	private JTextField chooseassignmentDate;
	private JTextField chooseTime;
	
	
	private static DefaultListModel<Employee> employeeList = new DefaultListModel<Employee>();
	private static DefaultListModel<Skill> skillList = new DefaultListModel<Skill>();
	private static DefaultListModel<CleaningSchedule> csList = new DefaultListModel<CleaningSchedule>();

	

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
			skillList.addElement(skill7);
				
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
		frmWindows.setBounds(150, 150, 700, 600);
		frmWindows.setResizable(false);
		frmWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindows.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		frmWindows.setResizable(false); // Does that the frame cannot maximize or change size in any way. 
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmWindows.getContentPane().add(tabbedPane);
		
	// Work schedule tab		
		JPanel wsPanel = new JPanel();
		tabbedPane.addTab("Work Schedule", null, wsPanel, null);
		wsPanel.setLayout(null);
		
		// list containing all shifts
		JList workschedulelist = new JList();
		workschedulelist.setFont(new Font("Tahoma", Font.BOLD, 15));
		workschedulelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		workschedulelist.setBounds(10, 0, 273, 180);
		wsPanel.add(workschedulelist);
		
		JLabel lblWorkSchedule = new JLabel("Work schedule");
		lblWorkSchedule.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWorkSchedule.setBounds(60, 21, 116, 14);
		wsPanel.add(lblWorkSchedule);
		
		JScrollPane scrollPane = new JScrollPane(workschedulelist);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(60, 46, 550, 400);
		wsPanel.add(scrollPane);
		
		
		
		
		
	// Skill Tab	
		JPanel skillPanel = new JPanel();
		tabbedPane.addTab("Skill", null, skillPanel, null);
		skillPanel.setLayout(null);
		
		JList listOfSkills = new JList(skillList);
		listOfSkills.setBounds(70, 49, 350, 158);
		skillPanel.add(listOfSkills);
		
		JScrollPane scrollPane_1 = new JScrollPane(listOfSkills);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(57, 38, 566, 167);
		skillPanel.add(scrollPane_1);
		
	
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Skill tempSkill = (Skill) listOfSkills.getSelectedValue();
				skillList.removeElement(tempSkill);
	
			}
		});
		btnDelete.setBounds(152, 217, 89, 23);
		skillPanel.add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(57, 217, 89, 23);
		skillPanel.add(btnEdit);
		
		skillIDField = new JTextField();
		skillIDField.setBounds(123, 254, 86, 20);
		skillPanel.add(skillIDField);
		skillIDField.setColumns(10);
		
		skillNameField = new JTextField();
		skillNameField.setBounds(123, 282, 86, 20);
		skillPanel.add(skillNameField);
		skillNameField.setColumns(10);
		
		JLabel lblSkillId = new JLabel("Skill ID");
		lblSkillId.setBounds(57, 257, 46, 14);
		skillPanel.add(lblSkillId);
		
		JLabel lblSkillName = new JLabel("Skill name");
		lblSkillName.setBounds(57, 285, 76, 14);
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
		
		btnSaveSkill.setBounds(123, 313, 86, 23);
		skillPanel.add(btnSaveSkill);
		
		JLabel lblSkillList = new JLabel("Skill list");
		lblSkillList.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSkillList.setBounds(57, 13, 167, 14);
		skillPanel.add(lblSkillList);
		
		
	// Employee tab
		
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employee", null, empPanel, null);
		empPanel.setLayout(null);
		
		JList listOfEmp = new JList(employeeList);
		listOfEmp.setBounds(32, 39, 185, 137);
		empPanel.add(listOfEmp);
		
		JScrollPane scrollListEmployee = new JScrollPane(listOfEmp);
		scrollListEmployee.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollListEmployee .setBounds(51, 38, 256, 237);
		empPanel.add(scrollListEmployee );
		
		// list showing information about employee
		JList infoOfEmployeesList = new JList();
		
		infoOfEmployeesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		infoOfEmployeesList.setBounds(282, 34, 185, 137);
		empPanel.add(infoOfEmployeesList);
		
		JScrollPane scrollListEmployeeInfo = new JScrollPane(infoOfEmployeesList);
		scrollListEmployeeInfo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollListEmployeeInfo .setBounds(382, 38, 248, 235);
		empPanel.add(scrollListEmployeeInfo );
		
		
		
		
		
		
		// edit employee
		
		JButton editemployee = new JButton("Edit");

		editemployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
			}
		});
		editemployee.setBounds(51, 286, 89, 23);

		empPanel.add(editemployee);
		
		
		
		
		
		
		//Deleting employee String
		
		JButton Deleteemployee = new JButton("Delete");
		Deleteemployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// 
				Employee tempEmp = (Employee) listOfEmp.getSelectedValue();
				employeeList.removeElement(tempEmp);
				
			}
		});
		Deleteemployee.setBounds(148, 286, 89, 23);
		empPanel.add(Deleteemployee);
		
		JEditorPane nameOfEmployee = new JEditorPane();
		nameOfEmployee.setBounds(131, 329, 106, 20);
		empPanel.add(nameOfEmployee);
		
		JEditorPane lastName = new JEditorPane();
		lastName.setBounds(131, 360, 106, 20);
		empPanel.add(lastName);
		
		JEditorPane phoneNumber = new JEditorPane();
		phoneNumber.setBounds(131, 391, 106, 20);
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
		Saveemployeeinfo.setBounds(218, 490, 89, 23);
		empPanel.add(Saveemployeeinfo);
		
		
		// skills to for the employee
		JCheckBox Skill1forEmp = new JCheckBox("Skill 1");
		Skill1forEmp.setBounds(51, 434, 64, 23);
		empPanel.add(Skill1forEmp);
		
		JCheckBox Skill2forEmp = new JCheckBox("Skill 2");
		Skill2forEmp.setBounds(51, 460, 64, 23);
		empPanel.add(Skill2forEmp);
		
		JCheckBox Skill3forEmp = new JCheckBox("Skill 3");
		Skill3forEmp.setBounds(112, 434, 59, 23);
		empPanel.add(Skill3forEmp);
		
		JCheckBox Skill4forEmp = new JCheckBox("Skill 4");
		Skill4forEmp.setBounds(112, 460, 59, 23);
		empPanel.add(Skill4forEmp);
		
		JCheckBox Skill5forEmp = new JCheckBox("Skill 5");
		Skill5forEmp.setBounds(173, 434, 64, 23);
		empPanel.add(Skill5forEmp);
		
		JCheckBox Skill6forEmp = new JCheckBox("Skill 6");
		Skill6forEmp.setBounds(173, 460, 97, 23);
		empPanel.add(Skill6forEmp);
		
		JCheckBox Skill7forEmp = new JCheckBox("Skill 7");
		Skill7forEmp.setBounds(239, 434, 68, 23);
		empPanel.add(Skill7forEmp);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(51, 335, 64, 14);
		empPanel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(51, 366, 64, 14);
		empPanel.add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel("Phone ");
		lblPhoneNumber.setBounds(51, 397, 64, 14);
		empPanel.add(lblPhoneNumber);
		
		JLabel lblNewLabel_1 = new JLabel("Employee list");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(122, 13, 115, 14);
		empPanel.add(lblNewLabel_1);
		
		JLabel lblEmployeeInfo = new JLabel("Employee info");
		lblEmployeeInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmployeeInfo.setBounds(447, 13, 122, 14);
		empPanel.add(lblEmployeeInfo);
		
	
		
		
		
		
	// Cleaning schedule tab	
		JPanel csPanel = new JPanel();
		tabbedPane.addTab("Cleaning Schedule", null, csPanel, null);
		csPanel.setLayout(null);
		
		JButton DeleteCS = new JButton("Delete");
		
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Skill tempSkill = (Skill) listOfSkills.getSelectedValue();
				skillList.removeElement(tempSkill);
	
			}
		});

		
		DeleteCS.setBounds(148, 287, 89, 23);
		csPanel.add(DeleteCS);

		
		JButton EditCS = new JButton("Edit");
		EditCS.setBounds(49, 287, 89, 23);
		csPanel.add(EditCS);
		
		//List containing all cleaning schedules 
		JList ListOfCS = new JList();
		ListOfCS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListOfCS.setBounds(39, 33, 89, 49);
		csPanel.add(ListOfCS);
		JScrollPane scrollPane_4 = new JScrollPane(ListOfCS);
		scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_4.setBounds(49, 44, 319, 232);
		csPanel.add(scrollPane_4);
		
		JEditorPane csIdField = new JEditorPane();
		csIdField.setBounds(113, 335, 106, 20);
		csPanel.add(csIdField);
		
		JEditorPane csNameField = new JEditorPane();
		csNameField.setBounds(113, 366, 106, 20);
		csPanel.add(csNameField);
		
		//check boxes for the required skill to the cleaning schedule
		
		JCheckBox Skill1forCS = new JCheckBox("Skill 1");
		Skill1forCS.setBounds(49, 410, 62, 23);
		csPanel.add(Skill1forCS);
		
		JCheckBox Skill2forCS = new JCheckBox("Skill 2");
		Skill2forCS.setBounds(49, 436, 62, 23);
		csPanel.add(Skill2forCS);
		
		JCheckBox Skill3forCS = new JCheckBox("Skill 3");
		Skill3forCS.setBounds(111, 410, 62, 23);
		csPanel.add(Skill3forCS);
		
		JCheckBox Skill4forCS = new JCheckBox("Skill 4");
		Skill4forCS.setBounds(113, 436, 62, 23);
		csPanel.add(Skill4forCS);
		
		JCheckBox Skill5forCS = new JCheckBox("Skill 5");
		Skill5forCS.setBounds(175, 410, 62, 23);
		csPanel.add(Skill5forCS);
		
		JCheckBox Skill6forCS = new JCheckBox("Skill 6");
		Skill6forCS.setBounds(175, 436, 62, 23);
		csPanel.add(Skill6forCS);
		
		JCheckBox Skill7forCS = new JCheckBox("Skill 7");
		Skill7forCS.setBounds(237, 410, 62, 23);
		csPanel.add(Skill7forCS);
		
		JButton AddCS = new JButton("Save");
	
		
		AddCS.setBounds(279, 462, 89, 23);
		csPanel.add(AddCS);
		
		JLabel lblCsId = new JLabel("CS ID");
		lblCsId.setBounds(49, 335, 46, 14);
		csPanel.add(lblCsId);
		
		JLabel lblNewLabel = new JLabel("CS name");
		lblNewLabel.setBounds(49, 365, 54, 14);
		csPanel.add(lblNewLabel);
		
		JLabel lblCleaningSchedules = new JLabel("Cleaning schedules");
		lblCleaningSchedules.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCleaningSchedules.setBounds(49, 19, 170, 14);
		csPanel.add(lblCleaningSchedules);
		
		
		
	
	// Assignment tab	
		JPanel assigPanel = new JPanel();
		tabbedPane.addTab("Shift", null, assigPanel, null);
		assigPanel.setLayout(null);
		
		JList shiftList = new JList();
		shiftList.setBounds(37, 11, 193, 162);
		assigPanel.add(shiftList);
		
		JScrollPane scrollPane_2 = new JScrollPane(shiftList);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(56, 37, 555, 181);
		assigPanel.add(scrollPane_2);
		
		JList shiftInformationList = new JList();
		shiftInformationList.setBounds(288, 11, 193, 162);
		assigPanel.add(shiftInformationList);
		
		JScrollPane scrollPane_3 = new JScrollPane(shiftInformationList);
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setBounds(480, 172, -190, -158);
		assigPanel.add(scrollPane_3);
		
		JButton btnEdit_1 = new JButton("Edit");
		btnEdit_1.setBounds(59, 229, 89, 23);
		assigPanel.add(btnEdit_1);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.setBounds(158, 229, 89, 23);
		assigPanel.add(btnDelete_2);
		
		typeShiftName = new JTextField();
		typeShiftName.setBounds(133, 281, 86, 20);
		assigPanel.add(typeShiftName);
		typeShiftName.setColumns(10);
		
		chooseassignmentDate = new JTextField();
		chooseassignmentDate.setToolTipText("");
		chooseassignmentDate.setBounds(133, 343, 86, 20);
		assigPanel.add(chooseassignmentDate);
		chooseassignmentDate.setColumns(10);
		
		chooseTime = new JTextField();
		chooseTime.setBounds(133, 375, 86, 20);
		assigPanel.add(chooseTime);
		chooseTime.setColumns(10);
		
		JButton btnAddShift = new JButton("Save");
		btnAddShift.setBounds(249, 374, 89, 23);
		assigPanel.add(btnAddShift);
		
		JLabel lblShiftName = new JLabel("Shift name");
		lblShiftName.setBounds(56, 284, 67, 14);
		assigPanel.add(lblShiftName);
		
		JLabel lblChooseCs = new JLabel("Choose CS");
		lblChooseCs.setBounds(56, 315, 77, 14);
		assigPanel.add(lblChooseCs);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(56, 346, 46, 14);
		assigPanel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(56, 378, 46, 14);
		assigPanel.add(lblTime);
		
		JLabel lblShifts = new JLabel("Shifts");
		lblShifts.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblShifts.setBounds(56, 12, 58, 14);
		assigPanel.add(lblShifts);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(133, 312, 86, 20);
		assigPanel.add(comboBox);
		frmWindows.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmWindows.getContentPane()}));
	}


	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

