import java.awt.EventQueue;

import javax.swing.JFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;



import java.awt.Component;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JPopupMenu;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.SwingConstants;


public class Windows {

	private JFrame frmWindows;
	private JTextField typeShiftName;
	protected Skill skill1;
	
	static ArrayList<Employee> empAry = new ArrayList<Employee>();
	static ArrayList<Skill> skillAry = new ArrayList<Skill>();
	static ArrayList<Assignment> assignmentAry = new ArrayList<Assignment>();
	static ArrayList<Shift> shiftAry = new ArrayList<Shift>();
	static ArrayList<CleaningSchedule> csAry = new ArrayList<CleaningSchedule>();
	static private ArrayList <Employee> availableEmpAry =new ArrayList<Employee>();
	
	
	//List models to handle lists
	private static DefaultListModel<Employee> employeeListModel = new DefaultListModel<Employee>();
	private static DefaultListModel<Skill> skillListModel = new DefaultListModel<Skill>();
	private static DefaultListModel<CleaningSchedule> csListModel = new DefaultListModel<CleaningSchedule>();
	private static DefaultListModel<Shift> shiftListModel = new DefaultListModel<Shift>();
	private static DefaultListModel <CleaningSchedule> comboList = new DefaultListModel<>(); 
	
	
	
	List<JCheckBox> chbxList = new ArrayList<JCheckBox>();
	DefaultTableModel  scheduleTabelModel = new DefaultTableModel (); 
	
