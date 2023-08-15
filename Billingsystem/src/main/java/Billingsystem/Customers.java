package Billingsystem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customers {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String customerPhone;
	private String customerEmail;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "customers")
	private List<InvoiceNo> invoiceNo;
	
	
	
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	

	public List<InvoiceNo> getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(List<InvoiceNo> invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	

	public Customers(int customerId, String customerName, String customerPhone, String customerEmail,
			List<InvoiceNo> invoiceNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.invoiceNo = invoiceNo;
	}

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
