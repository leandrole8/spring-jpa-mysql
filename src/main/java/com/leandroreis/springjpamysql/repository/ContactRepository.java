package com.leandroreis.springjpamysql.repository;

import com.leandroreis.springjpamysql.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
