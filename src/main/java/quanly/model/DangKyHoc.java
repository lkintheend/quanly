package quanly.model;

public class DangKyHoc {
	
	private String maMonHoc;
	private String maSinhVien;

	public DangKyHoc() {
	}

	public DangKyHoc(String maMonHoc, String maSinhVien) {
		this.maMonHoc = maMonHoc;
		this.maSinhVien = maSinhVien;
	}

	public String getMaMonHoc() {
		return maMonHoc;
	}

	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

}
