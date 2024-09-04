package baiTap;

public class TuSo {
	private float tuSo;
	
	
	//dong goi
	public float getTuSo() {
		return tuSo;
	}
	public void setTuSo(float tuSo) throws Exception {
		if(tuSo != 0.0f) {
			this.tuSo = tuSo;
		}else {
			throw new Exception("Tu so khong duoc rong!");
		}
	}
	
	
	//Ham tao
	public TuSo(float tuSo, float mauSo) throws Exception {
		if(tuSo != 0.0f) {
			this.tuSo = tuSo;
		}else {
			throw new Exception("Tu so khong duoc rong!");
		}	
	}
	
	
	  // Hàm tối giản phân số
//    private void toiGian() {
//        float gcd = gcd(Math.abs(tuSo), Math.abs(mauSo));
//        tuSo /= gcd;
//        mauSo /= gcd;
//    }
//    
//    private float gcd(float a, float b) {
//        while (b != 0) {
//            float temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
	
	// Hàm cộng hai phân số
//    public PhanSo cong(PhanSo ps) throws Exception {
//        float tuSoMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
//        float mauSoMoi = this.mauSo * ps.mauSo;
//        PhanSo ketQua = new PhanSo();
//        ketQua.setTuSo(tuSoMoi);
//        ketQua.setMauSo(mauSoMoi);
//        ketQua.toiGian();
//        return ketQua;
//    }
}

