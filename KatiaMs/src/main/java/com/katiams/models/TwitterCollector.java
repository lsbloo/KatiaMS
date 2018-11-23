package com.katiams.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.sql.Date;


@Entity
public class TwitterCollector {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@NotNull
	private long id;
	
	@Column(name="text")
	@NotNull
	private String text;
	
	@Column(name="data")
	@NotNull
	private Date data;
	
	@Column(name="name")
	@NotNull
	private String name;


	
	
	public TwitterCollector() {}
	/**
	 * Default Constructor;
	 * @param text
	 * @param data
	 * @param name
	 */
	public TwitterCollector(String text, Date data, String name) {
		setText(text);
		setData(data);
		setName(name);
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
