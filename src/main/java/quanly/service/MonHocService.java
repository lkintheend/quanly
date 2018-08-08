package quanly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanly.dao.MonHocDao;
import quanly.model.MonHoc;

@Service("monHocService")
public class MonHocService {
	@Autowired
	MonHocDao monHocDao;

	public void addMonHoc(MonHoc mh) {
		monHocDao.addMonHoc(mh);
	}

	public void deleteMonHoc(String maMonHoc) {
		monHocDao.deleteMonHoc(maMonHoc);
	}

	public void editMonHoc(MonHoc monHoc, String maMonHoc) {
		monHocDao.editMonHoc(monHoc, maMonHoc);
	}

	public List<MonHoc> getListMonHoc() {
		return monHocDao.getListMonHoc();
	}
}
