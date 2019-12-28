package tonhi.com.model;

public class SinhVien 
{
	// các thuộc tính phải để private để đảm bảo tính đóng gói
	private String ma;// instance variable
	private String ten;
	private double diem;
	public SinhVien() {
		System.out.println("Constructor mặc định của SinhVien");
	}
	public SinhVien(String ma, String ten, double diem) {
		this.ma=ma;
		this.ten=ten;
		this.diem=diem;
	}
	public void setMa(String ma) // local variable
	{
		this.ma=ma; // từ khóa this để tham chiếu đến instance variable
	}
	public String getMa() 
	{
		return this.ma;
	}
	public void setTen(String ten) {
		this.ten=ten;
	}
	public String getTen() {
		return this.ten;
	}
	public void setDiem(Double diem) {
		this.diem=diem;
	}
	public double getDiem() {
		return this.diem;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Chi tiết: \n"+ this.ma+"\t"+this.ten+"\t"+this.diem;
	}
}
