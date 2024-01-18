import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
import java.util.*;

public class ViewTicket extends JFrame{
	private JEditorPane txtMain;

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public ViewTicket(int tid){
		txtMain = new JEditorPane();
		txtMain.setContentType("text/html");
		txtMain.setEditable(false);
		setTitle("View Ticket");
		setSize(900,500);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);

		add(new JScrollPane(txtMain), "Center");
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);

		try {
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atbs","root","");
            ps = con.prepareStatement("select * from book_ticket where ticket_no=?;");
	        ps.setInt(1,tid);
	        rs = ps.executeQuery();
	        rs.next();

			String html= "<table align='center' width='50%' border=1 bgcolor='white'>"+
            "<tr><td><b>Ticket No:</b></td><td>"+rs.getString(1)+"</td></tr>"+
            "<tr><td><b>Flight ID:</b></td><td>"+rs.getString(2)+"</td></tr>"+
            "<tr><td><b>Flight Name:</b></td><td>"+rs.getString(3)+"</td></tr>"+
            "<tr><td><b>Source:</b></td><td>"+rs.getString(4)+"</td></tr>"+
            "<tr><td><b>Destination:</b></td><td>"+rs.getString(5)+"</td></tr>"+
            "<tr><td><b>Date:</b></td><td>Rs."+rs.getString(6)+"/-</td></tr>"+
            "<tr><td><b>Arrival Time:</b></td><td>"+rs.getString(7)+"</td></tr>"+
            "<tr><td><b>Departure Time:</b></td><td>"+rs.getString(8)+"</td></tr>"+
            "<tr><td><b>Total Price:</b></td><td>"+rs.getString(9)+"</td></tr>"+
            "<tr><td><b>No.of Seats:</b></td><td>"+rs.getString(10)+"</td></tr>"+
            "<tr><td><b>Customer Name:</b></td><td>"+rs.getString(11)+"</td></tr>"+
            "</table><br>";

			txtMain.setText(html);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			dispose();
		}
	}

    public static void main(String args[]){
        new ViewTicket(1);
    }
}
