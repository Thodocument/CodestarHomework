package homework;

//Xây dựng lớp Xe với các thuộc tính TenXe, LoaiXe, VanTocMax

public class Xe {
	private String tenXe, loaiXe;
	private float vanTocMax;
	
	public Xe(String tenXe, String loaiXe, float vanTocMax) {
		super();
		this.tenXe = tenXe;
		this.loaiXe = loaiXe;
		this.vanTocMax = vanTocMax;
	}
	
//	public Xe() {
//		super();
//	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public float getVanTocMax() {
		return vanTocMax;
	}

	public void setVanTocMax(float vanTocMax) {
		this.vanTocMax = vanTocMax;
	}
	
	
}
