package cau2;

import java.util.Scanner;

public class XeHoi {

	String hangSX;
	String mauSac;
	int nam;
	
	XeHoi() {	
	}
	
	void xuatThongTin() {
		String thongTin = String.format("Xe %s; Màu sắc: %s; Năm SX: %s", 
				this.hangSX, this.mauSac, this.nam);
		System.out.println(thongTin);
	}
	
	void nhapXeHoi() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			//Nhập hãng xe, màu sắc, năm SX
			do {
				System.out.println("Xin vui lòng nhập hãng xe: ");
				this.hangSX = scanner.nextLine();
				System.out.println("Xin vui lòng nhập màu sắc: ");
				this.mauSac = scanner.nextLine();
				System.out.println("Xin vui lòng nhập năm SX: ");
				this.nam = scanner.nextInt();
				
				scanner.nextLine();
			} while (this.hangSX.strip() == "" || this.mauSac.strip() == "" || this.nam <= 0 || this.nam > 2024);
			
			scanner.close();
		} catch (Exception ex) {
			System.out.println("Dữ liệu nhập vào không hợp lệ!");
			ex.printStackTrace();
		}
	}
}
