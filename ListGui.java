//Author Name :- Sonu Kumar 
//This code will help u understand how to use data Structure is implemented using java.
//I have creating GUI for Data Structure which will help understanding the concept of DS easily. 

package udemy;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
import javax.swing.*;

import udemy.win.closing;

class Manipulation extends JFrame implements ActionListener
{
	//Creating list of JButtons
	JButton b[] = new JButton[15];
	LinkedList<Integer> llist= new LinkedList();
	Manipulation()
	{
		//Setting Frame Name
		super("Demo of LinkedList");
		
	//Creating an object of buttons	
	b[0] = new JButton("Inset Element");
	b[1] = new JButton("Insert in Postition");
	b[4] = new JButton("Swap");
	b[5] = new JButton("Remove a specified element");
	b[7] = new JButton("display");
	b[6] = new JButton("display element and position");
	b[2] = new JButton("Display from a position");
	b[3] = new JButton("Display Reverse");
	b[8] = new JButton("Insert First");
	b[9] = new JButton("Remove First");
	b[10] = new JButton("Remove from Index");
	b[11] = new JButton("Remove Last");
	b[12] = new JButton("Searching if Element Exist");

	//Setting the Frame layout as null
	setLayout(null);
	
	//Aligning the components for Insertion button
	b[0].setBounds(10,10,230,20);
	add(b[0]);
	
	b[1].setBounds(250,10,230,20);
	add(b[1]);
	
	b[8].setBounds(10,45,230,20);
	add(b[8]);
	
	b[4].setBounds(250,45,230,20);
	add(b[4]);
	
	//Aligning the components for Remove button

	b[5].setBounds(10,135,230,20);
	add(b[5]);
	
	b[9].setBounds(10,100,230,20);
	add(b[9]);

	b[10].setBounds(250,100,230,20);
	add(b[10]);
	
	b[11].setBounds(250,135,230,20);
	add(b[11]);
	
	//Aligning the components for delete button
	
	b[7].setBounds(10,190,230,20);
	add(b[7]);
	
	b[3].setBounds(250,190,230,20);
	add(b[3]);
	
	b[6].setBounds(10,225,230,20);
	add(b[6]);
	
	b[2].setBounds(250,225,230,20);
	add(b[2]);
	
	b[12].setBounds(10,280,230,20);
	add(b[12]);
	
	
	//Adding ActionListener to all the buttons
	b[0].addActionListener(this);
	b[1].addActionListener(this);
	b[2].addActionListener(this);
	b[3].addActionListener(this);
	b[4].addActionListener(this);
	b[5].addActionListener(this);
	b[6].addActionListener(this);
	b[7].addActionListener(this);
	b[8].addActionListener(this);
	b[9].addActionListener(this);
	b[10].addActionListener(this);
	b[11].addActionListener(this);
	b[12].addActionListener(this);
		
	//Code for Terminating the frame
	class ClosingGui extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	addWindowListener(new ClosingGui());
	}
	 
//code for Performing action on each button
	
