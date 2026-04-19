package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ProductUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ProductField;
	private JTextField PriceField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {   
				try {
					ProductUI frame = new ProductUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProductUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCT DETAILS");
		lblNewLabel.setBounds(164, 11, 108, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setBounds(89, 71, 46, 14); 
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Company");
		lblNewLabel_2.setBounds(89, 115, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setBounds(89, 157, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		ProductField = new JTextField();
		ProductField.setBounds(164, 68, 86, 20);
		contentPane.add(ProductField);
		ProductField.setColumns(10);
		
		PriceField = new JTextField();
		PriceField.setBounds(164, 154, 86, 20);
		contentPane.add(PriceField);
		PriceField.setColumns(10);
		
		JComboBox ComboBox = new JComboBox();
		ComboBox.setModel(new DefaultComboBoxModel(new String[] {"select","Dell", "CG", "HP","Apple"}));
		ComboBox.setBounds(164, 111, 86, 22);
		contentPane.add(ComboBox);

		
		
		
		
		
		JButton addbtn = new JButton("Add");
		addbtn.setBounds(134, 209, 95, 25);
		contentPane.add(addbtn);
		addbtn.addActionListener(e ->{
			
			// form validation
			if(ProductField.getText().isBlank()) {
				JOptionPane.showMessageDialog(ProductField , "Please enter product name");
				return;
			}
			
			if(ComboBox.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(ComboBox , "Please select company name");
				return;
			}
			
			if(PriceField.getText().isBlank()) {
				JOptionPane.showMessageDialog(PriceField , "Please enter price");
				return;
			}
			

	
			
			ProductService service = new ProductServiceImpl();
			Product p = new Product();
			
			p.setName(ProductField.getText());
			p.setCompany(ComboBox.getSelectedItem().toString());
			p.setPrice(Integer.parseInt(PriceField.getText()));
			JOptionPane.showMessageDialog(null, "Add products successfully");
			
			//clear input data
			ProductField.setText("");
			ComboBox.setSelectedIndex(0);
        	//..textField_2.setText

			
			service.addProduct(p);
		});

	}
}
