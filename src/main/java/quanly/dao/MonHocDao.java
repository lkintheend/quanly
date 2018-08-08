package quanly.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import quanly.model.MonHoc;

@Repository
@Qualifier("monHocDao")
public class MonHocDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addMonHoc(MonHoc mh) {
		jdbcTemplate.update("INSERT INTO MON_HOC (MA_MON_HOC, TEN_MON_HOC) VALUES (?, ?)", mh.getMaMonHoc(),
				mh.getTenMonHoc());
		System.out.println("MH Added!!");
	}

	public void deleteMonHoc(String maMonHoc) {
		jdbcTemplate.update("DELETE FROM MON_HOC WHERE MA_MON_HOC = ? ", maMonHoc);
		System.out.println("MH Deleted!!");
	}

	public void editMonHoc(MonHoc monHoc, String maMonHoc) {
		jdbcTemplate.update("UPDATE MON_HOC SET MA_MON_HOC = ? , TEN_MON_HOC = ? WHERE MA_MON_HOC = ? ",
				monHoc.getMaMonHoc(), monHoc.getTenMonHoc(), maMonHoc);
		System.out.println("MH Updated!!");
	}

	public List<MonHoc> getListMonHoc() {
		List<MonHoc> listMonHoc = jdbcTemplate.query("SELECT * FROM MON_HOC", new BeanPropertyRowMapper(MonHoc.class));
		return listMonHoc;
	}
}
