package quanly.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import quanly.model.DangKyHoc;
@Repository
@Qualifier("dangKyHocDao")
public class DangKyHocDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addDangKyHoc(DangKyHoc dangKyHoc) {
		jdbcTemplate.update("INSERT INTO DANG_KY_HOC (MA_SINH_VIEN, MA_MON_HOC) VALUES (?, ?)", dangKyHoc.getMaSinhVien(),
				dangKyHoc.getMaMonHoc());
		System.out.println("dkh Added!!");
	}

	public void deleteDangKyHoc(DangKyHoc dangKyHoc) {
		jdbcTemplate.update("DELETE from DANG_KY_HOC WHERE MA_SINH_VIEN = ? AND MA_MON_HOC = ?", dangKyHoc.getMaSinhVien(),
				dangKyHoc.getMaMonHoc());
		System.out.println("dkh Deleted!!");
	}

//	public void editSnhVien(SinhVien sinhVien, String maSinhVien) {
//		jdbcTemplate.update("UPDATE SINH_VIEN SET MA_SINH_VIEN = ? , TEN_SINH_VIEN = ? WHERE MA_SINH_VIEN = ? ",
//				sinhVien.getMaSinhVien(), sinhVien.getTenSinhVien(), maSinhVien);
//		System.out.println("SV Updated!!");
//	}

	public List<DangKyHoc> getListDangKyHoc() {
		List<DangKyHoc> listDangKyHoc = jdbcTemplate.query("SELECT * FROM DANG_KY_HOC",
				new BeanPropertyRowMapper(DangKyHoc.class));
		return listDangKyHoc;
	}
}
