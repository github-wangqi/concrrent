package com.hnmqet.service;


import com.hnmqet.entity.AccountMainEntity;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface ConcurrentRepository extends JpaRepository<AccountMainEntity, Long> {

    @Query(value = "select t.* from account_main t where t.acct_id = ?1 for update", nativeQuery = true)
    Optional<AccountMainEntity> lockById(Long id);


}