	private JComboBox csComBx;
	private JPanel cbpanel;
	private JPanel csSkillPanel;
	


	
	
		
	
	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		 
		try {
			FileOutputStream fileOut = new FileOutputStream("d:/workspace/p7/p7/emp.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(empAry);
			out.close();
			fileOut.close();
			System.out.println("\nSerialization Successful for array ... Checkout your specified output file..\n");
 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
		try {
			FileInputStream fileIn = new FileInputStream("d:/workspace/p7/p7/emp.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			System.out.println("Deserialized Data: \n" + in.readObject().toString());
			for (int i=0; i<empAry.size();i++){
				Employee tempEmp= (Employee) in.readObject();
				//employeeListModel.addElement(tempEmp);
				System.out.println(tempEmp);
			}
			
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// output serialization 
	
	
		
	
		
		
		
		
		
		
		Employee e1 = new Employee ("Bob", "Fan", 123456);	
		Employee e2 = new Employee ("Kun", "Foo", 123456);
		empAry.add(e1);
		empAry.add(e2);
		employeeListModel.addElement(e1);
		employeeListModel.addElement(e2);
		
			Skill skill1 = new Skill("Basic", 1);
			Skill skill2 = new Skill("Dialysis", 2);
			Skill skill3 = new Skill("Kitchen Morning", 3);
			Skill skill4 = new Skill("Kitchen Evening", 4);
			Skill skill5 = new Skill("Kitchen Help Morning", 5);
			Skill skill6 = new Skill("Kitchen Help Evening", 6);
			Skill skill7 = new Skill("AMA Kitchen Morning", 7);
			e1.AddSkill(skill1);
			skillAry.add(skill1);
			skillAry.add(skill2);
			skillAry.add(skill3);
			skillAry.add(skill4);
			skillAry.add(skill5);
			skillAry.add(skill6);
			skillAry.add(skill7);
			
			skillListModel.addElement(skill1);
			skillListModel.addElement(skill2);
			skillListModel.addElement(skill3);
			skillListModel.addElement(skill4);
			skillListModel.addElement(skill5);
			skillListModel.addElement(skill6);
			skillListModel.addElement(skill7);
			
			e1.AddSkill(skill7);
		CleaningSchedule cs1 = new CleaningSchedule(1, "Something");	
		CleaningSchedule cs2 = new CleaningSchedule(2, "SomethingElse");	
			csAry.add(cs1);
			csListModel.addElement(cs1);
			csAry.add(cs2);
			csListModel.addElement(cs2);
			cs1.skillRequiredAry.add(skill1);
				cs2.AddSkill(skill2);
				cs2.AddSkill(skill3);
			
			//Creating a date  shift
			Date start = createDate(2016, 11, 13, 12, 10);
			Date end = createDate(2016, 12, 14, 13, 20);
			
			//Creating a shifts
			Shift shift00001 = new Shift(00001, start, end, cs1);
			shiftAry.add(shift00001);
			shiftListModel.addElement(shift00001);
			
			
			System.out.println(shiftAry);
			
			
			
			
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
		frmWindows.setLocation(200, 50);
		// adding tab panel to Windows
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		frmWindows.getContentPane().add(tabbedPane);
		
		
		
		
	//////////////////////   WORK SCHEDULE TAB  ////////////////////////////////////////////////////	
			
		JPanel wsPanel = new JPanel();
		
		wsPanel.setName("");
		tabbedPane.addTab("Work Schedule", null, wsPanel, null);
		wsPanel.setLayout(null);
		
		
		JList wsList = new JList(shiftListModel);
		
		JScrollPane wsScrollPanel = new JScrollPane(wsList);
		wsScrollPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		wsScrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		wsScrollPanel.setBounds(10, 69, 669, 278);
		wsPanel.add(wsScrollPanel);
		
		
		
		JButton btnAddEmp = new JButton("Add employee to Shift");
		btnAddEmp.setToolTipText("Click on a shift. Select an employee from the list. Click \u2018Add employee to shift\u2019.");
		btnAddEmp.setBounds(69, 389, 159, 23);
		wsPanel.add(btnAddEmp);
		
		JLabel lblWorkGod = new JLabel("Work Schedule");
		lblWorkGod.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorkGod.setForeground(Color.BLACK);
		lblWorkGod.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWorkGod.setBounds(112, 11, 395, 47);
		wsPanel.add(lblWorkGod);
		
		JComboBox availableEmp = new JComboBox<Object>();
		availableEmp.setBounds(69, 358, 200, 20);
		wsPanel.add(availableEmp);
		
		JPanel removeEmpPanel = new JPanel();
		removeEmpPanel.setBounds(231, 378, 224, 47);
		wsPanel.add(removeEmpPanel);
		removeEmpPanel.setLayout(null);
		
		JButton btnRemoveEmp = new JButton("Remove Employee from Shift");
		
		
		
		
		/// clear selection in the wsList	
		wsPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wsList.clearSelection();
				availableEmpAry.clear();
				availableEmp.setModel(new DefaultComboBoxModel<Object>( availableEmpAry.toArray()));
				
			}
		});
		
			
		//// Populating ComboBox availableEmp with employees, that has required skill
			wsList.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//Deleting all the elements form the array
					availableEmpAry.clear();
					//making sure that there is one shift selected
					if (!wsList.isSelectionEmpty()){
						// gets an exact shift
						Shift tempShift=  (Shift) wsList.getSelectedValue(); 
					
					// remove employee from the shift	
					if(!tempShift.assignedEmpAry.isEmpty()){
							// add button
							btnRemoveEmp.setBounds(10, 11, 204, 23);
							removeEmpPanel.add(btnRemoveEmp);
							removeEmpPanel.updateUI();
							// remove emp
							btnRemoveEmp.addMouseListener(new MouseAdapter (){
								@Override
								public void mouseClicked(MouseEvent z){
									
									tempShift.assignedEmpAry.clear();
									wsPanel.updateUI();
									//remove button
									removeEmpPanel.remove(btnRemoveEmp);
							}
						});
						
						
						
					}else{					
						
						// looping through cleaning schedule required skills
					for(int i=0; i<tempShift.Schedule.skillRequiredAry.size(); i++){ 
						// looping through all the employees
						for (int j=0; j<empAry.size(); j++){
							//Checking if employee skill array has an exact skill for cs
								if (empAry.get(j).empSkillAry.containsAll(tempShift.Schedule.skillRequiredAry)){
									
									
									//setting availableEmpAry as ComboBox elements
									availableEmpAry.add(empAry.get(j));
									availableEmp.setModel(new DefaultComboBoxModel<Object>( availableEmpAry.toArray()));
									
								}
							}
						}		
					}
				}
			}
				});
			
			
			
		//// Adding emp to CS in Work Schedule panel	
			
			btnAddEmp.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				
					Employee tempEmp = (Employee) availableEmp.getSelectedItem();
					
					Shift tempShift = (Shift) wsList.getSelectedValue();
					
					tempShift.assigneEmpToShift(tempEmp);
					wsList.updateUI();
					wsList.clearSelection();
					availableEmpAry.clear();
					availableEmp.setModel(new DefaultComboBoxModel<Object>( availableEmpAry.toArray()));
					
					Date start = tempShift.Start;
					Date end = tempShift.End;
					
					Assignment tempAs = new Assignment(tempEmp, start, end);
					assignmentAry.add(tempAs);
					
					System.out.println(assignmentAry);
					
					
				}
				
			});
		
	
		//////////////////////////// SKILL TAB ////////////////////////////////////////////////////
		
		JPanel skillPanel = new JPanel();
		tabbedPane.addTab("Skill", null, skillPanel, null);
		skillPanel.setLayout(null);
		
		
		// creating JList that contains all the skills
		 JList skillList = new JList(skillListModel);
		
		
		// creating scroll panel that shows skill List
		JScrollPane skillScrollPane = new JScrollPane(skillList);
		skillScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		skillScrollPane.setBounds(57, 38, 555, 167);
		skillPanel.add(skillScrollPane);
		
		// creating buttons
		JButton btnDelete = new JButton("Delete");
		btnDelete.setToolTipText("Select skill from list. Click \u2018Delete\u2019 to remove from list.");
		btnDelete.setBounds(152, 217, 89, 23);
		skillPanel.add(btnDelete);
		
		JButton btnEdit = new JButton("Update");
		btnEdit.setToolTipText("Select skill from list. Write ID & name. Click \u2018Update\u2019 to save changes.");
		btnEdit.setBounds(57, 340, 89, 23);
		skillPanel.add(btnEdit);
		
		JButton btnSaveSkill = new JButton("Save New");
		btnSaveSkill.setToolTipText("Write new ID & name. Click \u2018Save New\u2019 to add new skill to list.");
		btnSaveSkill.setBounds(155, 340, 100, 23);
		skillPanel.add(btnSaveSkill);
		
		JButton btnUpdate = new JButton("Edit");
		btnUpdate.setToolTipText("Select skill from list. Click 'Edit' to view info.");
		btnUpdate.setBounds(57, 217, 89, 23);
		skillPanel.add(btnUpdate);
		
		
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
		
		
		
		// update fields
		btnUpdate.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				int tempSkillInd = skillList.getSelectedIndex();
				int skillID = skillListModel.getElementAt(tempSkillInd).skillID;
				String skillName = skillListModel.getElementAt(tempSkillInd).skillName;
				skillNameField.setText(skillName);
				skillIDField.setText(String.valueOf(skillID));				
			}
		});
		
		
		
		//Delete skill
		
		btnDelete.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Skill tempSkill = (Skill) skillList.getSelectedValue();
			skillListModel.removeElement(tempSkill);
			skillAry.remove(tempSkill);
			System.out.println(skillAry);
			}
		});
		
				
		//Save a skill
		
		btnSaveSkill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int skillIDnumber = Integer.parseInt( skillIDField.getText());
				String skillsname = skillNameField.getText();
				
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
				
			
				skillListModel.addElement(tempSkill);
				skillAry.add(tempSkill);
				repaintChBx();
				repaintShiftChBx();
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
					skillListModel.setElementAt(tempSkill, tempSkillID);
					skillAry.set(tempSkillID, tempSkill);
					skillNameField.setText("");
					
					}
				
				if (!skillIDField.getText().isEmpty()){
					int newSkillID =Integer.parseInt( skillIDField.getText());
					tempSkill.changeID(newSkillID);
					skillListModel.setElementAt(tempSkill, tempSkillID);
					skillAry.set(tempSkillID, tempSkill);
					skillIDField.setText("");
					
					
				}
				repaintChBx();
				repaintShiftChBx();
				System.out.println(skillAry);
			}
		});
		
		
