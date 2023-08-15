package Billingsystem;

import java.security.DrbgParameters.NextBytes;
import java.util.Date;
import java.util.Scanner;

import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.model.relational.InitCommand;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Configuration configuration = new Configuration().configure().addAnnotatedClass(Inventory.class).addAnnotatedClass(Customers.class)
//        		.addAnnotatedClass(InvoiceNo.class).addAnnotatedClass(InvoiceItems.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//    	Transaction transaction= session.beginTransaction();
//
//        
//    	Date date2 = new Date();
//    	
//    	
//        
//               
//        
////        //Inventory
//////        Createproduct(sessionFactory,"Apples",250); 
//////        Createproduct(sessionFactory, 102,"Apples",250);  
//////        UpdateProduct(sessionFactory, 101, "mango", 150);
//////        UpdateProduct(sessionFactory, 102, "hello", 500);
////        
////        DeleteProduct(sessionFactory, 101);
////        RetrieveProduct(sessionFactory, 102);
////        // inventory end;-
////        
////        //Customer table :-
////        
////        CreateCustomer(sessionFactory, "Abhimanyu", "9322019961","abhi@gmail.com");
////        CreateCustomer(sessionFactory, "Rinshu", "8419945612","Rinnshu@gmail.com");
////        //Customer table end 
////        
////        
////        
////       
////        
//////        InvoiceCreate(sessionFactory, date2);
//////        InvoiceCreate(sessionFactory, date2);
////        
//    
//    	Customers cus1 = new Customers();
//    	cus1.setCustomerName("Abhimanyu");
//    	
//    	
//        InvoiceNo in1 = new InvoiceNo();
//        in1.setDate(date2);
//        in1.setCustomers(cus1);
//        
////        InvoiceNo in2 = new InvoiceNo();
////        in2.setDate(date2);
////        InvoiceNo in3 = new InvoiceNo();
////        in3.setDate(date2);
////        
////        
//        InvoiceItems invoiceItems = new InvoiceItems();
//        invoiceItems.setInvoiceNo(in1);
//        invoiceItems.setDescription("Rice ");
//        invoiceItems.setQuantity(10);
//        invoiceItems.setRate(200);
//        invoiceItems.setAmount(10*200);
////        
//        InvoiceItems invoiceItems1 = new InvoiceItems();
//        invoiceItems1.setInvoiceNo(in1);
//        invoiceItems1.setDescription("toor dal");
//        invoiceItems1.setQuantity(4);
//        invoiceItems1.setRate(100);
//        invoiceItems1.setAmount(100*4);
////        
////        InvoiceItems invoiceItems2 = new InvoiceItems();
////        invoiceItems2.setInvoiceNo(in3);
////        invoiceItems2.setDescription("beans dal");
////        invoiceItems2.setQuantity(10);
////        invoiceItems2.setRate(100);
////        invoiceItems2.setAmount(100*4);
////        
////        InvoiceItems invoiceItems3 = new InvoiceItems();
////        invoiceItems3.setInvoiceNo(in3);
////        invoiceItems3.setDescription("Bean oil");
////        invoiceItems3.setQuantity(4);
////        invoiceItems3.setRate(500);
////        invoiceItems3.setAmount(500*4);
////        
////        Customers c1 = new Customers();
////        c1.setCustomerName("Sachin");
////        c1.setCustomerEmail("sachin@gmail.com");
////        c1.setCustomerPhone("9322019964");
////        
////        session.persist(c1);
////        
////        
////        
////        
////        
//        session.persist(in1);
//        session.persist(cus1);
//        session.persist(invoiceItems);
//        session.persist(invoiceItems1);
////        session.persist(invoiceItems2);
////        session.persist(invoiceItems3);
//        transaction.commit();
//        session.close();
        
        
        System.out.println("-----: Welcome to Billing System :-----");
    	System.out.println("Enter press 1 To bill System");
    	System.out.println("Enter Press 2 To Inventory");
    	System.out.println("please enter one number given option");
    	
    	while(true) {
    		
    		Configuration configuration = new Configuration().configure().addAnnotatedClass(Inventory.class).addAnnotatedClass(Customers.class)
            		.addAnnotatedClass(InvoiceNo.class).addAnnotatedClass(InvoiceItems.class);
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Date date2 = new Date();
    		
    		Scanner scanner = new Scanner(System.in);
    		
    		int cases = scanner.nextInt();
        	if (cases <= 2)
    		{
        		int inputTypes = cases;
    			if (inputTypes==1) {
    				
    				while (true) {
    					System.out.println("Enter press 1 To Bill genrating");
        		    	System.out.println("Enter Prsee 2 To Bill veiw");
        		    	System.out.print ("Enter your choose :- ");
        		    	int billGen = scanner.nextInt();
        		    	
        		    	if(billGen <= 2) {
        		    		
        		    		if (billGen == 1) {
        						System.out.println(" Generate Bills");
        	    				System.out.println("enter Customer name :- ");
        	    				String cuname = scanner.next();
        	    				System.out.println("enter Customer Email id :-");
        	    				String cuEmai = scanner.next();
        	    				System.out.println("enter Customer Phon no. :-");
        	    				String cuphone = scanner.next();
        	    				
        	    				CreateCustomer(sessionFactory, cuname, cuphone, cuEmai);
        	    				InvoiceCreate(sessionFactory, date2);
        	    				
        	    				// items Tables :-
        	    				
        	    				System.out.print("Enter Product Name :-");
        	    				String proname = scanner.next();
        	    				System.out.print("Enter Product Qty :-");
        	    				int proQty = scanner.nextInt();
        	    				System.out.print("Enter Product Rate :-");
        	    				int proRate = scanner.nextInt();
        	    				
        	    				itemsTable(sessionFactory, proname, proQty, proRate);
        	    				
        	    				
        	    				
    						}
        		    		if (billGen == 2) {
								System.out.println("work in process ! ");
							}
        		    		
        		    	}else {
        		    		System.out.println("Sorry You enter wrong number Please Select Given Options number");
						}

					}
    				
    			
    				
    			}
    			
    			// curd Operation here :-
    			
    			if(inputTypes== 2) {
    				
    		    	
    		    	
    		    	while (true) {
    		    		System.out.println("Enter press 1 To Create product");
        		    	System.out.println("Enter Prsee 2 To Update Product");
        		    	System.out.println("Enter press 3 To Retrieve product");
        		    	System.out.println("Enter Prsee 4 To Delete Product");
        		    	System.out.println("Select option and Enter number :- ");
    		    		int curdInputs = scanner.nextInt();
    		    		
    		    		if(curdInputs<=4) {
    		    			
    		    			if(curdInputs == 1) {
        		    			System.out.println("Create Products details");
        		    			System.out.print("Enter Product name :-");
        		    			String pname = scanner.next();
        		    			System.out.print("Enter Product Prices :-");
        		    			int pprice = scanner.nextInt();
        		    			
        		    			Createproduct(sessionFactory, pname, pprice);
        		    		}
        		    		if(curdInputs == 2) {
        		    			System.out.println("updaate Products details");
                		    	System.out.println("Enter Id of product :- ");
                		    	int updateproductd = scanner.nextInt();
                		    	System.out.print("Enter Product name :-");
        		    			String pname = scanner.next();
        		    			System.out.print("Enter Product Prices :-");
        		    			int pprice = scanner.nextInt();
        		    			
        		    			UpdateProduct(sessionFactory, updateproductd, pname, pprice);
                		    	
        		    		}
        		    		if(curdInputs ==3) {
        		    			System.out.println(" Retrieve Products details");
                		    	System.out.println("Enter Id of product :- ");
                		    	int updateproductd = scanner.nextInt();
                		    	RetrieveProduct(sessionFactory, updateproductd);
        		    			
        		    		}
        		    		if(curdInputs == 4) {
        		    			System.out.println("Delete Products details");
                		    	System.out.println("Enter Id of product :- ");
                		    	int updateproductd = scanner.nextInt();
                		    	DeleteProduct(sessionFactory, updateproductd);
        		    		}
    		    			
    		    			
    		    		}else {
							System.out.println("Sorry You enter wrong number Please Select Given Options number");
						}
    		    		
						
					}
    			}
    		}
    		else {
    			System.out.println("Please Enter valid in put");
    		}
    		
    	}
        
        
        
        
        
        
        
       
        
    }
    
    
   
    // invoice Item table code  method  here ::-
    public static void itemsTable (SessionFactory ss, String des, int qty, int rate) {

    	Session session = ss.openSession();
    	Transaction transaction= session.beginTransaction();
    	
    	InvoiceItems invoiceItems = new InvoiceItems();
    	
    	invoiceItems.setDescription(des);
    	invoiceItems.setQuantity(qty);
    	invoiceItems.setRate(rate);
    	int total = qty*rate;
    	invoiceItems.setAmount(total);
    	//invoiceItems.setInvoiceNo(inId);
    	
    	session.save(invoiceItems);
    	transaction.commit();
    	session.close();
    }
   
    
    //invoice table  here :-
    
    public static void InvoiceCreate(SessionFactory ss, Date date) {
		
    	Session session = ss.openSession();
    	Transaction transaction= session.beginTransaction();

    	
    	InvoiceNo invoiceNo = new InvoiceNo();
    	invoiceNo.setDate(date);
    	session.save(invoiceNo);
    	transaction.commit();
    	session.close();
	}
    // Customer create here:-
    
    public static void CreateCustomer(SessionFactory ss, String name, String phone, String email) {
		
    	Session session = ss.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Customers customers = new Customers();
    	customers.setCustomerEmail(email);
    	customers.setCustomerName(name);
    	customers.setCustomerPhone(phone);
    	session.persist(customers);
    	transaction.commit();
    	session.close();
    	
	}
    
    
    // Create Product method :-
    
    public static void Createproduct(SessionFactory ss, String pname,float pprices) {
    	
    	Session session = ss.openSession();
        Transaction transaction = session.beginTransaction();
        
        Inventory inventory = new Inventory();
        //inventory.setProduct_Id(id);
        inventory.setProduct_name(pname);
        inventory.setProduct_price(pprices);
        
        session.save(inventory);
        transaction.commit();
        session.close();
	}
    
    // Update product details :-
    
    public static void UpdateProduct(SessionFactory ss, int Id, String pname,float pprices) {
		
    	Session session = ss.openSession();
        Transaction transaction = session.beginTransaction();
        
        Inventory inventory = session.get(Inventory.class, Id);
        inventory.setProduct_name(pname);
        inventory.setProduct_price(pprices);
        session.save(inventory);
        transaction.commit();
        session.close();       
	}
    
    // Delete product items:- 
    
    public static void DeleteProduct(SessionFactory ss, int Id) {
    	
    	Session session = ss.openSession();
        Transaction transaction = session.beginTransaction();
        
        Inventory inventory = session.get(Inventory.class, Id);
        session.delete(inventory);
        transaction.commit();
        session.close();
		
	}
    
    //Retrieve information of product:-
    
    public static void RetrieveProduct(SessionFactory ss, int Id) {
    	Session session = ss.openSession();
        Transaction transaction = session.beginTransaction();
        
        Inventory inventory = session.get(Inventory.class, Id);
        System.out.println("Product Id :- "+inventory.getProduct_Id()+" "+"Product Name :- "+inventory.getProduct_name()+" "+"Product Price :- "+inventory.getProduct_price());
        
        transaction.commit();
        session.close();
		
	}
    
}
