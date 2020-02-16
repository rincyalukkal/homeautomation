package com.uttara.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uttara.controllers.Device;
import com.uttara.controllers.Operations;
import com.uttara.controllers.Value;
import com.uttara.dao.DaoInterface;

@Service
public class ServiceImp implements ServiceInterface {

	
	@Autowired
	DaoInterface dao;
	
	public String createDevice(Device bean,Operations bean1) {
		return dao.createDevice(bean,bean1);
	}

	public List<Device> listDevices() {
		return dao.getAllDevices();
	}

	public String SetDevicestatus(Long didl) {
		return dao.setDevicestatus(didl);
	}

	public String SetDevicestatusoff(Long sl) {
		return dao.setDevicestatusoff(sl);
	}

	public String delete(Long sl) {
		return dao.delete(sl);
	}

	


	
}
