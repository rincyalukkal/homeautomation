package com.uttara.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.uttara.controllers.Device;
import com.uttara.controllers.Operations;
import com.uttara.controllers.Value;
@Repository
public class DaoImp implements DaoInterface {

	
	@Autowired
	SessionFactory factory;
	public String createDevice(Device bean,Operations bean1) {
		System.out.println(bean);
		System.out.println(bean1);
		System.out.println("inside dao");
		System.out.println(bean);
			Session s = factory.openSession();
			s.beginTransaction();
			s.save(bean);
			s.save(bean1);
			s.getTransaction().commit();
			s.close();
			
			
			return "device added successfully";
	}
	public List<Device> getAllDevices() {
		Session s = factory.openSession();
		s.beginTransaction();
		List<Device> d = s.createQuery("from Device order by dname").getResultList();
		s.getTransaction().commit();
		s.close();
		
		return d;
	}
	
	public String setDevicestatus(Long didl) {
		Session s = factory.openSession();
		s.beginTransaction();
		
		Query q = s.createQuery("update Operations set status=:ss where dv_didl=:dd");
		q.setParameter("ss","ON");
		q.setParameter("dd",didl);
		q.executeUpdate();

		System.out.println(q);
	
		s.getTransaction().commit();
		s.close();
	
		return "Device Current Status : ON";
	}
	public String setDevicestatusoff(Long sl) {
		Session s = factory.openSession();
		s.beginTransaction();
		
		Query q = s.createQuery("update Operations set status=:ss where dv_didl=:dd");
		q.setParameter("ss","OFF");
		q.setParameter("dd",sl);
		q.executeUpdate();

		System.out.println(q);
	
		s.getTransaction().commit();
		s.close();
	
		return "Device Current Status : OFF";
	}
	public String delete(Long sl) {
		Session s = factory.openSession();
		s.beginTransaction();
		Query q = s.createQuery("delete Operations where dv_didl=:dd");
		q.setParameter("dd",sl);
		q.executeUpdate();
		Query q1 = s.createQuery("delete Device where didl=:dd");
		q1.setParameter("dd",sl);
		q1.executeUpdate();
	
		s.getTransaction().commit();
		s.close();
		return "Device Removed Successfully";
	}
	
	

}