////////////////////////////////// EMPLOYEE TAB /////////////////////////////////////////////////////////
		
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employee", null, empPanel, null);
		empPanel.setLayout(null);
		
		
		JList employeeList = new JList( employeeListModel);
		employeeList.setBounds(32, 39, 185, 137);
		empPanel.add(employeeList);
		
		
		JScrollPane scrollListEmployee = new JScrollPane(employeeList);
		scrollListEmployee.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollListEmployee .setBounds(51, 38, 555, 200);
		empPanel.add(scrollListEmployee );
		employeeList.setVisibleRowCount(10);
		employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		
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
		JButton Saveemployeeinfo = new JButton("Save New");
		Saveemployeeinfo.setToolTipText("Write first name, last name, phone number & checkmark skill(s). Click \u2018Save New\u2019 to save changes.");
		Saveemployeeinfo.setBounds(152, 490, 115, 23);
		empPanel.add(Saveemployeeinfo);
				
		JButton Deleteemployee = new JButton("Delete");
		Deleteemployee.setToolTipText("Select employee from list. Click \u2018Delete\u2019 to remove from list.");
		Deleteemployee.setBounds(152, 286, 89, 23);
		empPanel.add(Deleteemployee);
	
		JButton editemployee = new JButton("Update");
		editemployee.setToolTipText("Select employee from list. Write first name, last name, phone number & checkmark skill(s). Click \u2018Update\u2019 to save changes.");
		editemployee.setBounds(51, 490, 89, 23);
		empPanel.add(editemployee);
		
		
		JButton btnUpdate_1 = new JButton("Edit");
		btnUpdate_1.setToolTipText("Select employee from list. Click 'Edit' to view info.");
		btnUpdate_1.setBounds(51, 286, 89, 23);
		empPanel.add(btnUpdate_1);
		
		
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
		
		cbpanel = new JPanel();
		cbpanel.setBounds(51, 422, 600, 57);
		empPanel.add(cbpanel);
		cbpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
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
	
		
		//update fields
		btnUpdate_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Employee tempEmp=(Employee) employeeList.getSelectedValue();
				int tempEmpInd=employeeList.getSelectedIndex();
				int tempEmpPh = employeeListModel.getElementAt(tempEmpInd).phoneNumber;
				String tempEmpFirstName = employeeListModel.getElementAt(tempEmpInd).firstName;
				String tempEmpLastName = employeeListModel.getElementAt(tempEmpInd).lastName;
				
				nameOfEmployee.setText(tempEmpFirstName);
				lastName.setText(tempEmpLastName);
				phoneNumber.setText(String.valueOf(tempEmpPh));
				
				//adding skill check boxes
				for(int i=0; i<skillAry.size();i++){
					JCheckBox box = new JCheckBox(skillAry.get(i).getName());
					box.setName(skillAry.get(i).getName());
					
					chbxList.add(box);
					cbpanel.add(box);
					
					// Selecting Check Boxes of emp skills
					for (int j=0; j<tempEmp.empSkillAry.size(); j++)
					if(tempEmp.empSkillAry.get(j).skillName.equals(box.getName())){
						box.setSelected(true);
					}
				}
				empPanel.updateUI();
				
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
				else if (nameOfEmployee.getText().isEmpty() &&lastName.getText().isEmpty() && phoneNumber.getText().isEmpty()){
					JOptionPane.showMessageDialog(Saveemployeeinfo, "Please enter information about Employee before saving!");
				}
				
				else {
					
					Employee tempEmp = new Employee (employeeName, surname, number);
					
				// clear text fields
					nameOfEmployee.setText("");
					lastName.setText("");
					phoneNumber.setText("");
					
					
					employeeListModel.addElement(tempEmp);
					empAry.add(tempEmp);
					System.out.println(empAry);
				}
				
			}
		});
		
		
		// Delete selected employee
		
		Deleteemployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// when button clicked, create new String that has selected string and delete it.

				int tempEmp = (int)employeeList.getSelectedIndex();
				empAry.remove(tempEmp);
				employeeListModel.remove(tempEmp);
				System.out.println(empAry);
				}
			});
		
		
		// Edit selected employee

			
				
				editemployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
					
				Employee tempEmp = (Employee) employeeList.getSelectedValue();
				int tempEmpID =employeeList.getSelectedIndex();
				tempEmp.empSkillAry.clear();	
					for (int i=0; i<chbxList.size(); i++){
						if ( chbxList.get(i).isSelected()){
							for (int j=0; j<skillAry.size(); j++){
								
								if (skillAry.get(j).skillName.equals(chbxList.get(i).getName())){						
										
									tempEmp.AddSkill(skillAry.get(j));
									}
								}
								chbxList.get(i).setSelected(false);
						}
					}
					if (!nameOfEmployee.getText().isEmpty() ){
							String newName = nameOfEmployee.getText();
							tempEmp.changeFirstName(newName);
							nameOfEmployee.setText("");
					}
					if (!lastName.getText().isEmpty() ){
							String newLastName = lastName.getText();
							tempEmp.changeLastName(newLastName);
							lastName.setText("");
							}
					if (!phoneNumber.getText().isEmpty() ){
							int newphone = Integer.parseInt (phoneNumber.getText());
							tempEmp.changePhoneNumber(newphone);
							phoneNumber.setText("");
							}
					employeeListModel.setElementAt(tempEmp, tempEmpID);
					empAry.set(tempEmpID, tempEmp);
					employeeList.clearSelection();
					cbpanel.removeAll();
					cbpanel.updateUI();
					
				}
						
			});
		
		
		
		
