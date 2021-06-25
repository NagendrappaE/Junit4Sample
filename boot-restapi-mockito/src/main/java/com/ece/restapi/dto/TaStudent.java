/**
 * 
 */
package com.ece.restapi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author user
 *
 */
@Entity
@Table(name = "ta_student")
@Data
public class TaStudent {

	@Id
	@GeneratedValue

	private long id;

	@Column(name = "first_name")
	private String sname;

	@Column(name = "usn")

	private String usn;

}
