public class MenuItem {
    private String menuName;
    private double menuPrice;
          
    public MenuItem() {
        menuName = "";
        menuPrice = 0;
    }

    public MenuItem(String name, double price) {
        menuName = name;
        menuPrice = price;
    }

    public void setName(String newName) {
		menuName = newName;
	}
	
	public String getName() {
		return menuName;
	}

    public void setPrice(int newPrice) {
		menuPrice = newPrice;
	}
	
	public double getPrice() {
		return menuPrice;
	}
}
