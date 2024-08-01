package cau1;

import java.util.Scanner;

/**
 * Câu 1: Tạo lớp HocSinh để lưu thông tin 1 học sinh (tên, tuổi, điểm số)
 * 		Thêm các phương thức để in thông tin, tính điểm TB
 */
public class Cau1Application {

	public static void main(String[] args) {
		HocSinh hs = nhapHocSinh();		
		if (hs != null) {
			hs.xuatThongTin();
		}
	}
	
	public static HocSinh nhapHocSinh() {
		Scanner scanner = new Scanner(System.in);
		String name; 
		int tuoi;
		double toan; double ly; double hoa;
		
		try {
			//B1: Nhập tên hs
			do {
				System.out.println("Xin vui lòng nhập tên học sinh: ");
				name = scanner.nextLine();
			} while (name.strip() == "");
			
			//B2: Nhập tuổi hs
			do {
				System.out.println("Tuổi học sinh: ");
				tuoi = scanner.nextInt();
			} while (tuoi <= 0);
			
			//B3: Nhập điểm toán, lý, hóa
			do {
				System.out.println("Điểm toán: ");
				toan = scanner.nextDouble();
				System.out.println("Điểm lý: ");
				ly = scanner.nextDouble();
				System.out.println("Điểm hóa: ");
				hoa = scanner.nextDouble();
			} while (toan < 0 || toan > 10 || ly < 0 || ly > 10 || hoa < 0 || hoa > 10);
			
			scanner.close();
			
			return new HocSinh(name, tuoi, toan, ly, hoa);
		} catch (Exception ex) {
			System.out.println("Dữ liệu nhập vào không hợp lệ!");
			System.out.println(ex.getStackTrace());
			return null;
		}
	}
}


//26/7, 8:00 pm - 8:25 pm