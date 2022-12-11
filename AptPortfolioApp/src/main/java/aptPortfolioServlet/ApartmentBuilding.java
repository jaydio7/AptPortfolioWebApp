package aptPortfolioServlet;

public class ApartmentBuilding {
	
	private String buildName;
	private String buildAddress;
	private String buildManager;
	
	public ApartmentBuilding(String buildName, String buildAddress, String buildManager) {
		super();
		this.buildName = buildName;
		this.buildAddress = buildAddress;
		this.buildManager = buildManager;
	}

	public ApartmentBuilding() {
		super();
	}
	
	public String getBuildName() {
		return this.buildName;
	}
	
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getBuildAddress() {
		return this.buildAddress;
	}

	public void setBuildAddress(String buildAddress) {
		this.buildAddress = buildAddress;
	}

	public String getBuildManager() {
		return this.buildManager;
	}

	public void setBuildManager(String buildManager) {
		this.buildManager = buildManager;
	}
	
	
	
}
