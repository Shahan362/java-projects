package cgpa_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame implements ActionListener{
  JLabel l1,l2,l3,l4;
  JTextField l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
  JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,cgpa;
  JTextField c1,c2,c3,c4,c5,c7,c8,c9,c10,c6;
  JButton b;
  
  double value;
  
	public Frame()
	{
		setSize(900,900);
		
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
		l1=new JLabel("LEADING UNIVERSITY CGPA CALCULATOR");
    	l1.setBounds(100,30,400,25);
    	add(l1);
    	
    	
    	l2=new JLabel("SUBJECT :");
    	l2.setBounds(100,60,70,25);
    	add(l2);
    	
    	l3=new JLabel("CREDIT :");
    	l3.setBounds(370,60,70,25);
    	add(l3);
    	
    	l4=new JLabel("MARKS :");
    	l4.setBounds(450,60,70,25);
    	add(l4);
    	
    	l5=new JTextField(70);
    	l5.setBounds(100,95,120,25);
    	add(l5);
    	
    	
    	
    	l6=new JTextField();
    	l6.setBounds(100,130,120,25);
    	add(l6);
    	
    	l7=new JTextField();
    	l7.setBounds(100,165,120,25);
    	add(l7);
    	
    	l8=new JTextField();
    	l8.setBounds(100,200,120,25);
    	add(l8);
    	
    	l13=new JTextField();
    	l13.setBounds(100,235,120,25);
    	add(l13);
		
    	l9=new JTextField();
    	l9.setBounds(100,270,120,25);
    	add(l9);
		
    	l10=new JTextField();
    	l10.setBounds(100,305,120,25);
    	add(l10);
    	
    	l11=new JTextField();
    	l11.setBounds(100,340,120,25);
    	add(l11);
    	
    	l12=new JTextField();
    	l12.setBounds(100,375,120,25);
    	add(l12);
    	
    	t1=new JTextField();
    	t1.setBounds(450,95,35,25);
    	add(t1);
    	
    	t2=new JTextField();
    	t2.setBounds(450,130,35,25);
    	add(t2);
    	
    	t3=new JTextField();
    	t3.setBounds(450,165,35,25);
    	add(t3);
    	
    	t4=new JTextField();
    	t4.setBounds(450,200,35,25);
    	add(t4);
    	
    	t5=new JTextField();
    	t5.setBounds(450,235,35,25);
    	add(t5);
    	
    	t6=new JTextField();
    	t6.setBounds(450,270,35,25);
    	add(t6);
    	
    	t7=new JTextField();
    	t7.setBounds(450,305,35,25);
    	add(t7);
    	
    	t8=new JTextField();
    	t8.setBounds(450,340,35,25);
    	add(t8);
		
    	t9=new JTextField();
    	t9.setBounds(450,375,35,25);
    	add(t9);
		
    	
    	c1=new JTextField();
    	c1.setBounds(370,95,35,25);
    	add(c1);
    	
    	c2=new JTextField();
    	c2.setBounds(370,130,35,25);
    	add(c2);
    	
    	c3=new JTextField();
    	c3.setBounds(370,165,35,25);
    	add(c3);
    	
    	c4=new JTextField();
    	c4.setBounds(370,200,35,25);
    	add(c4);
    	
    	c5=new JTextField();
    	c5.setBounds(370,235,35,25);
    	add(c5);
    	
    	
    	c6=new JTextField();
    	c6.setBounds(370,270,35,25);
    	add(c6);
    	
    	c7=new JTextField();
    	c7.setBounds(370,305,35,25);
    	add(c7);
    	
    	c8=new JTextField();
    	c8.setBounds(370,340,35,25);
    	add(c8);
		
    	c9=new JTextField();
    	c9.setBounds(370,375,35,25);
    	add(c9);
    	
    	
    	c10=new JTextField();
    	c10.setBounds(770,250,85,25);
    	add(c10);
		
    	
    	
    	
    	b=new JButton("CGPA ");
    	b.setBounds(650,250,100,25);
    	add(b);
    	
    	b.addActionListener(this);
		
		
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b)
		{
			String num1=t1.getText();
			String num2=t2.getText();
			String num3=t3.getText();
			String num4=t4.getText();
			String num5=t5.getText();
			String num6=t6.getText();
			String num7=t7.getText();
			String num8=t8.getText();
			String num9=t9.getText();
			
			String cc1=c1.getText();
			String cc2=c2.getText();
			String cc3=c3.getText();
			String cc4=c4.getText();
			String cc5=c5.getText();
			String cc6=c6.getText();
			String cc7=c7.getText();
			String cc8=c8.getText();
			String cc9=c9.getText();
			
			
			
			double n1=Double.parseDouble(num1);
			double n2=Double.parseDouble(num2);
			double n3=Double.parseDouble(num3);
			double n4=Double.parseDouble(num4);
			double n5=Double.parseDouble(num5);
			double n6=Double.parseDouble(num6);
			double n7=Double.parseDouble(num7);
			double n8=Double.parseDouble(num8);
			double n9=Double.parseDouble(num9);
			

			double ccc1=Double.parseDouble(cc1);
			double ccc2=Double.parseDouble(cc2);
			double ccc3=Double.parseDouble(cc3);
			double ccc4=Double.parseDouble(cc4);
			double ccc5=Double.parseDouble(cc5);
			double ccc6=Double.parseDouble(cc6);
			double ccc7=Double.parseDouble(cc7);
			double ccc8=Double.parseDouble(cc8);
			double ccc9=Double.parseDouble(cc9);
			//double n2=Double.parseDouble(num2);
			
			if(n1>=80)
			{
				value+=(4*ccc1);
			}
			else if(n1>=75)
			{
				value+=(3.75*ccc1);
			}
			else if(n1>=70)
			{
				value+=(3.5*ccc1);
			}
			else if(n1>=65)
			{
				value+=(3.25*ccc1);
			}
			else if(n1>=60)
			{
				value+=(3*ccc1);
			}
			
			
			
			if(n2>=80)
			{
				value+=(4*ccc2);
			}
			else if(n2>=75)
			{
				value+=(3.75*ccc2);
			}
			else if(n2>=70)
			{
				value+=(3.5*ccc2);
			}
			else if(n2>=65)
			{
				value+=(3.25*ccc2);
			}
			else if(n2>=60)
			{
				value+=(3*ccc2);
			}
			
			if(n3>=80)
			{
				value+=(4*ccc3);
			}
			else if(n3>=75)
			{
				value+=(3.75*ccc3);
			}
			else if(n3>=70)
			{
				value+=(3.5*ccc3);
			}
			else if(n3>=65)
			{
				value+=(3.25*ccc3);
			}
			else if(n3>=60)
			{
				value+=(3*ccc3);
			}
			
			if(n4>=80)
			{
				value+=(4*ccc4);
			}
			else if(n4>=75)
			{
				value+=(3.75*ccc4);
			}
			else if(n4>=70)
			{
				value+=(3.5*ccc4);
			}
			else if(n4>=65)
			{
				value+=(3.25*ccc4);
			}
			else if(n4>=60)
			{
				value+=(3*ccc4);
			}
			if(n5>=80)
			{
				value+=(4*ccc5);
			}
			else if(n5>=75)
			{
				value+=(3.75*ccc5);
			}
			else if(n5>=70)
			{
				value+=(3.5*ccc5);
			}
			else if(n5>=65)
			{
				value+=(3.25*ccc5);
			}
			else if(n5>=60)
			{
				value+=(3*ccc5);
			}
			
			if(n3>=80)
			{
				value+=(4*ccc3);
			}
			else if(n3>=75)
			{
				value+=(3.75*ccc3);
			}
			else if(n3>=70)
			{
				value+=(3.5*ccc3);
			}
			else if(n6>=65)
			{
				value+=(3.25*ccc6);
			}
			else if(n6>=60)
			{
				value+=(3*ccc6);
			}
			if(n7>=80)
			{
				value+=(4*ccc7);
			}
			else if(n7>=75)
			{
				value+=(3.75*ccc7);
			}
			else if(n7>=70)
			{
				value+=(3.5*ccc7);
			}
			else if(n7>=65)
			{
				value+=(3.25*ccc7);
			}
			else if(n7>=60)
			{
				value+=(3*ccc7);
			}
			if(n8>=80)
			{
				value+=(4*ccc8);
			}
			else if(n8>=75)
			{
				value+=(3.75*ccc8);
			}
			else if(n8>=70)
			{
				value+=(3.5*ccc8);
			}
			else if(n8>=65)
			{
				value+=(3.25*ccc8);
			}
			else if(n8>=60)
			{
				value+=(3*ccc8);
			}
			
			if(n9>=80)
			{
				value+=(4*ccc9);
			}
			else if(n9>=75)
			{
				value+=(3.75*ccc9);
			}
			else if(n9>=70)
			{
				value+=(3.5*ccc9);
			}
			else if(n9>=65)
			{
				value+=(3.25*ccc9);
			}
			else if(n9>=60)
			{
				value+=(3*ccc9);
			}
			
			double crsum=ccc1+ccc2+ccc3+ccc4+ccc5+ccc6+ccc7+ccc8+ccc9;
			
	value=value/crsum;
	 String ans="" ;
	  ans = String.format("%.2f", value);
	 c10.setText(ans);
			
			
			
			
			
			
		}
	}
}
