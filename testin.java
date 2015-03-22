import java.util.Scanner;

import javax.swing.JOptionPane;


public class testin {
	public static void main(String[] args) {
		String tempuser = "";
		String temppass = "";
		String admin = "admin";
		String adminp = "admin1";
		String student = "student";
		String studentp = "student1";
		String staff = "staff";
		String staffp = "staff1";
		Boolean status=true;
		Boolean ad,stu,sta;
		int i=0, a,s,st;
		
		String[] choices = {admin, student, staff};
		String input = (String) JOptionPane.showInputDialog
				(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
		System.out.println(input);
		
		ad = Boolean.parseBoolean(admin);
		stu= Boolean.parseBoolean(student);
		sta= Boolean.parseBoolean(staff);
		
		switch(input) {
		
		case "admin" : {{
			tempuser = JOptionPane.showInputDialog("Enter your username");
			for(int x=1; x<=2;x++){
				if (tempuser.equalsIgnoreCase(admin)){ x=+3;}
				if(!tempuser.equalsIgnoreCase(admin)) {
					tempuser = JOptionPane.showInputDialog("Enter your username again");
					i++; }}
			for (int x=1; x<=1; x++) {
				if(!tempuser.equalsIgnoreCase(admin)){
					JOptionPane.showMessageDialog(null,"Your account is locked");
					JOptionPane.showMessageDialog(null, "Please contact your adminstrator to unlock your account!"); 
					return;
					}}
	
			temppass = JOptionPane.showInputDialog("Enter your password");
		
			for(int x=1; x<=2;x++){
				if(temppass.equalsIgnoreCase(adminp)){ x=+3;}
				if(!temppass.equalsIgnoreCase(adminp)){
					temppass = JOptionPane.showInputDialog("Enter your password again");
					i++; }}
			for (int x=1; x<=1; x++) {
				if(!temppass.equalsIgnoreCase(adminp)){
					JOptionPane.showMessageDialog(null,"Your account is locked");
					JOptionPane.showMessageDialog(null,"Please contact your adminstrator to unlock your account!"); 
					return;
				}
		} JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read file.");
			} } break;
		
		case "student": {{
			tempuser = JOptionPane.showInputDialog("Enter your username");
			for(int x=1; x<=2;x++){
				if(tempuser.equalsIgnoreCase(student)){ x=+3;}
				if(!tempuser.equalsIgnoreCase(student)) {
					tempuser = JOptionPane.showInputDialog("Enter your username again");
					i++;}}
			for (int x=1; x<=1; x++) {
				if(!tempuser.equalsIgnoreCase(student)){
					JOptionPane.showMessageDialog(null,"Your account is locked");
					JOptionPane.showMessageDialog(null, "Please contact your adminstrator to unlock your account!"); 
					return;
					}} 
	
		temppass = JOptionPane.showInputDialog("Enter your password");
		
		for(int x=1; x<=2;x++){
			if(temppass.equalsIgnoreCase(studentp)){ x=+3;}
			if(!temppass.equalsIgnoreCase(studentp)) {
				temppass = JOptionPane.showInputDialog("Enter your password again");
				i++;}}
			for (int x=1; x<=1; x++) {
				if(!temppass.equalsIgnoreCase(studentp)){
					JOptionPane.showMessageDialog(null,"Your account is locked");
					JOptionPane.showMessageDialog(null,"Please contact your adminstrator to unlock your account!"); 
					return;
				}
		} JOptionPane.showMessageDialog(null,"Welcome Student! You can only read file.");
			}} break;
		
		case "staff": {{
			tempuser = JOptionPane.showInputDialog("Enter your username");
			for(int x=1; x<=2;x++){
				if(tempuser.equalsIgnoreCase(staff)){ x=+3;}
				if(!tempuser.equalsIgnoreCase(staff)) {
					tempuser = JOptionPane.showInputDialog("Enter your username again");
					i++;}}
			for (int x=1; x<=1; x++) {
				if(!tempuser.equalsIgnoreCase(staff)){
					JOptionPane.showMessageDialog(null,"Your account is locked");
					JOptionPane.showMessageDialog(null, "Please contact your adminstrator to unlock your account!"); 
					return;
					}}
	
		temppass = JOptionPane.showInputDialog("Enter your password");
		
		for(int x=1; x<=2;x++){
			if(temppass.equalsIgnoreCase(staffp)){ x=+3;}
			if(!temppass.equalsIgnoreCase(staffp)) {
				temppass = JOptionPane.showInputDialog("Enter your password again");
				i++;}}
			for (int x=1; x<=1; x++) {
				if(!temppass.equalsIgnoreCase(staffp)){
					JOptionPane.showMessageDialog(null,"Your account is locked");
					JOptionPane.showMessageDialog(null,"Please contact your adminstrator to unlock your account!"); 
					return;
				}break;
		} } JOptionPane.showMessageDialog(null,"Welcome Staff! You can update, read, add, delete file.");
		} 
		

}}}