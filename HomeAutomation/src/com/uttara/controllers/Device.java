package com.uttara.controllers;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table (name="Device")
public class Device implements Serializable {
	
	
	@Id @GeneratedValue
	private Long didl;
	
	@NotBlank
	private String dname;
	
	@OneToOne(mappedBy="dv")
	Operations op;

	public Long getDidl() {
		return didl;
	}

	public void setDidl(Long didl) {
		this.didl = didl;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Operations getOp() {
		return op;
	}

	public void setOp(Operations op) {
		this.op = op;
	}

	@Override
	public String toString() {
		return "Device [dname=" + dname + ", op=" + op + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		return true;
	}

	
	
	

}
