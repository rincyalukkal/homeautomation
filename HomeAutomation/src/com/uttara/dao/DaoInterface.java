package com.uttara.dao;

import java.util.List;

import com.uttara.controllers.Device;
import com.uttara.controllers.Operations;
import com.uttara.controllers.Value;

public interface DaoInterface {

	String createDevice(Device bean,Operations bean1);

	List<Device> getAllDevices();

	String setDevicestatus(Long didl);

	String setDevicestatusoff(Long sl);

	String delete(Long sl);

	
   

}
