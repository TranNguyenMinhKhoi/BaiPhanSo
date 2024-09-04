package baiTap;

public class MauSo {
	private float mauSo;
	
	//dong goi
	public float getMauSo() {
		return mauSo;
	}
	public void setMauSo(float mauSo) throws Exception {
		if (mauSo != 0) {
			this.mauSo = mauSo;
		}else {
			throw new Exception("Mau so phai khac 0");
		}	
	}
	public MauSo(float mauSo) throws Exception {
		if (mauSo != 0) {
			this.mauSo = mauSo;
		}else {
			throw new Exception("Mau so phai khac 0!");
		}
	}
	
}
