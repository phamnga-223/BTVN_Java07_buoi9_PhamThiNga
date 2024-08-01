package cau4;

import java.util.Scanner;

/**
 * Câu 4: Lớp Xe Hơi và Xe Máy
 * 		+ Lớp cơ sở: PhuongTienGiaoThong
 * 		+ Lớp con: XeHoi, XeMay
 * 		+ Thuộc tính: Hãng sản xuất, màu sắc, năm sản xuất
 * 		+ Phương thức: Hiển thị thông tin xe
 */
public class PhuongTienGiaoThong {
	
	static final String[] LOAI_PHUONG_TIEN = {"Xe Hơi", "Xe Máy"};
	
	String loaiPhuongTien;
	String hangSX;
	String mauSac;
	int namSX;
	Scanner scanner;
	
	void thongTinXe() {
		System.out.println(this.loaiPhuongTien + "; Hãng SX: " + this.hangSX + "; Màu sắc: " + this.mauSac
				+ "; Năm SX: " + this.namSX);
	}
	
	void nhapThongTin() {
		try {
			this.scanner = new Scanner(System.in);
			
			//Người dùng nhập hãng SX, màu sắc, năm SX
			do {
				System.out.print("Vui lòng nhập Hãng SX: ");
				this.hangSX = scanner.nextLine();
			} while (this.hangSX.strip().equals(""));
			
			do {
				System.out.print("Màu sắc: ");
				this.mauSac = scanner.nextLine();
			} while (this.mauSac.strip().equals(""));
			
			do {
				System.out.print("Năm SX: ");
				this.namSX = scanner.nextInt();
			} while (this.namSX < 0 || this.namSX > 2024);
			
			this.scanner.nextLine();
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
	
}
