package aptPortfolioServlet;

public class Apartment {
	
	private String aptNum;
	private String tenantName;
	private String tenantNum;
	private String address;
	private String manager;
	
	public Apartment() {
		super();
	}
	
	
	public Apartment(String AptNum, String TenantName, String TenantNum, String address, String manager) {
		super();
		this.aptNum = AptNum;
		this.tenantName = TenantName;
		this.tenantNum = TenantNum;
		this.address = address;
		this.manager = manager;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	
	
	public String getAptNum() {
		return this.aptNum;
	}

	public void setAptNum(String aptNum) {
		this.aptNum = aptNum;
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenantNum() {
		return this.tenantNum;
	}

	public void setTenantNum(String tenantNum) {
		this.tenantNum = tenantNum;
	}
	
	
	
	
}
