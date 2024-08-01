package cau5;

public class DieuHoa extends ThietBiDien {

	String kieuDang;
	
	@Override
	void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Kiểu dáng: " + this.kieuDang);
	}
	
	@Override
	void nhapThongTin() {
		super.nhapThongTin();

		try {
			this.loaiMay = ThietBiDien.LOAI_MAY[0];	

			do {
				this.scanner.nextLine();
				System.out.print("Kiểu dáng: ");
				this.kieuDang = this.scanner.nextLine();
			} while (this.kieuDang.strip().equals(""));
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();	
		}
	}
	
}
