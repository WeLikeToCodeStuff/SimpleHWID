package xyz.ssmidge.simplehwid;

import java.util.ArrayList;
import java.util.List;


public class HWID {
	public List<LicenseItem> HWIDs = new ArrayList<LicenseItem>();

	private static HWID instance = new HWID();

	public static HWID getInstance() {
		return instance;
	}

	private HWID() {


		String HWID;
		String user;

		final StringBuffer tmp = new StringBuffer('0');
		final Integer tt = new Integer(0);
		HWIDs.forEach(hwid -> {
			int id = Integer.valueOf(tmp.toString());
			id++;
			tmp.delete(0, tmp.toString().length());
			tmp.append(id);
		});

	}

	public void addHWID(String user, String HWID, int id) {

//	addHWID("TT", "FUSDFHSDHFUSDFDSAFASGDG", 10);

		LicenseItem licenseItem = new LicenseItem();
		licenseItem.setHWID(HWID);
		licenseItem.setId(id);

		licenseItem.setUser(user);

		HWIDs.add(licenseItem);
//		Client.addChatMessage(licenseItem.toString());

	}

	public LicenseItem getHWIDbyID(int id) {
		LicenseItem result = null;

		for (LicenseItem item : HWIDs) {
			if (item.getId() == id) {
				result = item;
				break;
			}
		}
		return result;
	}

	public LicenseItem getIDbyHWID(String hwid) {
		LicenseItem result = null;
		for (LicenseItem item : HWIDs) {
			if (item.getHWID().equals(hwid)) {
				result = item;
				break;
			}
		}
		return result;
	}
}
