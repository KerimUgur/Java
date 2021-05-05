
public class Campaign implements Entity{
	int id;
	String name;
	String discountPercent;
	
	
	
	public Campaign(int id, String name, String discountPercent) {
		super();
		this.id = id;
		this.name = name;
		this.discountPercent = discountPercent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(String discountPercent) {
		this.discountPercent = discountPercent;
	};

}
