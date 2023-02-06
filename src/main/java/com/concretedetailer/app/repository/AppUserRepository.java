package com.concretedetailer.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concretedetailer.app.model.AppUser;

/**
 * @author Hendi Santika
 *
 */
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);
}
