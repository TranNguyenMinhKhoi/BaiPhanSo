package baiPhanSo;

import java.util.Scanner;

public class TestPhanSo {
	//In khoảng cách
	public static void inKhoangCach() {
		for (int i = 0; i < 35; i++) {
			System.out.printf("_");
		}
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Nhập phân số đầu tiên
        System.out.print("Nhập tử số 1: ");
        float tuSo1 = scanner.nextFloat();
        System.out.print("Nhập mẫu số 1: ");
        float mauSo1 = scanner.nextFloat();

        // Kiểm tra mẫu số phân số đầu tiên
//        if (mauSo1 == 0) {
//            System.out.println("Mẫu số phải khác 0! Vui lòng nhập lại!");
//            scanner.close();
//            return; // Kết thúc chương trình
//        }
        
        PhanSo ps1 = new PhanSo(tuSo1, mauSo1);
        inKhoangCach();

        // Nhập phân số thứ hai
        System.out.print("Nhập tử số 2: ");
        float tuSo2 = scanner.nextFloat();
        System.out.print("Nhập mẫu số 2: ");
        float mauSo2 = scanner.nextFloat();

        // Kiểm tra mẫu số phân số thứ hai
//        if (mauSo2 == 0) {
//            System.out.println("Mau so phai khac 0. Vui long nhap lai.");
//            scanner.close();
//            return; // Kết thúc chương trình
//        }

        PhanSo ps2 = new PhanSo(tuSo2, mauSo2);
        inKhoangCach();

        // In phân số
        System.out.println("Phân số 1: ");
        ps1.inPhanSo();
        System.out.println("Phân số 2: ");
        ps2.inPhanSo();
        inKhoangCach();
        
        // Tối giản phân số
        System.out.println("Phân số 1 sau khi tối giản: ");
        ps1.toiGian();
        ps1.inPhanSo();
        
        System.out.println("Phân số 2 sau khi tối giản: ");
        ps2.toiGian();
        ps2.inPhanSo();
        inKhoangCach();
        
        // Nghịch đảo phân số
        PhanSo nghichDaoPs1 = ps1.nghichDao();
        if (nghichDaoPs1 != null) {
            System.out.println("Nghịch đảo phân số 1: ");
            nghichDaoPs1.inPhanSo();
        }
        
        PhanSo nghichDaoPs2 = ps2.nghichDao();
        if (nghichDaoPs2 != null) {
            System.out.println("Nghịch đảo phân số 2: ");
            nghichDaoPs2.inPhanSo();
        }
        inKhoangCach();
        
        // Cộng hai phân số
        PhanSo tong = ps1.cong(ps2);
        if (tong != null) {
            System.out.println("Tổng: ");
            tong.inPhanSo();
        }
        inKhoangCach();
        
        // Trừ hai phân số
        PhanSo hieu = ps1.tru(ps2);
        if (hieu != null) {
            System.out.println("Hiệu: ");
            hieu.inPhanSo();
        }
        inKhoangCach();
        
        //Nhân hai phân số
        PhanSo nhan = ps1.nhan(ps2);
        if (nhan != null) {
            System.out.println("Nhân: ");
            nhan.inPhanSo();
        }
        scanner.close();
    }
}
