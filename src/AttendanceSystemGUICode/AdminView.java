package AttendanceSystemGUICode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.border.LineBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class AdminView extends javax.swing.JFrame {

	/**
	 * Creates new form AdminView
	 */
	public AdminView() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton1.setBounds(16, 266, 169, 38);
		jButton2 = new javax.swing.JButton();
		jButton2.setBounds(16, 315, 169, 38);
		jButton3 = new javax.swing.JButton();
		jButton3.setBounds(304, 315, 169, 38);
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(102, 11, 348, 245);

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 153, 0));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrator View",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		// setting the properties of create student button
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jButton1.setMnemonic('s');
		jButton1.setText("Add Student To Course");
		jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		// adding action listener to create student button
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ASJtableAdmin AdminCreate = new ASJtableAdmin();
				AdminCreate.setVisible(true);
				AdminCreate.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			}
		});

		// setting the properties of the create class button
		jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jButton2.setMnemonic('c');
		jButton2.setText("Create Class");
		jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		// adding action listener to the create class button
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CreateClass Class = new CreateClass();
				Class.setVisible(true);
				Class.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			}
		});

		// setting the properties of the create module button
		jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jButton3.setMnemonic('R');
		jButton3.setText("Create Module");
		jButton3.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		// adding action listener to the create module button
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CreateModule Module = new CreateModule();
				Module.setVisible(true);
				Module.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			}
		});

		jLabel1.setIcon(new javax.swing.ImageIcon(("img/lyitLogo.png")));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(jPanel1, Alignment.LEADING,
				GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE));
		getContentPane().setLayout(layout);
		jPanel1.setLayout(null);
		jPanel1.add(jButton1);
		jPanel1.add(jButton2);
		jPanel1.add(jButton3);
		jPanel1.add(jLabel1);

		JButton btnNewButton = new JButton("Add Student To Module");
		btnNewButton.setMnemonic('m');
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ASJstudentToModule Module = new ASJstudentToModule();
				Module.frame.setVisible(true);

			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(304, 266, 169, 38);
		jPanel1.add(btnNewButton);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminView().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
}
