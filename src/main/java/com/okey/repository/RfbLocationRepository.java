package com.okey.repository;

import com.okey.domain.RfbLocation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RfbLocation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RfbLocationRepository extends JpaRepository<RfbLocation, Long> {

}
