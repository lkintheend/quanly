package quanly.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import quanly.config.ApplicationConfig;
import quanly.config.ApplicationContextConfig;
import quanly.model.SinhVien;
import quanly.service.SinhVienService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		SinhVienService sinhVienService = (SinhVienService) context.getBean("sinhVienService");
		sinhVienService.addSinhVien(new SinhVien("123","abc"));
		context.close();
	}

}
