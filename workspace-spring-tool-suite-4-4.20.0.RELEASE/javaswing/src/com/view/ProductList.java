package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ProductList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;
	private JTextField SearchField;
	private JTextField NameField;
	private JTextField PriceField;
	private int id;

	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductList frame = new ProductList();
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
	public ProductList() {
		setTitle("ProductList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(242, 59, 328, 167);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "name", "company", "price"
			}
			
		));
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("Product List");
		lblNewLabel.setBounds(288, 11, 116, 25);
		contentPane.add(lblNewLabel);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.setBackground(SystemColor.activeCaptionBorder);
		DeleteButton.setForeground(Color.BLACK);
		DeleteButton.setBounds(466, 237, 89, 23);
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(table_1.getSelectedRow() < 0 ) {
					
					JOptionPane.showMessageDialog(null, "select row");
					return;
				}
				
				int srow = table_1.getSelectedRow();
				int id = (int) table_1.getModel().getValueAt(srow, 0);
				
				
				ProductService service = new ProductServiceImpl();
				service.deleteProduct(id);
				JOptionPane.showMessageDialog(null, "product deletd success");
			}
		});
		contentPane.add(DeleteButton);
		
		JLabel lblNewLabel_1 = new JLabel("Search");
		lblNewLabel_1.setBounds(410, 31, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		SearchField = new JTextField();
		SearchField.setBackground(Color.WHITE);
		SearchField.setBounds(466, 28, 104, 20);
		SearchField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				String sdata = SearchField.getText().trim();
				ProductService service = new ProductServiceImpl();
				List<Product> plist = service.searchProduct(sdata);
						
			    DefaultTableModel tmodel = (DefaultTableModel) table_1.getModel();
				tmodel.setRowCount(0);// reset data
				
				for(Product pd : plist) {
					
					tmodel.addRow(new Object[] {pd.getId(), pd.getName(), pd.getCompany(),pd.getPrice()  });
				}			
			}
		});
		contentPane.add(SearchField);
		SearchField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(22, 72, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		NameField = new JTextField();
		NameField.setBounds(79, 61, 95, 25);
		contentPane.add(NameField);
		NameField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setBounds(22, 115, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		PriceField = new JTextField();
		PriceField.setBounds(79, 110, 95, 25);
		contentPane.add(PriceField);
		PriceField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("company");
		lblNewLabel_4.setBounds(22, 169, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "Apple", "CG", "Dell", "HP"}));
		comboBox.setBounds(79, 164, 95, 25);
		contentPane.add(comboBox);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Product pd = new Product();
				pd.setId(id);
				pd.setName(NameField.getText());
				pd.setPrice(Integer.parseInt(PriceField.getText()));
		        pd.setCompany(comboBox.getSelectedItem().toString());
		    
		        ProductService  service = new ProductServiceImpl();
		        
		        service.updateProduct(pd);
		        JOptionPane.showMessageDialog(null,"update success");
		        
		        displayData();
		        
			}
		});
		UpdateButton.setBounds(54, 227, 89, 23);
		contentPane.add(UpdateButton);
		
		JButton EditButton = new JButton("Edit");
		EditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(table_1.getSelectedRow() < 0) {
					
					JOptionPane.showMessageDialog(null, "select any row");
					return;
				}
				
				
				int srow = table_1.getSelectedRow();
				 id = (int) table_1.getModel().getValueAt(srow, 0);
				
				 NameField.setText(table_1.getModel().getValueAt(srow, 1).toString());
				 PriceField .setText(table_1.getModel().getValueAt(srow, 1).toString());
				 comboBox.setSelectedItem(table_1.getModel().getValueAt(srow, 2));
		        
		        
			}
		});
		EditButton.setBounds(334, 237, 89, 23);
		contentPane.add(EditButton);
		
		JButton btnNewButton_3 = new JButton("Add");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				new ProductUI().setVisible(true);
							
			}
		});
		btnNewButton_3.setBounds(33, 27, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton PrintButton = new JButton("Print");
		PrintButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            table_1.print();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		PrintButton.setBounds(217, 237, 89, 23);
		contentPane.add(PrintButton);
		displayData();
	}	
        	
	// display data in jtable
	
	
	private void displayData()
	{
		
		ProductService service = new ProductServiceImpl();
		List<Product> plist = service.getAllProducts();
		
		DefaultTableModel tmodel = (DefaultTableModel) table_1.getModel();
		tmodel.setRowCount(0);// reset data
		
		for(Product pd : plist) {
			
			tmodel.addRow(new Object[] {pd.getId(), pd.getName(), pd.getCompany(),pd.getPrice()  });
		}
		
	}
}
