package com.cg.dms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dms.entities.Farmer;
import com.cg.dms.repository.IfarmerRepository;
@Service("fs")
public class FarmerService implements IFarmerService {
@Autowired
IfarmerRepository ifs;

@Override
public Farmer validateFarmer(String username, String password) throws Exception {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Farmer addFarmer(Farmer user) {
	
	
	return ifs.addFarmer(user);
}
@Override
public Farmer updateFarmer(Farmer user) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Farmer> getAllFarmer() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Farmer> getFarmer(int dealerId) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Company getCompany() {
	// TODO Auto-generated method stub
	return null;
}
}
