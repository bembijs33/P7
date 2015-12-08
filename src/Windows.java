import java.awt.EventQueue;

import javax.swing.JFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;


public class Windows {

	private JFrame frmWindows;
	private JTextField typeShiftName;
	private JTextField chooseassignmentDate;
	private JTextField chooseTime;
	
	//static ArrayList<Employee> employeeAry = new ArrayList<Employee>();
	static ArrayList<Skill> skillAry = new ArrayList<Skill>();
	static ArrayList<Assignment> assignmentAry = new ArrayList<Assignment>();
	static ArrayList<Shift> shiftAry = new ArrayList<Shift>();
	static ArrayList<CleaningSchedule> csAry = new ArrayList<CleaningSchedule>();

	private static DefaultListModel<Employee> employeeListModel = new DefaultListModel<Employee>();
	private static DefaultListModel<Skill> skillListModel = new DefaultListModel<Skill>();
	private static DefaultListModel<CleaningSchedule> csListModel = new DefaultListModel<CleaningSchedule>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Employee e1 = new Employee ("Bob", "Fan", 123456);
			
		//	Employee e2 = new Employee ("Kun", "Foo", 123456);
		//	employeeAry.add(e2);
			//System.out.print(employeeList);
		//	Skill skill1 = new Skill("Basic", 1);
		//	Skill skill2 = new Skill("Dialysis", 2);
		//	Skill skill3 = new Skill("Kitchen Morning", 3);
		//	Skill skill4 = new Skill("Kitchen Evening", 4);
		//	Skill skill5 = new Skill("Kitchen Help Morning", 5);
		//	Skill skill6 = new Skill("Kitchen Help Evening", 6);
		//	Skill skill7 = new Skill("AMA Kitchen Morning", 7);

