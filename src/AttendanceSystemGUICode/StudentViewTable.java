package AttendanceSystemGUICode;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lindsay
 */
public class StudentViewTable extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2264879583094570126L;
	/**
     * Creates new form StudentViewTable
     */
    public StudentViewTable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jTable2.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student View", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable2.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Date", "Hours Attended", "Module Hours to Date", "Attendance %"
        	}
        ));
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTable2.getColumnModel().getColumn(0).setMinWidth(13);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        			.addGap(11))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showTable() {

		try {
			// ASJtableLect asj = new ASJtableLect();
			DatabaseHandler db = new DatabaseHandler();
			// connect to database
			db.connectToDatabase();

			// create query and pass into doQuery method
			String selectQuery = "SELECT Student.StudentNumber, Student.StudentLastName, Student.StudentFirstname, StudentModules.Module FROM Student JOIN StudentModules ON Student.StudentNumber=StudentModules.StudentIdentity WHERE Student.StudCourseCode ='"
					+ ASJtableLectSelect.jComboBox2.getSelectedItem() + "' AND StudentModules.Module = '"
					+ ASJtableLectSelect.jComboBox1.getSelectedItem() + "'";

			db.doQuery(selectQuery);

			db.stmt.executeUpdate("USE AttendanceSystem");
			ResultSet rs = db.stmt.executeQuery(selectQuery);
			// STEP 5(a) - Process results of the Query
			while (rs.next() != false) {

				// Can get columns by name, or number which starts at 1
				String StudentNo = rs.getString("StudentNumber");
				String last = rs.getString("StudentLastName");
				String first = rs.getString("StudentFirstName");
				// String course = rs.getString("StudCourseCode");
				System.out.println(StudentNo + " " + last + " " + first + " ");
				boolean present = true;
				Object[] content = { StudentNo, last, first, null, present };

				DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

				model.addRow(content);
				// model.addTableModelListener(jTable2);

				System.out.println("STEP 5(a) COMPLETE - Results of Query processed...");

			}
			db.conn.close();
		} catch (SQLException e) {
			System.out.println("Problem with SQL.\n" + e.getMessage());
		}
		

	}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentViewTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentViewTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentViewTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentViewTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentViewTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
