/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.json.*;

/**
 *
 * @author Michael
 */
public class AgriPlannerUI extends javax.swing.JFrame {

	/**
	 * Creates new form java
	 */
	public AgriPlannerUI() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		jComboBox2 = new javax.swing.JComboBox<>();
		jComboBox3 = new javax.swing.JComboBox<>();
		jComboBox4 = new javax.swing.JComboBox<>();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();
		jTextField8 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jTextField10 = new javax.swing.JTextField();
		jComboBox5 = new javax.swing.JComboBox<>();
		jLabel11 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel2.setText("Plot 1");

		jLabel3.setForeground(new java.awt.Color(255, 0, 0));
		jLabel3.setText("Plot 2");

		jLabel4.setForeground(new java.awt.Color(100, 155, 100));
		jLabel4.setText("Plot 3");

		jLabel5.setForeground(new java.awt.Color(0, 0, 190));
		jLabel5.setText("Plot 4");

		jTextField1.setName("plot1Radius"); // NOI18N


		jTextField2.setName("plot2Radius"); // NOI18N


		jTextField3.setName("plot3Radius"); // NOI18N

		jTextField4.setName("plot3Radius"); // NOI18N

		jLabel1.setText("Radius(ft)");

		jLabel6.setText("AgriPlanner");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select", "Corn", "Wheat" }));

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select", "Corn", "Wheat" }));

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select", "Corn", "Wheat" }));

		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select", "Corn", "Wheat" }));

		jTextField5.setName("plot1Date"); // NOI18N

		jTextField6.setName("plot2Date"); // NOI18N

		jTextField7.setName("plot3Date"); // NOI18N

		jTextField8.setName("plot4Date"); // NOI18N

		jLabel7.setText("Date (MM/DD/YYYY)");

		jLabel8.setText("Soil Type");

		jLabel9.setText("City");

		jLabel10.setText("State");

		jTextField9.setName("city"); // NOI18N

		jTextField10.setName("state"); // NOI18N

		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sand", "Loam", "Clay" }));

		jLabel11.setText("Nitrate(lb/acre)");

		jButton1.setText("Submit");
		jButton1.setName("submit"); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
									.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField4))
									.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField2))
									.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField3))
									.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
											.addComponent(jLabel1)
											.addComponent(jTextField1))))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
									.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jTextField8))
									.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jTextField7))
									.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jTextField6))
									.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
											.addComponent(jLabel7)
											.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
							.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel9)
								.addGap(18, 18, 18)
								.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
					.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(197, 197, 197)
						.addComponent(jLabel6))
					.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel10)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
							.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel11)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTextField11))
							.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel8)
								.addGap(18, 18, 18)
								.addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
					.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jButton1)))
.addContainerGap(171, Short.MAX_VALUE))
);
jPanel1Layout.setVerticalGroup(
	jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(jPanel1Layout.createSequentialGroup()
		.addContainerGap()
		.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addGap(7, 7, 7)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel1)
			.addComponent(jLabel7))
		.addGap(8, 8, 8)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel2)
			.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel3)
			.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel4)
			.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel5)
			.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel9)
			.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addGap(3, 3, 3)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel10)
			.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel8)
			.addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel11)
			.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addGap(51, 51, 51)
		.addComponent(jButton1)
		.addContainerGap(53, Short.MAX_VALUE))
);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addContainerGap())
	);
