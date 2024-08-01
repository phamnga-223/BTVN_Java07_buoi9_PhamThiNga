package cau4;

public class XeMay extends PhuongTienGiaoThong {

	String loaiXe;
	
	@Override
	public void thongTinXe() {
		super.thongTinXe();
		
		System.out.println("Loại xe: " + this.loaiXe);
	}
	
	@Override
	void nhapThongTin() {
		super.nhapThongTin();

		try {
			this.loaiPhuongTien = PhuongTienGiaoThong.LOAI_PHUONG_TIEN[1];
			do {
				System.out.println("Loại xe: ");
				this.loaiXe = this.scanner.nextLine();
			} while (this.loaiXe.strip().equals(""));
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
}
