package Billingsystem;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InvoiceItems {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int itemId;
	private String description;
	private int quantity;
	private int rate;
	private int amount;
	@JoinColumn(name = "invoiceNo")
	@ManyToOne(cascade = CascadeType.ALL)
	InvoiceNo invoiceNo;
	
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public InvoiceNo getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(InvoiceNo invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	public InvoiceItems(int itemId, String description, int quantity, int rate, int amount, InvoiceNo invoiceNo) {
		super();
		this.itemId = itemId;
		this.description = description;
		this.quantity = quantity;
		this.rate = rate;
		this.amount = amount;
		this.invoiceNo = invoiceNo;
	}
	public InvoiceItems() {
		
	}
	

	
	
}
