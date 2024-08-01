package cau4;

public class XeHoi extends PhuongTienGiaoThong {

	int soChoNgoi;
	
	@Override
	public void thongTinXe() {
		super.thongTinXe();
		
		System.out.println("Số chỗ ngồi: " + this.soChoNgoi);
	}

	@Override
	void nhapThongTin() {
		super.nhapThongTin();

		try {
			this.loaiPhuongTien = PhuongTienGiaoThong.LOAI_PHUONG_TIEN[0];
			do {
				System.out.print("Số chỗ ngồi: ");
				this.soChoNgoi = this.scanner.nextInt();
			} while (this.soChoNgoi <= 2);
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
}
