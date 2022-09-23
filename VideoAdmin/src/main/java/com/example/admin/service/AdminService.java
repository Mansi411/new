package com.example.admin.service;

import java.util.List;

import com.example.admin.model.Admin;

public interface AdminService {

	public List<Admin> findallMovieData();
	public Admin addMovieData(Admin model);
	public String deleteMovieData(int movie_id);
}
