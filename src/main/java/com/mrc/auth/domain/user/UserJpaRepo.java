package com.mrc.auth.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUid(String email);
    Optional<UserEntity> findByUidAndProvider(String uid, String provider);
}