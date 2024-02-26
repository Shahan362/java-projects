package currency_converter;
import java.util.Stack;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;



public class Frame extends JFrame implements ActionListener {
   JButton done;
   JTextField text1,text2;
   JPanel p1,p2;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
   JButton plus,minus,mult,divi,clr,eql;
   double num1=0,num2=0,res=0;
   boolean eq=false;
   
	public Frame()
	{
		
		setSize(500,500);
		setTitle("Calculator");
		
		setDefaultCloseOperation(3);
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		Font fnt = new Font("Times New Roman",Font.BOLD,30);
		
		
		p1 = new JPanel();
		p1.setBounds(2, 2,480,100);
		p1.setBackground(Color.black);
		p1.setLayout(null);
		add(p1);
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(4,4,0,0));
		p2.setBounds(2,100,480,347);
		add(p2);
		
		text2=new JTextField();
		p1.add(text2);
		text2.setBounds(2,2,475,96);
		text2.setFont(new Font("Times New Roman",Font.BOLD,40));
		
		b1=new JButton("1");
		b1.setFont(fnt);
		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);
		p2.add(b1);
		
		
		
		b2=new JButton("2");
		b2.setFont(fnt);
		b2.setBackground(Color.gray);
		b2.setForeground(Color.white);
		p2.add(b2);
		
		b3=new JButton("3");
		b3.setFont(fnt);
		b3.setBackground(Color.gray);
		b3.setForeground(Color.white);
		p2.add(b3);
		
		plus=new JButton("+");
		plus.setFont(fnt);
	    plus.setBackground(Color.darkGray);
		plus.setForeground(Color.white);
		p2.add(plus);
		
		b4=new JButton("4");
		b4.setFont(fnt);
		b4.setBackground(Color.gray);
		b4.setForeground(Color.white);
		p2.add(b4);
		
		b5=new JButton("5");
		b5.setFont(fnt);
		b5.setBackground(Color.gray);
		b5.setForeground(Color.white);
		p2.add(b5);
		
		b6=new JButton("6");
		b6.setFont(fnt);
		b6.setBackground(Color.gray);
		b6.setForeground(Color.white);
		p2.add(b6);
		
		minus=new JButton("-");
		minus.setFont(fnt);
	    minus.setBackground(Color.darkGray);
		minus.setForeground(Color.white);
		p2.add(minus);

		b7=new JButton("7");
		b7.setFont(fnt);
		b7.setBackground(Color.gray);
		b7.setForeground(Color.white);
		p2.add(b7);
		

		b8=new JButton("8");
		b8.setFont(fnt);
		b8.setBackground(Color.gray);
		b8.setForeground(Color.white);
		p2.add(b8);
		

		b9=new JButton("9");
		b9.setFont(fnt);
		b9.setBackground(Color.gray);
		b9.setForeground(Color.white);
		p2.add(b9);
		
		mult=new JButton("*");
		mult.setFont(fnt);
	    mult.setBackground(Color.darkGray);
		mult.setForeground(Color.white);
		p2.add(mult);
		
		divi=new JButton("/");
		divi.setFont(fnt);
	    divi.setBackground(Color.darkGray);
		divi.setForeground(Color.white);
		p2.add(divi);
		
		b0=new JButton("0");
		b0.setFont(fnt);
		b0.setBackground(Color.gray);
		b0.setForeground(Color.white);
		p2.add(b0);
		
		
		clr=new JButton("CR");
		clr.setFont(fnt);
	    clr.setBackground(Color.darkGray);
		clr.setForeground(Color.white);
		p2.add(clr);
		
		eql=new JButton("=");
		eql.setFont(fnt);
	    eql.setBackground(Color.darkGray);
		eql.setForeground(Color.white);
		p2.add(eql);
		
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        mult.addActionListener(this);
        divi.addActionListener(this);
        eql.addActionListener(this);
        clr.addActionListener(this);
    	setVisible(true);
        
	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		
			String s= text2.getText();
			 Stack<Double> operandStack = new Stack<>();
		        Stack<String> operatorStack = new Stack<>();
			
			if(e.getSource()==clr)
			{
				text2.setText("");
			}
			 if(e.getSource()==b0)
			{
								
					s=s+"0";
					text2.setText(s);
				
			}
			 if(e.getSource()==b1)
			{
				s=s+"1";
				text2.setText(s);
			}
			 if(e.getSource()==b2)
			{
				s=s+"2";
				text2.setText(s);
			}
			 if(e.getSource()==b3)
			{
				s=s+"3";
				text2.setText(s);
			}
			 if(e.getSource()==b4)
			{
				s=s+"4";
				text2.setText(s);
			}
			 if(e.getSource()==b5)
			{
				s=s+"5";
				text2.setText(s);
			}
			 if(e.getSource()==b6)
			{
				s=s+"6";
				text2.setText(s);
			}
			 if(e.getSource()==b7)
			{
				s=s+"7";
				text2.setText(s);
			}
			 if(e.getSource()==b8)
			{
				s=s+"8";
				text2.setText(s);
			}
		 if(e.getSource()==b9)
			{
				s=s+"9";
				text2.setText(s);
			}
			 if(e.getSource()==plus )
			{
				s+="+";
				text2.setText(s);
				
				
			}
			 if(e.getSource()==minus)
			{
				s+="-";
				text2.setText(s);
			}
			 if(e.getSource()==divi)
			{s+="/";
			text2.setText(s);
			}
		if(e.getSource()==mult)
			{
				s+="*";
				text2.setText(s);
			}
		 if(e.getSource()==eql)
			{    
				
			   //System.out.println(s);
			
			        
			        double result ;
			        boolean f=false;
			      
			        int cnt=0;
			        for (int i = 0; i < s.length(); i++) {
			        	
			            char c =s.charAt(i);                              
			        
			             if ((Character.isDigit(c)) ) {
			                String xs="";
			                while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i)=='.' ))   {
			                    xs=xs+s.charAt(i);
			                    i++;
			                    System.out.println(xs);
			                }
			                operandStack.push(Double.parseDouble(xs));
			                i--; 
			                
			            } 
			            else if (c == '+' || c == '-' || c == '*' || c == '/') {
			            	
			            	 while (!operatorStack.isEmpty() ) {
					                
					                    double operand2 = operandStack.pop(); //22  11
					                    double operand1 = operandStack.pop();
					                    
					                    String operator = operatorStack.pop();
					                   
					                    char check=operator.charAt(0);

					                     
					                  if(check=='+')
					                  {
					                	
					                	  result = operand1 + operand2;
					                  operandStack.push(result);
					                  
					                
					                  }

					                  else if(check=='-')
					                  { 
					                	  
					                	  result= operand1 - operand2;
					                	  operandStack.push(result);
					                  }
							               
					                  else if(check== '*')
					                  { 
					                	  
					                	  result= operand1 * operand2;
					                  operandStack.push(result);
					                  }
					                  
							         
					                  else {
					                	  
							            	result= operand1 / operand2;
							            	operandStack.push(result);}
							        }
					                
					                    
					                String sxx = Character.toString(c);
					                operatorStack.push(sxx);
			            	
			               
			               
			            }
			       
			        
			        
			        
			            
			        }
			        while (!operatorStack.isEmpty()) {
			            double operand2 = operandStack.pop();
			            double operand1 = operandStack.pop();
			            String operator = operatorStack.pop();
			             result=0;
			             
			             char check=operator.charAt(0);

	                     
		                  if(check=='+')
		                  { result = operand1 + operand2;
		                  operandStack.push(result);
		                 
		                  }

		                  else if(check=='-')
		                  {
		                	  result= operand1 - operand2;
		                	  operandStack.push(result);
		                  }
				               
		                  else if(check== '*')
		                  { result= operand1 * operand2;
		                  operandStack.push(result);
		                  }
		                  
				         
		                  else {
				            	result= operand1 / operand2;
				            	operandStack.push(result);}
				        }
			        
			        
			        String ans="" ;
			        double to_push=operandStack.pop();
			        ans = Double.toString(to_push);
			      
			     
			        s="";
			        s=s+ans;
			        text2.setText(s);
			        eq=true;
			      
			       
			       

			       
			        
			        
			        
			       
			
	}
}
}


