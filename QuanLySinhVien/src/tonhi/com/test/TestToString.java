package tonhi.com.test;

import tonhi.com.model.SinhVien;

public class TestToString {

	public static void main(String[] args) {
		SinhVien an = new SinhVien();
		an.setMa("156");
		an.setTen("Nguyễn An");
		an.setDiem(9.5);
		//xuất đối tượng an ra màn hình
		System.out.println(an); // tự động gọi hàm toString()
	}

}
