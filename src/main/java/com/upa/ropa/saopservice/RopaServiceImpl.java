package com.upa.ropa.saopservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.upa.ropa.producto.Ropa;
@WebService(endpointInterface = "com.upa.ropa.saopservice.RopaService")
public class RopaServiceImpl implements RopaServices{
	
	static List<Ropa> ropaList = new ArrayList<Ropa>();

	public Ropa crearRopa(Ropa ropa) {
		ropaList.add(ropa);
		return ropa;
	}

	public List<Ropa> optenerTodaLaRopa() {
		return ropaList;
	}
	}