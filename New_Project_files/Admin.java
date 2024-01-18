import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Admin extends JFrame {
	private JPasswordField txtPass;
	private JTextField txtUserName;
	private JLabel lblUserName,lblPassword;
	private JButton btnOK,btnCancel;

	private Connection con;
	private Statement s;
	private PreparedStatement ps;
	private ResultSet rs;

	public static void main(String[] args) {
		new Admin();
	}

	public Admin() {
		lblUserName = new JLabel("User Name:");
		lblPassword = new JLabel("Password:");

		txtPass = new JPasswordField();
		txtUserName = new JTextField();

		btnOK = new JButton("OK");
		btnCancel = new JButton("Cancel");

		lblUserName.setDisplayedMnemonic('N');
		lblPassword.setDisplayedMnemonic('P');

		lblUserName.setLabelFor(txtUserName);
		lblPassword.setLabelFor(txtPass);

		btnOK.setMnemonic('O');
		btnCancel.setMnemonic('C');

		lblUserName.setFont(new Font(Font.SERIF, Font.BOLD,  25));
		lblPassword.setFont(new Font(Font.SERIF, Font.BOLD,  25));
		txtUserName.setFont(new Font(Font.SERIF, Font.BOLD,  25));
		txtPass.setFont(new Font(Font.SERIF, Font.BOLD,  25));
		btnOK.setFont(new Font(Font.SERIF, Font.BOLD,  25));
		btnCancel.setFont(new Font(Font.SERIF, Font.BOLD,  25));

		setTitle("Admin Login");
		setLayout(new GridLayout(3, 2));
		setSize(400,200);
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/logo.png"));

		add(lblUserName);
		add(txtUserName);
		add(lblPassword);
		add(txtPass);
		add(btnOK);
		add(btnCancel);
    setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					ps = con.prepareStatement("select * from admin where admin_id=? and admin_pwd=?");
					String uid = txtUserName.getText();
					String pass = txtPass.getText();
					ps.setString(1,uid);
					ps.setString(2,pass);
					rs = ps.executeQuery();
					if(rs.next()){
						JOptionPane.showMessageDialog(null,"Login Successful.");
						new Home().setVisible(true);;
						dispose();
					}
					else{
						JOptionPane.showMessageDialog(null,"Login Failed.");
						txtUserName.setText("");
						txtPass.setText("");
						txtUserName.requestFocus();
					}
		   	}
		   	catch(Exception e){
		   		JOptionPane.showMessageDialog(null,e);
		   		dispose();
		   	}
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		try{
			con=javaconnect.ConnectDb();
   	}
   	catch(Exception e){
   		JOptionPane.showMessageDialog(null,e);
   		dispose();
  	}
	}
}
