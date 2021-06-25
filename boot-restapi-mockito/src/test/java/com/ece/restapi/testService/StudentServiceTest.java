package com.ece.restapi.testService;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ece.restapi.repository.StudentRepository;
import com.ece.restapi.service.StudentServiceImpl;

import lombok.var;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

	@Mock
	private StudentRepository repo;

	@Test
	@DisplayName("saveData --studentName can't be null")
	void saveDataTest() {

		var ssi = new StudentServiceImpl(repo);
//this one check
		 when(ssi.saveData(null)).thenAnswer(x -> 
		 {throw new Exception(); });


	}

	@Test
	@DisplayName("findByData --studentName can't be null")
	void findByDataTest() {

		var ssi = new StudentServiceImpl(repo);

		assertThatIllegalArgumentException().isThrownBy(() -> ssi.findByData(null));

	}

}
