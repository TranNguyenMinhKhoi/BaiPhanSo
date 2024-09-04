package baiPhanSo;

public class PhanSo {
	private float tuSo;
    private float mauSo;

    //đóng gói
    public float getTuSo() {
        return tuSo;
    }

    public void setTuSo(float tuSo) throws Exception {
    	if (tuSo != 0.0f) {
    		this.tuSo = tuSo;
    	}else {
    		throw new Exception("Tử số không được rỗng!");
    	}
        
    }

    public float getMauSo() {
        return mauSo;
    }

    public void setMauSo(float mauSo) throws Exception {
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            throw new Exception("Mẫu số phải khác 0!");
        }
    }
    
 // Hàm tạo
    public PhanSo(float tuSo, float mauSo) throws Exception {
    	if (tuSo != 0.0f) {
    		this.tuSo = tuSo;
    	}else {
    		throw new Exception("Tử số không được rỗng!");
    	}
        
    	if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            throw new Exception("Mẫu số phải khác 0!");
        }
    }

    // Tối giản phân số
    public void toiGian() {
        float gcd = gcd(Math.abs(tuSo), Math.abs(mauSo));
        tuSo /= gcd;
        mauSo /= gcd;
    }

    private float gcd(float a, float b) {
        while (b != 0) {
            float temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Nghịch đảo phân số
    public PhanSo nghichDao() throws Exception {
        if (tuSo == 0) {
            throw new Exception("Tu so khong duoc bang 0");
        }
        return new PhanSo(mauSo, tuSo);
    }

    // Cộng hai phân số
    public PhanSo cong(PhanSo ps) throws Exception {
        float tuSoMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        float mauSoMoi = this.mauSo * ps.mauSo;
        PhanSo ketQua = new PhanSo(tuSoMoi, mauSoMoi);
        ketQua.toiGian();
        return ketQua;
    }

    // Trừ hai phân số
    public PhanSo tru(PhanSo ps) throws Exception {
        float tuSoMoi = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        float mauSoMoi = this.mauSo * ps.mauSo;
        PhanSo ketQua = new PhanSo(tuSoMoi, mauSoMoi);
        ketQua.toiGian();
        return ketQua;
    }
    
    //Nhân hai phân số
    public PhanSo nhan(PhanSo ps) throws Exception {
        float tuSoMoi = this.tuSo * ps.tuSo;
        float mauSoMoi = this.mauSo * ps.mauSo;
        PhanSo ketQua = new PhanSo(tuSoMoi, mauSoMoi);
        ketQua.toiGian();
        return ketQua;
    }

    // Hàm in phân số
    public void inPhanSo() {
        System.out.println(tuSo + "/" + mauSo);
    }
}
