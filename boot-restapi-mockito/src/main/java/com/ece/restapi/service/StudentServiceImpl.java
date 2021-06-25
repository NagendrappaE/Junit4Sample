package com.ece.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ece.restapi.dto.TaStudent;
import com.ece.restapi.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepo;

	@Override
	public String saveData(String student) {

		try {

			TaStudent st = new TaStudent();
			st.setSname(student.toString());
			st.setUsn(String.valueOf(System.currentTimeMillis()));
			studentrepo.save(st);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";
	}

	public String findByData(String student) {

		if (student == null) {

			throw new IllegalArgumentException("studentName can't be null");

		} else {
			// studentrepo.findAllById(ids);
		}
		return "found";
	}

}
