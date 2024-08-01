package cau5;

import java.util.Scanner;

/**
 * Câu 5: Lớp Điều hòa và Lớp Máy Sấy
 * 		+ Lớp cơ sở: ThietBiDien
 * 		+ Lớp con: DieuHoa, MaySay
 * 		+ Thuộc tính: Các thuộc tính liên quan đến thiết bị cụ thể (công suất, chức năng, vv)
 * 		+ Phương thức
 */
public class ThietBiDien {
	
	static final String[] LOAI_MAY = {"Điều hòa", "Máy sấy"};
	
	String loaiMay;
	String ten;
	double congSuat;
	String chucNang;
	long gia;
	
	Scanner scanner;
	
	void xuatThongTin() {
		String thongTin = String.format("%s: %s; Công suất: %s; Chức năng: %s; Giá tiền: %s"
				, this.loaiMay , this.ten, this.congSuat, this.chucNang, this.gia);
		System.out.println(thongTin);
	}
	
	void nhapThongTin() {
		try {
			this.scanner = new Scanner(System.in);
			
			do {
				System.out.print("Xin vui lòng nhập Tên thiết bị: ");
				this.ten = this.scanner.nextLine();
			} while (this.ten.strip().equals(""));
			
			do {
				System.out.print("Công suất: ");
				this.congSuat = this.scanner.nextDouble();
			} while (this.congSuat <= 0);
			this.scanner.nextLine();

			do {
				System.out.print("Chức năng: ");
				this.chucNang = this.scanner.nextLine();
			} while (this.chucNang.strip().equals(""));
			
			do {
				System.out.print("Giá: ");
				this.gia = this.scanner.nextLong();
			} while (this.gia <= 0);
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
}
