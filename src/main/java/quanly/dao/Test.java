package quanly.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import quanly.config.ApplicationConfig;
import quanly.config.ApplicationContextConfig;
import quanly.model.DangKyHoc;
import quanly.model.MonHoc;
import quanly.model.SinhVien;
import quanly.service.DangKyHocService;
import quanly.service.MonHocService;
import quanly.service.SinhVienService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		SinhVienService sinhVienService = (SinhVienService) context.getBean("sinhVienService");
		MonHocService monHocService = (MonHocService) context.getBean("monHocService");
		DangKyHocService dangKyHocService = (DangKyHocService) context.getBean("dangKyHocService");
//		sinhVienService.addSinhVien(new SinhVien("123","abc"));
//		System.out.println(sinhVienService.getListSinhVien());
//		monHocService.addMonHoc(new MonHoc("123", "abc"));
//		dangKyHocService.addDangKyHoc(new DangKyHoc("1","123"));
		
		System.out.println(dangKyHocService.getListDangKyHoc());
		context.close();
	}

}
