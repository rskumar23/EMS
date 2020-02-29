package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.DegreeDTO;
import com.ems.model.Degree;
import com.ems.repository.DegreeRepository;

@Service
public class DegreeServiceImpl implements DegreeService{
	
	@Autowired
	DegreeRepository degreeRepository;

	@Override
	public void addDegree(DegreeDTO degreeDto) {
		Degree degree = new Degree();
		if(degreeDto.getId() != null) {
			degree.setId(degreeDto.getId());
		}
		degree.setDegreeName(degreeDto.getDegreeName());
		degreeRepository.save(degree);
		
	}

	@Override
	public List<Degree> findAll() {
		
		return degreeRepository.findAll();
	}

	@Override
	public void deleteDegree(Long degreeId) {
		degreeRepository.deleteById(degreeId);
		
	}

	@Override
	public DegreeDTO updateDegree(Long degreeId) {
		Degree degree = degreeRepository.getOne(degreeId);
		return convertModelToDTO(degree);
	}
	
	
	private DegreeDTO convertModelToDTO(Degree degree) {
		DegreeDTO degreedto = new DegreeDTO();
		degreedto.setId(degree.getId());
		degreedto.setDegreeName(degree.getDegreeName());
		System.out.println("convertModelToDTO");
		return degreedto;
		
	}

}
