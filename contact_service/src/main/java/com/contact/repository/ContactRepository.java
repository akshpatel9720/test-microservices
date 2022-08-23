package com.contact.repository;

import com.contact.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Query("SELECT u from Contact u where u.userId = :userId")
    List<Contact> findByUserId(Long userId);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Contact u where u.userId = :userId")
    int deleteContactById(@Param("userId") Long userId);
}
