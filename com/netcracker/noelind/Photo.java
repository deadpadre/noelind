package com.netcracker.noelind;

public class Photo {
	private Image image;
	private Filter filter;
	
	public Image getImage() {
		return image;
	}
	void setImage(Image image) {
		this.image = image;
	}	
	public Filter getFilter() {
		return filter;
	}
	void setFilter(Filter filter) {
		this.filter = filter;
	}
	@SuppressWarnings("unused")
	private Photo() {}
	public Photo(Image image, Filter filter) {
		setImage(image);
		setFilter(filter);
	}
	public Photo(Image image) {
		this(image, new IdentityFilter());
	}

}
