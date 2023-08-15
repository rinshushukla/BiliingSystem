package Billingsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class InvoiceNo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoiceId;
	private Date date;
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "invoiceNo")
	List<InvoiceItems> invoiceItems = new ArrayList<InvoiceItems>();
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customers customers;
	
	
	
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<InvoiceItems> getInvoiceItems() {
		return invoiceItems;
	}
	public void setInvoiceItems(List<InvoiceItems> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}
	
	
	
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	
	
	public InvoiceNo(int invoiceId, Date date, List<InvoiceItems> invoiceItems, Customers customers) {
		super();
		this.invoiceId = invoiceId;
		this.date = date;
		this.invoiceItems = invoiceItems;
		this.customers = customers;
	}
	public InvoiceNo() {
		
	}
	
	
	
	
	
}
