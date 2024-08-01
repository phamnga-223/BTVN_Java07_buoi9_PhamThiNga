package cau5;

public class MaySay extends ThietBiDien {

	double khoiLuongSay;
	
	@Override
	void xuatThongTin() {
		super.xuatThongTin();
	}
	
	@Override
	void nhapThongTin() {
		super.nhapThongTin();

		try {
			this.loaiMay = ThietBiDien.LOAI_MAY[1];	

			do {
				System.out.print("Khối lượng sấy: ");
				this.khoiLuongSay = this.scanner.nextDouble();
			} while (this.khoiLuongSay <= 0);			
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();	
		}
	}
}
