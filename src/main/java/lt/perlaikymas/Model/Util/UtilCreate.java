package lt.perlaikymas.Model.Util;

import lt.perlaikymas.Model.Util.*;
import lt.perlaikymas.Model.Util.UtilEnums.*;

public class UtilCreate {

	// define utility attributes

	private UtilType utilType;

	private String title;

	private long price;

	private String description;

	private String image;
	
	public UtilType getType() {
		return utilType;
	}

	public void setUtilType(UtilType utilType) {
		this.utilType = utilType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getPrice() {
		return price;
	}

	public void SetPrice(long price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    }
