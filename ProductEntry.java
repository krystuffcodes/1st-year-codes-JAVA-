package acedron;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ProductEntry extends JFrame {

	private DefaultListModel<String> listmodel;
	private JList<String> productlist;
	private JTextField nameField, priceField, quantityField, ammountField;
	
	ProductEntry()
	{
	setTitle("Product Entry");
	setSize(300, 400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	//instantiate the list
	
	listmodel = new DefaultListModel<>();
	productlist = new JList<>(listmodel);
	
	//instantiate JTextField
	JPanel p = new JPanel(new GridLayout(4,2));
	nameField = new JTextField();
	priceField = new JTextField();
	quantityField = new JTextField();
	ammountField = new JTextField();

	//insert JLabel and JTextField to GridLayout
	p.add(new JLabel("Product name"));
	p.add(nameField);
	p.add(new JLabel("Price"));
	p.add(priceField);
	p.add(new JLabel("Quantity"));
	p.add(quantityField);
	p.add(new JLabel("Total Ammount"));
	p.add(ammountField);
	
	JButton addButton = new JButton("Add to cart");
	
	JPanel buttonPanel = new JPanel();
	buttonPanel.add(addButton);
	
	JPanel mainPanel = new JPanel();
	mainPanel.add(p, BorderLayout.NORTH);
	mainPanel.add(new JScrollPane(productlist), BorderLayout.CENTER);
	mainPanel.add(buttonPanel, BorderLayout.SOUTH);
	
	add(mainPanel);
	
	
	}
	
	public static void main(String[] args) {

		new ProductEntry().setVisible(true);;
		
	}

}
