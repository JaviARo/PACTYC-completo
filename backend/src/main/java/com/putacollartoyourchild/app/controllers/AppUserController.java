package com.putacollartoyourchild.app.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.putacollartoyourchild.app.entity.model.AppUser;
import com.putacollartoyourchild.app.entity.service.IAppUserService;

@RestController
@CrossOrigin(origins = "*")
public class AppUserController {
	
	@Autowired
	IAppUserService appUserService;

	@GetMapping("/appuser")
	public List<AppUser> getAll() {
		return appUserService.getAll();
	}
	
	@PostMapping("/appuser")
	public void insert(AppUser appUser) {
		appUserService.insert(appUser);
	}
	
	@DeleteMapping("/appuser/{id}")
	public void delete(@PathParam(value = "id") long id) {
		
	}
	
}
