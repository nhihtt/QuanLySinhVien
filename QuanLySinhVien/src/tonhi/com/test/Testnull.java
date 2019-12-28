package tonhi.com.test;

import tonhi.com.model.SinhVien;

public class Testnull {

	public static void main(String[] args) {
		SinhVien teo;
		teo.setDiem(7.3); // báo lỗi vì tèo chưa được cấp phát ô nhớ 
		// ta phải dùng new để cấp phát ô nhớ trước khi thao tác trên tèo
	}

}
