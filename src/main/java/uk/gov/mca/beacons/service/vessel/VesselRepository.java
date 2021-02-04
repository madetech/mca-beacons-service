package uk.gov.mca.beacons.service.vessel;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VesselRepository extends CrudRepository<Vessel, UUID> {}
