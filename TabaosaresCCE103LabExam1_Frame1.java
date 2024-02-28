package TabaosareCCE103;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TabaosaresCCE103LabExam1_Frame1 implements ActionListener {

	private static JLabel itemname, total, price, operation,enteritemname, enteritemprice, selectitem;
	private static JTextField ttl, entname, entprice ;
	private static JButton addnewitem, deleteitem;
	private static JTextArea itmnme, prc;
	
	public static void main(String[] args) {
	
		//Frames
        JFrame frame = new JFrame();        
        frame.setSize(600, 530);
        frame.setTitle("Lab5Tabaosares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel p = new JPanel();
        
        frame.add(p);
        p.setLayout(null);
        
        //Labels
        JLabel title = new JLabel("MY ORDERS ");
        title.setBounds(220, 10, 250, 55);
        p.add(title);        
        Font fn = new Font("Arial",Font.BOLD,25);
        title.setFont(fn);
        
        itemname = new JLabel("ITEM NAME ");
        itemname.setBounds(60, 110, 80, 25);
        p.add(itemname);
        
        price = new JLabel("PRICE");
        price.setBounds(220, 110, 80, 25);
        p.add(price);
        
        operation = new JLabel("OPERATION");
        operation.setBounds(380, 110, 80, 25);
        p.add(operation);
        
        total = new JLabel("TOTAl:");
        total.setBounds(350, 70, 120, 25);
        p.add(total);
        
        enteritemname = new JLabel("Enter Item Name:");
        enteritemname.setBounds(380, 170, 120, 25);
        p.add(enteritemname);
        
        enteritemprice = new JLabel("Enter Item Price:");
        enteritemprice.setBounds(380, 230, 120, 25);
        p.add(enteritemprice);
        
        selectitem = new JLabel("Select Item:");
        selectitem.setBounds(380, 350, 180, 30);
        p.add(selectitem);
        
        //Text field
      
       
       
        ttl = new JTextField();
        ttl.setBounds(390, 70, 120, 25);
        ttl.setEditable(false);
        p.add(ttl);
        
        entname = new JTextField();
        entname.setBounds(380, 200, 180, 25);
        entname.setEditable(true);
        p.add(entname);
        
        entprice = new JTextField();
        entprice.setBounds(380, 260, 180, 25);
        entprice.setEditable(true);
        p.add(entprice);
        
        //combo box
        
        String  choice[] = {};
        JComboBox cb = new JComboBox(choice);
        cb.setBounds(380, 380, 180, 25);
        p.add(cb);
                     
        
        //Button
        
        addnewitem = new JButton("ADD NEW ITEM");
        addnewitem.addActionListener(new TabaosaresCCE103LabExam1_Frame1());
        addnewitem.setBounds(380, 300, 180, 30);
        p.add(addnewitem);
        
        deleteitem = new JButton("DELETE ITEM");
        deleteitem.addActionListener(new TabaosaresCCE103LabExam1_Frame1());
        deleteitem.setBounds(380, 430, 180, 30);
        p.add(deleteitem);
        
        //
        
        itmnme = new JTextArea();
        itmnme.setEditable(false);
        itmnme.setLineWrap(true);
        itmnme.setWrapStyleWord(true);
        itmnme.setBounds(30, 130, 130, 350);
        p.add(itmnme);

        prc = new JTextArea();
        prc.setEditable(false);
        prc.setLineWrap(true);
        prc.setWrapStyleWord(true);
        prc.setBounds(170, 130, 130, 350);
        p.add(prc);
        
        
        frame.setVisible(true);        

        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		       
     if(e.getSource() == addnewitem) {
         try {
              
             double amount ;
             entname.setText(String.valueOf(total));
             prc.setText(String.valueOf(total));
 
             String itemname = itmnme.getText();
             
             prc.setText("" + price );
             entname.setText("" + enteritemname );
             
         } catch(NumberFormatException ex) {
           
         }
     } else if (e.getSource() == deleteitem) {
         entname.setText("");
         prc.setText("");
         price.setText("");
         entprice.setText("");


     }
     
 }
}