		//	skillAry.add(skill1);
		//	skillAry.add(skill2);
		//	skillAry.add(skill3);
		//	skillAry.add(skill4);
		//	skillAry.add(skill5);
		//	skillAry.add(skill6);
		//	skillAry.add(skill7);
			
			
		CleaningSchedule cs1 = new CleaningSchedule(1, "Something");	
			csAry.add(cs1);
			
				
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
	@SuppressWarnings("unchecked")
	private void initialize() {
		
		// Creating windows for application
		frmWindows = new JFrame();
		frmWindows.setTitle("Windows");
		frmWindows.setBounds(150, 150, 700, 600);
		frmWindows.setResizable(false);
		frmWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindows.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		frmWindows.setResizable(false); // Does that the frame cannot maximize or change size in any way. 
		
		// adding tab panel to Windows
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmWindows.getContentPane().add(tabbedPane);
		
		
		
		
	//////////////////////   WORK SCHEDULE TAB  ////////////////////////////////////////////////////	
			
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
		
		
		
		//////////////////////////// SKILL TAB ////////////////////////////////////////////////////
		
		JPanel skillPanel = new JPanel();
		tabbedPane.addTab("Skill", null, skillPanel, null);
		skillPanel.setLayout(null);
		
		
		// creating JList that contains all the skills
		 JList skillList = new JList(skillAry.toArray());
		
		
		// creating scroll panel that shows skill List
		JScrollPane skillScrollPane = new JScrollPane(skillList);
		skillScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		skillScrollPane.setBounds(57, 38, 566, 167);
		skillPanel.add(skillScrollPane);
		
		// creating buttons
		JButton btnDelete = new JButton("Delete");
		btnDelete.setToolTipText("Select skill from list. Click \u2018Delete\u2019 to remove from list.");
		btnDelete.setBounds(152, 217, 89, 23);
		skillPanel.add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");

		btnEdit.setToolTipText("Select skill from list. Write ID & name. Click \u2018Edit\u2019 to save changes.");
		btnEdit.setEnabled(true);

		btnEdit.setBounds(57, 217, 89, 23);
		skillPanel.add(btnEdit);
		
		JButton btnSaveSkill = new JButton("Save");
		btnSaveSkill.setToolTipText("Write new ID & name. Click \u2018Save\u2019 to add new skill to list.");
		btnSaveSkill.setBounds(123, 313, 86, 23);
		skillPanel.add(btnSaveSkill);
		
		// creating labels
		JLabel lblSkillId = new JLabel("Skill ID");
		lblSkillId.setBounds(57, 257, 46, 14);
		skillPanel.add(lblSkillId);
		
		JLabel lblSkillName = new JLabel("Skill name");
		lblSkillName.setBounds(57, 285, 76, 14);
		skillPanel.add(lblSkillName);
		
		JLabel lblSkillList = new JLabel("Skill list");
		lblSkillList.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSkillList.setBounds(57, 13, 167, 14);
		skillPanel.add(lblSkillList);
	
		
		// creating text fields (editor panel), where user can enter text
		JEditorPane skillIDField = new JEditorPane();
		skillIDField.setBounds(123, 254, 106, 20);
		skillPanel.add(skillIDField);
		
		JEditorPane skillNameField = new JEditorPane();
		skillNameField.setBounds(123, 279, 106, 20);
		skillPanel.add(skillNameField);
		
		
		// check for int in ID field
		
		skillIDField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){		
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(skillIDField, "Please enter numbers! ");
					e.consume();// if wrong argument it is deleted
				
				
			}
			}
		});
		
		//Delete skill
		
		btnDelete.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Skill tempSkill = (Skill) skillList.getSelectedValue();
			skillAry.remove(tempSkill);

			}
		});
		
				
		//Save a skill
		
		btnSaveSkill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int skillIDnumber = Integer.parseInt( skillIDField.getText());
				String skillsname = skillNameField.getText();
				
				// checking that all fields are filled
				if (skillIDField.getText().isEmpty()){
					JOptionPane.showMessageDialog(skillIDField, "Please enter Skill ID!");
				}
				else if (skillNameField.getText().isEmpty()){
					JOptionPane.showMessageDialog(skillNameField, "Please enter skill name! ");
				}
				
				// saving skill
				else {
				Skill tempSkill = new Skill (skillsname, skillIDnumber);
				
				// clear text fields
				skillIDField.setText("");
				skillNameField.setText("");
				
			
			
				skillAry.add(tempSkill);
				System.out.println(skillAry);
				

				}
			}
		});
	
		
		// Edit skill
			btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Skill tempSkill = (Skill) skillList.getSelectedValue(); 
				int tempSkillID = (int) skillList.getSelectedIndex();
				
				
				
				if (!skillNameField.getText().isEmpty() ){
					String newSkillName = skillNameField.getText();
					tempSkill.changeName(newSkillName);
					//skillList.setElementAt(tempSkill, tempSkillID);
					//skillList.set(tempSkillID, tempSkill);
					}
				
				if (!skillIDField.getText().isEmpty()){
					int newSkillID =Integer.parseInt( skillIDField.getText());
					tempSkill.changeID(newSkillID);
					//skillListModel.setElementAt(tempSkill, tempSkillID);
					//skillList.set(tempSkillID, tempSkill);
				}
			}
		});
		
		
		/////////////////////// EMPLOYEE TAB //////////////////////////////////
		
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employee", null, empPanel, null);
		empPanel.setLayout(null);
		

		
		//JList listOfEmp = new JList( empList);
		//listOfEmp.setBounds(32, 39, 185, 137);
		//empPanel.add(listOfEmp);
		

		
		//JList listOfEmp = new JList( empList);
		//listOfEmp.setBounds(32, 39, 185, 137);
		//empPanel.add(listOfEmp);

		//JList listOfEmp = new JList( empList);
		//listOfEmp.setBounds(32, 39, 185, 137);
		//empPanel.add(listOfEmp);
		

	//	JScrollPane scrollListEmployee = new JScrollPane(empList);
		//scrollListEmployee.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	//	scrollListEmployee .setBounds(51, 38, 392, 237);
	//	empPanel.add(scrollListEmployee );
		//empList.setVisibleRowCount(10);
		//empList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		
		// Creating editing fields
		JEditorPane nameOfEmployee = new JEditorPane();
		nameOfEmployee.setBounds(131, 329, 106, 20);
		empPanel.add(nameOfEmployee);
		
		JEditorPane lastName = new JEditorPane();
		lastName.setBounds(131, 360, 106, 20);
		empPanel.add(lastName);
		
		JEditorPane phoneNumber = new JEditorPane();
		phoneNumber.setBounds(131, 391, 106, 20);
		empPanel.add(phoneNumber);
		
		
		// Creating buttons
		JButton Saveemployeeinfo = new JButton("Save");
		Saveemployeeinfo.setToolTipText("Write first name, last name, phone number & checkmark skill(s). Click \u2018Save\u2019 to save changes.");
		Saveemployeeinfo.setBounds(218, 490, 89, 23);
		empPanel.add(Saveemployeeinfo);
				
		JButton Deleteemployee = new JButton("Delete");
		Deleteemployee.setToolTipText("Select employee from list. Click \u2018Delete\u2019 to remove from list.");
		Deleteemployee.setBounds(148, 286, 89, 23);
		empPanel.add(Deleteemployee);
	
		JButton editemployee = new JButton("Edit");

		editemployee.setToolTipText("Select employee from list. Write first name, last name, phone number & checkmark skill(s). Click \u2018Edit\u2019 to save changes.");

		editemployee.setBounds(51, 286, 89, 23);
		empPanel.add(editemployee);
		
		
		// skill check boxes  to for the employee
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
		
		//Creating labels
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
		lblNewLabel_1.setBounds(192, 13, 115, 14);
		empPanel.add(lblNewLabel_1);
		
		// key listener to input only int and length
		phoneNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){		
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(skillIDField, "Please enter numbers! ");
					arg0.consume(); // if wrong argument it is deleted
					
				}
				if(!(phoneNumber.getText().length()<8)){		
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(skillIDField,"Phone number length should be 8 digits! ");
					arg0.consume();// if wrong argument it is deleted
					
					}
			}
		});
	
		
		// Save employee
		Saveemployeeinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// creating new strings that captures text field value
				String employeeName = nameOfEmployee.getText();
				String surname = lastName.getText();
				// making sure that input is only int
				int number = Integer.parseInt( phoneNumber.getText());
				
				
				// checking taht all fields are filled before saving
				if(nameOfEmployee.getText().isEmpty()){
					JOptionPane.showMessageDialog(nameOfEmployee,"Enter employee name! ");
				}
				
				else if (lastName.getText().isEmpty()){
					JOptionPane.showMessageDialog(lastName,"Enter employee last name! ");
				}
				
				else if (phoneNumber.getText().isEmpty()){
					JOptionPane.showMessageDialog(phoneNumber,"Enter employee phone number! ");
				}
				
				else {
					
				//	Employee e3 = new Employee (employeeName, surname, number);
					
				// clear text fields
					nameOfEmployee.setText("");
					lastName.setText("");
					phoneNumber.setText("");
					
				//	employeeList.add(e3);
					//employeeListModel.addElement(e3);
					
					//System.out.println(employeeList);
				}
				
			}
		});
		
		
		// Delete selected employee
		
		Deleteemployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// when button clicked, create new String that has selected string and delete it.

			//	int tempEmp = empList.getSelectedIndex();
				//empList.remove(tempEmp);
				//employeeList.remove(tempEmp);
				
			}
		});
		
		// Edit selected employee

		editemployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			//	Employee tempEmp = (Employee) empList.getSelectedValue();
			//	int tempEmpID =empList.getSelectedIndex();
			
				
					//if (!nameOfEmployee.getText().isEmpty() ){
					//		String newName = nameOfEmployee.getText();
					//		tempEmp.changeFirstName(newName);
							//employeeListModel.setElementAt(tempEmp, tempEmpID);
							//employeeList.set(tempEmpID, tempEmp);
				//	}
				//	if (!lastName.getText().isEmpty() ){
				//		//	String newLastName = lastName.getText();
					//		tempEmp.changeLastName(newLastName);
							//employeeListModel.setElementAt(tempEmp, tempEmpID);
							//employeeList.set(tempEmpID, tempEmp);
					//		}
				//	if (!phoneNumber.getText().isEmpty() ){
				//			int newphone = Integer.parseInt (phoneNumber.getText());
					//		tempEmp.changePhoneNumber(newphone);
					//		//employeeListModel.setElementAt(tempEmp, tempEmpID);
							//employeeList.set(tempEmpID, tempEmp);
							}
				//	System.out.println(employeeList);
		//		}
						
		});
		
		
