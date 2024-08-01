package cau1;

public class HocSinh {

	String ten;
	int tuoi;
	double toan;
	double ly;
	double hoa;
	
	HocSinh() {
	}
	
	HocSinh(String ten, int tuoi, double toan, double ly, double hoa) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	
	void xuatThongTin() {
		String diemTB = String.format("%.2f", trungBinh());
		String thongTin = String.format("Họ tên: %s; Tuổi: %s; Điểm TB: %s; Điểm Toán, Lý, Hóa: %s, %s, %s.",
				this.ten, this.tuoi, diemTB, this.toan, this.ly, this.hoa);
		System.out.println(thongTin);
	}
	
	double trungBinh() {
		return (this.toan + this.ly + this.hoa) / 3;
	}
}
