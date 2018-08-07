package quanly.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import quanly.model.SinhVien;

@Repository
@Qualifier("sinhVienDao")

public class SinhVienDao {
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public void addSinhVien(SinhVien sv) {
        jdbcTemplate.update("INSERT INTO SINH_VIEN (MA_SINH_VIEN, TEN_SINH_VIEN) VALUES (?, ?)",
            sv.getMaSinhVien(), sv.getTenSinhVien());
        System.out.println("SV Added!!");
    }

}
