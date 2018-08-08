package quanly.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanly.dao.SinhVienDao;
import quanly.model.SinhVien;
 

 
@Service("sinhVienService")
public class SinhVienService {
 
    @Autowired
    SinhVienDao sinhVienDao;
 
    public void addSinhVien(SinhVien sv) {
    	sinhVienDao.addSinhVien(sv);
    }
    
    public void deleteSinhVien(String maSinhVien) {
    	sinhVienDao.deleteSinhVien(maSinhVien);
	}

	public void editSnhVien(SinhVien sinhVien, String maSinhVien) {
		sinhVienDao.editSnhVien(sinhVien, maSinhVien);
	}
    
    public List <SinhVien> getListSinhVien() {
    	return sinhVienDao.getListSinhVien();
    }
 

}