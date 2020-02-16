package com.uttara.services;

import java.util.List;

import com.uttara.controllers.Device;
import com.uttara.controllers.Operations;
import com.uttara.controllers.Value;

public interface ServiceInterface {

	String createDevice(Device bean,Operations bean1);

	List<Device> listDevices();

	String SetDevicestatus(Long didl);

	String SetDevicestatusoff(Long sl);

	String delete(Long sl);

}
