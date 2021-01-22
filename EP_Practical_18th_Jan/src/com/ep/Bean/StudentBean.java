package com.ep.Bean;

public class StudentBean
{
	//members
	private String name , location;
	private String email;
	private long id;
	
	//constructor
	public StudentBean()
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
	}
	
	//getters and setters
	//for name
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	//for location
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getLocation()
	{
		return location;
	}
	
	//for id
	public void setId(long id)
	{
		this.id = id;
	}
	public long getId()
	{
		return id;
	}
	
	//for email
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
}
	