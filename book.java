package day4;

public class book {
	private int id;
	private String bname;
	private String aname;
	private int price;


public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getAname() {
		return aname;
	}


	public void setAname(String aname) {
		this.aname = aname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public book(int id, String bname, String aname, int price) {
		super();
		this.id = id;
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
		
	public book() {
	
	}



	@Override
	public String toString() {
		return "book [id=" + id + ", bname=" + bname + ", aname=" + aname + ", price=" + price + "]";
	}





	
	}