layout.setVerticalGroup(
	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(layout.createSequentialGroup()
		.addGap(24, 24, 24)
		.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);

pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		String event = evt.getActionCommand();
		if(event.equals("Submit")){
			try{
				String crop1 = jComboBox1.getSelectedItem().toString();
				if (crop1 != "Select"){

					System.out.println(jLabel2.getText() + ": " + crop1);
					if (crop1.equals("Corn")){
						Corn plot = new Corn(
							jTextField5.getText(), jTextField10.getText(), jTextField9.getText(), jComboBox5.getSelectedItem().toString(), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField1.getText())
							);
						System.out.println(plot.requiredN());
						System.out.println(plot.waterNeeded());
						System.out.println(plot.harvestDate());
						System.out.println();
					}
					else if (crop1.equals("Wheat")){
						Wheat plot = new Wheat(
							jTextField5.getText(), jTextField10.getText(), jTextField9.getText(), jComboBox5.getSelectedItem().toString(), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField1.getText())
							);
						System.out.println(plot.requiredN());
						System.out.println(plot.waterNeeded());
						System.out.println(plot.harvestDate());
						System.out.println();
					}
				}
				String crop2 = jComboBox2.getSelectedItem().toString();
				if (crop2 != "Select"){

					System.out.println(jLabel3.getText() + ": " + crop2);
					if (crop2.equals("Corn")){
						Corn plot = new Corn(
							jTextField6.getText(), jTextField10.getText(), jTextField9.getText(), jComboBox5.getSelectedItem().toString(), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField2.getText())
							);
						System.out.println(plot.requiredN());
						System.out.println(plot.waterNeeded());
						System.out.println(plot.harvestDate());
						System.out.println();
					}
					else if (crop2.equals("Wheat")){
						Wheat plot = new Wheat(
							jTextField6.getText(), jTextField10.getText(), jTextField9.getText(), jComboBox5.getSelectedItem().toString(), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField2.getText())
							);
						System.out.println(plot.requiredN());
						System.out.println(plot.waterNeeded());
						System.out.println(plot.harvestDate());
						System.out.println();
					}
				}
				String crop3 = jComboBox3.getSelectedItem().toString();

				if (crop3 != "Select"){

					System.out.println(jLabel4.getText() + ": " + crop3);
					if (crop3.equals("Corn")){
						Corn plot = new Corn(
							jTextField7.getText(), jTextField10.getText(), jTextField9.getText(), jComboBox5.getSelectedItem().toString(), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField3.getText())
							);
						System.out.println(plot.requiredN());
						System.out.println(plot.waterNeeded());
						System.out.println(plot.harvestDate());
						System.out.println();
					}
					else if (crop3.equals("Wheat")){
						Wheat plot = new Wheat(
							jTextField7.getText(), jTextField10.getText(), jTextField9.getText(), jComboBox5.getSelectedItem().toString(), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField3.getText())
							);
						System.out.println(plot.requiredN());
						System.out.println(plot.waterNeeded());
						System.out.println(plot.harvestDate());
						System.out.println();
					}
				}
				String crop4 = jComboBox4.getSelectedItem().toString();
				if (crop4 != "Select"){

					System.out.println(jLabel5.getText() + ": " + crop4);
					if (crop4.equals("Corn")){
						Corn plot = new Corn(
							jTextField8.getText(), jTextField10.getText(), jTextField9.getText(), jComboBox5.getSelectedItem().toString(), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField4.getText())
							);
						System.out.println(plot.requiredN());
						System.out.println(plot.waterNeeded());
						System.out.println(plot.harvestDate());
						System.out.println();
					}
					else if (crop4.equals("Wheat")){
						Wheat plot = new Wheat(
							jTextField8.getText(), jTextField10.getText(), jTextField9.getText(), jComboBox5.getSelectedItem().toString(), Double.parseDouble(jTextField11.getText()), Double.parseDouble(jTextField4.getText())
							);
						System.out.println(plot.requiredN());
						System.out.println(plot.waterNeeded());
						System.out.println(plot.harvestDate());
						System.out.println();
					}
				}
			}
			catch(NumberFormatException e){
				System.out.println("Make sure that the form is filled out correctly");
			}
			catch(JSONException e){
				System.out.println("Make sure that the form is filled out correctly");
			}
			System.out.println("DONE" + "\n" + "\n");
		}
	}//GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(AgriPlannerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AgriPlannerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AgriPlannerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AgriPlannerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AgriPlannerUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JComboBox<String> jComboBox3;
	private javax.swing.JComboBox<String> jComboBox4;
	private javax.swing.JComboBox<String> jComboBox5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	// End of variables declaration//GEN-END:variables
}
