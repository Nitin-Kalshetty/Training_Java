package task2;

import java.util.Objects;

public class Mobiles extends Electronics{

	private String mobileId;
	private String mobileName;
	private String description;
	private Integer modelYear;
	private String imei;
	private Integer price;
	public String getMobileId() {
		return mobileId;
	}
	public void setMobileId(Integer mobileId) {
		this.mobileId = "MB_"+mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getModelYear() {
		return modelYear;
	}
	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.mobileId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobiles other = (Mobiles) obj;
		return Objects.equals(mobileId, other.mobileId) ;
	}
	@Override
	public String toString() {
		return "Mobiles [mobileId=" + mobileId + ", mobileName=" + mobileName + ", description=" + description
				+ ", modelYear=" + modelYear + ", imei=" + imei + ", price=" + price + "]";
	}
	public Mobiles(Integer mobileId, String mobileName, String description, Integer modelYear, String imei,
			Integer price) {
		super();
		this.mobileId = "MB_"+mobileId;
		this.mobileName = mobileName;
		this.description = description;
		this.modelYear = modelYear;
		this.imei = imei;
		this.price = price;
	}
	
	
	
}