//////////////////////////////// CLEANIGN SCHEDULE TAB /////////////////////////////////////////
		
		
		
		JPanel csPanel = new JPanel();
		tabbedPane.addTab("Cleaning Schedule", null, csPanel, null);
		csPanel.setLayout(null);
		
		//List containing all cleaning schedules 
		//JList ListOfCS = new JList(csListModel);
		//ListOfCS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//ListOfCS.setBounds(39, 33, 89, 49);
		//csPanel.add(ListOfCS);
		//JScrollPane scrollPane_4 = new JScrollPane(ListOfCS);
		//scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//scrollPane_4.setBounds(49, 44, 319, 232);
		//csPanel.add(scrollPane_4);

		
		// Creating buttons
		JButton DeleteCS = new JButton("Delete");

		DeleteCS.setToolTipText("Select cleaning schedule from list. Click \u2018Delete\u2019 to remove from list.");

		DeleteCS.setBounds(148, 287, 89, 23);
		csPanel.add(DeleteCS);
		
		JButton EditCS = new JButton("Edit");

		EditCS.setToolTipText("Select cleaning schedule from list. Write new ID, name & checkmark skill(s). Click \u2018Edit\u2019 to save changes.");

		EditCS.setBounds(49, 287, 89, 23);
		csPanel.add(EditCS);
		
		//Creating editing fields		
		JEditorPane csIdField = new JEditorPane();
		csIdField.setBounds(160, 328, 106, 20);
		csPanel.add(csIdField);
		
		JEditorPane csNameField = new JEditorPane();
		csNameField.setBounds(160, 359, 106, 20);
		csPanel.add(csNameField);
		
		JButton AddCS = new JButton("Save");
		AddCS.setToolTipText("Write new ID, name & checkmark skill(s). Click \u2018Save\u2019 to add new cleaning schedule to list.");
		AddCS.setBounds(279, 462, 89, 23);
		csPanel.add(AddCS);
		
		// Creating labels
		JLabel lblCsId = new JLabel("CS ID");
		lblCsId.setBounds(49, 335, 46, 14);
		csPanel.add(lblCsId);
		
		JLabel lblNewLabel = new JLabel("Floor and department");
		lblNewLabel.setBounds(49, 365, 124, 14);
		csPanel.add(lblNewLabel);
		
		JLabel lblCleaningSchedules = new JLabel("Cleaning schedules");
		lblCleaningSchedules.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCleaningSchedules.setBounds(49, 19, 170, 14);
		csPanel.add(lblCleaningSchedules);
		
				
		//Creating check boxes for the required skill to the cleaning schedule
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
		
		// check for input only int 
		csIdField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){		
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(skillIDField, "Please enter numbers! ");
					e.consume();
				
				}
			
			}
		});
		// Save CS
		AddCS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String csName = csNameField.getText();
				int csID = Integer.parseInt( csIdField.getText());
				
				
				// checking that all fields are filled
				if(csNameField.getText().isEmpty()){
					JOptionPane.showMessageDialog(csNameField, "Please enter Cleaning Schedule name! ");
				}
				else if (csIdField.getText().isEmpty()){
					JOptionPane.showMessageDialog(csIdField, "Please enter Cleaning Schedule ID! ");
				}
				
				// saving CS
				else {
					CleaningSchedule tempCS = new CleaningSchedule(csID, csName);
			//csListModel.addElement(tempCS);
			//schedule.add(tempCS);
				}
			}
		});
				
		//Delete CS
		DeleteCS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//CleaningSchedule tempCS = (CleaningSchedule) ListOfCS.getSelectedValue();
				//csListModel.removeElement(tempCS);
				//schedule.remove(tempCS);
			}
		});
		
		// Editing CS
		
		EditCS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//CleaningSchedule tempCS = (CleaningSchedule) ListOfCS.getSelectedValue();
				//int tempCSID =ListOfCS.getSelectedIndex();
				
				//	if (!csNameField.getText().isEmpty() ){
				//			String newCSName = csNameField.getText();
					//		tempCS.changeCSName(newCSName);
							//csListModel.setElementAt(tempCS, tempCSID);
							//schedule.set(tempCSID, tempCS);
				//			}
				//	if (!csIdField.getText().isEmpty()){
						
					//	int newCSID= Integer.parseInt(csIdField.getText());
					//	tempCS.changeID(newCSID);	
						//csListModel.setElementAt(tempCS, tempCSID);
						///schedule.set(tempCSID, tempCS);
					}
				//}
		});
		
		
