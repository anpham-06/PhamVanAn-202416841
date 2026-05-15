package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    
    // Bộ so sánh: Ưu tiên Tên (alphabet), sau đó đến Giá (giảm dần)
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    
    // Bộ so sánh: Ưu tiên Giá (giảm dần), sau đó đến Tên (alphabet)
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    
    public Media() {
        super();
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

    // Generate đầy đủ Getter và Setter cho cả 4 thuộc tính ở đây
	
	@Override
	public boolean equals(Object obj) {
	    // Kiểm tra xem đối tượng truyền vào có phải Media không
	    if (!(obj instanceof Media)) {
	        return false;
	    }
	    Media other = (Media) obj;
	    // So sánh tiêu đề (title), lưu ý kiểm tra null để tránh lỗi
	    if (this.getTitle() == null || other.getTitle() == null) {
	        return false;
	    }
	    return this.getTitle().equalsIgnoreCase(other.getTitle());
	}
}