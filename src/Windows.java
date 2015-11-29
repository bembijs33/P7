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

public class Windows {

	private JFrame frmWindows;

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
		
				
		JPanel empPanel = new JPanel();
		tabbedPane.addTab("Employee", null, empPanel, null);
		
		JPanel skillPanel = new JPanel();
		tabbedPane.addTab("Skill", null, skillPanel, null);
		
		JPanel csPanel = new JPanel();
		tabbedPane.addTab("Cleaning Schedule", null, csPanel, null);
		
		JPanel assigPanel = new JPanel();
		tabbedPane.addTab("Assignment", null, assigPanel, null);
		assigPanel.setLayout(null);
	
		frmWindows.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmWindows.getContentPane()}));
	}

}
