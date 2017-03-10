package attendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

public class ASJtable  extends javax.swing.JFrame {
	 /**
     * Creates new form ASJtable
     */
    public ASJtable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TableAS = new javax.swing.JTable();
        jTextFieldStudent = new javax.swing.JTextField();
        jTextFieldLN = new javax.swing.JTextField();
        jTextFieldFN = new javax.swing.JTextField();
        jTextFieldPaswd = new javax.swing.JTextField();
        jLabelStudent = new javax.swing.JLabel();
        jLabelLN = new javax.swing.JLabel();
        jLabelFN = new javax.swing.JLabel();
        jLabelCourse = new javax.swing.JLabel();
        jLabelModule = new javax.swing.JLabel();
        jLabelPaswd = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonFinish = new javax.swing.JButton();
       
        String[] courses = {"Cloud & Green IT", "CSDF", "Applied Computing"};
    	String[] modules = {"Algorithms & Data Structures", "Database Technology", "AWS"};
    	//modules.setModuleHours(20);
    	//@SuppressWarnings("parameterized")
        jComboBoxCourse = new javax.swing.JComboBox(courses);
        jComboBoxModule = new javax.swing.JComboBox(modules);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_TableAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            		
           new String [] {
                "StudentID", "LastName", "FirstName", "Course", "Module", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable_TableAS);

        jTextFieldLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLNActionPerformed(evt);
            }
        });

        jLabelStudent.setText("StudentID");

        jLabelLN.setText("Last Name");

        jLabelFN.setText("First Name");

        jLabelCourse.setText("Course");

        jLabelModule.setText("Module");

        jLabelPaswd.setText("Password");

        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonFinish.setText("Finish");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelLN)
                        .addComponent(jLabelFN)
                        .addComponent(jLabelCourse)
                        .addComponent(jLabelModule)
                        .addComponent(jLabelPaswd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPaswd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxModule, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxCourse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldFN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldLN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(288, 288, 288))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelCourse, jLabelFN, jLabelLN, jLabelModule, jLabelPaswd, jLabelStudent});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxCourse, jTextFieldFN, jTextFieldLN, jComboBoxModule, jTextFieldPaswd, jTextFieldStudent});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelLN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelModule))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPaswd))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelCourse, jLabelFN, jLabelLN, jLabelModule, jLabelPaswd, jLabelStudent});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxCourse, jTextFieldFN, jTextFieldLN, jComboBoxModule, jTextFieldPaswd, jTextFieldStudent});
        
        setSize(540,560);
        //pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // create database and table
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost/";
	final String USER_NAME = "root";
	final String PASSWORD = "password";
    
    public void theQuery(String query){
		Connection con = null;
		Statement st = null;
		try{
			java.lang.Class.forName(JDBC_DRIVER);
			System.out.println("STEP 1 COMPLETE - Driver Registered...");
			
			// STEP 2 - Open a connection
			//          Use the DriverManager.getConnection() method to create a Connection object,
			//          which represents a physical connection with the database server.
		    con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		    System.out.println("STEP 2 COMPLETE - Connection obtained...");
		    
		    // STEP 3 - Create Statement object		    
		    Statement stmt = con.createStatement();
		    System.out.println("STEP 3 COMPLETE - Statement object created...");
		    
		    String createDatabase = "CREATE DATABASE IF NOT EXISTS attendance"; 
		    stmt.executeUpdate(createDatabase);
		    System.out.println("STEP 4(a) COMPLETE - Query executed and database created...");

		    // STEP 4(a) - Execute Query (Create a Table)
		    String createTable = "CREATE TABLE IF NOT EXISTS students " +
	                   "(StudentID VARCHAR(9) not NULL, " +
	                   " lastName VARCHAR(25), " + 
	                   " firstName VARCHAR(25), " + 
	                   " course VARCHAR (25), " +
	                   " module VARCHAR (25),"+
	                   " password VARCHAR (25),"+
	                   " PRIMARY KEY ( StudentID ))";
	                   //"foreign key (moduleCode) references MODULE)"; 
		    stmt.executeUpdate("USE attendance");
		    stmt.executeUpdate(createTable);
		    System.out.println("STEP 4(b) COMPLETE - Query executed and table added to database...");
			con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
			st = con.createStatement();
			st.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Query Executed");
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null,  ex.getMessage());
		}
		
		
    	
	}
    private void jTextFieldLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLNActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

       DefaultTableModel model = (DefaultTableModel) jTable_TableAS.getModel();
       
       
       model.addRow(new Object[]{ jTextFieldStudent.getText(), jTextFieldLN.getText(), jTextFieldFN.getText(), jComboBoxCourse.getSelectedItem(), jComboBoxModule.getSelectedItem(), jTextFieldPaswd.getText() });
    //GEN-LAST:event_jButtonAddActionPerformed

        	ArrayList<Student> students = new ArrayList<>();
            Student s1 = new Student(jTextFieldStudent.getText(), jTextFieldLN.getText(), jTextFieldFN.getText(), jTextFieldPaswd.getText()); 
            students.add(s1);
            for (Student s : students) {
                System.out.print(s + "\n");
            }
            ArrayList<Module> modules = new ArrayList<>();
            
            Module m1 = new Module((String)jComboBoxModule.getSelectedItem(), 0);
            //m1.setModuleHours();
            modules.add(m1);
            for (Module m : modules) {
            	m.getModuleHours();
                System.out.print(m + "\n");
            }
            
            ArrayList<Class> courses = new ArrayList<>();
            Class c1 = new Class((String)jComboBoxCourse.getSelectedItem());
            courses.add(c1);
            for (Class c : courses) {
                System.out.print(c + "\n");
            }
        
    
    jButtonFinish.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e) {
			try{
				theQuery("insert into attendance.students(StudentID, lastName, firstName, course, module, password) values ('"+jTextFieldStudent.getText()+"','" +jTextFieldLN.getText()+"','" +jTextFieldFN.getText()+"','" +jComboBoxCourse.getSelectedItem()+"','" +jComboBoxModule.getSelectedItem()+"','" +jTextFieldPaswd.getText()+"')");
			}
			catch (Exception ex){}
		}
	});
    
    /*jButtonDelete.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e) {
			try{
				//theQuery("delete from attendance.students(StudentID, lastName, firstName, course, module, password) values ('"+jTextFieldStudent.getText()+"','" +jTextFieldLN.getText()+"','" +jTextFieldFN.getText()+"','" +jComboBoxCourse.getSelectedItem()+"','" +jComboBoxModule.getSelectedItem()+"','" +jTextFieldPaswd.getText()+"')");
				theQuery("delete from attendance.students " +"where studentID = jTextFieldStudent.getText()");
			}
			catch (Exception ex){}
		}
	});*/
    	
}	


    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ASJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASJtable().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinish;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelFN;
    private javax.swing.JLabel jLabelLN;
    private javax.swing.JLabel jLabelModule;
    private javax.swing.JLabel jLabelPaswd;
    private javax.swing.JLabel jLabelStudent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_TableAS;
    private javax.swing.JTextField jTextFieldFN;
    private javax.swing.JTextField jTextFieldLN;
    private javax.swing.JTextField jTextFieldPaswd;
    private javax.swing.JTextField jTextFieldStudent;
    private javax.swing.JComboBox jComboBoxCourse;
    private javax.swing.JComboBox jComboBoxModule;
    // End of variables declaration//GEN-END:variables
	
}
