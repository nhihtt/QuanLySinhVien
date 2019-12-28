package tonhi.com.test;

import tonhi.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		//nhưu vậy ta đã tạo được 1 kiểu dữ liệu tên là SinhVien
		// SinhVien là class đại diện cho tập các đối tượng có chung đặc tả
		//Muốn sử dụng lớp này ta phải tạp các đối tượng
		SinhVien teo= new SinhVien();
		//dùng từ khóa new để xin cấp phát bộ nhớ
		// muốn thay đổi dữ liệu cho tèo ta gọi các setter
		teo.setMa("K184060741");
		teo.setTen("tố nhi");
		teo.setDiem(7.5);
		//ta không được phéo : teo.ma =1155 
		// vì các thuộc tính đã được đóng gói (private)
		// muốn truy xuất phải dùng setter , getter
		//Muốn lấy giá trị của đối tượng ra
		System.out.println("Mã= "+teo.getMa());
		System.out.println("Tên="+teo.getTen());
		System.out.println("Điểm=" +teo.getDiem());
	}

}
