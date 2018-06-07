package project;

public class Invoice1 {
	String 	partnumber;
	   String partdescription;
	   int quantityOfItem; 
	   double price;
	   
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	public String getPartdescription() {
		return partdescription;
	}
	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}
	public int getQuantityOfItem(int quantityOfItem) {
		if(quantityOfItem<0) {
			quantityOfItem=0;
		}
		else {
			this.quantityOfItem=quantityOfItem;
		}
		return quantityOfItem;
	}
	public void setQuantityOfItem(int quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}
	public double getPrice() {
		
		return price;
	}
	public void setPrice(double price) {
		if(price<0) {
			this.price=0;
		}
		else {
			this.price=price;
		}
		
	}
	   public double getInvoiceAmount() {
		return price*quantityOfItem;
		 }
	   

	public static void main(String[] args) {
		Invoice1 t1=new Invoice1();
		t1.setPrice(90);
		t1.setQuantityOfItem(12);
		System.out.println(t1.getInvoiceAmount());
		
		                                                                                                                                                                                                                                                                                                                                                                                            
	}
	}


