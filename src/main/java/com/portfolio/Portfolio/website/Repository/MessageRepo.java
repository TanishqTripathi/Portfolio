package com.portfolio.Portfolio.website.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.Portfolio.website.Model.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
    // This interface will automatically provide CRUD operations for the Message
    // entity
    // No additional methods are needed unless custom queries are required
    //

}
