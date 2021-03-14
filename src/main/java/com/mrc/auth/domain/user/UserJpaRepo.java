package com.mrc.auth.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<UserEntity,Long> {
}
