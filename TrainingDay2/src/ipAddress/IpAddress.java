package ipAddress;

public class IpAddress {

	public static void main(String[] args) {
		System.out.println(new IpAddress().validateIpAddress("192.168.0.1"));
	}
	
	public boolean validateIpAddress(String ipAddress) {
		String[] arr = ipAddress.split("\\.");
		if(arr.length!=4) {
			return false;
		}
		for(String str : arr) {
			try {
				int val = Integer.parseInt(str);
				if(val<0 || val>255) {
					return false;
				}
			}catch(NumberFormatException e) {
				return false;
			}
		}
		return true;
	}
	
	
	

}