//////////////////////////////// CLEANIGN SCHEDULE TAB /////////////////////////////////////////
		
		
		
		JPanel csPanel = new JPanel();
		tabbedPane.addTab("Cleaning Schedule", null, csPanel, null);
		csPanel.setLayout(null);
		
		//List containing all cleaning schedules 
		JList csList = new JList(csListModel);
		csList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		csList.setBounds(39, 33, 89, 49);
		csPanel.add(csList);
		JScrollPane scrollPane_4 = new JScrollPane(csList);
		scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_4.setBounds(49, 44, 555, 200);
		csPanel.add(scrollPane_4);

		
		// Creating buttons
		JButton DeleteCS = new JButton("Delete");
		DeleteCS.setToolTipText("Select cleaning schedule from list. Click \u2018Delete\u2019 to remove from list.");
		DeleteCS.setBounds(148, 287, 89, 23);
		csPanel.add(DeleteCS);
		
		JButton EditCS = new JButton("Update");
		EditCS.setToolTipText("Select cleaning schedule from list. Write new ID, name & checkmark skill(s). Click \u2018Update\u2019 to save changes.");
		EditCS.setBounds(49, 462, 89, 23);
		csPanel.add(EditCS);
		
		
		//Creating editing fields		
		JEditorPane csIdField = new JEditorPane();
		csIdField.setBounds(174, 328, 106, 20);
		csPanel.add(csIdField);
		
		JEditorPane csNameField = new JEditorPane();
		csNameField.setBounds(174, 359, 106, 20);
		csPanel.add(csNameField);
		
		JButton AddCS = new JButton("Save New");
		AddCS.setToolTipText("Write new ID, name & checkmark skill(s). Click \u2018Save New\u2019 to add new cleaning schedule to list.");
		AddCS.setBounds(148, 462, 106, 23);
		csPanel.add(AddCS);
		
		JButton btnUpdate_2 = new JButton("Edit");
		btnUpdate_2.setToolTipText("Select cleaning schedule from list. Click 'Edit' to view info.");
		btnUpdate_2.setBounds(49, 287, 89, 23);
		csPanel.add(btnUpdate_2);
		
		
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
		
		
		// pannel for skill check boxes
		
		csSkillPanel = new JPanel();
		csSkillPanel.setBounds(49, 402, 528, 58);
		csSkillPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		csPanel.add(csSkillPanel);		
		
				
		
		
		
		
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
		
		
		//update fields
		btnUpdate_2.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
			
				CleaningSchedule tempCs= (CleaningSchedule) csList.getSelectedValue();
				int tempCSInd=csList.getSelectedIndex();				
				int csId = csListModel.getElementAt(tempCSInd).CsID;				
				String csName = csListModel.getElementAt(tempCSInd).Name;
				
				csNameField.setText(csName);
				csIdField.setText(String.valueOf(csId));
					
				// creating check boxes
				
				for(int i=0; i<skillAry.size();i++){
					JCheckBox box = new JCheckBox(skillAry.get(i).getName());
					box.setName(skillAry.get(i).getName());
					chbxList.add(box);
					csSkillPanel.add(box);
					for (int j=0; j<tempCs.skillRequiredAry.size(); j++)
						if(tempCs.skillRequiredAry.get(j).skillName.equals(box.getName())){
							box.setSelected(true);
						}
				}
				csSkillPanel.updateUI();
				
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
				else if(csIdField.getText().isEmpty() && csNameField.getText().isEmpty())				{
					JOptionPane.showMessageDialog(AddCS, "Please enter information about Cleaning schedule before saving!");
				}
				// saving CS
				else {
					CleaningSchedule tempCS = new CleaningSchedule(csID, csName);
					csListModel.addElement(tempCS);
					csAry.add(tempCS);
					comboList.addElement(tempCS);
					csNameField.setText("");
					csIdField.setText("");
					System.out.println(csAry);
					repaintCS();
					}
				}
			});
			
		
		//Delete CS
		DeleteCS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CleaningSchedule tempCS = (CleaningSchedule) csList.getSelectedValue();
				csListModel.removeElement(tempCS);
				csAry.remove(tempCS);
				}
			});
		
		
		// Update CS
		EditCS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CleaningSchedule tempCS = (CleaningSchedule) csList.getSelectedValue();
				int tempCSID =csList.getSelectedIndex();
				tempCS.skillRequiredAry.clear();
				for (int i=0; i<chbxList.size(); i++){
					if ( chbxList.get(i).isSelected()){
						for (int j=0; j<skillAry.size(); j++){
							
							if (skillAry.get(j).skillName.equals(chbxList.get(i).getName())){
								
								tempCS.AddSkill(skillAry.get(j));
								csListModel.setElementAt(tempCS, tempCSID);
								csAry.set(tempCSID, tempCS);					
								}
							
							chbxList.get(i).setSelected(false);
							}
						}
					}
				
					if (!csNameField.getText().isEmpty() ){
							String newCSName = csNameField.getText();
							tempCS.changeCSName(newCSName);
							csListModel.setElementAt(tempCS, tempCSID);
							csAry.set(tempCSID, tempCS);
							}
					if (!csIdField.getText().isEmpty()){
						
						int newCSID= Integer.parseInt(csIdField.getText());
						tempCS.changeID(newCSID);	
						csListModel.setElementAt(tempCS, tempCSID);
						csAry.set(tempCSID, tempCS);
						}
					csList.clearSelection();
					csNameField.setText("");
					csIdField.setText("");
					csSkillPanel.removeAll();
					csPanel.updateUI();
					
				
					}
			});
		
		
		
