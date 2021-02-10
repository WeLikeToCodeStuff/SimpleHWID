package xyz.ssmidge.simplehwid;

public class LicenseItem {
	@Override
	public String toString() {
		return "LicenseItem [user=" + user + ", HWID=" + HWID + ", id=" + id + "]";
	}

	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getHWID() {
		return HWID;
	}

	public void setHWID(String hWID) {
		HWID = hWID;
	}

	private String HWID;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}