package quanly.service;
 
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
 
//    public void editPerson(Person person, int personId) {
//        personDao.editPerson(person, personId);
//    }
// 
//    public void deletePerson(int personId) {
//        personDao.deletePerson(personId);
//    }
// 
//    public Person find(int personId) {
//        return personDao.find(personId);
//    }
// 
//    public List < Person > findAll() {
//        return personDao.findAll();
//    }
}