/////////////////////////////////// shift TAB //////////////////////////////////////////////////////////		
		
		JPanel shiftPanel = new JPanel();
		tabbedPane.addTab("Shift", null, shiftPanel, null);
		shiftPanel.setLayout(null);
		
		JList shiftList = new JList(shiftListModel);
		shiftList.setBounds(37, 11, 193, 162);
		shiftPanel.add(shiftList);
		
		JScrollPane scrollPane_2 = new JScrollPane(shiftList);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(56, 37, 555, 200);
		shiftPanel.add(scrollPane_2);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.setToolTipText("Select shift from list. Click \u2018Delete\u2019 to remove from list.");
		btnDelete_2.setBounds(56, 248, 89, 23);
		shiftPanel.add(btnDelete_2);
		
		JButton btnAddShift = new JButton("Save New");
		btnAddShift.setToolTipText("Write new name, date, time & choose CS. Click \u2018Save New\u2019 to save changes.");
		btnAddShift.setBounds(56, 421, 106, 23);
		shiftPanel.add(btnAddShift);
		
		// Creating labels
		JLabel lblShiftName = new JLabel("Shift name");
		lblShiftName.setBounds(56, 284, 67, 14);
		shiftPanel.add(lblShiftName);
		
		JLabel lblChooseCs = new JLabel("Choose CS");
		lblChooseCs.setBounds(56, 315, 77, 14);
		shiftPanel.add(lblChooseCs);
		
		JLabel lblDate = new JLabel("Starts");
		lblDate.setBounds(56, 346, 67, 14);
		shiftPanel.add(lblDate);
		
		JLabel lblTime = new JLabel("Ends");
		lblTime.setBounds(56, 378, 67, 14);
		shiftPanel.add(lblTime);
		
		JLabel lblShifts = new JLabel("Shifts");
		lblShifts.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblShifts.setBounds(56, 12, 58, 14);
		shiftPanel.add(lblShifts);

		
		// creating combo  box
		csComBx = new JComboBox( );
		csComBx.setMaximumRowCount(10);
		
		//setting combobox to default model to display CS
		csComBx.setModel(new DefaultComboBoxModel<Object>( csAry.toArray()));
		
		csComBx.setBounds(155, 312, 456, 20);
		shiftPanel.add(csComBx);
		frmWindows.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmWindows.getContentPane()}));
		
		
		// creating text fields
		typeShiftName = new JTextField();
		typeShiftName.setBounds(155, 284, 86, 20);
		shiftPanel.add(typeShiftName);
		
		
		
		JComboBox comboBoxDay = new JComboBox<Date>();
		comboBoxDay.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDay.setBounds(155, 343, 51, 20);
		shiftPanel.add(comboBoxDay);
		
		JComboBox comboBoxDayE = new JComboBox();
		comboBoxDayE.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDayE.setBounds(155, 375, 51, 20);
		shiftPanel.add(comboBoxDayE);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxMonth.setBounds(216, 343, 67, 20);
		shiftPanel.add(comboBoxMonth);
		
		JComboBox comboBoxMonthE = new JComboBox();
		comboBoxMonthE.setModel(new DefaultComboBoxModel(new String[] {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxMonthE.setBounds(216, 375, 67, 20);
		shiftPanel.add(comboBoxMonthE);
		
		JComboBox comboBoxYear = new JComboBox();
		comboBoxYear.setModel(new DefaultComboBoxModel(new String[] {"Year", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2022", "2023", "2024", "2025"}));
		comboBoxYear.setBounds(293, 343, 58, 20);
		shiftPanel.add(comboBoxYear);
		
		JComboBox comboBoxYearE = new JComboBox();
		comboBoxYearE.setModel(new DefaultComboBoxModel(new String[] {"Year", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2022", "2023", "2024", "2025"}));
		comboBoxYearE.setBounds(293, 375, 58, 20);
		shiftPanel.add(comboBoxYearE);
		
		JComboBox comboBoxH = new JComboBox();
		comboBoxH.setModel(new DefaultComboBoxModel(new String[] {"Hour", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxH.setBounds(372, 343, 67, 20);
		shiftPanel.add(comboBoxH);
		
		JComboBox comboBoxHE = new JComboBox();
		comboBoxHE.setModel(new DefaultComboBoxModel(new String[] {"Hour", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxHE.setBounds(372, 375, 67, 20);
		shiftPanel.add(comboBoxHE);
		
		JComboBox comboBoxM = new JComboBox();
		comboBoxM.setModel(new DefaultComboBoxModel(new String[] {"Minute", "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"}));
		comboBoxM.setBounds(445, 343, 77, 20);
		shiftPanel.add(comboBoxM);
		
		JComboBox comboBoxME = new JComboBox();
		comboBoxME.setModel(new DefaultComboBoxModel(new String[] {"Minute", "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"}));
		comboBoxME.setBounds(445, 375, 77, 20);
		shiftPanel.add(comboBoxME);
		
		
		// checking for INT in name field 
		
		typeShiftName.addKeyListener(new KeyAdapter() {
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
		// save shift
		btnAddShift.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int newShiftName = Integer.parseInt(typeShiftName.getText());
				CleaningSchedule schedule=(CleaningSchedule) csComBx.getSelectedItem();
				
			
				
				
				int day= Integer.parseInt(comboBoxDay.getSelectedItem().toString()); 
				int month=Integer.parseInt(comboBoxMonth.getSelectedItem().toString());  
				int year =Integer.parseInt(comboBoxYear.getSelectedItem().toString()); 
				int hour=Integer.parseInt(comboBoxH.getSelectedItem().toString()); 
				int minute = Integer.parseInt(comboBoxM.getSelectedItem().toString()); 
				int dayE=Integer.parseInt(comboBoxDayE.getSelectedItem().toString());  
				int monthE=Integer.parseInt(comboBoxMonthE.getSelectedItem().toString());  
				int yearE =Integer.parseInt(comboBoxYearE.getSelectedItem().toString()); 
				int hourE=Integer.parseInt(comboBoxHE.getSelectedItem().toString()); 
				int minuteE =Integer.parseInt(comboBoxME.getSelectedItem().toString()); 
				
				
				Date newStart = createDate(day,month,year,hour,minute);
				Date newEnd = createDate(dayE,monthE,yearE,hourE,minuteE);
				
				Shift tempShift = new Shift(newShiftName, newStart, newEnd, schedule);
				
				
				shiftListModel.addElement(tempShift);
				shiftAry.add(tempShift);
				System.out.println(shiftAry);
			}
		});
	
	
	// delete shift
		
		btnDelete_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int tempShiftID = shiftList.getSelectedIndex();
				shiftList.remove(tempShiftID);
				shiftAry.remove(tempShiftID);
				
			}
		});
}
	
	
	
	
	

	// This method repaints Combo box of CS in Shift tab	
	private JComboBox repaintCS(){
		csComBx.removeAll();
		csComBx.setModel(new DefaultComboBoxModel( csAry.toArray()));
		return csComBx;
	}
	
	
	// This method repaints check boxes in Employee tab
	private  JPanel repaintChBx(){
		cbpanel.removeAll();
		for(int i=0; i<skillAry.size();i++){
			JCheckBox box = new JCheckBox(skillAry.get(i).getName());
			box.setName(skillAry.get(i).getName());
			chbxList.add(box);
			cbpanel.add(box);
		} 
		return cbpanel;
	}
	
	// This method repaints check boxes in CS tab
	public JPanel repaintShiftChBx(){
			csSkillPanel.removeAll();
				for(int i=0; i<skillAry.size();i++){
					JCheckBox box = new JCheckBox(skillAry.get(i).getName());
					box.setName(skillAry.get(i).getName());
					chbxList.add(box);
					csSkillPanel.add(box);
				} 
			return csSkillPanel;
	}
	
	
	
		public static Date createDate( int year, int month, int day, int hour, int minute) {
			Date date = new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy/HH/mm");
				try {
					date = sdf.parse(day + "/" + month + "/" + year + "/" + hour + ":" + minute);
				} catch (Exception e){}
				
				return date;
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
