package com.rocker.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@ConfigurationProperties(prefix = "oracle")
@Component
public class OracleProp {
	private String title;
	  private String itemLabel;
	  private String qtyLabel;
	@Override
	public String toString() {
		return "OracleProp [title=" + title + ", itemLabel=" + itemLabel + ", qtyLabel=" + qtyLabel + "]";
	}
	public OracleProp(String title, String itemLabel, String qtyLabel) {
		super();
		this.title = title;
		this.itemLabel = itemLabel;
		this.qtyLabel = qtyLabel;
	}
	public OracleProp() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getItemLabel() {
		return itemLabel;
	}
	public void setItemLabel(String itemLabel) {
		this.itemLabel = itemLabel;
	}
	public String getQtyLabel() {
		return qtyLabel;
	}
	public void setQtyLabel(String qtyLabel) {
		this.qtyLabel = qtyLabel;
	}
	

	  
}
