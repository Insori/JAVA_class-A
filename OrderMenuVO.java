package mvc.vo;

public class OrderMenuVO {
	private int orderNo;
	private int MenuNo;
	private int menuPrice;
	private int menuCount;
	
	public OrderMenuVO(int orderNo, int MenuNo, int menuPrice, int menuCount) {
		this.orderNo = orderNo;
		this.MenuNo = MenuNo;
		this.menuPrice = menuPrice;
		this.menuCount = menuCount;
	}
	
	public int getMenuNo() {
		return MenuNo;
	}
	public void setMenuName(int MenuNo) {
		this.MenuNo = MenuNo;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	public int getMenuCount() {
		return menuCount;
	}
	public void setMenuCount(int menuCount) {
		this.menuCount = menuCount;
	}
	public int getOrderNo() {
		return orderNo;
	}
}