/////////////////////////////////// ASSIGNMENT TAB //////////////////////////////////////////		
		
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
		
		//Creating buttons		
		JButton btnEdit_1 = new JButton("Edit");
		btnEdit_1.setToolTipText("Select shift from list. Write name, date, time & choose CS. Click \u2018Edit\u2019 to save changes.");
		btnEdit_1.setBounds(59, 229, 89, 23);
		assigPanel.add(btnEdit_1);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.setToolTipText("Select shift from list. Click \u2018Delete\u2019 to remove from list.");
		btnDelete_2.setBounds(158, 229, 89, 23);
		assigPanel.add(btnDelete_2);
		

		JButton btnAddShift = new JButton("Save");
		btnAddShift.setToolTipText("Write new name, date, time & choose CS. Click \u2018Save\u2019 to save changes.");
		btnAddShift.setBounds(249, 374, 89, 23);
		assigPanel.add(btnAddShift);
		
		// Creating labels
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

		// creating combo  box
		JComboBox<JList<CleaningSchedule>> comboBox = new JComboBox();
		comboBox.setBounds(133, 312, 86, 20);
		assigPanel.add(comboBox);
		frmWindows.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmWindows.getContentPane()}));
		
		// creating text fields
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
		
		// add CS list to combo box
		comboBox.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				
			//	comboBox.addItem(csList);
				
			}
		});
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
	
	
	// date format method
	public static Date createDate( int day, int month, int year, int hour, int minute) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy/HH/mm");
			try {
				date = sdf.parse(day + "/" + month + "/" + year + "/" + hour + "/" + minute);
			} catch (Exception e){}
			System.err.println("date error ");
			return date;
	}
}

