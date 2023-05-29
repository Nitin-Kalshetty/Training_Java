package task2;

import java.util.Objects;

public class TV extends Electronics{

	private String tvId;
	@Override
	public int hashCode() {
		
		return Objects.hash(tvId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TV other = (TV) obj;
		return Objects.equals(tvId, other.tvId);
	}
	private String tvName;
	private String description;
	private Integer modelYear;
	private String imei;
	private Integer price;
	public String getTvId() {
		return tvId;
	}
	public void setTvId(Integer tvId) {
		this.tvId = "TV_"+tvId;
	}
	public String getTvName() {
		return tvName;
	}
	public void setTvName(String tvName) {
		this.tvName = tvName;
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
	public String toString() {
		return "TV [tvId=" + tvId + ", tvName=" + tvName + ", description=" + description + ", modelYear=" + modelYear
				+ ", imei=" + imei + ", price=" + price + "]";
	}
	public TV(Integer tvId, String tvName, String description, Integer modelYear, String imei, Integer price) {
		super();
		this.tvId = "TV_"+tvId;
		this.tvName = tvName;
		this.description = description;
		this.modelYear = modelYear;
		this.imei = imei;
		this.price = price;
	}
	
	
}
