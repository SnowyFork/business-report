//by Chauke A.

package component;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.lang.NumberFormatException;

public class Inventory extends JFrame 
{
    JLabel inventoryitemlabel, deptnumlabel, unitcostlabel, quantitylabel;
    JLabel inventorycostlabel, displaygraph;
    JTextField inventoryitemfield, deptnumfield, unitcostfield, quantityfield;
    JTextField inventorycostfield;
    JButton calculatebutton;
    
    //building the pop-up
    
    public Inventory() 
    {
        super("Inventory Report");
        
        Container container = getContentPane();
        container.setLayout( null );
        container.setBackground(Color.red);
        
        inventoryitemlabel = new JLabel( "Item name");
        inventoryitemlabel.setBounds(16, 16, 150, 21);
        container.add( inventoryitemlabel);
        
        inventoryitemfield = new JTextField();
        inventoryitemfield.setBounds(150, 16, 90, 21);
        inventoryitemfield.setHorizontalAlignment(JTextField.RIGHT);
        container.add( inventoryitemfield);
        
        deptnumlabel = new JLabel( "department number");
        deptnumlabel.setBounds(16, 56, 150, 21);
        container.add( deptnumlabel);
        
        deptnumfield = new JTextField();
        deptnumfield.setBounds(150, 56, 90, 21);
        deptnumfield.setHorizontalAlignment(JTextField.RIGHT);
        container.add( deptnumfield);
               
        quantitylabel = new JLabel( "how many items");
        quantitylabel.setBounds(16, 96, 150, 21);
        container.add( quantitylabel);
        
        quantityfield = new JTextField();
        quantityfield.setBounds(150, 96, 90, 21);
        quantityfield.setHorizontalAlignment(JTextField.RIGHT);
        container.add( quantityfield);
        
        unitcostlabel = new JLabel( "cost of each item" );
        unitcostlabel.setBounds(16, 136, 150, 21);
        container.add( unitcostlabel);
        
        unitcostfield = new JTextField();
        unitcostfield.setBounds(150, 136, 90, 21);
        unitcostfield.setHorizontalAlignment(JTextField.RIGHT);
        container.add( unitcostfield);
        
        inventorycostlabel = new JLabel( "total item cost");
        inventorycostlabel.setBounds(16, 176, 150, 21);
        container.add( inventorycostlabel);
        
        inventorycostfield = new JTextField();
        inventorycostfield.setBounds(150, 176, 90, 21);
        inventorycostfield.setEditable(false);
        inventorycostfield.setHorizontalAlignment(JTextField.RIGHT);
        container.add( inventorycostfield);
        
        calculatebutton = new JButton("calculate profits");
        calculatebutton.setBounds(90, 210, 150, 21);
        container.add( calculatebutton);
        
        Icon icon = new ImageIcon("ftp://spccis.spc.edu/mitchellcourses/Cs237/Chauke%20Abuhandah/chapter%2011%20inventory%20report/chart.jpg");
        JLabel graph = new JLabel(icon);
        graph.setBounds(300, 5, 200, 200);
        container.add(graph); 
        
        displaygraph = new JLabel("inventory report");
        displaygraph.setForeground(Color.BLUE);
        displaygraph.setFont(new Font("arial", Font.PLAIN, 35));
        displaygraph.setBounds(300, 120, 300, 300);
        getContentPane().add(displaygraph, BorderLayout.CENTER);
        
        calculatebutton.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                payments();
            }
        }        
        );
        pack();
        setSize(700, 350);
        show();
    }
    
    //calculations
    
    public void payments() throws NumberFormatException
    {
        double quantity=0, unitcost=0, inventorycost, backupquantity=0, backupunitcost=0;
        String sinventcost;
        boolean continueloop = true;
        
        do
        {
            try
            {
                quantity = Integer.parseInt(quantityfield.getText());
                unitcost = Double.parseDouble(unitcostfield.getText());
                continueloop = false;
            }
            catch (NumberFormatException numberFormatException)
            {
                System.err.printf("\nException: %s\n", numberFormatException);
                System.out.println("input that was parsed was not a number. Here is a zero isntead. Please try again.");
                quantity = 0;
                unitcost = 0;
                quantityfield.setText("0");
                unitcostfield.setText("0");
                continueloop = false;
            }
        }while(continueloop);
        
        inventorycost = quantity * unitcost;
        
        sinventcost = Double.valueOf(inventorycost).toString();
        
        inventorycostfield.setText(sinventcost);
    }
    
    //main
    
    public static void main(String args[]) throws IOException
    {
        new Inventory();
    }
}
