package gui;

import javax.swing.JOptionPane;

public class JOPtionPaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JOptionPane.showMessageDialog(null, "Welcome IMU !!!");
//		JOptionPane.showConfirmDialog(null, "Erased your disk ???");
		
//		int choice = JOptionPane.showConfirmDialog(null, "Erased your disk ???");
//		if (choice == JOptionPane.YES_NO_OPTION) {
//			JOptionPane.showMessageDialog(null, "Disk erased!");
//		}
//			else if(choice == JOptionPane.NO_OPTION){
//			JOptionPane.showMessageDialog(null, "No!");
//		} else {
//			JOptionPane.showMessageDialog(null, "Cancelled!");
//		}
		
		String name = JOptionPane.showInputDialog(null, "What is your Name ? ");
		JOptionPane.showMessageDialog(null, "Your name is "+name);
		
		

	}

}
