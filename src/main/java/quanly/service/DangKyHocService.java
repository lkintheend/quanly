package quanly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanly.dao.DangKyHocDao;
import quanly.model.DangKyHoc;

@Service("dangKyHocService")
public class DangKyHocService {
	@Autowired
	DangKyHocDao dangKyHocDao;

	public void addDangKyHoc(DangKyHoc dangKyHoc) {
		dangKyHocDao.addDangKyHoc(dangKyHoc);
	}

	public void deleteDangKyHoc(DangKyHoc dangKyHoc) {
		dangKyHocDao.deleteDangKyHoc(dangKyHoc);
	}

	public List<DangKyHoc> getListDangKyHoc() {
		return dangKyHocDao.getListDangKyHoc();
	}
}
