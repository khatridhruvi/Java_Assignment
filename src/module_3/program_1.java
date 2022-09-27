package module_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import module_3.program_1;

public class program_1 implements ActionListener {

	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
	JTextField t1, t2, t3, t4;
	JButton b1, b2, b3, b4, b5, b6;
	JRadioButton r1, r2;

	public program_1() {
		JFrame fr = new JFrame("REGISTRATION FORM");
		fr.setVisible(true);
		fr.setSize(700, 500);
		fr.setLayout(null);

		l1 = new JLabel("Registration form");
		l1.setBounds(60, 10, 120, 30);
		fr.add(l1);

		l2 = new JLabel("ID");
		l2.setBounds(30, 50, 120, 30);
		fr.add(l2);

		l3 = new JLabel("Name     ");
		l3.setBounds(30, 90, 120, 30);
		fr.add(l3);

		l4 = new JLabel("Gender  ");
		l4.setBounds(30, 125, 120, 30);
		fr.add(l4);

		l5 = new JLabel("Address  ");
		l5.setBounds(30, 160, 120, 30);
		fr.add(l5);

		l6 = new JLabel("Contact  ");
		l6.setBounds(30, 200, 120, 30);
		fr.add(l6);

		l7 = new JLabel("Male");
		l7.setBounds(120, 125, 120, 30);
		fr.add(l7);

		l8 = new JLabel("Female");
		l8.setBounds(180, 125, 120, 30);
		fr.add(l8);

		r2 = new JRadioButton();
		r2.setBounds(160, 125, 120, 30);
		fr.add(r2);

		t1 = new JTextField();
		t1.setBounds(100, 50, 120, 30);
		fr.add(t1);

		t2 = new JTextField();
		t2.setBounds(100, 90, 120, 30);
		fr.add(t2);

		t3 = new JTextField();
		t3.setBounds(100, 160, 120, 30);
		fr.add(t3);

		t4 = new JTextField();
		t4.setBounds(100, 200, 120, 30);
		fr.add(t4);

		r1 = new JRadioButton();
		r1.setBounds(100, 125, 120, 30);
		fr.add(r1);

		b1 = new JButton("Exit");
		b1.setBounds(20, 250, 90, 20);
		fr.add(b1);

		b2 = new JButton("Register");
		b2.setBounds(130, 250, 90, 20);
		fr.add(b2);

		b3 = new JButton("Delete");
		b3.setBounds(20, 280, 90, 20);
		fr.add(b3);

		b4 = new JButton("Update");
		b4.setBounds(130, 280, 90, 20);
		fr.add(b4);

		b5 = new JButton("Reset");
		b5.setBounds(70, 310, 90, 20);
		fr.add(b5);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}

	public static void main(String[] args) {
		new program_1();
	}

	public static Connection createConnection() {

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/module_3", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			System.out.println("Register button clicked");
			int id= Integer.parseInt(t1.getText());
			String name = t2.getText();
			String gender  = r1.getText();
			String address = t3.getText();
			long contact = Long.parseLong(t4.getText());
			
			try {
				Connection conn = program_1.createConnection();
				String sql = "insert into registration(id,name,contact,address) values(?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setString(3, gender);
				pst.setString(4, address);
				pst.setLong(5, contact);
				
				//executeUpdate ->DML(insert,update,delete)
				//executeQuery ->select
				pst.executeUpdate();
				System.out.println("Data inserted");
				t1.setText("");
				t2.setText("");
				r1.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		/*else if(e.getSource()==b2) {
			System.out.println("search button clicked");
			int ID = Integer.parseInt(t1.getText());
			try {
				Connection conn = program_1.createConnection();
				String sql = "select * from data_demo where ID=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, ID);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					t1.setText(String.valueOf(rs.getInt("ID")));
					t2.setText(rs.getString("Name"));
					t3.setText(String.valueOf(rs.getLong("Contact")));
					t4.setText(rs.getString("Address"));
				}
				else{
					System.out.println("data not found");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		else if(e.getSource()==b3) {
			System.out.println("update button clicked");
			int ID = Integer.parseInt(t1.getText());
			String Name = t2.getText();
			long Contact = Long.parseLong(t3.getText());
			String Address = t4.getText();
			try {
				Connection conn = program_1.createConnection();
				String sql = "update data_demo set Name=?,Contact=?,Address=? where ID=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, Name);
				pst.setLong(2, Contact);
				pst.setString(3, Address);
				pst.setInt(4, ID);
				pst.executeUpdate();
				System.out.println("data updated");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		else if(e.getSource()==b4) {
			System.out.println("delete button clicked");
			int ID = Integer.parseInt(t1.getText());
			try {
				Connection conn = program_1.createConnection();
				String sql = "delete from data_demo where ID=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, ID);
				pst.executeUpdate();
				System.out.println("data deleted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}*/
	}
}