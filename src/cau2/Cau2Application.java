package cau2;

/**
 * Câu 2: Tạo lớp XeHoi để biểu diễn 1 chiếc xe hơi (hãng sx, màu sắc, năm sx)
 * 		Thêm phương thức để hiển thị thông tin xe hơi
 */
public class Cau2Application {

	public static void main(String[] args) {
		XeHoi xeHoi = new XeHoi();
		xeHoi.nhapXeHoi();
		xeHoi.xuatThongTin();
	}

}