	public void actionPerformed(ActionEvent e) 
	{
		//Code for insertion
		if(e.getSource()==b[0])
		{
			String name;
			name = JOptionPane.showInputDialog("Enter a number ");

			int num=Integer.parseInt(name);
			llist.add(num);
		}
		
		//Code for Insert in Position
		
		else if(e.getSource()==b[1])
		{
			String name,pos;
			
			name = JOptionPane.showInputDialog("Enter a number ");
			pos = JOptionPane.showInputDialog("Enter a Position");

			int ele=Integer.parseInt(name);
			int ind = Integer.parseInt(pos);
			
			if(ind > llist.size()-1)
			{
				JOptionPane.showMessageDialog(null,"Enter a valid position");
			}
			
			else
			{
			  llist.add(ind, ele);
			}
		}
		
		//code for Displaying from a position
				else if(e.getSource()==b[2])
				{
					String pos2 = JOptionPane.showInputDialog("Enter a Position");
					int ind = Integer.parseInt(pos2);
					
					String str1 = " ";
					
					if(ind > llist.size()-1)
					{
						JOptionPane.showMessageDialog(null,"Enter a valid position");
					}
					
					else
					{
					for(int i= ind;i<llist.size();i++)
					{
						 str1 =str1+llist.get(i)+"  ";
					}
					 JOptionPane.showMessageDialog(null,str1);
					}
				}
		

		//code for Displaying Reverse
		else if(e.getSource()==b[3])
		{

			String str2 = " ";
			for(int i= llist.size()-1;i>=0;i--)
			{
				str2 =str2 +llist.get(i)+"  ";
			}
			JOptionPane.showMessageDialog(null,str2);
		}
		
		//code for Swap
		else if(e.getSource()==b[4])
		{
			String pos1 = JOptionPane.showInputDialog("Enter a 1st Position");
			String pos2 = JOptionPane.showInputDialog("Enter a 2nd Position");
			
			int ind1 = Integer.parseInt(pos1);
			int ind2 = Integer.parseInt(pos2);
			
			if(ind1> llist.size()-1 || ind2> llist.size()-1 || ind1<=-1 || ind2<= -1)
			{
				JOptionPane.showMessageDialog(null,"Enter a valid Number");
			}
			else
			{
				LinkedList<Integer> dummtlist = new LinkedList();
				dummtlist = (LinkedList) llist.clone();
				Collections.swap(llist,ind1,ind2);
				JOptionPane.showMessageDialog(null,"Befor Swapping"+"\n"+dummtlist+"\n"+"After Swapping"+"\n"+llist);
			}
		}
		

		//code for Remove a specified element
		else if(e.getSource()==b[5])
		{
			String pos1 = JOptionPane.showInputDialog("Enter the element");
			int ind1 = Integer.parseInt(pos1);
			for(int rem=0;rem<llist.size();rem++)
			{
				if(llist.get(rem)==ind1)
				{
					llist.remove(rem);
					JOptionPane.showMessageDialog(null,"Item Successfully removed");			
				}
			}
		}
		
		//code for Display position and element
				else if(e.getSource()==b[6])
				{
					String str1="";
					
					for(int i = 0; i<llist.size();i++)
					{
						str1 =str1+llist.get(i)+"  at position "+i+"\n";
					}
					JOptionPane.showMessageDialog(null,str1);	
				}
		
		//code for Display List
		else if(e.getSource()==b[7])
		{
			JOptionPane.showMessageDialog(null,llist);
		}
		
		//code Insert First
		else if(e.getSource()==b[8])
		{
			if(e.getSource()==b[8])
			{
				String name;
				name = JOptionPane.showInputDialog("Enter a number ");

				int num=Integer.parseInt(name);
				llist.addFirst(num);
			}
		}
		
		//code Remove First Element
		else if(e.getSource()==b[9])
		{
			llist.removeFirst();
			JOptionPane.showMessageDialog(null,"Successfully Removed First element");
		}
		
		//code for Remove From Index
		else if(e.getSource()==b[10])
		{
			String pos1 = JOptionPane.showInputDialog("Enter the Position");
			int ind1 = Integer.parseInt(pos1);
			
			if(ind1> llist.size()-1 || ind1<=-1)
			{
				JOptionPane.showMessageDialog(null,"Enter a valid Number");
			}
			else
			{
			llist.remove(ind1);
			JOptionPane.showMessageDialog(null,"Successfully Removed");
			}
		}
		
		//code for Remove Last
		else if(e.getSource() == b[11])
		{
			llist.remove();
			JOptionPane.showMessageDialog(null,"Successfully Removed Last Element");
		}
		
		
		//code for Searching if Element Exist
		else if(e.getSource()==b[12])
		{
			String pos1 = JOptionPane.showInputDialog("Enter the element to be searched"); 
			int ind1 = Integer.parseInt(pos1);
	        // Initializing the answer to the index -1 
	        int ans = -1; 
	  
	        // Traversing through the Linked List 
	        for (int i = 0; i < llist.size(); i++) { 
	        	
	            int llElement = llist.get(i); 
	  
	            if (llElement == ind1) 
	            { 
	                ans = i; 
	                break; 
	            } 
	        } 
	        
	        if (ans == -1) { 
	        	JOptionPane.showMessageDialog(null,"Element not Found"); 
	        } 
	        else { 
	        	JOptionPane.showMessageDialog(null,"Element found in Linked List at " + ans +" position"); 
	        } 
	    }
}
}

public class ListGui 
{
	public static void main(String arge[])
	{
		Manipulation man = new Manipulation();
		man.setSize(500,350);
		man.setVisible(true);
		man.setResizable(false);
	}

}


