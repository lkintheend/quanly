package quanly.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import quanly.model.SinhVien;

@Repository
@Qualifier("sinhVienDao")

public class SinhVienDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addSinhVien(SinhVien sv) {
		jdbcTemplate.update("INSERT INTO SINH_VIEN (MA_SINH_VIEN, TEN_SINH_VIEN) VALUES (?, ?)", sv.getMaSinhVien(),
				sv.getTenSinhVien());
		System.out.println("SV Added!!");
	}

	public void deleteSinhVien(String maSinhVien) {
		jdbcTemplate.update("DELETE from SINH_VIEN WHERE MA_SINH_VIEN = ? ", maSinhVien);
		System.out.println("SV Deleted!!");
	}

	public void editSnhVien(SinhVien sinhVien, String maSinhVien) {
		jdbcTemplate.update("UPDATE SINH_VIEN SET MA_SINH_VIEN = ? , TEN_SINH_VIEN = ? WHERE MA_SINH_VIEN = ? ",
				sinhVien.getMaSinhVien(), sinhVien.getTenSinhVien(), maSinhVien);
		System.out.println("SV Updated!!");
	}

	public List<SinhVien> getListSinhVien() {
		List<SinhVien> listSinhVien = jdbcTemplate.query("SELECT * FROM SINH_VIEN",
				new BeanPropertyRowMapper(SinhVien.class));
		return listSinhVien;
	}
}
