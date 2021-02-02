package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Base class we're extending to create an event repository.
 * It's going to store Event objects and that the primary key of those objects is of type integer
 * */
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}
